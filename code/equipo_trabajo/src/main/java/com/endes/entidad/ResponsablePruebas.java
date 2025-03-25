package com.endes.entidad;

/**
 * Clase que representa a un REsponsable de pruebas, al que se le cuentan el numero de bugs que encuentra en su trabajo.
 * 
 * Cuanto mayor cantidad de bugs detectados mayor sera la productividad que se le aplicara al sueldo gbase
 * 
 * @author Raul
 */

public class ResponsablePruebas extends Personal {
    private int bugsDetectados;

    	
    /**
     * Constructor para crear un objeto ResponsablePruebas.
     * 
     * @param dni               Documento de identidad
     * @param nombre            Nombre del desarrollador
     * @param sueldoBase        Sueldo base
     * @param bugsDetectados	Numero de bugs detectados por los programadores
     * @throws IllegalArgumentException si el lenguaje principal es nulo o vacío
     */
    
    public ResponsablePruebas(String dni, String nombre, double sueldoBase, int bugsDetectados) {
        super(dni, nombre, sueldoBase);
        setBugsDetectados(bugsDetectados);
    }
    
    /**
     * Devuelve el la cantidad de bug detectados.
     * 
     * @return los bugs como Double
     */

    public int getBugsDetectados() {
        return bugsDetectados;
    }
    

    /**
     * Establece la cantidad de bugs.
     * 
     * @param bugsDetectados numero de bugs detectados
     * @throws IllegalArgumentException si el numero de bugs es negativo
     */

    public void setBugsDetectados(int bugsDetectados) {
        if (bugsDetectados < 0) {
            throw new IllegalArgumentException("El número de bugs detectados no puede ser negativo.");
        }
        this.bugsDetectados = bugsDetectados;
    }
   
    @Override
    public double calcularProductividad() {
        return getSueldoBase() * (1 + 0.02 * bugsDetectados);
    }
}
