package com.expertise_tech.gebu.entites;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Center {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String name;
        private String location;

        @OneToMany(mappedBy = "center")
        @JsonIgnore
        private List<Budget> budgets;

        @OneToOne(mappedBy = "center")
        @JsonIgnore
        private Account account;

}
