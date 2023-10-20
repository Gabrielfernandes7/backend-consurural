package com.consurural.consurural.controllers;

import com.consurural.consurural.enumerations.ServicoEnum;
import com.consurural.consurural.models.Formulario;
import com.consurural.consurural.services.FormularioService;
import org.springframework.beans.factory.annotation.Autowired;
import com.consurural.consurural.repository.FormularioRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/formulario")
public class FormularioController {

    @Autowired
    FormularioService formularioService;
    @Autowired
    FormularioRepository formularioRepository;

    @PostMapping("/criar")
    public Formulario criarFormulario(@RequestBody Formulario formulario) {
        if (ServicoEnum.CONSULTORIAS.equals((formulario.getServicoSelecionado()))){
            formulario.setSubtipoSelecionado(formulario.getSubtipoSelecionado());
        }
        return formularioService.salvarFormulario(formulario);
    }

    @GetMapping("/listar")
    public List<Formulario> listarFormularios(){
        return formularioRepository.findAll();
    }

}
