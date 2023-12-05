package oms.Examen.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import oms.Examen.dto.Party;

public interface IPartyDAO extends JpaRepository<Party, Integer> {

	List<Party> findByGameId(int idGame);

}
