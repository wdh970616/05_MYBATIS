package com.ohgiraffers.DTO;

import lombok.*;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class DeptAndEmpDTO {
    private String id;
    private String title;
    private String locationId;
    private List<EmployeeDTO> empList;
}
