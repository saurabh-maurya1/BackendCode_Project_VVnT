package com.project.vvnt.site.repositories;

import com.project.vvnt.site.entities.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, String>
{

    Optional<User> findByEmail(String email);

    Optional<User> findByEmailAndPassword(String email,String password);

    Page<User> findByNameContaining(String keywords, Pageable pageable);

}
