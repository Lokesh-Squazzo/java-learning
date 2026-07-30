package com.lokesh.controller;

import com.lokesh.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

@Controller
public class FirstController {
    @GetMapping("/register")
    String goToRegisterPage(){
        return "register";
    }
    //Multiple ways we can use to sent data to profile-page
    /*1. We can use HttpServletRequest's req obj and getParameter()
         then we can store that in vairable and add it to model
    */
    /*2. we can use @RequestParam annotation.
    @PostMapping("/profilePage")
    String profilePageOpen(
            @RequestParam("name") String name,
            @RequestParam("email") String email,
            @RequestParam("phone") long phone,
            Model model
    ){
        User user = new User();
        user.setName(name);
        user.setEmail(email);
        user.setPhone(phone);
        model.addAttribute(user); //we can later use it in view page.
        return "profile";
    }

    here we can see Model's reference vairable is initailize with
    an implemented class of Model interface.
    So in depth ExtendedModelMap is the one who has implemented this
    it looks like Model model = new ExtendedModelMap();
    i just thought to explain.
     */

    /*3. We can use @ModelAttribute annotation which will directly
        which will directly store data into out bean class.
        make sure to keep vairable name same as names like in form.
        this is also efficent less coding practice.
     */
    @PostMapping("/profilePage")
    String openProfilePage(@ModelAttribute User user){
        /*
         We can have specific mode name too here on frontend we need to
         use user.getName(), but if we want to use something else
         we simply do like @ModelAttribute("name we want") User user
         */
        return "profile";
    }
}
