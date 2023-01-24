package com.clasePlatzi.market_platzi.persistence.crud;

import com.clasePlatzi.market_platzi.persistence.entity.Producto;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface ProductoCrudRepository extends CrudRepository<Producto,Integer> {

    List<Producto> getByCategoria(int idCategoria);
    Optional<List<Producto>> findByCantidadStockLessThanAndEstado(int cantidadStock, boolean estado);

    List<Producto> findByIdCategoriaOrderByNombreAsc(int idCategoria);






}
