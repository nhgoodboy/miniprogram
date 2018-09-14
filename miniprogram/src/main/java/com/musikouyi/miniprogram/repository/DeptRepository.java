package com.musikouyi.miniprogram.repository;

import com.musikouyi.miniprogram.domain.entity.Dept;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeptRepository extends JpaRepository<Dept, Integer> {
}
