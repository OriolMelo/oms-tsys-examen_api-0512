package oms.Examen.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import oms.Examen.dto.Message;

public interface IMessageDAO extends JpaRepository<Message, Integer>{
	
	List<Message> findByPartyId(int idParty);
}

