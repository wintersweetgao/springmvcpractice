package com.spittr.controller;

import com.spittr.dao.SpittleRepository;
import com.spittr.pojo.Spitter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

/**
 * 处理表单类型的控制器
 *
 * @author dongmei.gao
 * @date 2019/5/29 10:42
 */
@Controller
@RequestMapping("/spi")
public class SpitterController {

    private SpittleRepository spittleRepository ;

    @RequestMapping(value = "/register",method = RequestMethod.GET)
    public String showRegisterForm(){

        //可以根据路径进行业务分类
        return "form/registerForm";
    }

    /**
     * Spitter作为参数中的属性要和页面请求的同名字参数进行填充
     *
     * @param spitter
     * @return  "form/registerForm";会引入子目录的jsp文件，很方便的将视图模板组织为层次目录结构
     */
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String processRegister(@Valid Spitter spitter,Errors errors,Model model){
        if(errors.hasErrors()){
            System.out.println("校验错误信息为："+errors.toString());
            return "form/registerForm";
        }
        System.out.println("controller对象打印 ：" + spitter.toString());
        spittleRepository.save(spitter);

        model.addAttribute("username",spitter.getFistName());
        /**
         * https://www.cnblogs.com/maying3010/p/6682582.html
         * 重定向，服务器收到请求后发送一个状态码给客户端，让客户端再重新请求，
         * 并且第一次请求中Request里的数据消失。所以redirect相当于客户端向服务器发出两次请求，
         * 第一次请求的数据不会转发给第二次请求，URL地址会变化两次
         * (原始请求+模型spitter)-----重定向-----> 重定向请求+模型（空）
         * 重定向到另外一Controller继续处理(定位根据路径进行的),下面的showSpitterProfile;
         *
         * forward
         *转发(前往)，服务器内部的重定向，在Servlet中通过RequestDispatcher转发给另一个程序处理请求，
         *请求的数据依然在。所以forward相当于客户端向服务器发送一次请求，服务器处理两次，请求数据不会消失且URL地址只变化一次
         */
        //当构建url或sql查询时，使用string连接比较危险
       // return "redirect:/spi/" + spitter.getFistName() ;
       // return "home"; 回到主頁面
        //占位符填充url模板中，而不是直接重定向到String中，不安全字符会进行转义；适合传递简单参数。
        return "redirect:/spi/{username}" ;
    }

    @RequestMapping(value = "/{firstName}",method = RequestMethod.GET)
    public String showSpitterProfile(@PathVariable String  firstName, Model model){
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
