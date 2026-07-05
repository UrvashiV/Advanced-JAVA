package com.jdbc.bootjdbcexample.Dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.jdbc.core.JdbcTemplate;

@Repository
public class UserDao {

    @Autowired
    private JdbcTemplate jdbctemplate;

    public UserDao(){

    }

    public int createTable(){
        String query = """
    CREATE TABLE IF NOT EXISTS User1(
        id INT PRIMARY KEY,
        name VARCHAR(200),
        age INT,
        city VARCHAR(200)
    )
    """;

        int update = this.jdbctemplate.update(query);
        System.out.println("Affected Rows: " + update);
        return update;
    }

    public int insertUser(Integer id,String name,Integer age,String city){
        String query = "insert into User1 (id,name,age,city) values (?,?,?,?)";
        int update1 = this.jdbctemplate.update(query,new Object[] {id,name,age,city});
        return update1;
    }
}
