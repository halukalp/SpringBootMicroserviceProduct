package com.akis_yazilim.oracle.melih.product.model.service;

import com.akis_yazilim.oracle.melih.product.model.entity.Product;
import com.akis_yazilim.oracle.melih.product.utility.ExceptionMessageType;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService extends AbstractProductService
{

    @Override
    protected List<Product> findByPriceGreaterThan(Double limit)
    {
        return null;
    }

    @Override
    protected List<Product> findByPriceGreaterThanEqual(Double limit) {
        return null;
    }

    @Override
    public void deleteByID(Integer id) {

    }

    @Override
    public Product save(Product entity) {
        return null;
    }

    @Override
    public List<Product> findAll() {
        return null;
    }

    @Override
    public Product findByID(Integer id)
    {
        Product product = productRepository.findById(id)
                .orElseThrow(() -> new RuntimeException(ExceptionMessageType.FIND_BY_ID.getValue()));

        return product;
    }
}
