package springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/first")
public class HomeController {

    @RequestMapping(path="/home", method= RequestMethod.GET)
    public String Home(Model model) {
        System.out.println("This is home page");
        model.addAttribute("name", "Urvashi Verma");
        model.addAttribute("ID", 124);
        List<String> friends = new ArrayList<String>();
        friends.add("Rohan");
        friends.add("Mohan");
        friends.add("Sohan");
        model.addAttribute("friends", friends);
        return "index";
    }

    @RequestMapping("/about")
    public String about(){
        System.out.println("This is the about page");
        return "about";
    }

    @RequestMapping("/help")
    public ModelAndView help(){
        {
            System.out.println("This is the help page");
            ModelAndView mav = new ModelAndView();
            mav.setViewName("help");
            mav.addObject("name", "Urvashi Verma is here.");

            List<Integer> marks = new ArrayList<>();
            marks.add(1);
            marks.add(2);
            marks.add(3);

            mav.addObject("marks", marks);

            return mav;
        }
    }

}
