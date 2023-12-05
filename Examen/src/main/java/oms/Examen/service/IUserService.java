package oms.Examen.service;



import oms.Examen.dto.User;

public interface IUserService {

	// Metodos del CRUD
	public User getOne(int id);
	
	public User add(User user);

	public User update(User user);

}
