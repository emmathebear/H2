package com.example.H2ready;

import jakarta.persistence.*;
import lombok.Data;
@Entity
@Data
@Table
public class User {
    @Id
    @GeneratedValue
    private long id;
    @Column(nullable = false)
    private String name, surname;
    @Column(unique = true, nullable = false)
    private String email;
}
