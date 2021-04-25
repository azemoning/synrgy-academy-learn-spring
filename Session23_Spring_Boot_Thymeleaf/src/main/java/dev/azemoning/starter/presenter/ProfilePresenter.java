package dev.azemoning.starter.presenter;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProfilePresenter {

    @GetMapping("profile")
    public String showProfile() {
        return "profile";
    }
}
