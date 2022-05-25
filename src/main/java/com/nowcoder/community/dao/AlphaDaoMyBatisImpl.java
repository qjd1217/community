package com.nowcoder.community.dao;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

/**
 * @author qijunda
 * @create 2022/5/22--9:39 上午
 */
@Repository
@Primary
public class AlphaDaoMyBatisImpl implements  AlphaDao{

    @Override
    public String select() {
        return "MyBatis";
    }
}
