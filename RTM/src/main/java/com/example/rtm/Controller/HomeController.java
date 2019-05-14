package com.example.rtm.Controller;

import com.example.rtm.Services.SEService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.logging.Logger;

@Controller
public class HomeController {

    @Autowired
    SEService seService;


    Logger log = Logger.getLogger(HomeController.class.getName());



    private final String INDEX = "index";



    @GetMapping("/")
    public String index(){
        log.info("Index action called... ");


        return INDEX;
    }
}
