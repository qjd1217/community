package com.nowcoder.community.dao;

import org.springframework.stereotype.Repository;

/**
 * @author qijunda
 * @create 2022/5/22--9:36 上午
 */
@Repository("alphaHibernate")
public class AlphaDaoHibernateImpl implements AlphaDao{

    @Override
    public String select() {
        return "Hibernate";
    }
}
