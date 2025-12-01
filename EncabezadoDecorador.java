package Parcial2;

public class EncabezadoDecorador extends ReporteDecorador {
    private String encabezado;
    
    public EncabezadoDecorador(Reporte reporte, String encabezado) {
        super(reporte);
        this.encabezado = encabezado;
    }
    
    public void generarContenido() {
        System.out.println("Encabezado: " + encabezado);
        super.generarContenido();
    }
}