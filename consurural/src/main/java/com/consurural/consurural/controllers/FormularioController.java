package com.consurural.consurural.controllers;

import com.consurural.consurural.configuration.ApplicationConfiguration;
import com.consurural.consurural.enumerations.ServicoEnum;
import com.consurural.consurural.models.Formulario;
import com.consurural.consurural.services.FormularioService;
import org.springframework.beans.factory.annotation.Autowired;
import com.consurural.consurural.repository.FormularioRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/formulario")
@CrossOrigin(origins = "http://localhost:8080")
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

    @GetMapping("/private/contato")
    public ResponseEntity<Void> redirect(Formulario formulario) {

        String url = "";

        if(formulario.getSubtipoSelecionado() != null) {
            String dados =
                " Nome: " + formulario.getName() +
                " Telefone: " + formulario.getPhone_number() +
                " Endereço: " + formulario.getAddress() +
                " Ramo de atividade: " + formulario.getBusiness_sector() +
                " Serviço selecioado: " + formulario.getServicoSelecionado().getDescricao() +
                " Consultoria: " + formulario.getSubtipoSelecionado().getDescricao();

            String texto =
                ApplicationConfiguration.retriveData(1).replaceAll(" ", "+") +
                dados.replaceAll(" ","+");

            url =
                "https://api.whatsapp.com/send?phone=+55" +
                ApplicationConfiguration.retriveData(0) + "&text=" + texto;

        } else {
            String dados =
                " Nome: " + formulario.getName() +
                " Telefone: " + formulario.getPhone_number() +
                " Endereço: " + formulario.getAddress() +
                " Ramo de atividade: " + formulario.getBusiness_sector() +
                " Serviço selecioado: " + formulario.getServicoSelecionado().getDescricao();

            String texto =
                ApplicationConfiguration.retriveData(1).replaceAll(" ", "+") +
                dados.replaceAll(" ","+");

            url =
                "https://api.whatsapp.com/send?phone=+55" +
                ApplicationConfiguration.retriveData(0) + "&text=" + texto;
        }

        return ResponseEntity.status(HttpStatus.FOUND).location(URI.create(url)).build();
    }

    @GetMapping("/listar")
    public List<Formulario> listarFormularios(){
        return formularioRepository.findAll();
    }

}
