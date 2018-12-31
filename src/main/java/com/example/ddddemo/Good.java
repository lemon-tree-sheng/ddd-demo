package com.example.ddddemo;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author sheng 2018/12/31
 * @desc todo
 */
@Data
@AllArgsConstructor
public class Good {

    private String goodId;
    private String name;
    private Integer price;

}
