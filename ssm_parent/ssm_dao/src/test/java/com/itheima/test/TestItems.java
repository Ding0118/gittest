package com.itheima.test;

import com.itheima.dao.ItemsDao;
import com.itheima.pojo.Items;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @description:
 * @author: ding
 * @date: 2020/8/16 19:26
 */
public class TestItems {
    @Test
    public void findAll(){
        ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext("classpath:spring-mybatis.xml");
        ItemsDao itemsDao = app.getBean(ItemsDao.class);
        List<Items> items = itemsDao.findAll();
        for (Items item : items) {
            System.out.println(item);
        }
    }
}
