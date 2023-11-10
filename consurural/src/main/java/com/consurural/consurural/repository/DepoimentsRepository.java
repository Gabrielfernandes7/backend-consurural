package com.consurural.consurural.repository;

import com.consurural.consurural.models.Depoiments;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepoimentsRepository extends JpaRepository<Depoiments, Long> {
}
