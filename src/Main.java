public class Main {
    public static void main(String[] args) {

        Materia[] materias = new Materia[3];
        materias[0] = new Materia("Física", 21, 3, "Rafael", "Santiago", "Juan");
        materias[1] = new Materia("Calculo", 12, 3, "Rafael", "Santiago", "Juan");
        materias[2] = new Materia("Comunicacion", 31, 2, "Rafael", "Santiago", "Juan");

        System.out.println("Información de Materias:\n");
        for (int i = 0; i < materias.length; i++) {
            System.out.println("Materia " + (i + 1) + ":");
            System.out.println("Nombre: " + materias[i].getNombre());
            System.out.println("Código: " + materias[i].getCodigo());
            System.out.println("Número de Horas: " + materias[i].getNumeroHoras());
            System.out.println("Profesor de la materia 1: " + materias[i].getProfesor1());
            System.out.println("Profesor de la materia 2: " + materias[i].getProfesor2());
            System.out.println("Profesor de la materia3: " + materias[i].getProfesor3());
            System.out.println();
        }


        Estudiante estudiante = new Estudiante("1758241036", "Lorena", 123, "Física", "Cálculo", "Comunicación");

        System.out.println("\nInformación del Estudiante:\n");
        System.out.println("Nombre: " + estudiante.getNombre());
        System.out.println("Cédula: " + estudiante.getCedula());
        System.out.println("Código: " + estudiante.getCodigo());
        System.out.println("Materia 1: " + estudiante.getMateria1());
        System.out.println("Materia 2: " + estudiante.getMateria2());
        System.out.println("Materia 3: " + estudiante.getMateria3());


        Profesor[] profesores = new Profesor[3];
        profesores[0] = new Profesor("Rafael", "0963204185", "58");
        profesores[1] = new Profesor("Santiago", "1752498035", "25");
        profesores[2] = new Profesor("Juan", "1396875240", "47");

        System.out.println("\nInformación de Profesores:\n");
        for (int i = 0; i < profesores.length; i++) {
            System.out.println("Profesor " + (i + 1) + ":");
            System.out.println("Nombre del profesor: " + profesores[i].getNombre());
            System.out.println("Cédula del profesor: " + profesores[i].getCedula());
            System.out.println("Código del profesor: " + profesores[i].getCodigoP());
            System.out.println();
        }
    }
}



