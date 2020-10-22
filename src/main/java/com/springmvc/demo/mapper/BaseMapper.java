package com.springmvc.demo.mapper;

import java.util.List;


public interface BaseMapper<Model, Entity> {

	public Entity mapToEntity(Model model);

	public Model mapToModel(Entity entity);

	public List<Entity> mapToEntity(List<Model> modelList);

	public List<Model> mapToModel(List<Entity> entityList);

}
