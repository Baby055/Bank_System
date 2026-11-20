package com.sombiniaina.project.model;

import java.math.BigDecimal;
import java.util.UUID;
import lombok.Builder;

@Builder
public record Account(
    UUID id,
    AccountType type,
    BigDecimal balance,
    String currency,
    AccountStatus status,
    Customer customer) {}
