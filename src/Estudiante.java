public class Estudiante {

    private String cedula;
    private String nombre;
    private int codigo;
    private String materia1;
    private String materia2;
    private String materia3;

    // Constructor
    public Estudiante(String cedula, String nombre, int codigo, String materia1, String materia2, String materia3) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.codigo = codigo;
        this.materia1 = materia1;
        this.materia2 = materia2;
        this.materia3 = materia3;
    }

    // Getters
    public String getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getMateria1() {
        return materia1;
    }

    public String getMateria2() {
        return materia2;
    }

    public String getMateria3() {
        return materia3;
    }
}
