package com.ohgiraffers.DTO;

import lombok.*;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class EmpAndDeptDTO {
    private String id;
    private String name;
    private String no;
    private String email;
    private String phone;
    private String deptCode;
    private String jobCode;
    private String salLevel;
    private double salary;
    private double bonus;
    private String managerId;
    private LocalDate hireDate;
    private LocalDate entDate;
    private String entYn;
    private DepartmentDTO dept;
}
