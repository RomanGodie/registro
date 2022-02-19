package com.registro.registro.aplicacion.fabrica;

import com.registro.registro.dominio.modelo.DatosUsuario;
import com.registro.registro.infraestructura.dto.RegistroUsuarioDto;
import org.springframework.stereotype.Component;

@Component
public class FabricaRegistroUsuario {
    public DatosUsuario convertir(RegistroUsuarioDto registroUsuarioDto) {
        DatosUsuario datosUsuario = new DatosUsuario();
        datosUsuario.setDocumentoIdentificacionUsario(registroUsuarioDto.getDocumentoIdentificacionUsario());
        datosUsuario.setNombreUsuario(registroUsuarioDto.getNombreUsuario());
        return datosUsuario;
    }
}