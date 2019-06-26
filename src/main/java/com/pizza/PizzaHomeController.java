package com.pizza;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author dongmei.gao
 * @date 2019/6/4 9:22
 */
@Controller
public class PizzaHomeController {

    @RequestMapping(value = "/pizza")
    public String homePizza(){
        return "redirect:/pizza/customer/welcome";
    }
}
