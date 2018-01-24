package com.bestapp.companymanage.data.dao;

import com.bestapp.companymanage.data.dto.BaseDto;
import org.hibernate.Criteria;
import org.hibernate.Session;

public interface BaseDao<T extends BaseDto> {

  Session getCurrentSession();

  Criteria createCriteria();

  void saveOrUpdate(T dto);

  void flush();
}
