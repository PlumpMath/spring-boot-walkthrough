package hello;

import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class CustomerService {
    @Autowired
    CustomerRepository repository;

    public Customer save(Customer customer) {
        return repository.save(customer);
    }

    public List<Customer> findAll() {
        return repository.findAll();
    }
}
