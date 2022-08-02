package com.programacion.servicios;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class OperacionesImpl implements Operaciones {

    @Inject
    private ServicioLog log;

@Override
    public int sumar (int x, int y){
        return  x+y;
    }

    @PostConstruct
    void init() {
        log.log("**************OoperacionesImp::int");
    }

    @PreDestroy
    void destroy() {
        log.log("**************OoperacionesImp::destroy");
    }
}
