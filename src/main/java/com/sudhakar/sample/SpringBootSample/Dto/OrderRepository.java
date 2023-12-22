package com.sudhakar.sample.SpringBootSample.Dto;

import com.sudhakar.sample.SpringBootSample.Domain.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Integer> {


}
