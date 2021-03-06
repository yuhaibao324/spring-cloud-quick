package com.fegin.controller;

import com.fegin.service.FeginHiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IDEA
 * User: vector
 * Data: 2017/11/29
 * Time: 15:10
 * Description:
 */
@RestController
public class HiController {
    @Autowired
    FeginHiService hiService;

    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    public String sayHi(@RequestParam("name") String name){
        return hiService.sayHiFromClientOne(name);
    }
}
