import java.util.Arrays;

import controllers.Ejercicios;
import controllers.EmpleadoContoller;
import controllers.EmpleadoDAO;
import controllers.EmpleadoDAOHashMap;
import controllers.EmpleadoDAOTreemap;
import controllers.Mapa;

import models.Empleado;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("----Practica Mapas----");
        System.out.println("Nombre: Kevin Paladines"); /// Cambiar por su nombre
        // Ejecuta el ejemplo de uso de HashMap con ejemplos sencillos
        //runMapExamlpe();

        // // Ejecuta el ejemplo de gestión de empleados usando HashMap
        // runEmpleadoExample();

        // // Ejecuta los ejercicios de sumatoria y anagramas
        // runEjerccios();

        // Ejecuta los ejercicios con el DAO
        //runEmpleadoDAO();

        //Ejercicios propuestos
        runEjerccios();
    }

    private static void runMapExamlpe() {
        System.out.println();
        Mapa mapa = new Mapa();
        System.out.println("-- Metodo 1 --");
        mapa.runHashMap();
        System.out.println();
        System.out.println("-- Metodo 2 --");
        mapa.runLinkedHashMap();
        System.out.println();
        System.out.println("-- Metodo 3 --");
        mapa.runTreeMap();
        System.out.println();
        System.out.println("-- Metodo 4 --");
        mapa.runHashMapObj();
        System.out.println();
        System.out.println("-- Metodo 5 --");
        mapa.runTreeMapObj();
        System.out.println();

    }

    private static void runEmpleadoDAO() {
        
        System.out.println("---- Prueba Empleados con HashMap ----");
         EmpleadoDAO daoHash = new EmpleadoDAOHashMap();
        EmpleadoContoller controllerHash = new EmpleadoContoller(daoHash);

        Empleado e1 = new Empleado(4, "Pedro", "DEV");
        Empleado e2 = new Empleado(2, "Pedro", "DEV");
        Empleado e3 = new Empleado(5, "Juan", "DEV");
        Empleado e4 = new Empleado(3, "Maria", "DEV");
        Empleado e5 = new Empleado(1, "Juan", "DEV");

        controllerHash.agregarEmpleado(e1);
        controllerHash.agregarEmpleado(e2);
        controllerHash.agregarEmpleado(e3);
        controllerHash.agregarEmpleado(e4);
        controllerHash.agregarEmpleado(e5);

        System.out.println("\n-- Lista con HashMap --");
        controllerHash.list();
        controllerHash.remove(2);
        System.out.println("\n-- Lista despues de eliminar ID 2 --");
        controllerHash.list();

        System.out.println("\n---- Prueba Empleados con TreeMap ----");
        EmpleadoDAO daoTree = new EmpleadoDAOTreemap();
        EmpleadoContoller controllerTree = new EmpleadoContoller(daoTree);

        controllerTree.agregarEmpleado(e1);
        controllerTree.agregarEmpleado(e2);
        controllerTree.agregarEmpleado(e3);
        controllerTree.agregarEmpleado(e4);
        controllerTree.agregarEmpleado(e5);

        System.out.println("\n-- Lista con TreeMap --");
        controllerTree.list();
        controllerTree.remove(2);
        System.out.println("\n-- Lista despues de eliminar ID 2 --");
        controllerTree.list();
    }

    private static void runEmpleadoExample() {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    private static void runEjerccios() {
        Ejercicios ejercicios = new Ejercicios();

        System.out.println("\n---- Ejercicio 1 ----");
        
        System.out.println(">>> Palabras: listen, silent.");
        System.out.println("¿Son anagramas? -> " + Ejercicios.areAnagrams("listen", "silent"));
        System.out.println("\n>>> Palabras : hello, bello");
        System.out.println("¿Son anagramas? -> " + Ejercicios.areAnagrams("hello", "bello"));

        System.out.println("\n---- Ejercicio 2 ----");

        int[] nums1 = {9, 2, 3, 6};
        int objetivo1 = 5;
        int[] resultado1 = ejercicios.sumatoriaDeDos(nums1, objetivo1);
        System.out.println(">>> Numeros: [9,2,3,6] -> objetivo 5: ");
        System.out.println("Posiciones: " + Arrays.toString(resultado1));

        int[] nums2 = {9, 2, 3, 6};
        int objetivo2 = 10;
        int[] resultado2 = ejercicios.sumatoriaDeDos(nums2, objetivo2);
        System.out.println("\n>>> Numeros: [9,2,3,6] -> objetivo 10: ");
        System.out.println("Posiciones: " + Arrays.toString(resultado2));

        System.out.println("\n---- Ejercicio 3 ----");

        System.out.println("Palabra: hola");
        System.out.println("Contador de caracteres : ");
        ejercicios.contarCaracteres("hola");

        System.out.println("\n---- Ejercicio 4 ----");
        boolean resultadoAnagrama = ejercicios.sonAnagramas("roma", "amor");
        System.out.println("Palabras: roma , amor.");
        System.out.println("¿Son anagramas? -> " + resultadoAnagrama);
        System.out.println();
    }
}
