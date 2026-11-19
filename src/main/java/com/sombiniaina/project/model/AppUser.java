package com.sombiniaina.project.model;

import lombok.Builder;

import java.util.UUID;

@Builder
public record AppUser(UUID userId, String firstName, String lastName, String email, String password, Role role, boolean active) {}
