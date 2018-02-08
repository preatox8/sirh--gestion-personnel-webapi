package dev.sgpwebapi.controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import dev.sgpwebapi.entite.Collaborateur;
import dev.sgpwebapi.repository.CollaborateurRepository;

@RestController
@RequestMapping("/api/collaborateurs")
public class CollaborateurController {

	@Autowired
	private CollaborateurRepository collaborateurRepo;

	@GetMapping
	public List<Collaborateur> listercollaborateurs(@RequestParam("departement") Optional<Integer> id) {
		if (id.isPresent()) {
			return collaborateurRepo.findByDepartementId(id);
		} else {
			return collaborateurRepo.findAll();
		}
	}

	// @RequestMapping(path = "/{matricule}", method = RequestMethod.GET)
	@GetMapping("/{matricule}")
	public Collaborateur affichercollaborateurs(@PathVariable String matricule) {
		return collaborateurRepo.findByMatricule(matricule);
	}

	@PutMapping("/{matricule}")
	public Collaborateur modifiercollaborateur(@PathVariable String matricule) {
		Collaborateur collabAModif = collaborateurRepo.findByMatricule(matricule);
		Collaborateur collabmodifier = new Collaborateur();
			if(collabAModif != null ) {	
				collabmodifier = collabAModif;
				collabmodifier.setMatricule("Matricule Modifier");
				collaborateurRepo.save(collabmodifier);
			}
		return null;
	}
	
	

}
