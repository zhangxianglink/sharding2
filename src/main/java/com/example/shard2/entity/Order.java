package com.example.shard2.entity;

import lombok.Data;

import java.time.LocalDateTime;

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
    private LocalDateTime updateTime;
    private LocalDateTime createTime;
    private String remark;

}
