package com.springmvc.demo.dao;

import java.util.List;

import com.springmvc.demo.entity.TeamInformationEntity;

public interface ITeamInformationDao {

	public void saveTeamInformation(TeamInformationEntity teamInformationEntity);
	
	public List<TeamInformationEntity> retrieveTeamInformation();

}
