package com.majdar.fullstackcrud.repository;

import com.majdar.fullstackcrud.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
