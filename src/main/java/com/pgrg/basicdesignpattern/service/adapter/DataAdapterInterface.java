package com.pgrg.basicdesignpattern.service.adapter;

import com.pgrg.basicdesignpattern.model.adapter.DataProcessorDto;

public interface DataAdapterInterface {

    DataProcessorDto getPayload(String filePath);

}
