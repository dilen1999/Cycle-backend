package com.example.CycleSharingSystemBackend.LoginRepository;

import com.example.CycleSharingSystemBackend.LoginDomain.Login;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginRepository extends JpaRepository<Login, Long> {
    Login findByUsernameAndPassword(String username, String password);


}
