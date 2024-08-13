package com.picpaysimplified.Repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.picpaysimplified.domain.model.User;

public interface UserRespository extends JpaRepository<User, Long>  {
    Optional<User> findByUserDocument(String document);
    Optional<User> findByUserId(Long id);
}
