package com.sombiniaina.project.repository.model;

import com.sombiniaina.project.model.AccountStatus;
import com.sombiniaina.project.model.AccountType;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import java.math.BigDecimal;
import java.util.UUID;
import lombok.*;

@Entity
@Table(name = "account")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class JAccount {
  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  private UUID id;

  @Enumerated(EnumType.STRING)
  private AccountType type;

  private BigDecimal balance;

  @NotBlank private String currency;

  @Enumerated(EnumType.STRING)
  private AccountStatus status;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "customer_id")
  private JCustomer customer;
}
