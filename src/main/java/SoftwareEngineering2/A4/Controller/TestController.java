package SoftwareEngineering2.A4.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {
    @RequestMapping(value = "test")
    public ModelAndView test(){
        return new ModelAndView("test");
    }
}
