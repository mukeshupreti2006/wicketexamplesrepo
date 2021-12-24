package com.mycompany;

import java.util.List;

public interface IProductDao {
    Product add(Product product);

    List<Product> findAll(long first, long blockSize);

    long allProductsCount();

    Product findById(int id);
}
