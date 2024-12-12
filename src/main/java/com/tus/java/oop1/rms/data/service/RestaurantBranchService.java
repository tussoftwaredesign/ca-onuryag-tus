package com.tus.java.oop1.rms.data.service;

import com.tus.java.oop1.rms.data.models.RestaurantBranch;
import com.tus.java.oop1.rms.data.record.RestaurantBranchRecord;
import com.tus.java.oop1.rms.data.repository.api.IRestaurantBranchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class RestaurantBranchService {

    @Autowired
    private IRestaurantBranchRepository branchRepository;

    @Transactional
    public RestaurantBranch addBranch(RestaurantBranch restaurantBranch) {
        return branchRepository.saveAndFlush(restaurantBranch);
    }

    public RestaurantBranchRecord findByBranch(Long branchId) {
        Optional<RestaurantBranch> branch = branchRepository.findById(branchId);
        if(branch.isPresent()) {
            RestaurantBranch restaurantBranch = branch.get();
            return new RestaurantBranchRecord(restaurantBranch.getBranchId(),
                    restaurantBranch.getAddress(), restaurantBranch.getProperties());
        }
        return null;
        // Returns the branch if found, otherwise returns null
    }

    @Transactional public void deleteById(Long branchId) {
        branchRepository.deleteById(branchId);
    }

    public List<RestaurantBranch> getAllBranches() {
        return branchRepository.findAll();
    }
}

