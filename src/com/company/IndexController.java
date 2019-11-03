package com.company;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/index")
public class IndexController {

    @RequestMapping(value = "")
    public String myPage(){
        return "index";
    }

}

