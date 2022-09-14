package com.pgrg.basicdesignpattern.controller.factorymethod;

import com.pgrg.basicdesignpattern.model.adapter.SimpleDetail;
import com.pgrg.basicdesignpattern.model.factorymethod.ApprovalDto;
import com.pgrg.basicdesignpattern.service.adapter.DataAdapterImpl;
import com.pgrg.basicdesignpattern.service.adapter.DataAdapterInterface;
import com.pgrg.basicdesignpattern.service.adapter.JsonDataReaderInterface;
import com.pgrg.basicdesignpattern.service.adapter.XmlDataReaderInterface;
import com.pgrg.basicdesignpattern.service.adapter.impl.JsonDataProcessor;
import com.pgrg.basicdesignpattern.service.adapter.impl.XmlDataProcessor;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@RequestMapping("/adapter")
public class AdapterController {

    @GetMapping
    public String getData() throws IOException {
        JsonDataReaderInterface jsonDataReaderInterface = new JsonDataProcessor();
        SimpleDetail simpleDetail = jsonDataReaderInterface.readJsonData();

        XmlDataReaderInterface xmlDataReaderInterface = new XmlDataProcessor();
        SimpleDetail simpleDetail1 = xmlDataReaderInterface.readData();

        JsonDataReaderInterface dataAdapterInterface = new DataAdapterImpl(xmlDataReaderInterface);
        SimpleDetail simpleDetail2 = dataAdapterInterface.readJsonData();
        return simpleDetail2.toString();
    }
}
