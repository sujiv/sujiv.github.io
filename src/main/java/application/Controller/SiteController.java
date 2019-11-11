package application.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SiteController {

    @GetMapping("/algorithm")
    public String getAlgo(){
        return "ShortPath";
    }
}
