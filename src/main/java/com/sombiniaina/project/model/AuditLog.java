package com.sombiniaina.project.model;

import lombok.Builder;

import java.time.Instant;
import java.util.UUID;

@Builder
public record AuditLog(UUID id, Instant createdAt, UUID actorId, String actorEmail, AuditAction action, EntityType entityType, String details) {}
