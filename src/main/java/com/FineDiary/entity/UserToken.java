package com.FineDiary.entity;


import org.apache.commons.codec.digest.DigestUtils;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "TOKEN")
public class UserToken {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @ManyToOne
    @JoinColumn(name = "USER_ID", nullable = false, referencedColumnName = "Id")
    private User user;

    @Column(name = "TOKEN", nullable = false, unique = true)
    private String token;

    @Column(name = "TOKEN_CREATE_DATE", nullable = false)
    private Timestamp tokenCreateDate;

    //TODO токен должен выдаваться каждый раз, когда пользователь гуляет по страницам
    @Column(name = "USER_PLUS_PASS_HASH")
    private String userPlusPassHash;

    public String getUserPlusPassHash() {
        return userPlusPassHash;
    }

    public void setUserPlusPassHash(String userPlusPassHash) {
        this.userPlusPassHash = userPlusPassHash;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getToken() {
        return token;
    }

    public void setToken() {
        //temp token
        String sha1Hex = DigestUtils.sha1Hex(this.user.getEmail()+this.user.getPassword()+this.tokenCreateDate);
        this.token = sha1Hex;
    }

    public Timestamp getTokenCreateDate() {
        return tokenCreateDate;
    }

    public void setTokenCreateDate() {
        this.tokenCreateDate = new Timestamp(System.currentTimeMillis());
    }

    @Override
    public String toString() {
        return "Token{" +
                "id=" + id +
                ", userId=" + user.getId() +
                ", token='" + token + '\'' +
                ", tokenCreateDate=" + tokenCreateDate +
                ", userPlusPassHash='" + userPlusPassHash + '\'' +
                '}';
    }

}
