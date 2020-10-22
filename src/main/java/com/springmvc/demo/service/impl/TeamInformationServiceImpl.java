package com.springmvc.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springmvc.demo.dao.ITeamInformationDao;
import com.springmvc.demo.mapper.TeamInformationMapper;
import com.springmvc.demo.model.TeamInformation;
import com.springmvc.demo.service.ITeamInformationService;

@Service
public class TeamInformationServiceImpl implements ITeamInformationService {

	@Autowired
	private TeamInformationMapper teamInformationMapper;

	@Autowired
	private ITeamInformationDao teamInformationDao;

	@Transactional
	@Override
	public void saveTeamInformation(TeamInformation teamInformation) {
		teamInformationDao.saveTeamInformation(teamInformationMapper.mapToEntity(teamInformation));
	}

	@Transactional
	@Override
	public List<TeamInformation> retrieveTeamInformation() {
		return teamInformationMapper.mapToModel(teamInformationDao.retrieveTeamInformation());

	}
}
