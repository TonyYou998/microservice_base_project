package com.uit.microservice_base_project.config;

import com.uit.microservice_base_project.common.utils.ErrorUtil;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;

import java.util.HashMap;
import java.util.Map;

public class ResponseHandler {
    public ResponseHandler() {
    }

    public static ResponseEntity<Object> getResponse(Object content, HttpStatus httpStatus) {
        Map<String, Object> map = new HashMap();
        map.put("Content", content);
        map.put("status", httpStatus.value());
        return new ResponseEntity(map, httpStatus);
    }

    public static ResponseEntity<Object> getResponse(BindingResult errors, HttpStatus httpStatus) {
        Map<String, Object> map = new HashMap();
        map.put("errors", ErrorUtil.getErrorMessages(errors));
        map.put("status", httpStatus.value());
        return new ResponseEntity(map, httpStatus);
    }

    public static Object getResponse(HttpStatus httpStatus) {
        Map<String, Object> map = new HashMap();
        map.put("content", "");
        map.put("errors", "");
        map.put("status", httpStatus.value());
        return new ResponseEntity(map, httpStatus);
    }
}
