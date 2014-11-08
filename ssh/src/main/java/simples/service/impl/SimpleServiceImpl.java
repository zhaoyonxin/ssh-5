package simples.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import simples.bean.SimpleBean;
import simples.dao.SimpleDao;
import simples.service.SimpleService;
@Service
public class SimpleServiceImpl implements SimpleService {
	
	@Autowired
	private SimpleDao simpleDao;

	public void save(SimpleBean bean) {
		simpleDao.save(bean);
	}

	public void update(SimpleBean bean) {
		simpleDao.update(bean);
	}

	public void delete(Long id) {
		simpleDao.delete(id);
	}

	public SimpleBean get(Long id) {
		return simpleDao.get(id);
	}
	
}
