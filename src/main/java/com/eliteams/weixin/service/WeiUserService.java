package com.eliteams.weixin.service;

import com.eliteams.quick4j.core.generic.GenericService;
import com.eliteams.weixin.model.WeiUser;

import java.util.List;
import java.util.Map;

/**
 * Created by wangjie on 16/10/26.
 */
public interface WeiUserService extends GenericService {
    /**
     * 获取用户
     * @return
     */
    List<WeiUser> getUserList(Map<String,Object> search);

    /**
     * 根据id获取用户
     * @param id
     * @return
     */
    WeiUser getUser(String id);
}
