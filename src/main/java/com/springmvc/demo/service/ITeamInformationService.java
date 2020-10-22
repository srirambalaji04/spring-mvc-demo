package com.springmvc.demo.service;

import java.util.List;

import com.springmvc.demo.model.TeamInformation;

public interface ITeamInformationService {

	public void saveTeamInformation(TeamInformation teamInformation);

	public List<TeamInformation> retrieveTeamInformation();
}
