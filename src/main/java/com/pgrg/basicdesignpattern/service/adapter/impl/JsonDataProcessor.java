package com.pgrg.basicdesignpattern.service.adapter.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.pgrg.basicdesignpattern.model.adapter.SimpleDetail;
import com.pgrg.basicdesignpattern.service.adapter.JsonDataReaderInterface;
import org.springframework.core.io.ClassPathResource;
import org.springframework.util.StreamUtils;

import java.io.IOException;
import java.nio.charset.Charset;

public class JsonDataProcessor implements JsonDataReaderInterface {

    @Override
    public SimpleDetail readJsonData() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        String json = StreamUtils.copyToString( new ClassPathResource("payload.json").getInputStream(),
                Charset.defaultCharset()  );
        SimpleDetail simpleDetail = objectMapper.readValue(json, SimpleDetail.class);
        return simpleDetail;
    }
}
