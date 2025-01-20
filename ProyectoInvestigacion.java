// Subclase para proyectos de investigación
class ProyectoInvestigacion extends ProyectoInnovacion {
    private String tema;

    public ProyectoInvestigacion(String nombre, String lider, double presupuesto, String tema) {
        super(nombre, lider, presupuesto);
        this.tema = tema;
    }

    @Override
    public String resumen() {
        return super.resumen() + " Tema de investigación: " + tema + ".";
    }
}
