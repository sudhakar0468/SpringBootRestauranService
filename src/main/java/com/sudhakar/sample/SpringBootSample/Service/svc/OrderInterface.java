package com.sudhakar.sample.SpringBootSample.Service.svc;

import com.sudhakar.sample.SpringBootSample.Domain.Order;

import java.util.Optional;

public interface OrderInterface {

    Order saveOrder(final Order order);
    Optional<Order> getOrderByID(int id);
}
