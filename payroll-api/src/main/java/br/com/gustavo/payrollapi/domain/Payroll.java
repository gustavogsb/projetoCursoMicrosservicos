package br.com.gustavo.payrollapi.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@AllArgsConstructor
public class Payroll {
    
    private String workname;
    private String description;
    private Double hourlyPrice;
    private Double workedHours;
    private Double totalPayment;

}
