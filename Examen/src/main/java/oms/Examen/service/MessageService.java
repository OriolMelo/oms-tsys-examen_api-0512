package oms.Examen.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import oms.Examen.dao.IMessageDAO;
import oms.Examen.dto.Message;

@Service
public class MessageService implements IMessageService {

	@Autowired(required = true)
	IMessageDAO iMessageDAO;
	
	@Override
	public List<Message> getAllByParty(int idParty){
		return iMessageDAO.findByPartyId(idParty);
	}
	
	@Override
	public Message add(Message message) {
		return iMessageDAO.save(message);
	}

	@Override
	public Message update(Message message) {
		return iMessageDAO.save(message);
	}

	@Override
	public void deleteOne(int id) {
		iMessageDAO.deleteById(id);
	}
	
	@Override
	public Message getOne(int id) {
		return iMessageDAO.findById(id).get();
	}

}
