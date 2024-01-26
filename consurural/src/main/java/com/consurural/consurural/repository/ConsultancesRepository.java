package com.consurural.consurural.repository;

import com.consurural.consurural.models.Consultances;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConsultancesRepository extends JpaRepository<Consultances, Long> {

}
