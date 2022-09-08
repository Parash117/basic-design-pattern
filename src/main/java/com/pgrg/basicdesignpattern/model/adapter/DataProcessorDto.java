package com.pgrg.basicdesignpattern.model.adapter;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DataProcessorDto {
    private Integer id;

    private String appName;

    private String filePath;
}
