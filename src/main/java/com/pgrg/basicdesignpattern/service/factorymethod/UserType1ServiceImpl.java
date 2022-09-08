package com.pgrg.basicdesignpattern.service.factorymethod;

import com.pgrg.basicdesignpattern.model.factorymethod.ApprovalDto;
import com.pgrg.basicdesignpattern.model.factorymethod.UserType1Entity;
import com.pgrg.basicdesignpattern.repo.factorymethod.UserType1Repo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class UserType1ServiceImpl implements UserType1Service {

    @Autowired
    private UserType1Repo userType1Repo;

    @Override
    public void submit(ApprovalDto approvalDto) {
        UserType1Entity userType1Entity = userType1Repo.findById(approvalDto.getId()).orElseThrow(()-> new RuntimeException("ERROR OOPS"));
        userType1Entity.setApprovalStatus("SUBMIT");
        userType1Entity = userType1Repo.save(userType1Entity);
        log.info("SUBMITTED USER Type 1");
    }

    @Override
    public void verify(ApprovalDto approvalDto) {
        UserType1Entity userType1Entity = userType1Repo.findById(approvalDto.getId()).orElseThrow(()-> new RuntimeException("ERROR OOPS"));
        userType1Entity.setApprovalStatus("VERIFY");
        userType1Entity = userType1Repo.save(userType1Entity);
        log.info("VERIFIED USER Type 1");

    }

    @Override
    public void approve(ApprovalDto approvalDto) {
        log.info("APPROVED USER Type 1");

    }

    @Override
    public void reject(ApprovalDto approvalDto) {
        log.info("REJECTED USER Type 1");

    }

}
