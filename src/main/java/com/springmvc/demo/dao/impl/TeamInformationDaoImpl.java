package com.springmvc.demo.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.springmvc.demo.dao.ITeamInformationDao;
import com.springmvc.demo.entity.TeamInformationEntity;

import lombok.extern.slf4j.Slf4j;

@Repository
@Slf4j
public class TeamInformationDaoImpl extends BaseDaoImpl implements ITeamInformationDao {

	@Override
	public void saveTeamInformation(TeamInformationEntity teamInformationEntity) {
		log.info("{}", teamInformationEntity);
		getSession().save(teamInformationEntity);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<TeamInformationEntity> retrieveTeamInformation() {
		return getSession().createCriteria(TeamInformationEntity.class).list();
	}
}
