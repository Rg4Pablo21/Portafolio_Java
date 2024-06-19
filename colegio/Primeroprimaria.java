package colegio;

public class Primeroprimaria {
    public static void programa(){
        Estudiante estudiante1= new Estudiante("Diego","diego@gmail.com","IV Computación","5","true");
        Estudiante estudiante2= new Estudiante("Allyson","Ally@gmail.com","IV Computación","4","true");
        Estudiante estudiante3= new Estudiante("Saudy","Saudy@gmail.com","IV Computación","6","true");
        Estudiante estudiante4= new Estudiante("Samuel","Samu@gmail.com","IV Computación","4","true");
        Estudiante estudiante5= new Estudiante("Jimena","Jimena@gmail.com","IV Computación","5","true");

        //Nombres y correos
        System.out.println(estudiante1.getNombre()+"        "+estudiante1.getCorreo());
        System.out.println(estudiante1.getNombre()+"         "+estudiante2.getCorreo());
        System.out.println(estudiante3.getNombre()+"         "+estudiante3.getCorreo());
        System.out.println(estudiante4.getNombre()+"         "+estudiante4.getCorreo());
        System.out.println(estudiante5.getNombre()+"         "+estudiante5.getCorreo());

        System.out.println("\n-------------------------------------\n");
        //Cursos
        cursos curso1 = new cursos("Matematica","Aritmetica","1");
        cursos curso2 = new cursos("Ciencias Sociales","Geografia","2");
        cursos curso3 = new cursos("Expresión Artistica","Arte","3");
        cursos curso4 = new cursos("Comunicación y Lenguaje","Lectura","4");

        System.out.println(curso1.getMateria());
        System.out.println(curso2.getMateria());
        System.out.println(curso3.getMateria());
        System.out.println(curso4.getMateria());




    }
}
