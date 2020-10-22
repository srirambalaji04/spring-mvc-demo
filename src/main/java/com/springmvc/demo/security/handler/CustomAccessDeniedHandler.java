package com.springmvc.demo.security.handler;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.access.AccessDeniedHandler;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CustomAccessDeniedHandler implements AccessDeniedHandler {

	@Override
	public void handle(HttpServletRequest request, HttpServletResponse response, AccessDeniedException exc)
			throws IOException, ServletException {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		if (auth != null) {
			log.warn("User: " + auth.getName() + " attempted to access the protected URL: " + request.getRequestURI());
		}
		request.setAttribute("AccessDenied", true);
		response.sendRedirect(request.getContextPath() + "/showAccessDenied.do");
	}
}