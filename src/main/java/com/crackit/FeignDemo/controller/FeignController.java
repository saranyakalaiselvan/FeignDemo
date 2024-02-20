package com.crackit.FeignDemo.controller;

import com.crackit.FeignDemo.client.EmployeeFeignClient;
import com.crackit.FeignDemo.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/crackit/v1/feignClient")
public class FeignController {

    @Autowired
    private EmployeeFeignClient employeeFeignClient;

    @GetMapping("/employees")
    public Employee getEmployees() {
        return employeeFeignClient.getEmployees();
    }
}
