package com.enviro.assessment.grad001.MinenhleMadlala.controller;

import com.enviro.assessment.grad001.MinenhleMadlala.entity.WasteCategory;
import com.enviro.assessment.grad001.MinenhleMadlala.service.WasteCategoryService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// Marks this class as a REST controller that handles HTTP requests for waste categories.
// All endpoints are prefixed with "/api/categories".
@RestController
@RequestMapping("/api/categories")
public class WasteCategoryController {

    private final WasteCategoryService wasteCategoryService;

    // Constructor for injecting the service layer dependency.
    public WasteCategoryController(WasteCategoryService wasteCategoryService) {
        this.wasteCategoryService = wasteCategoryService;
    }

    // Handles GET requests to fetch all waste categories.
    @GetMapping
    public List<WasteCategory> getAllCategories() {
        return wasteCategoryService.getAllCategories();
    }

    // Handles POST requests to add a new waste category.
    // Uses @Valid to ensure the incoming data is validated against constraints in the entity.
    @PostMapping
    public WasteCategory addCategory(@Valid @RequestBody WasteCategory category) {
        return wasteCategoryService.addCategory(category);
    }

    // Handles PUT requests to update an existing waste category by its ID.
    @PutMapping("/{id}")
    public WasteCategory updateCategory(@PathVariable Long id, @Valid @RequestBody WasteCategory category) {
        return wasteCategoryService.updateCategory(id, category);
    }

    // Handles DELETE requests to delete a waste category by its ID.
    // Returns a success message or an error message if the category does not exist.
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteCategory(@PathVariable Long id) {
        try {
            String message = wasteCategoryService.deleteCategory(id);
            return ResponseEntity.ok(message); // Returns HTTP 200 with success message.
        } catch (RuntimeException ex) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ex.getMessage()); // Returns HTTP 404 with error message.
        }
    }
}
