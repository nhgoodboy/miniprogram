package com.musikouyi.miniprogram.repository;

import com.musikouyi.miniprogram.domain.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

    User findUserByAccount(String account);
}
