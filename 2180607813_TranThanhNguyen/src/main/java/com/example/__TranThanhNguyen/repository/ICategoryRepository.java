package com.example.__TranThanhNguyen.repository;

import com.example.__TranThanhNguyen.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICategoryRepository extends JpaRepository<Category, Long> {
}

