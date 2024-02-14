package br.com.gustavo.payrollapi.services;

import java.util.Objects;

import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import br.com.gustavo.payrollapi.domain.Payroll;
import br.com.gustavo.payrollapi.feignClients.UserFeign;
import br.com.gustavo.payrollapi.services.exceptions.ObjectNotFoundExcepetion;
import feign.FeignException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RequiredArgsConstructor
@Slf4j
@Service
public class PayrollService {
    

    private final Environment env;
    private final UserFeign feign;

    public Payroll getPayment(Long workerId, Payroll payroll){
        log.info("PAYROLL_SERVICE ::: Get Request on "+ env.getProperty("local.server.port") + "  port");

        try{
            
            var user = feign.findById(workerId).getBody();

            if(Objects.nonNull(user)){
                return new Payroll(user.getName(), 
                                payroll.getDescription(), 
                                user.getHourlyPrice(), 
                                payroll.getWorkedHours(), 
                                user.getHourlyPrice() * payroll.getWorkedHours());
            }
            

        }catch(FeignException.NotFound ex){
            throw new ObjectNotFoundExcepetion("Object Not Found");
        }catch(Exception ex){
            throw new IllegalArgumentException("Ilegal Arguments Exception");
        }

        return null;
    }
}
