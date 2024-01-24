package KIM.com.HomeWorkPasswordDemo;

import org.springframework.stereotype.Controller;

@Controller
public class PasswordController {
    private PasswordServer passwordServer;

    public PasswordController(PasswordServer passwordServer) {
        this.passwordServer = passwordServer;
    }

}
