package nrazv.speingcontext.springcontext.user.controller;

import lombok.RequiredArgsConstructor;
import lombok.ToString;

@RequiredArgsConstructor
@ToString
public class User {
    private final String firstName;
    private final String lastName;
    private final String email;

    public static void printUser(){
        var user = new User("Jon","Raider","jon@.com");
        System.out.println(user.toString());
    }

}
