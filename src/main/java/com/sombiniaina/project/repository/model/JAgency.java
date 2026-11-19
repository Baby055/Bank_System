package com.sombiniaina.project.repository.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import lombok.*;

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
}
