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
public class Budget {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String periode;

    @ManyToOne
    private Center center;

    @ManyToOne
    private Year Year;

    @OneToMany(mappedBy = "budget")
    @JsonIgnore
    private List<Op> opList;

    @OneToMany(mappedBy = "budget")
    @JsonIgnore
    private List<Expense> expenseList;

    @OneToMany(mappedBy = "budget")
    @JsonIgnore
    private List<Recipe> recipeList;
}
