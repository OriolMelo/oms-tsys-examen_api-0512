package oms.Examen.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import oms.Examen.dao.IPartyDAO;
import oms.Examen.dto.Party;

@Service
public class PartyService implements IPartyService {

	@Autowired(required = true)
	IPartyDAO iPartyDAO;

	@Override
	public List<Party> getAllByGame(int idGame) {
		return iPartyDAO.findByGameId(idGame);
	}
	
	@Override
	public Party add(Party party) {
		return iPartyDAO.save(party);
	}

}
