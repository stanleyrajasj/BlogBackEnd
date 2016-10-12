package com.niit.BlogBack.DAO;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.niit.BlogBack.DAO.FriendListDao;
import com.niit.BlogBack.model.FriendList;

public class FriendListDaoImpl implements FriendListDao {

	
	@Autowired
	private SessionFactory sessionFactory;

	public FriendListDaoImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public List<FriendList> list() {
		@SuppressWarnings({ "unchecked" })
		List<FriendList> listFriendList = (List<FriendList>) sessionFactory.getCurrentSession().createCriteria(FriendList.class)
				.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		return listFriendList;
	}

	public FriendList get(String friend_id) {
		String hql = "from FriendList where sender ='" + friend_id + "'";
		org.hibernate.Query query = sessionFactory.getCurrentSession().createQuery(hql);
		@SuppressWarnings("unchecked")
		List<FriendList> listFriendList = (List<FriendList>) query.list();
		if (listFriendList != null && !listFriendList.isEmpty()) {
			return listFriendList.get(0);
		}
		return null;
	}

	public void saveOrUpdate(FriendList Friendlist) {
		sessionFactory.getCurrentSession().saveOrUpdate(Friendlist);

	}

	public void delete(String friend_id) {
		FriendList friendListToDelete = new FriendList();
		friendListToDelete.setFriend_id(friend_id);
		sessionFactory.getCurrentSession().delete(friendListToDelete);
	}

}
