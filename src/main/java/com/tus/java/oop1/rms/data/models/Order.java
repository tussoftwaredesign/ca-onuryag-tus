package com.tus.java.oop1.rms.data.models;

import com.tus.java.oop1.rms.utils.OrderStatus;
import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "orders")
public class Order {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long orderId;

        @ManyToOne
        @JoinColumn(name = "branch_id")
        private RestaurantBranch branch;

        @ManyToMany
        @JoinTable(
                name = "order_menu_items",
                joinColumns = @JoinColumn(name = "order_id"),
                inverseJoinColumns = @JoinColumn(name = "menu_item_id")
        )
        private List<MenuItem> menuItems;

        public void setMenuItems(List<MenuItem> menuItems) { this.menuItems = menuItems; }

        private LocalDateTime date;

        @Enumerated(EnumType.STRING)
        private OrderStatus status;

        private Double totalPrice;

        public Long getId() {
                return orderId;
        }

        public void setId(Long id) {
                this.orderId = id;
        }
}

