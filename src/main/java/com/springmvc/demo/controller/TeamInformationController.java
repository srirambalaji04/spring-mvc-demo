package com.springmvc.demo.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.springmvc.demo.model.TeamInformation;
import com.springmvc.demo.service.ITeamInformationService;
import com.springmvc.demo.validator.TeamInformationValidator;

@Controller
public class TeamInformationController extends BaseController {

	@Autowired
	private TeamInformationValidator teamInformationValidator;

	@Autowired
	private ITeamInformationService teamInformationService;

	@RequestMapping(value = "/showTeamInformation.do")
	public ModelAndView showTeamInformation(HttpServletRequest request, HttpServletResponse response, Model model) {
		populateRoleAndExperienceMap(model);
		return new ModelAndView(VIEW_SHOW_TEAM_INFORMATION, "teamInformation", new TeamInformation());
	}

	@RequestMapping(value = "/addTeamInformation.do")
	public ModelAndView addTeamInformation(HttpServletRequest request, HttpServletResponse response, Model model,
			@Validated TeamInformation teamInformation, BindingResult bindingResult) {
		teamInformationValidator.validate(teamInformation, bindingResult);
		populateRoleAndExperienceMap(model);
		if (bindingResult.hasErrors()) {
			return new ModelAndView(VIEW_SHOW_TEAM_INFORMATION);
		}
		teamInformationService.saveTeamInformation(teamInformation);
		return new ModelAndView(VIEW_TEAM_INFORMATION, "message",
				"Team Member-'" + teamInformation.getResourceName() + "' is successfully added");
	}

	@RequestMapping(value = "/viewTeamInformationList.do")
	public ModelAndView addTeamInformation(HttpServletRequest request, HttpServletResponse response, Model model) {
		model.addAttribute("teamInformationList", teamInformationService.retrieveTeamInformation());
		return new ModelAndView(VIEW_TEAM_INFORMATION_LIST);
	}

	private Map<Integer, String> getRoleMap() {
		Map<Integer, String> roleMap = new HashMap<>();
		roleMap.put(1, "Developer");
		roleMap.put(2, "Tester");
		return roleMap;
	}

	private Map<Integer, String> getExperienceMap() {
		Map<Integer, String> experienceMap = new HashMap<>();
		experienceMap.put(1, "1 to 5 Years");
		experienceMap.put(2, "5 to 10 Years");
		return experienceMap;

	}

	private void populateRoleAndExperienceMap(Model model) {
		model.addAttribute("applicationRoleMap", getRoleMap());
		model.addAttribute("experienceMap", getExperienceMap());
	}
}
