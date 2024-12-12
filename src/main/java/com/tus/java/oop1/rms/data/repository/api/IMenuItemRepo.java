package com.tus.java.oop1.rms.data.repository.api;

import com.tus.java.oop1.rms.data.models.MenuItem;
import com.tus.java.oop1.rms.data.record.RestaurantBranchRecord;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IMenuItemRepo extends JpaRepository<MenuItem, Long> {

    List<MenuItem> findByBranch(RestaurantBranchRecord restaurantBranchRecord);

}