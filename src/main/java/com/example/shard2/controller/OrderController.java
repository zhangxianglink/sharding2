package com.example.shard2.controller;

import com.example.shard2.entity.Order;
import com.example.shard2.service.OrderService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Map;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Resource
    private OrderService orderService;

    /**
     * 新增
     * @author zx
     * @date 2021/04/05
     **/
    @RequestMapping("/insert")
    public Object insert(Order Order){
        return orderService.insert(Order);
    }

    /**
     * 刪除
     * @author zx
     * @date 2021/04/05
     **/
    @RequestMapping("/delete")
    public Object delete(int id){
        return orderService.delete(id);
    }

    /**
     * 更新
     * @author zx
     * @date 2021/04/05
     **/
    @RequestMapping("/update")
    public Object update(Order Order){
        return orderService.update(Order);
    }

    /**
     * 查询 根据主键 id 查询
     * @author zx
     * @date 2021/04/05
     **/
    @RequestMapping("/load")
    public Object load(int id){
        return orderService.load(id);
    }

    /**
     * 查询 分页查询
     * @author zx
     * @date 2021/04/05
     **/
    @RequestMapping("/pageList")
    public Map<String, Object> pageList(@RequestParam(required = false, defaultValue = "0") int offset,
                                        @RequestParam(required = false, defaultValue = "10") int pagesize) {
        return orderService.pageList(offset, pagesize);
    }
}
