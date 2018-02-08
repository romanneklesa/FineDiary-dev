package com.FineDiary.repository;

import com.FineDiary.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User,Integer>{
    //List<String> findByName(String name);
    User findByEmail(String name);
    //@Query("select e from User e")
    List<User> findAll();

    @Transactional
    @Modifying
    @Query("UPDATE User u SET u.password=:p where u.email =:e")
    void updateUser(@Param("p")String password, @Param("e")String email);


    @Transactional
    @Modifying
    void deleteById(int id);
}

