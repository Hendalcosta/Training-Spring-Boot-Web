package com.phantom.trainingSpringBootWeb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.phantom.trainingSpringBootWeb.entities.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long>{

}
