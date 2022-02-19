package com.registro.registro.dominio.servicio;

import com.registro.registro.dominio.dao.DatosUsuarioDao;
import com.registro.registro.dominio.dto.RespuestaRegistroUsuarioDto;
import com.registro.registro.dominio.modelo.DatosUsuario;
import org.springframework.stereotype.Component;

@Component
public class RegistroUsuarioService {
    DatosUsuarioDao datosUsuarioDao;

    public RegistroUsuarioService(DatosUsuarioDao datosUsuarioDao) {
        this.datosUsuarioDao = datosUsuarioDao;
    }

    public RespuestaRegistroUsuarioDto analizar(DatosUsuario datosUsuario){
        if(verificacionCedula(datosUsuario.getDocumentoIdentificacionUsario())){
            datosUsuarioDao.createDatosUsuario(datosUsuario);
            return new RespuestaRegistroUsuarioDto("Usuario Registrado con Exito desde el Dto en el service con\nID:"+
                    datosUsuario.getDocumentoIdentificacionUsario()+"\nNombre: "+ datosUsuario.getNombreUsuario());
        }else{
            return new RespuestaRegistroUsuarioDto("La Cedula Ingresada es Incorrecta");
        }

    }
    private static boolean verificacionCedula(String cedula){
        boolean isNumeric =  isNumeric(cedula);
        if (!isNumeric){
            return false;
        }else {
            return true;
        }
    }
    private static boolean isNumeric(String cadena){
        try {
            Integer.parseInt(cadena);
            return true;
        } catch (NumberFormatException nfe){
            return false;
        }
    }
}
