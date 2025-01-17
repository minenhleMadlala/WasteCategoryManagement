package com.enviro.assessment.grad001.MinenhleMadlala.repository;

import com.enviro.assessment.grad001.MinenhleMadlala.entity.WasteCategory;
import org.springframework.data.jpa.repository.JpaRepository;

// This repository interface handles database interactions for the WasteCategory entity.
// JpaRepository provides built-in CRUD operations and query methods.
public interface WasteCategoryRepository extends JpaRepository<WasteCategory, Long> {

}
