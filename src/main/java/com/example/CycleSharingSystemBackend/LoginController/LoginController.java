package com.example.CycleSharingSystemBackend.LoginController;

import com.example.CycleSharingSystemBackend.LoginDomain.Login;
import com.example.CycleSharingSystemBackend.LoginService.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.gson.GsonProperties;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Objects;

import static org.springframework.http.HttpStatus.BAD_REQUEST;
import static org.springframework.http.HttpStatus.OK;

@Controller
@CrossOrigin("http://localhost:3000")
public class LoginController {
    @Autowired
    private LoginService userService;

    @GetMapping("/login")
    public ModelAndView login(){
        ModelAndView mav = new ModelAndView("login");
        mav.addObject("user",new Login());
        return mav;
    }

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody Login user){

        Login oauthUser = userService.login(user.getUsername(), user.getPassword());


        System.out.println(oauthUser);
        if(oauthUser == null){
            return new ResponseEntity<>("Invalid user name or password", BAD_REQUEST);
//            return "redirect:/";
        }
        else {
//            return "redirect:/login";
            return new ResponseEntity<>("user Logged in Successfully", OK);


        }
    }
}
