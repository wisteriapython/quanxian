package com.yujian.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonUtil {

    public static String object2JsonStr(Object obj){
        String json="";
        ObjectMapper objectMapper=new ObjectMapper();
        try {
            json=objectMapper.writeValueAsString(obj);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return json;
    }
}
