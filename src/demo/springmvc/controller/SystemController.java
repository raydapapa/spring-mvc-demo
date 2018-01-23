package demo.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * Desc
 *
 * @author Papa Ray
 * Created on 2018-01-19
 */
@Controller
public class SystemController {

    @RequestMapping("/hello")
    public ModelAndView gotoHelloPage() throws Exception {
        ModelAndView mv = new ModelAndView();
        mv.addObject("message", "Hello World!");
        System.out.println("gotoHelloPage()");
        mv.setViewName("hello");
        return mv;
    }

    @RequestMapping("/helloWorld")
    public @ResponseBody String test() {
        return "Hello world!";
    }
}
