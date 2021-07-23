package com.example.demo.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.Categoria;
import com.example.demo.domain.services.CategoriaService;

@RestController
@RequestMapping(value="/categorias")
public class CategoriaResource {
	
	private CategoriaService service;
		@RequestMapping(value="/(id)",method = RequestMethod.GET)
		public ResponseEntity<?> find(Integer id) {
			
			Categoria obj = service.buscar(id);
			return ResponseEntity.ok().body(obj);
			
		}

}
