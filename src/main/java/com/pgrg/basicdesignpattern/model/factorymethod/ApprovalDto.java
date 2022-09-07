package com.pgrg.basicdesignpattern.model.factorymethod;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ApprovalDto {

    private Integer id;

    private String status;

    private String userType;
}
