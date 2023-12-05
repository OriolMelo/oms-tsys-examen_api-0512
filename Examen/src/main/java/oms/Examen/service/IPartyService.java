package oms.Examen.service;

import java.util.List;


import oms.Examen.dto.Party;

public interface IPartyService {

	// Metodos del CRUD
	public List<Party> getAllByGame(int idGame);
	
	public Party add(Party party);

}
