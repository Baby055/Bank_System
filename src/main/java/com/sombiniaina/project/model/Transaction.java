package com.sombiniaina.project.model;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.UUID;
import lombok.Builder;

@Builder
public record Transaction(
    UUID id,
    TransactionType type,
    BigDecimal amount,
    Account sourceAccount,
    Account destinationAccount,
    TransactionStatus status,
    String reference,
    Instant date) {}
