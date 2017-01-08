package com.ts.dao;

import java.util.List;

import com.ts.model.Advice;

public interface AdviceDao {

	public List<Advice> list();
	
	public Advice get(long id);
	
	public void saveOrUpdate(Advice advice);
	
	public void delete(long id);
	
	public Advice getRandom();
	
}
