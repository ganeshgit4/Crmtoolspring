package com.CRMVCUBEUSERAPI.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.CRMVCUBEUSERAPI.Entity.Employe;

@Repository
public interface EmployeRepository extends JpaRepository<Employe, Long> {

}
