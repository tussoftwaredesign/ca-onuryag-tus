package com.tus.java.oop1.rms.data.processor;

import com.tus.java.oop1.rms.data.models.MenuItem;

public class MenuItemProcessor<S extends MenuItem> {

    private S menuItem;

    public MenuItemProcessor(S menuItem) {
        this.menuItem = menuItem;
    }

    public void process() {
        // Your processing logic here
    }

    public S getMenuItem() {
        return menuItem;
    }
}

