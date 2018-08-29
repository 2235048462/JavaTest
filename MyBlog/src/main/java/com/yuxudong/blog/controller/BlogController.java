package com.yuxudong.blog.controller;

import com.yuxudong.blog.service.BlogTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/blog")
public class BlogController {

    @Autowired
    private BlogTypeService blogTypeService;
    @RequestMapping(value = "/classify", method = RequestMethod.GET)
    public ModelAndView classify(){
        ModelAndView mav = new ModelAndView("classify");
        List<String> typeList = blogTypeService.getBlogTypeList();
        mav.addObject("typeList", typeList);
        mav.addObject("typeNum", blogTypeService.countBlogTypeNum());
        return mav;
    }
}
