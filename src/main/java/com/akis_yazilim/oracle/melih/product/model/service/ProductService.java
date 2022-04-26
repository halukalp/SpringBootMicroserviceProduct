package com.akis_yazilim.oracle.melih.product.model.service;

import com.akis_yazilim.oracle.melih.product.model.entity.Product;
import com.akis_yazilim.oracle.melih.product.utility.ExceptionMessageType;
import com.akis_yazilim.oracle.melih.product.utility.Util;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class ProductService extends AbstractProductService
{
    @Override
    protected List<Product> findByPriceGreaterThan(Double limit)
    {
        return productRepository.findByPriceGreaterThan(limit);
    }

    @Override
    protected List<Product> findByPriceGreaterThanEqual(Double limit)
    {
        return productRepository.findByPriceGreaterThanEqual(limit);
    }

    @Override
    public void deleteByID(Integer id)
    {
        try
        {
            productRepository.deleteById(id);
        }
        catch (IllegalArgumentException e)
        {
            Util.showExceptionInfo(e);
        }
    }

    @Override
    public Product save(Product entity)
    {
        try
        {
            entity.setCreated(new Date());
            return productRepository.save(entity);
        }
        catch (IllegalArgumentException e)
        {
            Util.showExceptionInfo(e);
            return null;
        }
    }

    @Override
    public List<Product> findAll()
    {
        return productRepository.findAll();
    }

    @Override
    public Product findByID(Integer id)
    {
        Product product = productRepository.findById(id)
                .orElseThrow(() -> new RuntimeException(ExceptionMessageType.FIND_BY_ID.getValue()));

        return product;
    }
}
