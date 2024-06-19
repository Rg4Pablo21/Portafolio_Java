package colegio;

public class cursos {
    private String Materia;
    private String Categoria;
    private String Periodo;

    cursos(String materia,String categoria,String periodo){
        this.Materia=materia;
        this.Periodo=periodo;
        this.Categoria=categoria;
    }

    public String getCategoria() {
        return Categoria;
    }

    public String getPeriodo() {
        return Periodo;
    }

    public String getMateria() {
        return Materia;
    }

    @Override
    public String toString() {
        return "Materia"+Materia+"Categoría"+ Categoria+"Periodo"+Periodo;
    }
}
