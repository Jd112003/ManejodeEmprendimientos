// Subclase para proyectos de desarrollo de productos
class ProyectoProducto extends ProyectoInnovacion {
    private String productoFinal;

    public ProyectoProducto(String nombre, String lider, double presupuesto, String productoFinal) {
        super(nombre, lider, presupuesto);
        this.productoFinal = productoFinal;
    }

    @Override
    public String resumen() {
        return super.resumen() + " Producto final: " + productoFinal + ".";
    }
}
