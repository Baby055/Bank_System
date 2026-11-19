package com.sombiniaina.project.model;

import lombok.Builder;

import java.util.UUID;

@Builder
public record Beneficiary(UUID id, String firstName, String lastName, Account beneficiaryAccount, Customer owner) {}
