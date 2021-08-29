package com.dduarte.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dduarte.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
