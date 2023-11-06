package com.consurural.consurural.services;
import com.consurural.consurural.models.Formulario;
import com.consurural.consurural.repository.FormularioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FormularioService {

    @Autowired
    private FormularioRepository formularioRepository;

    public Formulario salvarFormulario(Formulario formulario) {
        return formularioRepository.save(formulario);
    }
}
