package com.jdbc.bootjdbcexample;

import com.jdbc.bootjdbcexample.Dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

@SpringBootApplication
public class BootjdbcexampleApplication  implements CommandLineRunner {

    @Autowired
    private UserDao userDao;

    public static void main(String[] args) {

        SpringApplication.run(BootjdbcexampleApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println(this.userDao.createTable());
        this.createUser();
    }


    public void createUser() throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter user ID: ");
        Integer userId =Integer.parseInt(br.readLine());

        System.out.println("Enter user Name: ");
        String userName =br.readLine();

        System.out.println("Enter user Age: ");
        Integer userAge =Integer.parseInt(br.readLine());

        System.out.println("Enter user City: ");
        String userCity =br.readLine();

       int i= this.userDao.insertUser(userId,userName,userAge,userCity);
        System.out.println(i + " user inserted successfully");
    }
}
