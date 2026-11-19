package com.sombiniaina.project.repository.model;

import jakarta.persistence.*;
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
    private String firstName;

    @Column(nullable = false)
    private String lastName;
}
