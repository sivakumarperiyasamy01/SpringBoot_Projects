package com.springsecuirtycourse.springsecurity;


import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class employeecontroller {

    @GetMapping
    public String greet(){
        return "welcome buddy";
    }

    @PreAuthorize("hasRole('user')")
    @GetMapping("/userproducts")
    public String userallowes(){
        return "user allowed to view products only";
    }

    @PreAuthorize("hasRole('admin')") // this will enble by using @Enablemethodsecurity in congi file , it will allow admin user only to use this reasource
    @GetMapping("/admin")
    public String products(){
        return "he can add or removed prodcuts";
    }

}
