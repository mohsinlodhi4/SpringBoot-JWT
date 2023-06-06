package com.example.Spring2.repository;

import com.example.Spring2.entity.DAOUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<DAOUser, Long> {

    DAOUser findByEmailIgnoreCase(String email);

    @Query("select u from DAOUser u where u.age>=?1 and u.age<=?2")
    List<DAOUser> findUsersInAgeRange(int min, int max);

}

