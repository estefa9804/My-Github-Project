package co.com.proyectojava;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.Scanner;

public class ClasePrincipal {

    public static void main(String[] arg) {
        Scanner lectura = new Scanner(System.in);

        // PRIMERA PARTE: BIENVENIDA.
        titulo("BIENVENIDO A LA LOTERIA");

        // SEGUNDA PARTE: TOMA DE DATOS PERSONALES.
        tomarDatosPersonales(lectura);

        // TERCERA PARTE: TOMA DATOS DEL BILLETE.
        Billete b = tomarDatosBillete(lectura);

        // CUARTA PARTE: DATOS NUMERO GANADOR.
        String numeroGanador = datoNumeroGanador();

        // QUINTA PARTE: CALCULAR PREMIO.
        calculoAcierto(b, numeroGanador);

        // ULTIMA PARTE: DESPEDIDA.
        titulo("GRACIAS POR PARTICIPAR");
    }

    public static void titulo(String mensaje) {
        System.out.println("***************************");
        System.out.println("  " + mensaje + "  ");
        System.out.println("***************************");
    }

    public static void tomarDatosPersonales(Scanner lectura) {
        System.out.println("Por favor ingrese su nombre:");
        String nombre = lectura.next();
        System.out.println("Por favor ingrese su telefono:");
        long telefonoComprador = 0;
        try {
            telefonoComprador = Long.parseLong(lectura.next());
        } catch (NumberFormatException e) {
            System.out.println("El telefono debe ser numerico, por favor inicie nuevamente.");
            System.exit(0);
        }

        // Instanciamos un objeto de la clase CompradorLoteria
        CompradorLoteria cL = new CompradorLoteria(nombre, null, telefonoComprador);

        System.out.println("Los datos del comprador de la loteria son los siguientes:");
        System.out.println("Nombre: " + cL.getNombre());
        System.out.println("Telefono: " + cL.getTelefono());
    }

    public static Billete tomarDatosBillete(Scanner lectura) {
        System.out.println("");
        System.out.println("***************************");
        System.out.println("     DATOS DEL BILLETE     ");
        System.out.println("***************************");
        System.out.println("Por favor ingrese el numero del billete:");
        int numeroEntero = 0;
        try {
            numeroEntero = Integer.parseInt(lectura.next());
        } catch (NumberFormatException e) {
            System.out.println("El numero de billete debe ser numerico, por favor inicie nuevamente.");
            System.exit(0);
        }
        String numeroBillete = String.valueOf(numeroEntero);
        System.out.println("Por favor ingrese el valor a apostar:");
        int valorApostado=0;
        try{
        valorApostado = Integer.parseInt(lectura.next());
        } catch (NumberFormatException e){
          System.out.println("El valor a apostar debe ser numerico, por favor inicie nuevamente.");
            System.exit(0);  
        }

        // Instanciamos un objeto de la clase Billete
        Billete b = new Billete(numeroBillete, null, valorApostado);

        System.out.println("Los datos del billete comprado son los siguientes:");
        System.out.println("Numero Billete: " + b.getNumeroBillete());
        System.out.println("Valor apostado: " + b.getValorApostado());
        return b;
    }

    public static String datoNumeroGanador() {
        System.out.println("");
        System.out.println("***************************");
        System.out.println("     NUMERO GANADOR        ");
        System.out.println("***************************");
        int numeroGanador = (int) (10000 * Math.random());
        String numeroGanadorString = "";
        if (numeroGanador < 1000 && numeroGanador > 99) {
            numeroGanadorString = "0" + String.valueOf(numeroGanador);
        } else if (numeroGanador < 100 && numeroGanador > 9) {
            numeroGanadorString = "00" + String.valueOf(numeroGanador);
        } else if (numeroGanador < 10) {
            numeroGanadorString = "000" + String.valueOf(numeroGanador);
        } else {
            numeroGanadorString = String.valueOf(numeroGanador);
        }

        System.out.println("La loteria de Boyaca genero el numero: " + numeroGanadorString);
        return numeroGanadorString;
    }

    public static void calculoAcierto(Billete b, String numeroAleatorioGanador) {
        System.out.println("");
        System.out.println("***************************");
        System.out.println("    CALCULO DE ACIERTOS   ");
        System.out.println("***************************");
        System.out.println("Numero de billete: " + b.getNumeroBillete());
        System.out.println("Numero ganador: " + numeroAleatorioGanador);

        int aciertos = 0;       

        

        try {
            if (numeroAleatorioGanador.substring(0, 1).equals(b.getNumeroBillete().substring(0, 1))) {
            aciertos = aciertos + 1;
        }
        if (numeroAleatorioGanador.substring(1, 2).equals(b.getNumeroBillete().substring(1, 2))) {
            aciertos = aciertos + 1;
        }
            if (numeroAleatorioGanador.substring(2, 3).equals(b.getNumeroBillete().substring(2, 3))) {
                aciertos = aciertos + 1;
            }
            if (numeroAleatorioGanador.substring(3, 4).equals(b.getNumeroBillete().substring(3, 4))) {
                aciertos = aciertos + 1;
            }
        } catch (StringIndexOutOfBoundsException ex) {
            System.out.println("La loteria debe ser de 4 cifras");
        } catch (Exception e) {
            System.out.println("Se presento un error general.");
        }

        TipoPremio tipoP = new TipoPremio("1", "Mayor");
        LocalDateTime today = LocalDateTime.now().plusDays(30);
        Premio premio = new Premio(tipoP, b.getValorApostado() * aciertos, today);

        System.out.println("El numero de aciertos son: " + aciertos);
        System.out.println("Su premio es: " + premio.getTotalGanado());

        System.out.println("La fecha de caducidad es: " + premio.getFechaCaducidad());
        System.out.println("");

    }
}
