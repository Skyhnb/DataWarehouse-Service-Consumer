package com.example.serverconsumer.entity.MySQLEntiy;

public class ProductGroup {
    private Integer product_group_id;
    private Integer product_id;

    public void setProduct_id(Integer product_id) {
        this.product_id = product_id;
    }

    public Integer getProduct_group_id() {
        return product_group_id;
    }

    public void setProduct_group_id(Integer product_group_id) {
        this.product_group_id = product_group_id;
    }

    public Integer getProduct_id() {
        return product_id;
    }
}
