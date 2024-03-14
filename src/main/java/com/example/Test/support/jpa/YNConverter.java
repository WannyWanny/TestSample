package com.example.Test.support.jpa;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter
public class YNConverter implements AttributeConverter<Boolean, String> {

    public String convertToDatabaseColumn(Boolean attr) {
        return (attr != null && attr) ? "Y" : "N";
    }

    public Boolean convertToEntityAttribute(String s) {
        return "Y".equals(s);
    }
}
