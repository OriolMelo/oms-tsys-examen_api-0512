package oms.Examen.service;

import java.util.List;

import oms.Examen.dto.Message;

public interface IMessageService {

	// Metodos del CRUD
	public List<Message> getAllByParty(int idParty);
	
	public Message getOne(int id);
	
	public Message add(Message message);
	
	public Message update(Message message);

	public void deleteOne(int id);
	
}
