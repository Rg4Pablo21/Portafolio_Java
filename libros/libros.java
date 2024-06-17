package libros;

public class libros {
    private String titulo;
    private String autor;
    private String fecha;

    //Metodo Constructor
    public libros(String titulo,String autor,String fecha){
        this.titulo=titulo;
        this.autor=autor;
        this.fecha=fecha;

    }

    public String getTitulo(){
        return titulo;
    }
    public String setAutor(){
        return autor;
    }
    public String setFecha(){
        return fecha;
    }
    public String toString(){
        return "Titulo:"+titulo+",Autor:"+autor+"Fecha:" + fecha;
    }


}
