package com.kioskong.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kioskong.app.models.Producto;

public interface ProductoRepository extends JpaRepository<Producto,Integer> {

}

