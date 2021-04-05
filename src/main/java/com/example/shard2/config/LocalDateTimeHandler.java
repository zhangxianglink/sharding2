package com.example.shard2.config;


import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.TypeHandler;

import java.sql.*;
import java.time.LocalDateTime;

public class LocalDateTimeHandler implements TypeHandler<LocalDateTime> {
    @Override
    public void setParameter(PreparedStatement preparedStatement, int i, LocalDateTime localDateTime, JdbcType jdbcType) throws SQLException {
        preparedStatement.setTimestamp(i, Timestamp.valueOf(localDateTime));
    }

    @Override
    public LocalDateTime getResult(ResultSet resultSet, String s) throws SQLException {
        Timestamp timestamp = resultSet.getTimestamp(s);
        return timestamp.toLocalDateTime();
    }

    @Override
    public LocalDateTime getResult(ResultSet resultSet, int i) throws SQLException {
        return resultSet.getTimestamp(i).toLocalDateTime();
    }

    @Override
    public LocalDateTime getResult(CallableStatement callableStatement, int i) throws SQLException {
        return callableStatement.getTimestamp(i).toLocalDateTime();
    }
}




