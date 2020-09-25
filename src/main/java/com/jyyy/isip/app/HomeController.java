package com.jyyy.isip.app;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author jingshan
 * @version 1.0
 * @description
 * @date 2019/4/9
 */
@Controller
@RequestMapping
public class HomeController {
    private final String HOME_URL = "index";

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {
        return HOME_URL;
    }
}