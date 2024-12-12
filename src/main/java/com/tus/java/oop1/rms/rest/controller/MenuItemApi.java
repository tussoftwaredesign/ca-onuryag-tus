package com.tus.java.oop1.rms.rest.controller;

import com.tus.java.oop1.rms.data.models.MenuItem;
import com.tus.java.oop1.rms.data.service.MenuItemService;
import com.tus.java.oop1.rms.data.service.RestaurantBranchService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/menu")
//@Slf4j
public class MenuItemApi {
    @Autowired
    private MenuItemService menuItemService;

    private static final Logger logger = LoggerFactory.getLogger(MenuItemApi.class);
    @Autowired
    private RestaurantBranchService restaurantBranchService;


    @GetMapping("/{branchId}")
    public List<MenuItem> getMenuByBranch(@PathVariable Long branchId) {
        logger.info("Get Menu Item...");
        return menuItemService.getMenuItemsByBranch(restaurantBranchService.findByBranch(branchId));
    }

    @PostMapping
    public List<MenuItem> saveMenu(@RequestBody MenuItem menuItem) {
        logger.info("Add Menu Item...");
        return menuItemService.saveMenuItem(menuItem);
    }

    @PostMapping("/order")
    public String orderMenuItem(@RequestBody List<Long> menuItemIds) {
        // Logic to place the order
        logger.info("Place order from Menu Item...");
        return "Order placed successfully!";
    }
}
