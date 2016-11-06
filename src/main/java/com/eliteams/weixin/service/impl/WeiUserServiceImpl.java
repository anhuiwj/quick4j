package com.eliteams.weixin.service.impl;

import com.eliteams.weixin.dao.WeiUserMapper;
import com.eliteams.weixin.model.WeiUser;
import com.eliteams.weixin.service.WeiUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * Created by wangjie on 16/10/26.
 */
@Service
public class WeiUserServiceImpl  implements WeiUserService {
    @Resource
    private WeiUserMapper weiUserMapper;


    @Override
    public List<WeiUser> getUserList(Map<String,Object> search) {
        System.out.print(weiUserMapper.selectByExampleAndPage(search));
        return null;
    }

    @Override
    public WeiUser getUser(String id) {
        return null;
    }

    @Override
    public int insert(Object o) {
        return 0;
    }

    @Override
    public int update(Object o) {
        return 0;
    }

    @Override
    public int delete(Object id) {
        return 0;
    }

    @Override
    public Object selectById(Object id) {
        return null;
    }

    @Override
    public Object selectOne() {
        return null;
    }

    @Override
    public List selectList() {
        return null;
    }
}
