package com.sombiniaina.project.repository.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

import java.util.UUID;

@Entity
@Table(name = "customer")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class JCustomer {
    @Id
    private UUID id;

    @OneToOne(fetch = FetchType.LAZY)
    @MapsId
    @JoinColumn(name = "id")
    private JAppUser user;

    @Column(nullable = false)
    @NotBlank
    private String firstName;

    @NotBlank
    @Column(nullable = false)
    private String lastName;
}
