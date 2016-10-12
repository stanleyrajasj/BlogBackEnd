package com.niit.BlogBack.DAO;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.niit.BlogBack.DAO.PostDao;
import com.niit.BlogBack.model.Post;

public class PostDaoImpl implements PostDao {

	
	
	@Autowired
	private SessionFactory sessionFactory;

	public PostDaoImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	
	public List<Post> list() {
		@SuppressWarnings({ "unchecked" })
		List<Post> listComment = (List<Post>) sessionFactory.getCurrentSession().createCriteria(Post.class)
				.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		return listComment;
	}

	public Post get(String userId) {
		String hql = "from Comment where sender ='" + userId + "'";
		org.hibernate.Query query = sessionFactory.getCurrentSession().createQuery(hql);
		@SuppressWarnings("unchecked")
		List<Post> listComment = (List<Post>) query.list();
		if (listComment != null && !listComment.isEmpty()) {
			return listComment.get(0);
		}
		return null;
	}

	public void saveOrUpdate(Post comment) {
		sessionFactory.getCurrentSession().saveOrUpdate(comment);

	}

	public void delete(String user_id) {
		Post commentToDelete = new Post();
		commentToDelete.setUser_id(user_id);
		sessionFactory.getCurrentSession().delete(commentToDelete);

	}

}

