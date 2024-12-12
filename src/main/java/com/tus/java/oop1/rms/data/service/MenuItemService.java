package com.tus.java.oop1.rms.data.service;

import com.tus.java.oop1.rms.data.record.RestaurantBranchRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.ObjectOptimisticLockingFailureException;
import org.springframework.stereotype.Service;
import com.tus.java.oop1.rms.data.models.MenuItem;
import com.tus.java.oop1.rms.data.repository.api.IMenuItemRepo;

import java.util.Arrays;
import java.util.List;


@Service
public class MenuItemService {

    @Autowired
    private IMenuItemRepo menuItemInterface;

    public List<MenuItem> getMenuItemsByBranch(RestaurantBranchRecord restaurantBranchRecord) {
        return menuItemInterface.findByBranch(restaurantBranchRecord);
    }

    public List<MenuItem> saveMenuItem(MenuItem menuItem) {
        try {
            List<MenuItem> items = Arrays.asList(menuItem);
            return menuItemInterface.saveAll(items);
        } catch (ObjectOptimisticLockingFailureException e) {
            // Handle the optimistic locking failure (e.g., retry the operation or notify the user)
            throw new RuntimeException("The menu item was updated by another transaction. Please try again.", e);
        }

    }

}
