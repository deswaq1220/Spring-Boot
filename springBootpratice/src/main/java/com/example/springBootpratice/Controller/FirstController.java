package com.example.springBootpratice.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstController {

    @GetMapping("/hi")
    public String niceTo(Model model){
        model.addAttribute("username", "봉림동미스코리아");
        return "greetings"; //
    }

    @GetMapping("/bye")
    public String SeeYou(Model model){
        model.addAttribute("nickname", "봉림동미스코리아");
        return "goodbye";
    }


}
