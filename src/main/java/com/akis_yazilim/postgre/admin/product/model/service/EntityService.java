package com.akis_yazilim.postgre.admin.product.model.service;

import java.util.List;

public interface EntityService<E, I>
{
    void deleteByID(I id);

    E save(E entity);

    List<E> findAll();

    E findByID(I id);
}
