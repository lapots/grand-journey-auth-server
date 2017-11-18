package com.lapots.game.journey.auth.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

/**
 * User role.
 */
@Entity
@Table(name="roles")
@Data
public class Role {
    @Id
    @GeneratedValue
    private UUID id;
    private String description;
    @ManyToMany(mappedBy = "roles")
    private Set<User> users = new HashSet<>();
}
