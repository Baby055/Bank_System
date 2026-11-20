package com.sombiniaina.project.repository.model;

import com.sombiniaina.project.model.AuditAction;
import com.sombiniaina.project.model.EntityType;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import java.time.Instant;
import java.util.UUID;
import lombok.*;

@Entity
@Table(name = "audit_log")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class JAuditLog {
  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  private UUID id;

  private Instant createdAt;

  private UUID actorId;

  @Email
  @Column(nullable = false, unique = true)
  private String actorEmail;

  @Enumerated(EnumType.STRING)
  private AuditAction action;

  @Enumerated(EnumType.STRING)
  private EntityType entityType;

  private String details;
}
