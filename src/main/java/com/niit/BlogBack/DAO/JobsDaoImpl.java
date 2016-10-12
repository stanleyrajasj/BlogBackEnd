package com.niit.BlogBack.DAO;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.niit.BlogBack.DAO.JobsDao;
import com.niit.BlogBack.model.Jobs;

public class JobsDaoImpl implements JobsDao {

	@Autowired
	private SessionFactory sessionFactory;

	public JobsDaoImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public List<Jobs> list() {
		@SuppressWarnings({ "unchecked" })
		List<Jobs> listJobs = (List<Jobs>) sessionFactory.getCurrentSession().createCriteria(Jobs.class)
				.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		return listJobs;
	}

	public Jobs get(String job_Id) {
		String hql = "from Jobs where sender ='" + job_Id + "'";
		org.hibernate.Query query = sessionFactory.getCurrentSession().createQuery(hql);
		@SuppressWarnings("unchecked")
		List<Jobs> listJobs = (List<Jobs>) query.list();
		if (listJobs != null && !listJobs.isEmpty()) {
			return listJobs.get(0);
		}
		return null;
	}

	public void saveOrUpdate(Jobs jobs) {
		sessionFactory.getCurrentSession().saveOrUpdate(jobs);

	}

	public void delete(String job_Id) {
		Jobs jobsToDelete = new Jobs();
		jobsToDelete.setJob_Id(job_Id);
		sessionFactory.getCurrentSession().delete(jobsToDelete);
	}

}

