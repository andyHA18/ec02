package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.PathVariable;
// imports for use List, Map, String and Object

import java.lang.String;

@Controller	
@RequestMapping(path="/api/curso") 
public class ApiController {
	@Autowired 
	private CursoRepository cursoRepository;



	@PostMapping(path="/nuevo") 
	public @ResponseBody String addNewCurso (@RequestParam String nombre
			, @RequestParam int creditos) {
		Curso n = new Curso();
		n.setNombre(nombre);
		n.setCreditos(creditos);
		cursoRepository.save(n);
		return "Saved";
	}

	@DeleteMapping(path="/eliminar")
	public @ResponseBody String delCurso (@RequestParam Integer id) {
		Curso n = new Curso();
		n.setId(id);
		cursoRepository.delete(n);
		return "Deleted";
	}


	@GetMapping(path="/all")
	public @ResponseBody Iterable<Curso> getAllCurso() {
		return cursoRepository.findAll();
	}


	


}

