package com.pgrg.basicdesignpattern.service.factorymethod;

public interface ApprovalFactoryAbstract {
    public ApprovalInterface approvalMechanismFactory(String userType);
}
