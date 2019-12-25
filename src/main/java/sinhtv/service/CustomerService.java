package sinhtv.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import sinhtv.dao.CustomerDAO;
import sinhtv.entities.Customer;

@Service
@Transactional
public class CustomerService {

	@Autowired
	private CustomerDAO customerDAO;

	public List<Customer> findAll() {
		return customerDAO.findAll();
	}

	public Customer findById(final int id) {
		return customerDAO.findById(id);
	}

	public void save(final Customer customer) {
		// check if customer exist -> throw exception
		customerDAO.persist(customer);
	}

	public void update(final Customer customer) {
		// if customerDB = null -> throw Exception
		Customer customerDB = customerDAO.findById(customer.getId());
		customerDB.setName(customer.getName());
		customerDB.setAddress(customer.getAddress());
		customerDAO.persist(customerDB);
	}

	public void delete(final int id) {
		Customer customer = customerDAO.findById(id);
		if (customer != null) {
			customerDAO.delete(customer);
		}
	}
}
