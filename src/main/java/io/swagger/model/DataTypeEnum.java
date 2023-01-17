package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum DataTypeEnum {
    BIT("Bit"),
    
    TWO_BYTE_INTEGER("Two Byte Integer"),
    
    FOUR_BYTE_INTEGER("Four Byte Integer"),
    
    UTF_8_ENCODED_STRING("UTF-8 Encoded String"),
    
    VARIABLE_BYTE_INTEGER("Variable Byte Integer"),
    
    BINARY_DATA("Binary Data"),
    
    UTF_8_STRING_PAIR("UTF-8 String Pair");

    private String value;

    DataTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static DataTypeEnum fromValue(String text) {
      for (DataTypeEnum b : DataTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }