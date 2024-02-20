package com.crackit.FeignDemo.client;

import com.crackit.FeignDemo.model.Employee;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.scheduling.annotation.Async;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "employee-service",
        url = "http://localhost:8080/crackit/v1/")
public interface EmployeeFeignClient {

    @GetMapping("/employees")
    public Employee getEmployees();

}
