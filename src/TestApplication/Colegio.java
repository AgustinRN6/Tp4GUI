package TestApplication;

import Control.*;

public class Colegio {
    
    public static void main (String [] args) {
        
        //1 . Inicializacion de materias
        Materia m1 = new Materia(001,"Web 2",2);
        Materia m2 = new Materia(002, "Matemáticas", 1);
        Materia m3 = new Materia(003, "Laboratorio 1", 1);
        
        //2 . Inicializacion de alumnos
        Alumno a1 = new Alumno(1001, "Martin","López");
        Alumno a2 = new Alumno(1002, "Brenda", "Martínez");
        
        //3 Inscripcion a materias primer alumno
        a1.agregarMateria(m1);
        a1.agregarMateria(m2);
        a1.agregarMateria(m3);
        //4 Inscripción a materias segundo alumno
        a2.agregarMateria(m1);
        a2.agregarMateria(m2);
        a2.agregarMateria(m3);
        a2.agregarMateria(m3); //4 Se vuelve a inscribir a la materia 3
        
        // 5 Se visualiza la cantidad de materias inscriptas de cada alumno.
        System.out.println("La cantidad de materias inscriptas del alumno " + a1.getLegajo() + " es: " + a1.cantMateria());
        
        System.out.println("La cantidad de materias inscriptas del alumno " + a2.getLegajo() + " es: " + a2.cantMateria());
        
    }
}
