package br.com.gustavo.payrollapi.feignClients;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.com.gustavo.payrollapi.domain.User;

@FeignClient(name = "user-api") //, url = "http://localhost:8000"
public interface UserFeign {
    
    @GetMapping(value = "/api/users/{id}")
    ResponseEntity<User> findById(@PathVariable Long id);

    @GetMapping()
    ResponseEntity<List<User>> findAll();    
}
