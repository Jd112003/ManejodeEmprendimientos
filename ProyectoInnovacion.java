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

// Main
public class Main {
    public static void main(String[] args) {
        ProyectoInnovacion proyecto = new ProyectoInvestigacion("AI para Agricultura", "Ana Torres", 50000, "Uso de drones en cultivos");
        System.out.println(proyecto.resumen());
    }
}
