package com.sak.ZenQuotes_SVC.repository;

import com.sak.ZenQuotes_SVC.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
