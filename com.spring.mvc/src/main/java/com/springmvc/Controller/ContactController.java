package springmvc;

import UserService.UserService;
import jakarta.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import sprinmvcmodel.User;

@Controller
public class ContactController {

    @Autowired
    private UserService userService;


    @ModelAttribute
    public void common(Model model){
        model.addAttribute("Header","Registration Form");
        model.addAttribute("Desc","This is related to your personal info!!");

    }

    @RequestMapping("/contact")
    public String showForm(){
        return "contact";
    }

    @RequestMapping(path="/processform", method= RequestMethod.POST)
//    public String handleForm(
//            @RequestParam("userEmail") String userEmail,
//            @RequestParam("userName") String userName,
//            @RequestParam("userPassword") String userPassword, Model model)
    public String handleForm(@ModelAttribute User user, Model model)
    {
        //purana method
//        public String handleForm(HttpServletRequest request) {
//        String email = request.getParameter("email");
//        System.out.println("email: " + email);
//        System.out.println("userEmail: "+userEmail);
//        System.out.println("userName: "+userName);
//        System.out.println("userPassword: "+userPassword);
//

//        User user = new User();
//        user.setUserEmail(userEmail);
//        user.setUserName(userName);
//        user.setUserPassword(userPassword);

        System.out.println(user);;
        this.userService.createUser(user);
     //   model.addAttribute("user",user);

//        model.addAttribute("userEmail",userEmail);
//        model.addAttribute("userName",userName);
//        model.addAttribute("userPassword",userPassword);


        return "success";
    }

}
