package com.pgrg.basicdesignpattern.service.adapter;

import com.pgrg.basicdesignpattern.model.adapter.DataProcessorDto;

public interface DataProcessorInterface {

    DataProcessorDto readJsonData(String filePath);

    DataProcessorDto readXmlData(String filePath);

}
