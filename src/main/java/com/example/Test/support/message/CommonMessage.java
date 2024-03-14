package com.example.Test.support.message;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public enum CommonMessage {

    NONE("없음")
    ;

    private String value;
}
