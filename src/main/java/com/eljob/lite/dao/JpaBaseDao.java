/**
 * Copyright  2016  Pemass
 * All Right Reserved.
 */
package com.eljob.lite.dao;

import com.biloba.common.dao.jpa.AbstractBaseDao;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * @Description: JpaBaseDao
 * @Author: estn.zuo
 * @CreateTime: 2016-11-07 15:56
 */
@Repository
public class JpaBaseDao extends AbstractBaseDao {

    @PersistenceContext(name = "env")
    private EntityManager em;

    @Override
    public EntityManager getEntityManager() {
        return em;
    }

}
