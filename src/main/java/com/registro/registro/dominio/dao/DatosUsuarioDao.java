package com.registro.registro.dominio.dao;

import com.registro.registro.dominio.modelo.DatosUsuario;

import java.util.List;

public interface DatosUsuarioDao {
    void createDatosUsuario(DatosUsuario datosUsuario);
   /**DatosUsuario readDatos(int id);
    DatosUsuario readDatosUsuarioNumeroIdentificacionUsuario(DatosUsuario datosUsuario);
    List<DatosUsuario> readListaDatosUsuario();
    void updateDatosUsuario(DatosUsuario datosUsuario, int id);
    void deleteDatosUsuario(int id);**/
}
