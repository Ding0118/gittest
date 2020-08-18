package com.itheima.service.impl;

import com.itheima.dao.ItemsDao;
import com.itheima.pojo.Items;
import com.itheima.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @description:
 * @author: ding
 * @date: 2020/8/16 19:38
 */
@Service
public class ItemsServiceImpl implements ItemsService {
    @Autowired
    private ItemsDao itemsDao;
    @Override
    public List<Items> findAll() {
        return itemsDao.findAll();
    }

    @Override
    public Integer add(Items items) {
        return itemsDao.add(items);
    }

    @Override
    public void update(Items items) {
        itemsDao.update(items);
    }

    @Override
    public void delete(Integer id) {
        itemsDao.delete(id);
    }
}
