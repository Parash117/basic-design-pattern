package com.pgrg.basicdesignpattern.service.adapter;

import com.pgrg.basicdesignpattern.model.adapter.DataProcessorDto;
import com.pgrg.basicdesignpattern.model.adapter.SimpleDetail;

import java.io.IOException;

public interface DataAdapterInterface {

    SimpleDetail getPayload() throws IOException;

}
