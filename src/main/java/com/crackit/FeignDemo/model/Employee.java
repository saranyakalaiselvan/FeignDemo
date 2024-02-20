package com.crackit.FeignDemo.model;

public record Employee(int employeeId, String employeeName,
                       String department, String designation) {
}
