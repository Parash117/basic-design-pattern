package com.pgrg.basicdesignpattern.controller.factorymethod;

import com.pgrg.basicdesignpattern.model.factorymethod.ApprovalDto;
import com.pgrg.basicdesignpattern.service.factorymethod.ApprovalFactoryAbstract;
import com.pgrg.basicdesignpattern.service.factorymethod.ApprovalInterface;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/factory-method-user-1")
public class FactoryMethodApprovalController {

    private ApprovalInterface approvalInterface;
    private final ApprovalFactoryAbstract approvalFactoryAbstract;

    public FactoryMethodApprovalController(ApprovalFactoryAbstract approvalFactoryAbstract) {

        this.approvalFactoryAbstract = approvalFactoryAbstract;
        approvalInterface = approvalFactoryAbstract.approvalMechanismFactory("userType1");
    }

    @PostMapping("/submit")
    public String submit(@RequestBody ApprovalDto approvalDto){
        approvalInterface.submit(approvalDto);
        return "";
    }


    @PostMapping("/verify")
    public String verify(ApprovalDto approvalDto){
        approvalInterface.verify(approvalDto);
        return "";
    }

    @PostMapping("/approve")
    public String approve(ApprovalDto approvalDto){
        approvalInterface.approve(approvalDto);
        return "";
    }

}
