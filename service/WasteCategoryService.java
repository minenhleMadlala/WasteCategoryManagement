package com.enviro.assessment.grad001.MinenhleMadlala.service;

import com.enviro.assessment.grad001.MinenhleMadlala.entity.WasteCategory;
import com.enviro.assessment.grad001.MinenhleMadlala.repository.WasteCategoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

// Marks this class as a service component in the Spring application.
// Spring will manage this as a bean and allow it to be injected into other components.
@Service
public class WasteCategoryService {

    // The repository handles interactions with the database.
    private final WasteCategoryRepository wasteCategoryRepository;

    // Constructor-based dependency injection to initialize the repository.
    public WasteCategoryService(WasteCategoryRepository wasteCategoryRepository) {
        this.wasteCategoryRepository = wasteCategoryRepository;
    }

    // Method to fetch all waste categories from the database.
    // It calls the repository's findAll() method and returns a list of WasteCategory objects.
    public List<WasteCategory> getAllCategories() {
        return wasteCategoryRepository.findAll();
    }

    // Method to add a new waste category to the database.
    // It uses the repository's save() method to persist the category.
    public WasteCategory addCategory(WasteCategory category) {
        return wasteCategoryRepository.save(category);
    }

    // Method to delete a waste category by its ID.
    // First, it checks if the category exists in the database using existsById().
    // If the category is not found, it throws a RuntimeException.
    // Otherwise, it deletes the category and returns a success message.
    public String deleteCategory(Long id) {
        if (!wasteCategoryRepository.existsById(id)) {
            throw new RuntimeException("Category not found with ID: " + id);
        }
        wasteCategoryRepository.deleteById(id);
        return "Category with ID " + id + " was deleted successfully!";
    }

    // Method to update an existing waste category by its ID.
    // First, it retrieves the category from the database using findById().
    // If the category is not found, it throws a RuntimeException.
    // Otherwise, it updates the category's fields and saves the changes.
    public WasteCategory updateCategory(Long id, WasteCategory updatedCategory) {
        WasteCategory existingCategory = wasteCategoryRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Category not found with ID: " + id));

        existingCategory.setName(updatedCategory.getName());
        existingCategory.setDescription(updatedCategory.getDescription());
        return wasteCategoryRepository.save(existingCategory);
    }
}
