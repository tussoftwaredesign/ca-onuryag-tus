package com.tus.java.oop1.rms.rest.controller;

import com.tus.java.oop1.rms.data.models.MenuItem;
import com.tus.java.oop1.rms.data.models.Order;
import com.tus.java.oop1.rms.data.repository.api.IMenuItemRepo;
import com.tus.java.oop1.rms.data.repository.api.IOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class OrderController {

    @Autowired
    private IMenuItemRepo menuItemRepository;

    @Autowired
    private IOrderRepository orderRepository;

    @PostMapping("/order")
    public String orderMenuItem(@RequestBody List<Long> menuItemIds) {
        // Check if all menu items exist
        for (Long itemId : menuItemIds) {
            Optional<MenuItem> menuItem = menuItemRepository.findById(itemId);
            if (!menuItem.isPresent()) {
                return "MenuItem with id " + itemId + " does not exist.";
            }
        }

        // Create and save the order
        Order order = new Order();
        List<MenuItem> menuItems = menuItemRepository.findAllById(menuItemIds);
        order.setMenuItems(menuItems);
        orderRepository.save(order);

        return "Order has been placed successfully.";
    }
}

