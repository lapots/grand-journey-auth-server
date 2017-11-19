package com.lapots.game.journey.auth.domain;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;

/**
 * Application user.
 */
@Table(name = "users")
@Entity
@Data
public class User {
    @Id
    private String username;
    @NotNull
    private String password;
    @NotNull
    @Column(name="is_enabled")
    private boolean enabled;
    @ManyToMany(cascade = {
            CascadeType.PERSIST,
            CascadeType.MERGE
    })
    @JoinTable(name = "user_roles",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id")
    )
    private Set<Role> roles = new HashSet<>();
}
