package com.enviro.assessment.grad001.MinenhleMadlala.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

// Marks this class as a JPA entity mapped to the "waste_categories" table.
@Entity
@Table(name = "waste_categories")
public class WasteCategory {

    // Marks this field as the primary key and sets it to auto-generate using
    // the database's identity column feature.
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Ensures the "name" field cannot be null or blank during validation.
    @NotBlank(message = "Name cannot be blank")
    private String name;

    // Maps this field to the database and ensures its maximum length is 255 characters.
    @Column
    @Size(max = 255, message = "Description must be less than 255 characters")
    private String description;

    // Getters and setters provide access to the private fields and allow data manipulation.
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
