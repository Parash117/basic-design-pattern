package com.pgrg.basicdesignpattern.service.factorymethod;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ApprovalFactory implements ApprovalFactoryAbstract {

    @Autowired
    UserType1Service userType1Service;

    @Autowired
    UserType2Service userType2Service;

    public ApprovalInterface approvalMechanismFactory(String userType){
        if (userType.equalsIgnoreCase("userType1")){
            return userType1Service;
        }
        else if(userType.equalsIgnoreCase("userType2")) {
            return userType1Service;
        }
        return null;
    }


}
