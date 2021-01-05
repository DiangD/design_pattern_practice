package com.qzh.design.pattern.structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName CourseCatalog
 * @Author DiangD
 * @Date 2021/1/5
 * @Version 1.0
 * @Description
 **/
public class CourseCatalog extends CatalogComponent {
    private final List<CatalogComponent> items = new ArrayList<>();
    private String name;
    private Integer level;

    public CourseCatalog(String name,Integer level) {
        this.name = name;
        this.level = level;
    }

    @Override
    public void add(CatalogComponent catalogComponent) {
        this.items.add(catalogComponent);
    }

    @Override
    public void remove(CatalogComponent catalogComponent) {
        items.remove(catalogComponent);
    }

    @Override
    public String getName(CatalogComponent catalogComponent) {
        return this.name;
    }

    @Override
    public void print() {
        System.out.println(this.name);
        for (CatalogComponent item : items) {
            if (this.level != null) {
                for (int i = 0; i < level; i++) {
                    System.out.print(" ");
                }
            }
            item.print();
        }
    }
}
