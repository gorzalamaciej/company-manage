package com.bestapp.companymanage.data.dao.impl;

import com.bestapp.companymanage.data.dao.BaseDao;
import com.bestapp.companymanage.data.dto.BaseDto;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

@SuppressWarnings("unchecked")
public class BaseDaoImpl<T extends BaseDto> implements BaseDao<T> {

  private Class<T> dtoClass;

  @Autowired
  private SessionFactory sessionFactory;

  public BaseDaoImpl() {
  }

  public BaseDaoImpl(Class<T> dtoClass) {
    this.dtoClass = dtoClass;
  }

  public Session getCurrentSession() {
    return sessionFactory.getCurrentSession();
  }

  @Transactional
  public Criteria createCriteria() {
    return getCurrentSession().createCriteria(dtoClass);
  }

  @Transactional
  public void saveOrUpdate(T dto) {
    getCurrentSession().saveOrUpdate(dto);
  }

  protected String[] extractNames(Enum[] enums) {
    String[] result = new String[enums.length];
    for (int i = 0; i < enums.length; i++) {
      result[i] = enums[i].name();
    }
    return result;
  }

  @Transactional
  public void flush() {
    getCurrentSession().flush();
  }

  @Transactional
  public void delete(T dto) {
    getCurrentSession().delete(dto);
  }
}
