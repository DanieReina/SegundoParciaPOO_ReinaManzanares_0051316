public class Empresa {
    {
        private ComponenteEmpresa ceo;

    public Empresa(ComponenteEmpresa ceo) {
        this.ceo = ceo;
    }

        public void mostrarEstructura() {
        ceo.mostrarDetalles();
    }
}
