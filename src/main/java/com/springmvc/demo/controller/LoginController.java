package com.springmvc.demo.controller;

import javax.servlet.http.HttpSession;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;

import com.springmvc.demo.entity.CustomUserDetails;
import com.springmvc.demo.entity.UserDetailsEntity;
import com.springmvc.demo.model.LoginDetails;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
@SessionAttributes({ "currentUser" })
public class LoginController extends BaseController {

	@RequestMapping(value = "/showLogin.do")
	public ModelAndView login() {
		return new ModelAndView(VIEW_SHOW_LOGIN, "loginDetails", new LoginDetails());
	}

	@RequestMapping(value = "/loginFailed.do")
	public ModelAndView loginError(Model model) {
		log.info("Login attempt failed");
		model.addAttribute("message", "UserName or Password Incorrect");
		return new ModelAndView(VIEW_SHOW_LOGIN, "loginDetails", new LoginDetails());
	}

	@RequestMapping(value = "/logout.do")
	public ModelAndView logout(Model model, SessionStatus session) {
		SecurityContextHolder.getContext().setAuthentication(null);
		session.setComplete();
		model.addAttribute("message", "Successfully Logged out");
		return new ModelAndView(VIEW_SHOW_LOGIN, "loginDetails", new LoginDetails());
	}

	@RequestMapping(value = "/showHome.do")
	public ModelAndView showHome(Model model, HttpSession session) {
		UsernamePasswordAuthenticationToken userPasswordAuthenticationToken = (UsernamePasswordAuthenticationToken) SecurityContextHolder
				.getContext().getAuthentication();

		validatePrincipal(userPasswordAuthenticationToken.getPrincipal());

		UserDetailsEntity userDetailsEntity = ((CustomUserDetails) userPasswordAuthenticationToken.getPrincipal())
				.getUserDetailsEntity();
		model.addAttribute("currentUser", userDetailsEntity.getUserName());
		session.setAttribute("userId", userDetailsEntity.getUserId());

		return new ModelAndView(VIEW_SHOW_HOME);
	}

	private void validatePrincipal(Object principal) {
		if (!(principal instanceof CustomUserDetails)) {
			throw new IllegalArgumentException("Principal can not be null!");
		}
	}

	@RequestMapping(value = "/showAccessDenied.do")
	public ModelAndView showAccessDenied(Model model) {
		return new ModelAndView(VIEW_SHOW_ACCESS_DENIED);
	}

}
