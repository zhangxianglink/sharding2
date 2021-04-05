package com.example.shard2.entity;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.Date;

@Data
public class Order {

    private long id;
    private long orderId;
    private String tradeType;
    private long amount;
    private String currency;
    private String status;
    private String channel;
    private String tradeNo;
    private long userId;
    private Date updateTime;
    private Date createTime;
    private String remark;

}
