package com.lming.chcservice.dto;

import lombok.Data;

import java.util.List;

@Data
public class UserNavDTO {

    private String openid;

    private List<String> navList;
}
