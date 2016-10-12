package com.niit.BlogBack.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.BlogBack.DAO.UserDao;
import com.niit.BlogBack.model.User;
public class BlogTest {
	

	public static void main(String[] args) {
	
		@SuppressWarnings("resource")
		AnnotationConfigApplicationContext	context = new AnnotationConfigApplicationContext();
		context.scan("com.niit.*");
		context.refresh();
		System.out.println("haaaaaaaaaaaaaaaaaaaaaaai");
		/*ChatDao chatDao = (ChatDao) context.getBean("ChatDao");
		BlogDao blogDao = (BlogDao) context.getBean("BlogDao");*/
		UserDao userDao = (UserDao) context.getBean("userDao");
		/*FriendListDao friendListDao = (FriendListDao) context.getBean("FriendListDao");
		EventsDao eventsDao = (EventsDao) context.getBean("EventsDao");
		JobsDao jobsDao = (JobsDao) context.getBean("JobsDao");
		PostDao postDao = (PostDao) context.getBean("PostDao");
		RoleDao roleDao = (RoleDao) context.getBean("RoleDao");*/
		
		/*Blog blog = (Blog) context.getBean("Blog");
		Chat chat = (Chat) context.getBean("Chat");*/
		User user = (User) context.getBean("User");
		/*Events events = (Events) context.getBean("Events");
		FriendList friendList = (FriendList) context.getBean("FriendList");
	    Jobs Jobs = (Jobs) context.getBean("Jobs");
		Post post = (Post) context.getBean("Post");
		Role role = (Role) context.getBean("Role");
		*/
		userDao.create(user);
		user.setUser_id(23);
		user.setUserName("muthu");
		user.setType_of_user("1");
		user.setPhone_no("25612695");
		user.setEmail_id("john.007stanley@gmail.com");
		
}
}