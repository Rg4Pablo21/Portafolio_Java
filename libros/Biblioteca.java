package libros;

public class Biblioteca {

    public static void programa(){
    System.out.println("Biblioteca");

    libros libro1=new libros("libro1111","PEPE","1994");
    libros libro2= new libros("Libro2222","Mario Vargas","2002");
    libros libro3 = new libros("1984", "George Orwell", "1949");
    libros libro4 = new libros("Matar a un ruiseñor", "Harper Lee", "1960");
    libros libro5 = new libros("Crimen y castigo", "Fiódor Dostoyevski", "1866");
    libros libro6 = new libros("Ulises", "James Joyce", "1922");
    libros libro7 = new libros("Orgullo y prejuicio", "Jane Austen", "1813");
    libros libro8 = new libros("En busca del tiempo perdido", "Marcel Proust", "1913-1927");
    libros libro9 = new libros("La Odisea", "Homero", "Siglo VIII a.C.");
    libros libro10 = new libros("El gran Gatsby", "F. Scott Fitzgerald", "1925");





// Títulos
        System.out.println(libro1.getTitulo());
        System.out.println(libro2.getTitulo());
        System.out.println(libro3.getTitulo());
        System.out.println(libro4.getTitulo());
        System.out.println(libro5.getTitulo());
        System.out.println(libro6.getTitulo());
        System.out.println(libro7.getTitulo());
        System.out.println(libro8.getTitulo());
        System.out.println(libro9.getTitulo());
        System.out.println(libro10.getTitulo());

// Autores
        System.out.println(libro1.setAutor());
        System.out.println(libro2.setAutor());
        System.out.println(libro3.setAutor());
        System.out.println(libro4.setAutor());
        System.out.println(libro5.setAutor());
        System.out.println(libro6.setAutor());
        System.out.println(libro7.setAutor());
        System.out.println(libro8.setAutor());
        System.out.println(libro9.setAutor());
        System.out.println(libro10.setAutor());

// Fechas
        System.out.println(libro1.setFecha());
        System.out.println(libro2.setFecha());
        System.out.println(libro3.setFecha());
        System.out.println(libro4.setFecha());
        System.out.println(libro5.setFecha());
        System.out.println(libro6.setFecha());
        System.out.println(libro7.setFecha());
        System.out.println(libro8.setFecha());
        System.out.println(libro9.setFecha());
        System.out.println(libro10.setFecha());

    }



}
