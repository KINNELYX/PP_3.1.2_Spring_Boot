package com.sprin.boot.project.spring_boot_userproject.repository;

import com.sprin.boot.project.spring_boot_userproject.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<User, Integer> {
}
