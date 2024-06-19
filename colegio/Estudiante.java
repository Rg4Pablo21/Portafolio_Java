package colegio;

public class Estudiante {

    String nombre;
    String correo;
    String carrera;
    String edad;
    String solvencia;

    Estudiante (String nombre,String correo,String carrera,String edad,String solvencia){
        this.nombre=nombre;
        this.carrera=carrera;
        this.correo=correo;
        this.edad=edad;
        this.solvencia=solvencia;
    }

    public String getCarrera() {
        return carrera;
    }

    public String getCorreo() {
        return correo;
    }

    public String getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getSolvencia() {
        return solvencia;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public void getSolvencia(String solvencia) {
        this.solvencia=solvencia;
    }

    public String toString(){
        return "Nombre"+nombre+"Carrera"+carrera+"Correo"+correo+"Edad"+edad+"Solvencia"+solvencia;
    }
}
