/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package org.ruben.java.leerProperties;

import java.io.IOException;

import org.ruben.java.leerProperties.properties.Prop;

public class App {
    public String getGreeting() {
        return "Inicio.";
    }

    public static void main(String[] args) throws IOException {

        System.out.println(new App().getGreeting());

        System.out.println("EL directorio de lectura es:  " + Prop.DIRECTORIO_DE_LECTURA.get());
        System.out.println("El numero de hilos es:  " + Prop.NUMERO_DE_HILOS.get());

        // Resultado:
        // Inicio.
        // EL directorio de lectura es: ruta/del/nombre/Del/Directorio/
        // El numero de hilos es: 4

        //new App().mostrarRutaDelRecurso();
    }

    public void mostrarRutaDelRecurso() {
        System.out.println("Leer recursos");
        System.out.println(this.getClass().getResource("ejemplo.properties"));
        System.out.println(this.getClass().getResource("/ejemplo.properties"));
        System.out.println(this.getClass().getClassLoader().getResource("ejemplo.properties"));
    }

}
