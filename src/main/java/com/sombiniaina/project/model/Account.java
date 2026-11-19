package com.sombiniaina.project.model;

import lombok.Builder;

import java.math.BigDecimal;
import java.util.UUID;

@Builder
public record Account(UUID id, AccountType type, BigDecimal balance, String currency, AccountStatus status, Customer customer) {}
