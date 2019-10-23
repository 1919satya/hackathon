package com.batch2;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/address")
public class AddressController {

	@Autowired
	private AddressService addressService;
	@Autowired
	CustomerRepository customerRepository;
	@Autowired
	CustomerService customerService;
	@Autowired
	LoginRegisterService loginRegisterService;

	int cust_id;

	private static final Logger logger = Logger.getLogger(AddressController.class);

	/*
	 * @RequestMapping("/") public ModelAndView getEmployee() { ModelAndView mv =
	 * new ModelAndView(); mv.setViewName("SetProfile"); return mv; }
	 */

	@RequestMapping("/saveDetails")
	public String saveAddress(@RequestBody Address address) {
		String name = address.getName();
		int login_id = address.getLogin_id();
		logger.info("Address Controller: saveDetails");
		addressService.save(address);

		int addr_id = addressService.getAddressId();
		System.out.println("login_id is :" + login_id);
		// loginRegisterService.update(login_id);

		System.out.println("Addr_ID : " + addr_id);
		System.out.println("NAME : " + name);

		return saveCustomer(name, addr_id, login_id);

	}

	@RequestMapping("/getCust_id")
	public int getCust_id() {
		return cust_id;
	}

	public String saveCustomer(String name, int addr_id, int login_id) {
		System.out.println("Address Controller: Saving Customer");
		Customer customer = new Customer();
		customer.setName(name);
		customer.setAdd_id(addr_id);
		customer.setCredit_score(8);
		customer.setLogin_id(login_id);
		Customer c = customerRepository.save(customer);
		cust_id = c.getCust_id();
		return "home";
	}

}