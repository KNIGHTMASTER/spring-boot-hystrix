package com.zisal.springboothystrix.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

/**
 * Created on 2/23/18.
 *
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
public interface IExampleService {

    @GetMapping("/employee")
    List<EmployeeData> getAllEmployee();

    @GetMapping("/employee/{id}")
    EmployeeData getEmployee(@PathVariable("id") Long p_id);

    EmployeeData employeeNotFound(Long p_id);
}
