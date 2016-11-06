package com.eliteams.weixin.model;

import java.util.List;

/**
 * Created by wangjie on 16/10/27.
 */
public class UserListData {
    private String total;
    private String count;
    private List data;
    private String next_openid;

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public List getData() {
        return data;
    }

    public void setData(List data) {
        this.data = data;
    }

    public String getNext_openid() {
        return next_openid;
    }

    public void setNext_openid(String next_openid) {
        this.next_openid = next_openid;
    }
}
