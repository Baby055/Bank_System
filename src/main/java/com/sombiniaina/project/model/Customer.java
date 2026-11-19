package com.sombiniaina.project.model;

import lombok.Builder;

import java.util.UUID;

@Builder
public record Customer(UUID id, AppUser user, String firstName, String lastName) {}
