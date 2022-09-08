package com.pgrg.basicdesignpattern.controller.factorymethod;

import com.pgrg.basicdesignpattern.model.factorymethod.ApprovalDto;
import com.pgrg.basicdesignpattern.service.factorymethod.ApprovalFactoryAbstract;
import com.pgrg.basicdesignpattern.service.factorymethod.ApprovalInterface;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/factory-method-approval")
public class FactoryMethodApprovalController {

    private ApprovalInterface approvalInterface;
    private ApprovalFactoryAbstract approvalFactoryAbstract;

    public FactoryMethodApprovalController(ApprovalFactoryAbstract approvalFactoryAbstract) {

        this.approvalFactoryAbstract = approvalFactoryAbstract;
    }

    @PostMapping("/submit")
    public String submit(@RequestBody ApprovalDto approvalDto){
        approvalInterface = approvalFactoryAbstract.approvalMechanismFactory(approvalDto.getUserType());
        approvalInterface.submit(approvalDto);
        return "SUBMITTED "+approvalDto.getUserType();
    }


    @PostMapping("/verify")
    public String verify(ApprovalDto approvalDto){
        approvalInterface = approvalFactoryAbstract.approvalMechanismFactory(approvalDto.getUserType());
        approvalInterface.verify(approvalDto);
        return "VERIFIED "+approvalDto.getUserType();
    }

    @PostMapping("/approve")
    public String approve(ApprovalDto approvalDto){
        approvalInterface = approvalFactoryAbstract.approvalMechanismFactory(approvalDto.getUserType());
        approvalInterface.approve(approvalDto);
        return "";
    }

}
