package com.example.shard2.service;

import com.example.shard2.entity.Order;

import java.util.Map;


public interface OrderService {
    /**
     * 新增
     */
    public Object insert(Order tOrder);

    /**
     * 删除
     */
    public Object delete(int id);

    /**
     * 更新
     */
    public Object update(Order tOrder);

    /**
     * 根据主键 id 查询
     */
    public Order load(int id);

    /**
     * 分页查询
     */
    public Map<String,Object> pageList(int offset, int pagesize);
}
