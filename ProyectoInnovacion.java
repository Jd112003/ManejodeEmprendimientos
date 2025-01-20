class ProyectoInnovacion {
    protected String nombre;
    protected String lider;
    protected double presupuesto;

    public ProyectoInnovacion(String nombre, String lider, double presupuesto) {
        this.nombre = nombre;
        this.lider = lider;
        this.presupuesto = presupuesto;
    }

    public String resumen() {
        return "Proyecto '" + nombre + "' liderado por " + lider + ". Presupuesto: " + presupuesto + " USD.";
    }
}
