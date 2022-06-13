package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
    @RequestMapping("/ca?/s?o?/info")
    public String info(Model model){
        model.addAttribute("hi","Infor1");
        return "/info";
    }
    @RequestMapping("/c*/s*/info2")
    public String info2(Model model){
        model.addAttribute("hi","Infor2");
        return "/info";
    }
}
