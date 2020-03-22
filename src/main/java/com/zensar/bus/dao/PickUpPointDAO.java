package com.zensar.bus.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.zensar.bus.model.PickUpPointMODL;

public interface PickUpPointDAO extends CrudRepository<PickUpPointMODL, Integer> {

	List<PickUpPointMODL> findByrouteId(Integer routeId);
}
