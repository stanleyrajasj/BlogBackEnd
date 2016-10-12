package com.niit.BlogBack.DAO;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.BlogBack.DAO.RoleDao;
import com.niit.BlogBack.model.Role;

@Repository("RoleDao")
public class RoleDaoImpl implements RoleDao {

	public RoleDaoImpl() {
		super();
	}
	@Autowired
	private SessionFactory sessionFactory;

	
	public RoleDaoImpl(SessionFactory sessionFactory) {
		super();
		this.sessionFactory = sessionFactory;
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}


	public List<Role> list() {
		@SuppressWarnings({ "unchecked" })
		List<Role> listUserRole = (List<Role>)
		sessionFactory.getCurrentSession().createCriteria(Role.class)
		.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		return listUserRole;
		
	}

	public Role get(String role_id) {
		String hql = "from UserRole where username ='"+ role_id +"'";
		org.hibernate.Query query = sessionFactory.getCurrentSession().createQuery(hql);
		@SuppressWarnings("unchecked")
		List<Role> listUserRole = (List<Role>) query.list();
		
		if (listUserRole != null && !listUserRole.isEmpty()){
			return listUserRole.get(0);
		}
		return null;
	}

	public void saveOrUpdate(Role role_name) {
		sessionFactory.getCurrentSession().saveOrUpdate(role_name);

	}

	public void delete(String role_id) {
		Role RoleToDelete = new Role();
		RoleToDelete.setRole_id(role_id);
		sessionFactory.getCurrentSession().delete(RoleToDelete);

	}

}