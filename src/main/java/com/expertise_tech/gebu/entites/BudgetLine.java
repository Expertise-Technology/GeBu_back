package com.expertise_tech.gebu.entites;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class BudgetLine {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private Integer numLine;
        private String description;

        @OneToMany(mappedBy = "budgetLine")
        @JsonIgnore
        private List<Expense> expense;

        @ManyToOne
        @JoinColumn(name = "category_id")
        private Category category;

        // getters and setters

}
