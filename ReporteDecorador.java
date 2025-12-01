package Parcial2;

public abstract class ReporteDecorador implements Reporte {
    protected Reporte reporteBase;
    
    public ReporteDecorador(Reporte reporte) {
        this.reporteBase = reporte;
    }
    
    public void generarContenido() {
        reporteBase.generarContenido();
    }
}