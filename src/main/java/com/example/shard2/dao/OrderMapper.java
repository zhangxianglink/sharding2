package com.example.shard2.dao;

import com.example.shard2.entity.Order;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface OrderMapper {
    /**
     * 新增
     * @author zx
     * @date 2021/04/05
     **/
    int insert(Order tOrder);

    /**
     * 刪除
     * @author zx
     * @date 2021/04/05
     **/
    int delete(int id);

    /**
     * 更新
     * @author zx
     * @date 2021/04/05
     **/
    int update(Order tOrder);

    /**
     * 查询 根据主键 id 查询
     * @author zx
     * @date 2021/04/05
     **/
    Order load(int id);

    /**
     * 查询 分页查询
     * @author zx
     * @date 2021/04/05
     **/
    List<Order> pageList(int offset, int pagesize);

    /**
     * 查询 分页查询 count
     * @author zx
     * @date 2021/04/05
     **/
    int pageListCount(int offset,int pagesize);
}
