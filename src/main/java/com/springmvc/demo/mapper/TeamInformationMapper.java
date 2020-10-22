package com.springmvc.demo.mapper;

import org.mapstruct.Mapper;

import com.springmvc.demo.entity.TeamInformationEntity;
import com.springmvc.demo.model.TeamInformation;

@Mapper(componentModel = "spring")
public interface TeamInformationMapper extends BaseMapper<TeamInformation, TeamInformationEntity> {

}
