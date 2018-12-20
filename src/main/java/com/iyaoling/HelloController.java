package com.iyaoling;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by dingyiming on 2017/2/20.
 */
@RestController
@RequestMapping("/api")
public class HelloController {

    @Autowired
    private GirlProperties girlProperties;

//    @RequestMapping(value = "/say/{id}", method = RequestMethod.GET)
    @GetMapping(value = "/say/{id}") // 组合注解
    public String say(@PathVariable("id")  Integer id, @RequestParam(value = "item", required = false, defaultValue = "spring") String name) {
//        return girlProperties.getCupSize() + "," + girlProperties.getAge();
        return "id:" + id + " , name:" + name;
    }
}
