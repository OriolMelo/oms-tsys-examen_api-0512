package oms.Examen.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import oms.Examen.dto.User;

public interface IUserDAO extends JpaRepository<User, Integer>{

}
