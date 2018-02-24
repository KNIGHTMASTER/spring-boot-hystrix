package com.zisal.springboothystrix.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created on 2/23/18.
 *
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
@RestController
public class ExampleController implements IExampleService {

    private static final Logger LOGGER = LoggerFactory.getLogger(ExampleController.class);

    @Autowired
    private EmployeeRepo employeeRepo;

    @Override
    public List<EmployeeData> getAllEmployee() {
        return employeeRepo.findAll();
    }

    @HystrixCommand(fallbackMethod = "employeeNotFound")
    @Override
    public EmployeeData getEmployee(@PathVariable("id") Long p_id) {
        return employeeRepo.findOne(p_id);
    }

    @Override
    public EmployeeData employeeNotFound(Long p_id) {
        System.out.println("Employee not found - fallback");
        EmployeeData employeeData = new EmployeeData();
        employeeData.setName("NOT FOUND");
        employeeData.setAmount(new BigDecimal(0));
        LOGGER.info("fallback executed");
        return employeeData;
    }
}
