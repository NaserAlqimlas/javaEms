package com.nasser.emsBackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.nasser.emsBackend.model.Employee;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
	
	
}
