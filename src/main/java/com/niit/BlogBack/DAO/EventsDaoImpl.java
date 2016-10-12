package com.niit.BlogBack.DAO;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.niit.BlogBack.DAO.EventsDao;
import com.niit.BlogBack.model.Events;

public class EventsDaoImpl implements EventsDao {

	
	@Autowired
	private SessionFactory sessionFactory;

	public EventsDaoImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public List<Events> list() {
		@SuppressWarnings({ "unchecked" })
		List<Events> listEvents = (List<Events>) sessionFactory.getCurrentSession().createCriteria(Events.class)
				.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		return listEvents;
	}

	public Events get(String event_Id) {
		String hql = "from Event where sender ='" + event_Id + "'";
		org.hibernate.Query query = sessionFactory.getCurrentSession().createQuery(hql);
		@SuppressWarnings("unchecked")
		List<Events> listEvent = (List<Events>) query.list();
		if (listEvent != null && !listEvent.isEmpty()) {
			return listEvent.get(0);
		}
		return null;
	}

	public void saveOrUpdate(Events event_Id) {
		sessionFactory.getCurrentSession().saveOrUpdate(event_Id);

	}

	public void delete(String event_Id) {
		Events commentToDelete = new Events();
		commentToDelete.setEvent_content(event_Id);
		sessionFactory.getCurrentSession().delete(commentToDelete);

	}

}

