package com.example.shard2.service.impl;

import com.example.shard2.dao.OrderMapper;
import com.example.shard2.entity.Order;
import com.example.shard2.service.OrderService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class OrderServiceImpl implements OrderService {
    @Resource
    private OrderMapper tOrderMapper;


    @Override
    public Object insert(Order tOrder) {

        // valid
        if (tOrder == null) {
            return "error";
        }

        tOrderMapper.insert(tOrder);
        return "success";
    }


    @Override
    public Object delete(int id) {
        return tOrderMapper.delete(id);

    }


    @Override
    public Object update(Order tOrder) {
        return tOrderMapper.update(tOrder);
    }


    @Override
    public Order load(int id) {
        return tOrderMapper.load(id);
    }


    @Override
    public Map<String,Object> pageList(int offset, int pagesize) {

        List<Order> pageList = tOrderMapper.pageList(offset, pagesize);
        int totalCount = tOrderMapper.pageListCount(offset, pagesize);

        // result
        Map<String, Object> result = new HashMap<String, Object>();
        result.put("pageList", pageList);
        result.put("totalCount", totalCount);

        return result;
    }

}
