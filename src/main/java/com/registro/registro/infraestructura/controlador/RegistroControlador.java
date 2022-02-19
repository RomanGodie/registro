package com.registro.registro.infraestructura.controlador;

import com.registro.registro.aplicacion.intermediario.IntermediarioRegistroUsuario;
import com.registro.registro.dominio.dto.RespuestaRegistroUsuarioDto;
import com.registro.registro.infraestructura.dto.RegistroUsuarioDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class RegistroControlador {
    IntermediarioRegistroUsuario intermediarioRegistroUsuario;

    public RegistroControlador(IntermediarioRegistroUsuario intermediarioRegistroUsuario) {
        this.intermediarioRegistroUsuario = intermediarioRegistroUsuario;
    }

    @PostMapping("/registro")
    public RespuestaRegistroUsuarioDto registroUsuario(@RequestBody RegistroUsuarioDto registroUsuarioDto){
        return intermediarioRegistroUsuario.respuestaRegistroUsuarioDto(registroUsuarioDto);
    }
}
