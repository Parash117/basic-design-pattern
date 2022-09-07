package com.pgrg.basicdesignpattern.service.factorymethod;

import com.pgrg.basicdesignpattern.model.factorymethod.ApprovalDto;
import com.pgrg.basicdesignpattern.model.factorymethod.UserType2Entity;
import com.pgrg.basicdesignpattern.repo.factorymethod.UserType2Repo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Slf4j
@Service
public class UserType2ServiceImpl implements UserType2Service{

    @Autowired
    private UserType2Repo userType2Repo;

    @Override
    public void submit(ApprovalDto approvalDto) {
        UserType2Entity userType2Entity = userType2Repo.findById(approvalDto.getId()).orElseThrow(()-> new RuntimeException("ERROR OOPS"));
        userType2Entity.setApprovalStatus("SUBMIT");
        userType2Entity = userType2Repo.save(userType2Entity);
      log.info("SUBMITTED USER Type2");
    }

    @Override
    public void verify(ApprovalDto approvalDto) {
        log.info("VERIFIED USER Type2");

    }

    @Override
    public void approve(ApprovalDto approvalDto) {
        log.info("APPROVED USER Type2");

    }

    @Override
    public void reject(ApprovalDto approvalDto) {
        log.info("REJECTED USER Type2");

    }
}
