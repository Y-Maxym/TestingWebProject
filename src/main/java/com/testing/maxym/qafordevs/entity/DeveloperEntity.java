package com.testing.maxym.qafordevs.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "developers")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DeveloperEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String email;
    private String firstName;
    private String lastName;
    private String specialty;

    @Enumerated(EnumType.STRING)
    private Status status;
}
