package com.sombiniaina.project.repository.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import lombok.*;

import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "agency")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class JAgency {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(nullable = false, unique = true)
    private String code;

    @Column(nullable = false, unique = true)
    private  String name;

    @Column(nullable = false)
    private String address;

    @Column(nullable = false,  unique = true)
    private String phone;

    @Email
    @Column(nullable = false,  unique = true)
    private String email;

    private boolean active;

    @OneToMany(mappedBy = "agency")
    private List<JEmployee> employees;
}
