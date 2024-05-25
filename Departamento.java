public class Departamento implements ComponenteEmpresa {
    private String nombre;
    private List<ComponenteEmpresa> componentes;

    public Departamento(String nombre) {
        this.nombre = nombre;
        this.componentes = new ArrayList<>();
    }

    public void addComponente(ComponenteEmpresa componente) {
        componentes.add(componente);
    }

    public void removeComponente(ComponenteEmpresa componente) {
        componentes.remove(componente);
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Departamento: " + nombre);
        for (ComponenteEmpresa componente : componentes) {
            componente.mostrarDetalles();
        }
    }
}
