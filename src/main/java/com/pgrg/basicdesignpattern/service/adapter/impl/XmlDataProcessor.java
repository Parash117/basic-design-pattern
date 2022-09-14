package com.pgrg.basicdesignpattern.service.adapter.impl;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.pgrg.basicdesignpattern.model.adapter.SimpleDetail;
import com.pgrg.basicdesignpattern.service.adapter.XmlDataReaderInterface;
import org.springframework.core.io.ClassPathResource;
import org.springframework.util.StreamUtils;

import java.io.IOException;
import java.nio.charset.Charset;

public class XmlDataProcessor implements XmlDataReaderInterface {


    @Override
    public SimpleDetail readData() throws IOException {
        XmlMapper xmlMapper = new XmlMapper();
        String xmlData = StreamUtils.copyToString( new ClassPathResource("payload.xml").getInputStream(),
                Charset.defaultCharset()  );
        SimpleDetail simpleDetail = xmlMapper.readValue(xmlData, SimpleDetail.class);
        return simpleDetail;
    }

}
