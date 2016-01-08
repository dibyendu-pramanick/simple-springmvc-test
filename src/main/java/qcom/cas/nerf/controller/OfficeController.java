package qcom.cas.nerf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/office")
public class OfficeController {

    @RequestMapping("/hello")
    @ResponseBody
    public String hello() {
        return "welcome dibyendu";
    }
}
