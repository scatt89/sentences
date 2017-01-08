package com.ts.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ts.model.Advice;

@Repository
public class AdviceDaoImpl implements AdviceDao{

	@Autowired
	private SessionFactory sessionFactory;
	
	@SuppressWarnings("unchecked")
	@Override
	@Transactional
	public List<Advice> list() {
		List<Advice> listAdvice = (List<Advice>) sessionFactory.getCurrentSession()
				.createCriteria(Advice.class)
				.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		
		return listAdvice;
	}

	@SuppressWarnings("unchecked")
	@Override
	@Transactional
	public Advice get(long id) {
		String hql = "from Advice where id="+id;
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		List<Advice> listAdvice = (List<Advice>) query.list();
		
		Advice advice = null;
		
		if(listAdvice != null && !listAdvice.isEmpty()){
			advice = listAdvice.get(0);
		}
		
		return advice;
	}

	@Override
	@Transactional
	public void saveOrUpdate(Advice advice) {
		sessionFactory.getCurrentSession().saveOrUpdate(advice);
	}

	@Override
	@Transactional
	public void delete(long id) {
		Advice adviceToDelete = this.get(id);
		sessionFactory.getCurrentSession().delete(adviceToDelete);
	}

	@SuppressWarnings("unchecked")
	@Override
	@Transactional
	public Advice getRandom() {
		
		List<Advice> advices = (List<Advice>) sessionFactory.getCurrentSession()
				.createQuery("from Advice order by rand()")
				.setMaxResults(1)
				.list();
		
		Advice advice = null;
		
		if(advices != null && !advices.isEmpty()){
			advice = advices.get(0);
		}
		
		return advice;
	}
	
}
