package com.consurural.consurural.repository;

import com.consurural.consurural.models.Consultances;
import com.consurural.consurural.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
