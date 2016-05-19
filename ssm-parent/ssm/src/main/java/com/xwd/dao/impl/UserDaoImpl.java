package com.xwd.dao.impl;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xwd.dao.UserDao;
import com.xwd.model.User;

@Repository
public class UserDaoImpl extends SqlSessionDaoSupport implements UserDao{
	
    String ns = "com.xwd.mapper."; 
    @Autowired
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory){  
        super.setSqlSessionFactory(sqlSessionFactory);  
    } 
	@Override
	public void addUser(User u) {
		this.getSqlSession().insert(ns+"insert",u);
	}

	@Override
	public boolean updateUser(User u) {
		// TODO Auto-generated method stub
		return this.getSqlSession().update(ns+"update", u)>0;
	}

	@Override
	public Boolean deleteUserById(Long id) {
		// TODO Auto-generated method stub
		return this.getSqlSession().delete(ns+"deleteByPrimaryKey", id)>0;
	}

	@Override
	public User findUserById(int id) {
		return this.getSqlSession().selectOne(ns+"selectById", id);
	}

}
