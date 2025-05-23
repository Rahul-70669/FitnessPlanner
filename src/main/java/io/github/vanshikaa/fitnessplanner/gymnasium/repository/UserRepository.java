package io.github.vanshikaa.fitnessplanner.gymnasium.repository;

import io.github.vanshikaa.fitnessplanner.gymnasium.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByName(String name);

}
