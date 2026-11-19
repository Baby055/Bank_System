package com.sombiniaina.project.model;

import lombok.Builder;

import java.util.UUID;

@Builder
public record Employee(UUID id, AppUser user, String firstName, String lastName, Agency agency) {}
