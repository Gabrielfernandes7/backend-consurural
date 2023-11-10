package com.consurural.consurural.services;
import com.consurural.consurural.models.Depoiments;
import com.consurural.consurural.repository.DepoimentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepoimentsService {

    @Autowired
    private static DepoimentsRepository depoimentsRepository;

    public static Depoiments salvarDepoimentos(Depoiments depoiments) {
        List<Depoiments> depoimentos = returnDepoiments();

        if(depoimentos.contains(depoiments)) {
            return depoiments;
        } else {
            return depoimentsRepository.save(depoiments);
        }
    }
    
    public static List<Depoiments> returnDepoiments() {
        return depoimentsRepository.findAll();
    }
}
