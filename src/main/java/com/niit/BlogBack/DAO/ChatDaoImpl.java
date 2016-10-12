package com.niit.BlogBack.DAO;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.niit.BlogBack.DAO.ChatDao;
import com.niit.BlogBack.model.Chat;

public class ChatDaoImpl implements ChatDao {

	
	
	@Autowired
	private SessionFactory sessionFactory;

	public ChatDaoImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	
	public List<Chat> list() {
		@SuppressWarnings({ "unchecked" })
		List<Chat> listChat = (List<Chat>) sessionFactory.getCurrentSession().createCriteria(Chat.class)
				.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		return listChat;
	}

	public Chat get(String sender) {
		String hql = "from Chat where sender ='" + sender + "'";
		org.hibernate.Query query = sessionFactory.getCurrentSession().createQuery(hql);
		@SuppressWarnings("unchecked")
		List<Chat> listChat = (List<Chat>) query.list();
		if (listChat != null && !listChat.isEmpty()) {
			return listChat.get(0);
		}
		return null;
	}

	public void saveOrUpdate(Chat chat) {
		sessionFactory.getCurrentSession().saveOrUpdate(chat);

	}

	public void delete(String sender) {
		Chat chatToDelete = new Chat();
		chatToDelete.setSender(sender);
		sessionFactory.getCurrentSession().delete(chatToDelete);

	}

}
