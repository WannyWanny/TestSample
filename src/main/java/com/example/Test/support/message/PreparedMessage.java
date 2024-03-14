package com.example.Test.support.message;

import com.example.Test.support.commonEnum.MessageLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public enum PreparedMessage {

    NO_DATA_FOUND("데이터가 존재하지 않습니다.", MessageLevel.WARN);

    private String message;
    private MessageLevel level;
}
