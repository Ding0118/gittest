package com.itheima.controller;

import com.itheima.pojo.Items;
import com.itheima.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @description:
 * @author: ding
 * @date: 2020/8/16 20:18
 */
@Controller
@RequestMapping("/items")
public class ItemsController {
    @Autowired
    private ItemsService itemsService;

    @GetMapping("/findAll")
    public String findAll(Model model){
        // model 数据模型
        List<Items> items = itemsService.findAll();
        // 塞给页面
        model.addAttribute("items",items);
        // modelAndView 数据与视图 基本不用
        return "items";
    }
    @RequestMapping("/add")
    public void add(@RequestBody Items items){
        itemsService.add(items);
    }
    @RequestMapping("/update")
    public void update(@RequestBody Items items){
        itemsService.update(items);
    }
    @RequestMapping("/delete")
    public void delete(Integer id){
        itemsService.delete(id);
    }
}
