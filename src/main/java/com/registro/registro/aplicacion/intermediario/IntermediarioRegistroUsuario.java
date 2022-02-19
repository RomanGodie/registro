package com.registro.registro.aplicacion.intermediario;


import com.registro.registro.aplicacion.fabrica.FabricaRegistroUsuario;
import com.registro.registro.dominio.dto.RespuestaRegistroUsuarioDto;
import com.registro.registro.dominio.servicio.RegistroUsuarioService;
import com.registro.registro.infraestructura.dto.RegistroUsuarioDto;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class IntermediarioRegistroUsuario {
    FabricaRegistroUsuario fabricaRegistroUsuario;
    RegistroUsuarioService registroUsuarioService;

    public RespuestaRegistroUsuarioDto respuestaRegistroUsuarioDto(RegistroUsuarioDto registroUsuarioDto){
        return registroUsuarioService.analizar(fabricaRegistroUsuario.convertir(registroUsuarioDto));
    }
}
