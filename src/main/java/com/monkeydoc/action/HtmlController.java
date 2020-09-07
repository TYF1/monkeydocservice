package com.monkeydoc.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HtmlController {
    @GetMapping("/Login")
    public String login(){
        return "login";
    }
    @GetMapping("/Logon")
    public String logon(){
        return "logon";
    }
    @GetMapping("/Pswmodify")
    public String pswmodify(){
        return "pswmodify";
    }
}
