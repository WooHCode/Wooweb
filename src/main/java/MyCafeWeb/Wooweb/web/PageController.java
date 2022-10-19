package MyCafeWeb.Wooweb.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class PageController {

    @GetMapping("/index")
    public String indexPage(){
        return "index";
    }
    @GetMapping("/about")
    public String aboutPage(){
        return "about";
    }
    @GetMapping("/contact")
    public String contactPage(){
        return "contact";
    }

    @GetMapping("/menu")
    public String menuPage(){
        return "menu";
    }

    @GetMapping("/reservation")
    public String reservationPage(){
        return "reservation";
    }

    @GetMapping("/service")
    public String servicePage(){
        return "service";
    }

    @GetMapping("/testimonial")
    public String testimonialPage(){
        return "testimonial";
    }


}
