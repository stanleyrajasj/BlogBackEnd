package com.niit.BlogBack.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.niit.BlogBack.DAO.UserDao;
import com.niit.BlogBack.model.User;

@RestController

public class UserRestController {
	@Autowired
	private UserDao userDao;
	
	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@GetMapping("/users")
	public List getCustomers() {
		return userDao.list();
	}

	@GetMapping("/users/{id}")
	public ResponseEntity<User> getUser(@PathVariable("id") String id) {

		User user = userDao.get(id);  
		if (user == null) {
			return new ResponseEntity("No User found for ID " + id, HttpStatus.NOT_FOUND);
		}

		return new ResponseEntity(user, HttpStatus.OK);
	}

	@PostMapping(value = "/users")
	public ResponseEntity createUser(@RequestBody User user) {

		userDao.create(user);

		return new ResponseEntity(user, HttpStatus.OK);
	}

	/*@DeleteMapping("/users/{id}")
	public ResponseEntity deleteUser(@PathVariable Long id) {

		if (userDAO.delete(id)) {
			return new ResponseEntity("No User found for ID " + id, HttpStatus.NOT_FOUND);
		}

		return new ResponseEntity(id, HttpStatus.OK);

	}*/

	@PutMapping("/users/{id}")
	public ResponseEntity<User> updateUser(@PathVariable Long id, @RequestBody User user) {

		user = userDao.update(id, user);

		if (null == user) {
			return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
		}

		return new ResponseEntity<User>(user, HttpStatus.OK);
	}

}