package nrazv.speingcontext.springcontext.user.controller;

import org.springframework.stereotype.Controller;

@Controller
public class UserController {
    public void printUser(){
        User.printUser();
    }
}
