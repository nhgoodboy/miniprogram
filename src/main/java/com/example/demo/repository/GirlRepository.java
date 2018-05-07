package com.example.demo.repository;

import com.example.demo.domain.entity.Girl;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GirlRepository extends JpaRepository<Girl, Integer> {

}
