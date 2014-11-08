package simples.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import simples.bean.SimpleBean;
import simples.dao.SimpleDao;
@Repository
public class SimpleDaoImpl implements SimpleDao {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	private Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	public void save(SimpleBean bean) {
		getSession().save(bean);
	}

	public void update(SimpleBean bean) {
		getSession().update(bean);
	}

	public void delete(Long id) {
		Session session = getSession();
		Object bean = session.get(SimpleBean.class, id);
		session.delete(bean);
	}

	public SimpleBean get(Long id) {
		return (SimpleBean) getSession().get(SimpleBean.class, id);
	}

}
