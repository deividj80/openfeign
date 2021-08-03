package com.deivid.openfeign.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class CovidDTO {

    private Integer uid;
    private String uf;
    private String state;
    private String cases;
    private String deaths;
    private String suspects;
    private String refuses;
    private LocalDateTime datetime;

}
