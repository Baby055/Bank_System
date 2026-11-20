package com.sombiniaina.project.model;

import java.util.UUID;
import lombok.Builder;

@Builder
public record Employee(UUID id, AppUser user, String firstName, String lastName, Agency agency) {}
