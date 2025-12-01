package Parcial2;

public class ReporteFactory {
    
    public Reporte crearReporte(String tipo) {
        if (tipo == null) {
            return null;
        }
        
        if (tipo == "PDF") {
            return new ReportePDF();
        }
        if (tipo == "EXCEL") {
            return new ReporteExcel();
        }
        if (tipo == "HTML") {
            return new ReporteHTML();
        }
        
        System.out.println("Tipo no valido");
        return null;
    }
}