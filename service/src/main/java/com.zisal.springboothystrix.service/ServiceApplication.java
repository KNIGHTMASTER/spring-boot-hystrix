package com.zisal.springboothystrix.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;

import java.math.BigDecimal;

/**
 * Created on 2/23/18.
 *
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
@SpringBootApplication
@EnableCircuitBreaker
public class ServiceApplication implements CommandLineRunner {

    public static void main(String [] args) {
        SpringApplication.run(ServiceApplication.class);
    }

    @Autowired
    private EmployeeRepo employeeRepo;

    @Override
    public void run(String... strings) throws Exception {
        if (employeeRepo.findAll().size() > 0) {
            employeeRepo.deleteAll();
        }

        EmployeeData employeeData = new EmployeeData();
        employeeData.setName("David");
        employeeData.setAmount(new BigDecimal(5000));

        EmployeeData employeeData1 = new EmployeeData();
        employeeData1.setName("Beckham");
        employeeData1.setAmount(new BigDecimal(6000));

        employeeRepo.save(employeeData);
        employeeRepo.save(employeeData1);
    }
}
