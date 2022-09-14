package com.pgrg.basicdesignpattern.model.adapter;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.web.bind.annotation.GetMapping;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SimpleDetail {

    private Integer id;

    private String name;

    private String address;

    private Integer age;

    @Override
    public String toString() {
        return "SimpleDetail{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                '}';
    }
}
