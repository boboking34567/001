package com.bobonode.user;

import com.bobonode.crm.utils.DateTimeUtil;
import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @program: crm001
 * @description:
 * @author: Mr.WangBoBo
 * @create: 2021-11-07 20:06
 **/
public class Test01 {
    @Test
    public void test01(){
     /*   System.out.println("111");*/
        /*Date date=new Date();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String sdfDate=sdf.format(date);*/
        String expireTime="2021-12-07 20:15:30";
        String currentTime= DateTimeUtil.getSysTime();
        Integer count=expireTime.compareTo(currentTime);
        System.out.println(count);


    }
}
