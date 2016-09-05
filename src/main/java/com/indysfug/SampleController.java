package com.indysfug;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author matt.rasband
 */
@RestController
@RequestMapping(produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class SampleController {
    @RequestMapping(value = "/foo", method = RequestMethod.GET)
    public Map<String, String> foo() {
        Map<String, String> entity = new HashMap<>();
        entity.put("foo", "this thing says foo a lot");
        return entity;
    }
}
