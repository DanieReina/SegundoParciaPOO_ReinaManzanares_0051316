public class Empleado implements ComponenteEmpresa {
    private String nombre;
    private String puesto;

    public Empleado(String nombre, String puesto) {
        this.nombre = nombre;
        this.puesto = puesto;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println(nombre + " - " + puesto);
    }
}
