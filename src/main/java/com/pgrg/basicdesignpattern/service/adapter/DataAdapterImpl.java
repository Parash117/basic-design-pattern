package com.pgrg.basicdesignpattern.service.adapter;

import com.pgrg.basicdesignpattern.model.adapter.SimpleDetail;

import java.io.IOException;

public class DataAdapterImpl implements JsonDataReaderInterface {

    private XmlDataReaderInterface xmlDataReaderInterface;

    public DataAdapterImpl(XmlDataReaderInterface xmlDataReaderInterface) {
        this.xmlDataReaderInterface = xmlDataReaderInterface;
    }

//    @Override
//    public SimpleDetail getPayload() throws IOException {
//        SimpleDetail simpleDetail = xmlDataReaderInterface.readData();
//        return simpleDetail;
//    }

    @Override
    public SimpleDetail readJsonData() throws IOException {
        SimpleDetail simpleDetail = xmlDataReaderInterface.readData();
        return simpleDetail;
    }
}
