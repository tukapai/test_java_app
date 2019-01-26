package com.tukapai.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.tukapai.TestEntity;
import com.tukapai.springboot.repositories.MyDataRepository;
//import org.springframework.web.bind.annotation.RestController;

@Controller
public class HelloController {
	
	@Autowired
	MyDataRepository repository;
	
	@RequestMapping("/")
	public ModelAndView index(ModelAndView mav) {
		mav.setViewName("index");
		mav.addObject("msg", "this is sample content.");
		Iterable<TestEntity> list = repository.findAll();
		mav.addObject("data", list);
		return mav;
	}
}
