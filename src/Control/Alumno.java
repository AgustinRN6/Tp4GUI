
package Control;

import java.util.HashSet;


public class Alumno {
    private int nrLegajo;
    private String nombre;
    private String apellido;
    private HashSet<Materia> materias = new HashSet();
    //Constructor
    public Alumno(int nrLegajo, String nombre, String apellido){
    this.nrLegajo = nrLegajo;
    this.nombre = nombre;
    this.apellido = apellido;
    }
    
    public int getLegajo(){
        return nrLegajo;
        }
    public void setLegajo(int legajo){
        this.nrLegajo = legajo;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre= nombre;
    }
    public String getApellido(){
        return apellido;
    }
    public void setApellido(String apellido){
        this.apellido = apellido;
    }
    //Metodos para agregar Materia
    public void agregarMateria(Materia m){
        materias.add(m);//Agrega la materia al HashSet.
    }
    public int cantMateria(){
    return materias.size();//retorna el tamaño del Arreglo.
    }
    
}
