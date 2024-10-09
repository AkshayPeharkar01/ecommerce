package com.ecommerce.model;


import jakarta.persistence.*;
import lombok.*;
import org.springframework.boot.autoconfigure.web.WebProperties;

@Entity //to create table in dbname as class
@Table(name = "user_details")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User {

    @Id
    @GeneratedValue(Strategy = GenerationType.IDENTITY)
    private Integer userId;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "user_address")
    private String userAddress;

    @Column(name = "user_age")
    private String userAge;

    @Column(name = "about")
    private String about;








//    // Getters and Setters
//    public Integer getUserId() {
//        return userId;
//    }
//
//    public void setUserId(Integer userId) {
//        this.userId = userId;
//    }
//
//    public String getUserName() {
//        return userName;
//    }
//
//    public void setUserName(String userName) {
//        this.userName = userName;
//    }
//
//    public String getUserAddress() {
//        return userAddress;
//    }
//
//    public void setUserAddress(String userAddress) {
//        this.userAddress = userAddress;
//    }
//
//    public String getUserAge() {
//        return userAge;
//    }
//
//    public void setUserAge(String userAge) {
//        this.userAge = userAge;
//    }
//
//    public String getAbout() {
//        return about;
//    }
//
//    public void setAbout(String about) {
//        this.about = about;
//    }
//    // constructor
//
//
//    public User(Integer userId, String userName, String userAddress, String userAge, String about) {
//        this.userId = userId;
//        this.userName = userName;
//        this.userAddress = userAddress;
//        this.userAge = userAge;
//        this.about = about;
//    }
//
//    public User() {
//
//    }
//    // To String method
//    @Override
//    public String toString() {
//        return "User{" +
//                "userId=" + userId +
//                ", userName='" + userName + '\'' +
//                ", userAddress='" + userAddress + '\'' +
//                ", userAge='" + userAge + '\'' +
//                ", about='" + about + '\'' +
//                '}';
//    }
}
