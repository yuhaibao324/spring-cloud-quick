package com.test.customer.controller;

import com.test.customer.service.TestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created with IDEA
 * User: vector
 * Data: 2017/9/28
 * Time: 14:21
 * Description:
 */
@RestController
public class ApiController {
    private static final Logger LOGGER = LoggerFactory.getLogger(ApiController.class);

    @Resource
    private TestService testService;


    @RequestMapping("/customer")
    public String customer() {
        String providerMsg = testService.hiService();
        return "Hello,Customer! msg from provider : <br/><br/> " + providerMsg;
    }

    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    public String sayHi(@RequestParam("name") String name){
        return testService.sayHiFromClientOne(name);
    }
}
