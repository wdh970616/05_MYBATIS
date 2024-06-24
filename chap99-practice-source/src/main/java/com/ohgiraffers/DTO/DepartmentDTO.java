package com.ohgiraffers.DTO;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class DepartmentDTO {
    private String id;
    private String title;
    private String locationId;
}
