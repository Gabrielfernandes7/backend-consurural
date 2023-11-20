package com.consurural.consurural.services;

import com.consurural.consurural.enumerations.ActivitiesEnum;
import com.consurural.consurural.models.Customer;
import com.consurural.consurural.repository.CustomerRepository;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    private CustomerRepository customerRepository;

    private CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public List<Customer> listCustomer() {
        return customerRepository.findAll();
    }

    public Customer saveCustomer(Customer customer) {
        if (ActivitiesEnum.CONSULTANCIES.equals((customer.getActivities()))){
            customer.setConsultance(customer.getConsultance());
        }

        return customerRepository.save(customer);
    }

}
