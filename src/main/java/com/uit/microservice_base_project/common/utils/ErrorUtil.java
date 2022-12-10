package com.uit.microservice_base_project.common.utils;

import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ErrorUtil {
    public ErrorUtil() {
    }

    public static List<String> getErrorMessages(BindingResult errors) {
        List<String> messages = new LinkedList();
        Iterator var2 = errors.getAllErrors().iterator();

        while(var2.hasNext()) {
            ObjectError err = (ObjectError)var2.next();
            messages.add(err.getDefaultMessage());
        }

        return messages;
    }
}
