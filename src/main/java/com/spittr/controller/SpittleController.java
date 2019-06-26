package com.spittr.controller;

import com.spittr.dao.SpittleRepository;
import com.spittr.pojo.Spittle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @author dongmei.gao
 * @date 2019/5/27 14:42
 */
@Controller
@RequestMapping("/spi")
public class SpittleController {
   private SpittleRepository spittleRepository ;

    @RequestMapping(value = "/nopara",method = RequestMethod.GET)
    public String spittles(Model model){
        model.addAttribute("spittleList",spittleRepository.findSpittles(Integer.MAX_VALUE,10));
        return "spittle";
    }

    /**
     *  查询参数方法：适合参数比较少的
     *  请求参数即为 /spi/para?max=5&count=6
     */

    @RequestMapping(value = "/para",method = RequestMethod.GET )
    public String  spittles(@RequestParam(value = "max") long max,@RequestParam(value = "count") int count,Model model){

        List<Spittle> list = spittleRepository.findSpittles(max,count);
        model.addAttribute("spittleList",list);
        return "spittle";
    }

    /**
     * 路径参数方法
     * PathVariable 参数名字和站位符名同时可以不指定value , PathVariable(value = "max")
     * 请求路径：/para_path/5/6
     */
    @RequestMapping(value = "/para_path/{max}/{count}",method = RequestMethod.GET )
    public String  spittlesPath(@PathVariable(value = "max") long max, @PathVariable int count, Model model){

        List<Spittle> list = spittleRepository.findSpittles(max,count);
        model.addAttribute("spittleList",list);
        return "spittle";
    }



    public SpittleRepository getSpittleRepository() {
        return spittleRepository;
    }

    @Autowired
    public void setSpittleRepository(SpittleRepository spittleRepository) {
        System.out.println("对象信息spittleRepository ：" + spittleRepository);
        this.spittleRepository = spittleRepository;
    }
}