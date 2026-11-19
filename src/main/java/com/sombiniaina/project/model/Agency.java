package com.sombiniaina.project.model;

import lombok.Builder;

import java.util.UUID;

@Builder
public record Agency(UUID id, String code, String name, String address, String phone, String email, boolean status) {}
