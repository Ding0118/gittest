package com.itheima.dao;

import com.itheima.pojo.Items;

import java.util.List;

/**
 * @description:
 * @author: ding
 * @date: 2020/8/16 18:25
 */
public interface ItemsDao {
    List<Items> findAll();
    Integer add(Items items);
    void delete(Integer id);
    void update(Items items);
}
