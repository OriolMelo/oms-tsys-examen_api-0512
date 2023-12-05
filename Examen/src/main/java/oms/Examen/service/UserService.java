package oms.Examen.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import oms.Examen.dao.IUserDAO;
import oms.Examen.dto.User;

@Service
public class UserService implements IUserService{
	
	@Autowired(required = true)
	IUserDAO iUserDAO;
	
	@Override
	public User add(User user) {
		return iUserDAO.save(user);
	}

	@Override
	public User update(User user) {
		return iUserDAO.save(user);
	}

	@Override
	public User getOne(int id) {
		return iUserDAO.findById(id).get();
	}

}
