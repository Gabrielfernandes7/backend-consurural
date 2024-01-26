package com.consurural.consurural.controllers;

import com.consurural.consurural.models.Customer;
import com.consurural.consurural.services.ConsultancesService;
import com.consurural.consurural.services.CustomerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/customers")
@CrossOrigin(origins = "*")
public class CustomerController {

    public CustomerService customerService;
    private ConsultancesService consultancesService;


    public CustomerController(CustomerService customerService, ConsultancesService consultancesService) {
        this.customerService = customerService;
        this.consultancesService = consultancesService;
    }

    @GetMapping("/list-customer")
    public List<Customer> listCustomers(){
        return customerService.listCustomer();
    }

    @PostMapping("/create")
    public Customer createCustomer(@RequestBody Customer customer) {
        return customerService.saveCustomer(customer);
    }

    @GetMapping("/send-whatsapp-message")
    public RedirectView redirectCustomer(Customer customer) {
        String dataCustomer =
                " Nome: " + customer.getName() +
                " Telefone: " + customer.getPhone_number() +
                " Endereço: " + customer.getAddress() +
                " Ramo de atividade: " + customer.getBusiness_sector() +
                " Serviço selecionado: " + customer.getActivities().getDescription();

        String url = "https://api.whatsapp.com/send?phone=+55" +
            consultancesService.getPhone(1) + "&text=" +
            "Olá, acabei de preencher o seu formulario, segue abaixo todos os meus dados: "
            + dataCustomer.replaceAll(" ", "+");

        return new RedirectView(url);
    }


}
