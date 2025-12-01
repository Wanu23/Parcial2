package Parcial2;

public class ConfiguracionSistema {
    private static ConfiguracionSistema instancia;
    
    private String directorioSalida;
    private String formatoPorDefecto;
    private boolean mostrarMarcaAgua;
    
    private ConfiguracionSistema() {
        this.directorioSalida = "/reportes";
        this.formatoPorDefecto = "PDF";
        this.mostrarMarcaAgua = false;
    }
    
    public static ConfiguracionSistema obtenerInstancia() {
        if (instancia == null) {
            instancia = new ConfiguracionSistema();
        }
        return instancia;
    }
    
    public String getDirectorioSalida() {
        return directorioSalida;
    }
    
    public void setDirectorioSalida(String directorioSalida) {
        this.directorioSalida = directorioSalida;
    }
    
    public String getFormatoPorDefecto() {
        return formatoPorDefecto;
    }
    
    public void setFormatoPorDefecto(String formatoPorDefecto) {
        this.formatoPorDefecto = formatoPorDefecto;
    }
    
    public boolean isMostrarMarcaAgua() {
        return mostrarMarcaAgua;
    }
    
    public void setMostrarMarcaAgua(boolean mostrarMarcaAgua) {
        this.mostrarMarcaAgua = mostrarMarcaAgua;
    }
    
    public void mostrarConfiguracion() {
        System.out.println("Directorio: " + directorioSalida);
        System.out.println("Formato por defecto: " + formatoPorDefecto);
        System.out.println("Marca de agua: " + mostrarMarcaAgua);
    }
}
