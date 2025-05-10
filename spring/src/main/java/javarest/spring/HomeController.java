package javarest.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/testmethod")
    public String test(){
        String viewName = getViewName();
        return viewName;
    }



    private String getViewName(){
        return "index.html";
    }
}
