package com.laycodding.order.controller;

import com.laycodding.order.service.FeignService;
import com.laycodding.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class OrderController {
    @Autowired
    OrderService orderService;
    @Autowired
    FeignService feignService;
    @RequestMapping("/order")
    public  String addOrder(String name,int id){
        String res=orderService.getUser(id);
        return "商品"+name+"生成订单:"+res;
    }
    @RequestMapping("/order2")
    public  String addOrder2(String name,int id){
        String res=feignService.getUser(id);
        return "商品"+name+"生成订单:"+res;
    }
}
