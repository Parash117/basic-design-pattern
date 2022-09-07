package com.pgrg.basicdesignpattern.model.factorymethod;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user_type_2")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserType2Entity {

    @Id
    @GeneratedValue
    private Integer savingsId;

    private String accountHolderName;

    private Double totalAmount;

    private Double minimumBalance;

    private String approvalStatus;

}
