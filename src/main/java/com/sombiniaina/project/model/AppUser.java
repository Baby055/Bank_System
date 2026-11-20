package com.sombiniaina.project.model;

import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Builder;

@Builder
public record AppUser(UUID id, String email, @JsonIgnore String password_hash, Role role, boolean active) {}
