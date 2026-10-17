import java.util.ArrayList;

public class Estudiante {
    private String nombre;
    private ArrayList<Double> calificaciones;

    public Estudiante(String nombre) {
        this.nombre = nombre;
        this.calificaciones = new ArrayList<>(); // Instanciación del ArrayList
    }

    public void agregarNota(double nota) {
        if (nota >= 0.0 && nota <= 10.0) {
            this.calificaciones.add(nota);
            System.out.println("Nota " + nota + " agregada correctamente.");
        } else {
            System.out.println("La nota " + nota + " no es válida. Debe estar entre 0.0 y 10.0.");
        }
    }

    public double calcularPromedio() {
        if (this.calificaciones.isEmpty()) {
            return 0.0;
        }

        double suma = 0.0;
        for (double nota : this.calificaciones) {
            suma += nota;
        }
        return suma / this.calificaciones.size();
    }

    public boolean haAprobado() {
        return calcularPromedio() >= 6.0;
    }

    public String getNombre() {
        return nombre;
    }

    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante("Lucía");

        estudiante.agregarNota(8.5);
        estudiante.agregarNota(5.0);
        estudiante.agregarNota(11.0); // Nota inválida
        estudiante.agregarNota(7.0);

        double promedio = estudiante.calcularPromedio();
        System.out.println(String.format("Promedio de %s: %.2f", estudiante.getNombre(), promedio));
        System.out.println("¿Aprobó el estudiante?: " + (estudiante.haAprobado() ? "SÍ" : "NO"));
    }
}