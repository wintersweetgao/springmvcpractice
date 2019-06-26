package com.spittr.pojo;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * 需要引入hibernate-validator为JAVA校验api的支持，版本别有6的会有下面的错误
 * java.lang.NoClassDefFoundError: javax/el/ELManager
 *
 * 参考文档 https://blog.csdn.net/durenniu/article/details/79708028
 * @author dongmei.gao
 * @date 2019/5/29 10:45
 */
public class Spitter {

    @NotNull
   @Size(min = 2, max=16)
    private String fistName ;
    @NotNull
    @Size(min = 2, max=16)
    private String lastName ;
    @NotNull
    @Size(min = 3, max=16)
    private String passWord ;

    @Override
    public String toString() {
        return "Spitter{" +
                "fistName='" + fistName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", passWord='" + passWord + '\'' +
                '}';
    }

    public String getFistName() {
        return fistName;
    }

    public void setFistName(String fistName) {
        this.fistName = fistName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
}
