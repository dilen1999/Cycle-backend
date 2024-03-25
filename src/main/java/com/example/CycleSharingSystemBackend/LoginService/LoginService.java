package com.example.CycleSharingSystemBackend.LoginService;

import com.example.CycleSharingSystemBackend.LoginDomain.Login;
import com.example.CycleSharingSystemBackend.LoginRepository.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {
    @Autowired
    private LoginRepository repo;

    public Login login(String username, String password){
        Login user = repo.findByUsernameAndPassword(username,password);
        System.out.println(username+password);

        return user;
    }
}
