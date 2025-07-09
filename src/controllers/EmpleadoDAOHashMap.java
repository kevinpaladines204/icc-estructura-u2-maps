package controllers;
import java.util.HashMap;
import java.util.Map;
import models.Empleado;

public class EmpleadoDAOHashMap implements EmpleadoDAO {
    private Map<Empleado, Empleado> empleados ;

    public EmpleadoDAOHashMap(){
        this.empleados = new HashMap<>();
    }

    @Override
    public void add(Empleado emp) {
        empleados.put(emp, emp);
        System.out.println("Empleado agregado: " + emp);
    }

    @Override
    public void list() {
        if (empleados.isEmpty()) {
            System.out.println("No hay empleados registrados.");
        } else {
            System.out.println("Lista de empleados:");
            for (Empleado emp : empleados.keySet()) {
                System.out.println(emp);
            }
        }
    }

    @Override
    public void remove(int id) {
        Empleado aEliminar = null;
        for (Empleado emp : empleados.keySet()) {
            if (emp.getId() == id) {
                aEliminar = emp;
                break;
            }
        }

        if (aEliminar != null) {
            empleados.remove(aEliminar);
            System.out.println("Empleado eliminado: " + aEliminar);
        } else {
            System.out.println("No se encontró un empleado con ID: " + id);
        }
    }
}