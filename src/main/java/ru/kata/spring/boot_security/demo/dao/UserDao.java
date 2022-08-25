package ru.kata.spring.boot_security.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import ru.kata.spring.boot_security.demo.model.User;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserDao extends JpaRepository<User, Integer>{
//    @Query("SELECT u FROM User u JOIN FETCH u.roles WHERE u.username = :username")
//    User findByUsername(@Param("username")String username);

    Optional <User> findUserByUsername(String username);

//    void update(Long id, User updatedUser);

}