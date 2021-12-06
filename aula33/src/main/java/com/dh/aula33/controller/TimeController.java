package com.dh.aula33.controller;

import com.dh.aula33.model.Time;
import com.dh.aula33.service.TimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/time")
public class TimeController {

    @Autowired
    private TimeService service;

    @PostMapping
    public Time postTime(@RequestBody Time time) {
        return service.createTime(time);
    }

}
