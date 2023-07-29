package dev.danvega.jpasecurity.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import dev.danvega.jpasecurity.model.User;

public interface UserRepository extends CrudRepository<User,Long> {

    Optional<User> findByUsername(String username);

}
