package com.salesianostriana.dam.registrologin.user.repo;

import com.salesianostriana.dam.registrologin.user.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface UserRepository extends JpaRepository<User, UUID> {

    Optional<User> findFirstByUsername(String username);

    boolean existsByUsername(String username);

}
