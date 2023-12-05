package oms.Examen.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import oms.Examen.dto.Party;
import oms.Examen.service.PartyService;

@RestController
@RequestMapping("/party")
public class PartyController {

	@Autowired(required = true)
	PartyService partyService;

	@GetMapping("/all")
	public List<Party> listAllParties(@RequestParam(name = "idGame", required = true) Integer idGame){
		return partyService.getAllByGame(idGame);
	}

	@PostMapping("/add")
	public Party saveParty(@RequestBody Party party) {
		return partyService.add(party);
	}
}
