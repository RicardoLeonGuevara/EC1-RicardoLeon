package com.idat.ev1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.ev1.modelo.MallaCurricular;

@Repository
public interface MallaRepository extends JpaRepository<MallaCurricular, Integer> {

}
