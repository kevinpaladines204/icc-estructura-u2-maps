package controllers;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

import models.Empleado;

public class Mapa {
    public Mapa() {
        System.out.println("Mapa Class");
    }

    public void runHashMap(){
        Map<String , String> mapa = new HashMap();
        mapa.put("001", "Celular");
        mapa.put("002", "Laptop");
        mapa.put("003", "Celular");
        mapa.put("003", "PC");

        //hacemos un for each y que imprima cada valor
        System.out.println(mapa);
        System.out.println(mapa.keySet());

        for(String codd: mapa.keySet()){
            System.out.println(mapa.get(codd));
        }
        System.out.println(mapa.get("001"));
        System.out.println(mapa.get("005"));
    }

    public void runLinkedHashMap(){
        //crear un mapa con clavenumeros y valor nombre de personas solo nombres
        // INteger - String
        //Agregen 5 elementos e imprimir todos los valores
        Map<Integer, String>mapa = new LinkedHashMap();
        mapa.put(01, "Rafa");
        mapa.put(02, "Ermes");
        mapa.put(03, "Jose");
        mapa.put(04, "Teo");
        mapa.put(05, "Ana");

        for (String nombre : mapa.values()){
            System.out.println(nombre);
        }
    }

    public void runTreeMap(){
        Map<Integer, String> items = new TreeMap();
        items.put(3, "Carro");
        items.put(6, "Bicicleta");
        items.put(1, "Moto");

        for (String nom : items.values()){
            System.out.println(nom);
        }
    }

    public void runHashMapObj(){
        Map<Empleado, Integer> empleados = new HashMap();
        empleados.put(new Empleado(1,"Juan", "Dev"), 1200);
        empleados.put(new Empleado(2,"Juan", "Dev"), 1500);
        empleados.put(new Empleado(3,"Pedro", "Dev"), 2000);
        empleados.put(new Empleado(1,"Juan", "Dev"), 2500);
        empleados.put(new Empleado(1,"Diego", "Dev"), 3000);

        System.out.println(empleados);

        for(Empleado empleado : empleados.keySet()){
            System.out.println("empleado " + empleado + "hashCode " + empleado.hashCode());
        }
    }

    public void runTreeMapObj(){
        Map<Empleado, Integer> empleadoss = new HashMap();
        empleadoss.put(new Empleado(1,"Juan", "Dev"), 1200);
        empleadoss.put(new Empleado(2,"Juan", "Dev"), 1500);
        empleadoss.put(new Empleado(3,"Pedro", "Dev"), 2000);
        empleadoss.put(new Empleado(1,"Diego", "Dev"), 1200);
        empleadoss.put(new Empleado(1,"Juan", "Dev"), 1200);

        System.out.println(empleadoss);

        for (Integer salar : empleadoss.values()){
            System.out.println(salar);
        }
    }
}
