package com.sudhakar.sample.SpringBootSample.Service.impl;

import com.sudhakar.sample.SpringBootSample.Domain.Order;
import com.sudhakar.sample.SpringBootSample.Dto.OrderRepository;
import com.sudhakar.sample.SpringBootSample.Service.svc.OrderInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class OrderSvcImpl implements OrderInterface {

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public Order saveOrder(Order order) {
        return orderRepository.save(order);
    }

    @Override
    public Optional<Order> getOrderByID(int id) {

        return orderRepository.findById(id);
    }
}
