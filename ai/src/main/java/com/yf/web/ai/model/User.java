package com.yf.web.ai.model;

import lombok.Data;

import java.io.Serializable;

/**
 * @author YangLF
 * @date 2018/1/17
 */
@Data
public class User implements Serializable {
    private Long id;
    private  String name;
}
