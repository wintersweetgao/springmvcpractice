package com.spittr.dao;

import com.spittr.pojo.Spitter;
import com.spittr.pojo.Spittle;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author dongmei.gao
 * @date 2019/5/27 14:20
 */

public interface SpittleRepository {
     List<Spittle> findSpittles(long max, int count);

     public Boolean save(Spitter spitter);

     public Spitter findByName(String name);
}
