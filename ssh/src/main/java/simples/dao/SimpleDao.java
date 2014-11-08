package simples.dao;

import simples.bean.SimpleBean;

public interface SimpleDao {
	void save(SimpleBean bean);
	void update(SimpleBean bean);
	void delete(Long id);
	SimpleBean get(Long id);
}
