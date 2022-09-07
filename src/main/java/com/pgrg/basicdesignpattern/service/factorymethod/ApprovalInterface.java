package com.pgrg.basicdesignpattern.service.factorymethod;

import com.pgrg.basicdesignpattern.model.factorymethod.ApprovalDto;

public interface ApprovalInterface {

    public void submit(ApprovalDto approvalDto);

    public void verify(ApprovalDto approvalDto);

    public void approve(ApprovalDto approvalDto);

    public void reject(ApprovalDto approvalDto);

}
