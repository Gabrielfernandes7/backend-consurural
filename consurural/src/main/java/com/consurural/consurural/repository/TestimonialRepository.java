package com.consurural.consurural.repository;

import com.consurural.consurural.models.Testimonial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestimonialRepository extends JpaRepository<Testimonial, Long> {
}
