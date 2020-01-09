package com.usuario.dto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.usuario.dto.dto.UsuarioDTO;
import com.usuario.dto.dto.UsuarioRespostaDTO;
import com.usuario.dto.model.Usuario;
import com.usuario.dto.repository.UsuarioRepository;


@RequestMapping("/usuarios")
@RestController
public class UsuarioController {
	
	@Autowired
	UsuarioRepository usuarioRespository;
	
	//cadastra
	@PostMapping("salvar")
	public ResponseEntity<UsuarioRespostaDTO> salvar(@RequestBody UsuarioDTO dto) {
	    Usuario usuario = usuarioRespository.save(dto.transformaParaObjeto());
	    return new ResponseEntity<>(UsuarioRespostaDTO.transformaEmDTO(usuario), HttpStatus.CREATED);
	}
	
	
	
}
