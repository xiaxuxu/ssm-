package com.xx.controller;

import com.xx.dao.Flower;
import com.xx.service.FlowerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/index")
@Controller
public class IndexController {
    @Autowired
    FlowerService flowerService;

    @RequestMapping(value = "/index")
    public String  index(){
        return "index";
    }

    @RequestMapping(value = "/insert",produces = "text/plain;charset=utf-8")
    @ResponseBody
    public String insert(Flower flower){
        flowerService.add(flower);
        return "insert 成功";
    }

}
