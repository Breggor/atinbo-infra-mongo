package com.atinbo.web.utils;

import javax.validation.ConstraintViolationException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Breggor on 2016/3/29.
 */
public abstract class ExceptionUtil {

    public static Map<Object, Object> procConstraintViolationException(Exception e) {
        Map<Object, Object> err = new HashMap<>();
        err.put("Exception", e.getMessage());
        if (e.getCause() instanceof ConstraintViolationException) {
            ConstraintViolationException ve = (ConstraintViolationException) e.getCause();
            ve.getConstraintViolations().forEach(ele -> err.put(ele.getPropertyPath(), ele.getMessage()));
        }
        return err;
    }
}
