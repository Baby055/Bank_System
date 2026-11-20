package com.sombiniaina.project.repository.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import java.util.UUID;
import lombok.*;

@Entity
@Table(name = "beneficiary")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class JBeneficiary {
  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  private UUID id;

  @Column(nullable = false)
  @NotBlank
  private String firstName;

  @Column(nullable = false)
  @NotBlank
  private String lastName;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "beneficiary_account_id")
  private JAccount beneficiaryAccount;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "owner_customer_id")
  private JCustomer owner;
}
