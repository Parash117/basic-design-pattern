package com.pgrg.basicdesignpattern.service.adapter;

import com.pgrg.basicdesignpattern.model.adapter.SimpleDetail;

import java.io.IOException;

public interface XmlDataReaderInterface {

    SimpleDetail readData() throws IOException;

}
