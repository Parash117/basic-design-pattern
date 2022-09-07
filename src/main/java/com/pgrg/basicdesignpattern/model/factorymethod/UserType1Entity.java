package com.pgrg.basicdesignpattern.model.factorymethod;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user_type_1")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserType1Entity {

    @Id
    @GeneratedValue
    private Integer loanAccountId;

    private String accountHolderName;

    private Double totalAmount;

    private Double depositedAmount;

    private Long accountId;

    private String approvalStatus;
}
