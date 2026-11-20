package com.sombiniaina.project.model;

import java.util.UUID;
import lombok.Builder;

@Builder
public record Beneficiary(
    UUID id, String firstName, String lastName, Account beneficiaryAccount, Customer owner) {}
