package com.repository;

import com.model.FacturacionModel;
import com.model.ProductoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoRepository extends JpaRepository<ProductoModel, Long> {
}
