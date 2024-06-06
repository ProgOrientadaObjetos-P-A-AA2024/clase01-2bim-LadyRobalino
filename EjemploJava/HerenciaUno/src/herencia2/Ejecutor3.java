/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia2;

import java.util.Locale;
import java.util.Scanner;
import herencia1.EstudianteDistancia;
import herencia1.EstudiantePresencial;

/**
 *
 * @author reroes
 */
public class Ejecutor3 {

    public static void main(String[] args) {
        // Ingresar por teclado
        // un objeto de tipo Estudiante Distancia si el usuario ingresa 1 como 
        // opción
        // un objeto de tipo Estudiante Presencial si el usuario ingresa 2 como 
        // opción

        Scanner entrada = new Scanner(System.in);
        System.out.println("Si quiere acceso a Estudiante Distancia. Ingrese 1: ");
        System.out.println("Si quiere acceso a Estudiante Presencial. Ingrese 2: ");
        int opcion = entrada.nextInt();
        entrada.nextLine();
        if (opcion == 1) {
            entrada.useLocale(Locale.US);
            System.out.println("Ingrese nombres");
            String nombres = entrada.nextLine();
            System.out.println("Ingrese apellidos");
            String apellidos = entrada.nextLine();
            System.out.println("Ingrese identificación");
            String identificacion = entrada.nextLine();
            System.out.println("Ingrese edad");
            int edad = entrada.nextInt();
            System.out.println("Ingrese número de asignaturas");
            int asignaturas = entrada.nextInt();
            System.out.println("Ingrese costo asignatura");
            double costoAsignatura = entrada.nextDouble();
            EstudianteDistancia estudiante = new EstudianteDistancia();

            estudiante.establecerNombresEstudiante(nombres);
            estudiante.establecerApellidoEstudiante(apellidos);
            estudiante.establecerEdadEstudiante(edad);
            estudiante.establecerIdentificacionEstudiante(identificacion);
            estudiante.establecerNumeroAsginaturas(asignaturas);
            estudiante.establecerCostoAsignatura(costoAsignatura);
            estudiante.calcularMatriculaDistancia();

            System.out.printf("%s\n", estudiante);
        }
        if (opcion == 2) {
            entrada.useLocale(Locale.US);
            System.out.println("Ingrese nombres");
            String nombres = entrada.nextLine();
            System.out.println("Ingrese apellidos");
            String apellidos = entrada.nextLine();
            System.out.println("Ingrese identificación");
            String identificacion = entrada.nextLine();
            System.out.println("Ingrese edad");
            int edad = entrada.nextInt();
            System.out.println("Ingrese número de creditos");
            int creditos = entrada.nextInt();
            System.out.println("Ingrese costo credito");
            double costoAsignatura = entrada.nextDouble();

            EstudiantePresencial estudiante2 = new EstudiantePresencial();

            estudiante2.establecerNombresEstudiante(nombres);
            estudiante2.establecerApellidoEstudiante(apellidos);
            estudiante2.establecerEdadEstudiante(edad);
            estudiante2.establecerIdentificacionEstudiante(identificacion);
            estudiante2.establecerNumeroCreditos(creditos);
            estudiante2.establecerCostoCredito(costoAsignatura);
            estudiante2.calcularMatriculaPresencial();

            System.out.printf("%s\n", estudiante2);
        }

    }
}
