package com.example.tukapai;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserAddController{
	
	@Autowired
	PasswordEncoder passwdEncoder;
	
	@Autowired
	UserRepository repository;
	
	@Autowired
	UserRepository userRepository;
	
	@RequestMapping(value = "/add" ,method = RequestMethod.GET)
	public ModelAndView add(@ModelAttribute("formModel")User user,ModelAndView mav){
		mav.setViewName("add");
		return mav;
	}
	
	@RequestMapping(value ="/add", method = RequestMethod.POST)
	@Transactional(readOnly = false)
	public ModelAndView form(@ModelAttribute("formModel")User user, ModelAndView mav){
		if(userRepository.countByUsername(user.getUsername()) > 0){
			mav.addObject("obj", user.getUsername() + "は既に使用されてるユーザ名です。");
			mav.setViewName("add");
		} else {
			user.setPassword(passwdEncoder.encode(user.getPassword()));
			repository.saveAndFlush(user);
			mav.addObject("user", user.getUsername() + "さん登録完了しました。");
			mav.setViewName("main");
		}
		return mav;
	}
}