package com.spittr.controller;

import com.spittr.dao.SpittleRepository;
import com.spittr.pojo.Spitter;
import com.spittr.service.exception.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.util.Map;

/**
 * 1、对SpitterController优化处理复杂的重定向
 * flash属性可以带着数据直到会话结束，重定向后模型数据得到保存
 *
 * 2、异常处理类
 * @author dongmei.gao
 * @date 2019/5/31 13:13
 */
@Controller
@RequestMapping("/flash")
public class SpitterFlashExceptionController {
    private SpittleRepository spittleRepository ;

    /**
     * 为了测试直接抛出一个异常
     * @return
     * @throws NotFoundException
     */
    @RequestMapping(value = "/show",method = RequestMethod.GET)
    public String showForm() throws  NotFoundException{
        NotFoundException e  = new NotFoundException();
        throw  e ;
        //可以根据路径进行业务分类
       // return "form/registerForm";
    }


    @RequestMapping(value = "/register",method = RequestMethod.GET)
    public String showRegisterForm(){

        //可以根据路径进行业务分类
        return "form/registerForm";
    }

    /**
     *
     * @param spitter
     * @param model RedirectAttributes继承了model
     * @return
     */
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String processRegister( Spitter spitter , RedirectAttributes model){

        System.out.println("controller对象打印 ：" + spitter.toString());
        spittleRepository.save(spitter);

        model.addAttribute("username",spitter.getFistName());
        //添加flash属性传递
        model.addFlashAttribute("spitter",spitter);
        //重定向到下面的方法中
        return "redirect:/spi/{username}" ;
    }

    @RequestMapping(value = "/{firstName}",method = RequestMethod.GET)
    public String showSpitterProfile(@PathVariable String  firstName, Model model){
       if( model.containsAttribute("spitter")){
           System.out.println("flash属性传递成功");
         // Map map = model.asMap();
       };
        Spitter spitter = spittleRepository.findByName(firstName);
        model.addAttribute("spitterKey",spitter);
        return "form/profile";
    }

    public SpittleRepository getSpittleRepository() {
        return spittleRepository;
    }

    @Autowired
    public void setSpittleRepository(SpittleRepository spittleRepository) {
        this.spittleRepository = spittleRepository;
    }

}
