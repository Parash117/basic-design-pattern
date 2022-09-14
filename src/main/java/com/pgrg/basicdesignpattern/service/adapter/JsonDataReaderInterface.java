package com.pgrg.basicdesignpattern.service.adapter;

import com.pgrg.basicdesignpattern.model.adapter.SimpleDetail;

import java.io.IOException;

public interface JsonDataReaderInterface {

    SimpleDetail readJsonData() throws IOException;

}
