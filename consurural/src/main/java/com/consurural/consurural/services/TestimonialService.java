package com.consurural.consurural.services;

import com.consurural.consurural.models.Testimonial;
import com.consurural.consurural.repository.TestimonialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestimonialService {

    @Autowired
    private static TestimonialRepository testimonialRepository;

    public static Testimonial saveTestimonials(Testimonial testimonials) {
        List<Testimonial> listTestimonials = returnTestimonial();

        if(listTestimonials.contains(testimonials)) {
            return testimonials;
        } else {
            return testimonialRepository.save(testimonials);
        }
    }

    public static List<Testimonial> returnTestimonial() {
        return testimonialRepository.findAll();
    }

}
