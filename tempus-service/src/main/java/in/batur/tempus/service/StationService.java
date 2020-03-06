package in.batur.tempus.service;

import java.util.List;

import in.batur.tempus.entity.Station;

public interface StationService
{
	public List<Station> findAll();
	public Station findStationById(Long id);
	public Station saveStation(Station station);
	public void deleteStation(Long id);
}
