package com.itheima.test;

import com.itheima.dao.ItemsDao;
import com.itheima.pojo.Items;
import com.itheima.service.ItemsService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @description:
 * @author: ding
 * @date: 2020/8/16 19:57
 */
public class TestService {
    @Test
    public void findAll(){
        ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext("classpath:spring-service.xml");
        ItemsService itemsService= app.getBean(ItemsService.class);
        List<Items> items = itemsService.findAll();
        for (Items item : items) {
            System.out.println(item);
        }
    }
}
