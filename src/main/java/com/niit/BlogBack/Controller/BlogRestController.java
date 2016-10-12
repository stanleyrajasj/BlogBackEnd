package com.niit.BlogBack.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import com.niit.BlogBack.DAO.*;

public class BlogRestController {
	@Autowired
	private BlogDao blogDao;

	public BlogDao getBlogDao() {
		return blogDao;
	}

	public void setBlogDao(BlogDao blogDao) {
		this.blogDao = blogDao;
	}
	@GetMapping("/blogDao")
	public List getCustomers() {
		return blogDao.list();
	}
}
