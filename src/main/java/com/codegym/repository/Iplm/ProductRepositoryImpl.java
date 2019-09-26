package com.codegym.repository.Iplm;

import com.codegym.model.Product;
import com.codegym.repository.ProductRepository;

import java.util.ArrayList;
import java.util.List;

public class ProductRepositoryImpl implements ProductRepository {
    List<Product> products = new ArrayList<>();
    {
        products.add(new Product(1,"SamSung",25000, ""));
        products.add(new Product(2,"Iphone",35000, ""));
        products.add(new Product(3,"Nokia",45000, ""));
    }
    @Override
    public List findAll() {
        return products;
    }

    @Override
    public void add(Product product) {
        products.add(product);
    }

}
