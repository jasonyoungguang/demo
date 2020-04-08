package com.example.demo.dto;

import com.alibaba.fastjson.JSON;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DemoDTO {

    private Long id;
    private String name;
    private Integer age;

    public static void main(String[] args) {
        DemoDTO demoDTO = new DemoDTO();
        demoDTO.setId(1L);
        demoDTO.setName("Jason");
        demoDTO.setAge(18);
        System.out.println(JSON.toJSONString(demoDTO));
    }
}
