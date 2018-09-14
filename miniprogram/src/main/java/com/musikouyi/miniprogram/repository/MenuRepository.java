package com.musikouyi.miniprogram.repository;

import com.musikouyi.miniprogram.domain.entity.Menu;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MenuRepository extends JpaRepository<Menu, Integer> {
}
