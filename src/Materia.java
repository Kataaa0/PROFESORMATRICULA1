public class Materia {
    // Atributos de la materia
    private String nombre;
    private int codigo;
    private int numeroHoras;
    private String profesor1;
    private String profesor2;
    private String profesor3;

    // Constructor
    public Materia(String nombre, int codigo, int numeroHoras, String profesor1, String profesor2, String profesor3) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.numeroHoras = numeroHoras;
        this.profesor1 = profesor1;
        this.profesor2 = profesor2;
        this.profesor3 = profesor3;
    }



    public String getNombre() {
        return nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public int getNumeroHoras() {
        return numeroHoras;
    }

    public String getProfesor1() {
        return profesor1;
    }

    public String getProfesor2() {
        return profesor2;
    }

    public String getProfesor3() {
        return profesor3;
    }
}