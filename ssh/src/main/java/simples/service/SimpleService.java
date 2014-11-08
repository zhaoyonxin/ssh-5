package simples.service;

import simples.bean.SimpleBean;

public interface SimpleService {
	void save(SimpleBean bean);
	void update(SimpleBean bean);
	void delete(Long id);
	SimpleBean get(Long id);
}
