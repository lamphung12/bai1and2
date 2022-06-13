package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Caculator {
    @GetMapping("/caculator")
    public ModelAndView tinh(){
        ModelAndView modelAndView = new ModelAndView("cacu");
        return modelAndView;
    }
    @PostMapping("/caculator")
    public ModelAndView tinh(@RequestParam("number1")double number1,@RequestParam("number2")double number2,@RequestParam("opera")String opera){
      ModelAndView modelAndView = new ModelAndView("cacu");
        double result =0;
        switch (opera){
            case "+":
                result=number1+number2;
                break;
            case "-":
                result = number1-number2;
                break;
            case "*":
                result = number1*number2;
                break;
            case "/":
                result= number1/number2;
                break;
        }
        modelAndView.addObject("result",result);

        return modelAndView;

    }

}
