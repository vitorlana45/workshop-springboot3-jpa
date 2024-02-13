package com.project.lana.course.repositories;

import com.project.lana.course.entities.Category;
import com.project.lana.course.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem,Long> {


}
