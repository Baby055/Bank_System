package com.sombiniaina.project.repository.model;

import com.sombiniaina.project.model.TransactionStatus;
import com.sombiniaina.project.model.TransactionType;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import java.math.BigDecimal;
import java.time.Instant;
import java.util.UUID;
import lombok.*;

@Entity
@Table(name = "transaction")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class JTransaction {
  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  private UUID id;

  @Enumerated(EnumType.STRING)
  private TransactionType type;

  @Positive private BigDecimal amount;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "source_account_id", nullable = false)
  private JAccount sourceAccount;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "destination_account_id", nullable = false)
  private JAccount destinationAccount;

  @Enumerated(EnumType.STRING)
  @Column(nullable = false)
  private TransactionStatus status;

  @Column(nullable = false, unique = true)
  @NotBlank
  private String reference;

  private Instant date;
}
