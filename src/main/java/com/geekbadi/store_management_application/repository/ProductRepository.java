package com.geekbadi.store_management_application.repository;

import com.geekbadi.store_management_application.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Optional;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}