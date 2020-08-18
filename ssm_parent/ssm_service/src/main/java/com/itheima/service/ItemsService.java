package com.itheima.service;

import com.itheima.pojo.Items;

import java.util.List;

/**
 * @description:
 * @author: ding
 * @date: 2020/8/16 19:38
 */
public interface ItemsService {
   List<Items> findAll();
   Integer add(Items items);
   void update(Items items);
   void delete(Integer id);
}
