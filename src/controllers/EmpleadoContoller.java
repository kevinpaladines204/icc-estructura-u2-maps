package controllers;

import java.util.HashMap;
import java.util.Map;

import models.Empleado;

public class EmpleadoContoller {

    private EmpleadoDAO dao;

    public EmpleadoContoller(EmpleadoDAO dao) {
        this.dao = dao;
    }

    public void agregarEmpleado(Empleado emp) {
        dao.add(emp);
    }

    public void list() {
        dao.list();
    }

    public void remove(int id) {
        dao.remove(id);
    }
}