package com.spittr.dao;

import com.spittr.pojo.Spitter;
import com.spittr.pojo.Spittle;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Component注解：该类会作为组件类，spring会创建bean ; 但组建扫描默认不会开启
 * @author dongmei.gao
 * @date 2019/5/27 14:35
 */
@Component(value = "spittleRepository")
public class SpittleRepositoryImpl implements SpittleRepository {
    @Override
    public List<Spittle> findSpittles(long max, int count) {
        List<Spittle>  spittleList = new ArrayList<Spittle>();
        for(int i =0 ; i<count ; i++ ){
            spittleList.add(new Spittle("this is " + i +" obj" , new Date()));
            System.out.println(spittleList.get(i));
        }
        return spittleList;
    }

    @Override
    public Boolean save(Spitter spitter) {
        System.out.println(spitter.toString());
        return null;
    }

    @Override
    public Spitter findByName(String name) {
        Spitter spitter = new Spitter() ;
        spitter.setFistName(name);
        spitter.setLastName("dongmei");
        spitter.setPassWord("my pass word");
        System.out.println("repository find: "+spitter.toString());
        return spitter;
    }


}
