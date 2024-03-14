package com.example.Test.support.utils;

import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.List;

@Component
public class CommonUtils {

    /**
     * BigDecimal null check util
     */
    public static BigDecimal nvl(final BigDecimal bigDecimal) {
        return bigDecimal == null ? BigDecimal.ZERO : bigDecimal;
    }

    /**
     * Map의 Key를 생성
     */
    public static String createKey(String ... values) {
        StringBuilder keys = new StringBuilder();
        for (String v : values) {
            keys.append(v);
        }
        return keys.toString();
    }

    /**
     *  list가 비어있는지 판단
     */
    public static <T> boolean isListEmpty(List<T> list) {
        return list == null || list.isEmpty();
    }
}
