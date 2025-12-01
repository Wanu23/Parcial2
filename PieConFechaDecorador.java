package Parcial2;

public class PieConFechaDecorador extends ReporteDecorador {
    
    public PieConFechaDecorador(Reporte reporte) {
        super(reporte);
    }
    
    public void generarContenido() {
        super.generarContenido();
        System.out.println("Pie de pagina");
        System.out.println("Fecha: 01/12/2024 10:30");
    }
}