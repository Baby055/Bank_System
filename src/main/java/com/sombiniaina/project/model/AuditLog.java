package com.sombiniaina.project.model;

import java.time.Instant;
import java.util.UUID;
import lombok.Builder;

@Builder
public record AuditLog(
    UUID id,
    Instant createdAt,
    UUID actorId,
    String actorEmail,
    AuditAction action,
    EntityType entityType,
    String details) {}
