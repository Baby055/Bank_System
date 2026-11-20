package com.sombiniaina.project.model;

import java.util.UUID;
import lombok.Builder;

@Builder
public record AppUser(UUID id, String email, String password, Role role, boolean active) {}
