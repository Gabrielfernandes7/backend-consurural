package com.consurural.consurural.services;

import com.consurural.consurural.models.Customer;
import com.consurural.consurural.repository.ConsultancesRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConsultancesService {

    private ConsultancesRepository repo;

    public ConsultancesService(ConsultancesRepository repo) {
        this.repo = repo;
    }

    public String getPhone(long id) {
        return repo.findById(id).get().getPhone();
    }

}
