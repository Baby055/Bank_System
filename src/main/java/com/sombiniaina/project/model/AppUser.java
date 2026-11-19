package com.sombiniaina.project.model;

import lombok.Builder;

import java.util.UUID;

@Builder
public record AppUser(UUID id, String email, String password, Role role, boolean active) {}
