package com.sombiniaina.project.model;

import java.util.UUID;
import lombok.Builder;

@Builder
public record Agency(
    UUID id,
    String code,
    String name,
    String address,
    String phone,
    String email,
    boolean status) {}
