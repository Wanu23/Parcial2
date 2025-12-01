package Parcial2;

public class MarcaAguaDecorador extends ReporteDecorador {
    private String marcaAgua;
    
    public MarcaAguaDecorador(Reporte reporte, String marcaAgua) {
        super(reporte);
        this.marcaAgua = marcaAgua;
    }
    
    public void generarContenido() {
        super.generarContenido();
        System.out.println("Marca de agua: " + marcaAgua);
    }
}