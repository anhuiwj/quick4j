package com.eliteams.weixin.dao;

import com.eliteams.quick4j.core.generic.GenericDao;
import com.eliteams.weixin.model.WeiUser;

import java.util.List;
import java.util.Map;

/**
 * Created by wangjie on 16/11/6.
 */
public interface WeiUserMapper extends GenericDao<WeiUser, Long> {
    List<WeiUser> selectByExampleAndPage(Map<String,Object> search);
}
