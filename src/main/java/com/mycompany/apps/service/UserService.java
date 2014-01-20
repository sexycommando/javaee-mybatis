/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.apps.service;

import com.mycompany.apps.entity.Usertable;
import com.mycompany.apps.mapper.UsertableMapper;
import javax.inject.Inject;
import org.apache.ibatis.session.SqlSessionFactory;

/**
 *
 * @author bigadmin
 */
public class UserService {

    @Inject
    private SqlSessionFactory sqlSessionFactory;

    public UserService() {
    }

    public Usertable getUsertable() {
        Usertable usertable = sqlSessionFactory.openSession().getMapper(UsertableMapper.class).selectByPrimaryKey("admin");
        return usertable;
    }

}
