public class Profesor {
    // Atributos del profesor
    private String nombre;
    private String cedula;
    private String codigoP;

    // Constructor
    public Profesor(String nombre, String cedula, String codigoP) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.codigoP = codigoP;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public String getCodigoP() {
        return codigoP;
    }
}
