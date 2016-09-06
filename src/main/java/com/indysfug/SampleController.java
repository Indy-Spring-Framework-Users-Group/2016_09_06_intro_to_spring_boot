package com.indysfug;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author matt.rasband
 */
@RestController
@RequestMapping(produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class SampleController {
    private final FooRepository fooRepository;

    @Autowired
    public SampleController(FooRepository fooRepository) {
        this.fooRepository = fooRepository;
    }

    @RequestMapping(value = "/foo", method = RequestMethod.GET)
    public Iterable<FooEntity> foo() {
        return fooRepository.findAll();
    }

    @RequestMapping(value = "/foo", method = RequestMethod.POST)
    public FooEntity createFoo(@RequestBody FooEntity fooEntity) {
        return fooRepository.save(fooEntity);
    }
}
