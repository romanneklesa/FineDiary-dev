package com.FineDiary.json;

import com.fasterxml.jackson.core.JsonProcessingException;

public interface JsonBuilder {
    void addInfo(Object o);
    String createJson() throws JsonProcessingException;
}
