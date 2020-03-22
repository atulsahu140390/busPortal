package com.zensar.bus.dao;

import org.springframework.data.repository.CrudRepository;

import com.zensar.bus.model.RouteMODL;

public interface RouteDAO extends CrudRepository<RouteMODL, Integer> {

}
