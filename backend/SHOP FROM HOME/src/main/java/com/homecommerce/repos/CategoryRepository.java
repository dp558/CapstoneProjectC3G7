package com.homecommerce.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.homecommerce.entity.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {

}
