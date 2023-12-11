package com.consurural.consurural.controllers;

import com.consurural.consurural.configuration.ApplicationConfiguration;
import com.consurural.consurural.models.Customer;
import com.consurural.consurural.services.CustomerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/customers")
@CrossOrigin(origins = "*")
public class CustomerController {

    public CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
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
    public ResponseEntity<Void> redirect(Customer customer) {

        String url = "";

        if(customer.getConsultance() != null) {
            String dataCustomer =
                " Nome: " + customer.getName() +
                " Telefone: " + customer.getPhone_number() +
                " Endereço: " + customer.getAddress() +
                " Ramo de atividade: " + customer.getBusiness_sector() +
                " Serviço selecionado: " + customer.getActivities().getDescription() +
                " Consultoria: " + customer.getConsultance().getDescription();

            String textMessage =
                ApplicationConfiguration.retriveData(1).replaceAll(" ", "+") +
                dataCustomer.replaceAll(" ","+");

            url =
                "https://api.whatsapp.com/send?phone=+55" +
                ApplicationConfiguration.retriveData(0) + "&text=" + textMessage;

        } else {
            String dataCustomer =
                " Nome: " + customer.getName() +
                " Telefone: " + customer.getPhone_number() +
                " Endereço: " + customer.getAddress() +
                " Ramo de atividade: " + customer.getBusiness_sector() +
                " Serviço selecionado: " + customer.getActivities().getDescription();

            String textMessage =
                ApplicationConfiguration.retriveData(1).replaceAll(" ", "+") +
                dataCustomer.replaceAll(" ","+");

            url =
                "https://api.whatsapp.com/send?phone=+55" +
                ApplicationConfiguration.retriveData(0) + "&text=" + textMessage;
        }

        return ResponseEntity.status(HttpStatus.FOUND).location(URI.create(url)).build();
    }

}
