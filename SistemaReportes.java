package Parcial2;

import java.util.Scanner;

public class SistemaReportes {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ReporteFactory factory = new ReporteFactory();
        
        // Punto 3: Singleton
        ConfiguracionSistema config = ConfiguracionSistema.obtenerInstancia();
        
        System.out.println("Sistema de Reportes");

        
        // Configurar el sistema
        System.out.println("Configuracion actual:");
        config.mostrarConfiguracion();

        
        System.out.print("Cambiar directorio de salida? (si/no): ");
        String respuesta = scanner.nextLine();
        if (respuesta.equals("si")) {
            System.out.print("Nuevo directorio: ");
            String nuevoDir = scanner.nextLine();
            config.setDirectorioSalida(nuevoDir);
        }
        

  
        System.out.println("PUNTO 1 - Factory Method");
        System.out.print("Tipo de reporte (PDF, EXCEL, HTML): ");
        String tipoReporte = scanner.nextLine();
        
        Reporte reporte = factory.crearReporte(tipoReporte);
        
        if (reporte == null) {
            System.out.println("Tipo invalido");
            return;
        }
        
        System.out.println("Reporte creado:");
        reporte.generarContenido();
        

        System.out.println("PUNTO 2 - Decorator");
        
        System.out.print("Agregar encabezado? (si/no): ");
        respuesta = scanner.nextLine();
        if (respuesta.equals("s")) {
            System.out.print("Texto del encabezado: ");
            String encabezado = scanner.nextLine();
            reporte = new EncabezadoDecorador(reporte, encabezado);
        }
        
        System.out.print("Agregar marca de agua? (si/no): ");
        respuesta = scanner.nextLine();
        if (respuesta.equals("si")) {
            System.out.print("Texto de la marca: ");
            String marca = scanner.nextLine();
            reporte = new MarcaAguaDecorador(reporte, marca);
        }
        
        System.out.print("Agregar pie con fecha? (si/no): ");
        respuesta = scanner.nextLine();
        if (respuesta.equals("si")) {
            reporte = new PieConFechaDecorador(reporte);
        }
        
        System.out.println("");
        System.out.println("Reporte Final:");
        reporte.generarContenido();
        

        System.out.println("");
        System.out.println("PUNTO 3 - Singleton");
        ConfiguracionSistema config2 = ConfiguracionSistema.obtenerInstancia();
        System.out.println("Es la misma instancia? " + (config == config2));
        System.out.println("Directorio actual: " + config2.getDirectorioSalida());
        
        scanner.close();
    }
}