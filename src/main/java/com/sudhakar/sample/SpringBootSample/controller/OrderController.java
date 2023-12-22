package com.sudhakar.sample.SpringBootSample.controller;

import com.sudhakar.sample.SpringBootSample.Domain.Order;
import com.sudhakar.sample.SpringBootSample.Service.svc.OrderInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/orderData")
public class OrderController {

    @Autowired
    private OrderInterface orderInterface;

    @PostMapping(path = "/save",consumes = MediaType.APPLICATION_JSON_VALUE)
    public Order saveOrder(@RequestBody final Order order){
        return orderInterface.saveOrder(order);
    }

    @GetMapping("/byId/{id}")
    public Optional<Order> getOrderDetails(@PathVariable Integer id){
        return orderInterface.getOrderByID(id);
    }
}
