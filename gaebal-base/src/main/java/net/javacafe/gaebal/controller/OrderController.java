package net.javacafe.gaebal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author 임형태
 * @since 2015.10.28
 */
@Controller
public class OrderController {

    @RequestMapping(value = "/order", method = RequestMethod.GET)
    public ModelAndView hello() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("order");

        String str = "계발자 주문 페이지";
        mav.addObject("message", str);

        return mav;
    }
}

