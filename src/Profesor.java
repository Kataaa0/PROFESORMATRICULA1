public class Profesor {
   
    private String nombre;
    private String cedula;
    private String codigoP;

    public Profesor(String nombre, String cedula, String codigoP) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.codigoP = codigoP;
    }


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
