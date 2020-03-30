package life.majiang.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author shkstar
 * @create 2020-03-24 上午 2:03
 */
@Controller
public class IndexController {

    @GetMapping("/")
    public String index(){ return "index";}

}
