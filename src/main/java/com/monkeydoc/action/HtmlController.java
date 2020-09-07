package com.monkeydoc.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HtmlController {
    @GetMapping("/Login")
    public String login(){
        return "login";
    }
    @GetMapping("/LogOn")
    public String logon(){
        return "logon";
    }
    @GetMapping("/Pswmodify")
    public String pswmodify(){
        return "pswmodify";
    }
}
