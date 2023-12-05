/**
 * 
 */
package oms.Examen.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import oms.Examen.dto.Game;

public interface IGameDAO extends JpaRepository<Game, Integer> {

}
