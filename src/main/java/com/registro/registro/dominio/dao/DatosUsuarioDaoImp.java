package com.registro.registro.dominio.dao;

import com.registro.registro.dominio.modelo.DatosUsuario;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Repository
@Transactional
public class DatosUsuarioDaoImp implements DatosUsuarioDao{
    @PersistenceContext
    EntityManager entityManager;

    @Override
    public void createDatosUsuario(DatosUsuario datosUsuario) {
        entityManager.merge(datosUsuario);
    }
}
