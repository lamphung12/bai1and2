package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/home")
public class IndexController {
    @RequestMapping("/")
    public String get(Model model){
        model.addAttribute("message","Hello Word");
        return "/home";
    }
    @RequestMapping("/index")
    public String Index(Model model){
        model.addAttribute("message", "Index");
        return "/index";
    }

    @RequestMapping("/c*/s*d/infor")
    ///* đại diện cho 1 hoặc nhiều ký tự
    public ModelAndView Index2(){
     ModelAndView modelAndView = new ModelAndView("/indexx");
     modelAndView.addObject("mes","hi");
     return modelAndView;
    }

    @RequestMapping("/c*/**")
    ///** đại diện cho 2 hoặc nhiều lần /caa/scc hoặc /ccc/aa/bb đều được
    public ModelAndView Index3(){
        ModelAndView modelAndView = new ModelAndView("/indexx");
        modelAndView.addObject("mes","hiiii");
        return modelAndView;
    }
}
