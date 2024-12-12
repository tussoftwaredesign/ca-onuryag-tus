package com.tus.java.oop1.rms.data.models;

import com.tus.java.oop1.rms.data.record.RestaurantBranchRecord;
import jakarta.persistence.*;


//@Entity
//@Table(name = "menu_items")
//public record MenuItem(
//        @Id
//        @GeneratedValue(strategy = GenerationType.IDENTITY)
//        Long menuId,
//        String name,
//        Double price,
//        Long branchId,
//
//        @Version
//        Long version
//) {}

@Entity
@Table(name = "menu_items")
public class MenuItem {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long menuId;

        private String name;
        private Double price;
        @Embedded
        private RestaurantBranchRecord branch;

        @Version
        private Long version;

        // Constructors
//        public MenuItem() {}

//        public MenuItem(String name, Double price, RestaurantBranch branch) {
//                this.name = name;
//                this.price = price;
//                this.branch = branch;
//        }

        // Getters and Setters
        public Long getMenuId() {
                return menuId;
        }

        public void setMenuId(Long menuId) {
                this.menuId = menuId;
        }

        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

        public Double getPrice() {
                return price;
        }

        public void setPrice(Double price) {
                this.price = price;
        }

        public RestaurantBranchRecord getBranch() {
                return branch;
        }

        public void setBranchId(RestaurantBranchRecord branch) {
                this.branch = branch;
        }

        public Long getVersion() {
                return version;
        }

        public void setVersion(Long version) {
                this.version = version;
        }
}
