package PracticaNro2;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Usuario iTC
 */
public class Practica2 {

    /**
     * Validación de formularios web. En este espacio es donde crea el registro
     * aqui se pondra los diferentes parametros del programa como es Correo,
     * Clave, Edad
     */
    public enum Cuentas {
        CUENTA1("juan.perez@email.com", "Jp2025!abc", 18),
        CUENTA2("maria.lopez@email.com", "Ml#Secure99", 22),
        CUENTA3("carlos.garciaemail.com", "Cg_pas", 16),
        CUENTA4("ana.torres@email.com", "AnaT@1234", 19),
        CUENTA5("esteban.ramirez@email.com", "EstRz5!", 23);
        private String correo;
        private String clave;
        private int edad;

        private Cuentas(String correo, String clave, int edad) {
            this.correo = correo;
            this.clave = clave;
            this.edad = edad;
        }

        public String getCorreo() {
            return correo;
        }

        public String getClave() {
            return clave;
        }

        public int getEdad() {
            return edad;
        }
    }

    /**
     * Aqui valida registros de usuarios: correo, contraseña y edad. Para cada
     * registro: Marca error si el correo no contiene "@". Advierte si la
     * contraseña tiene menos de 8 caracteres. Rechaza el registro si la edad es
     * menor a 18. Si no hay errores, indica que la cuenta es válida.
     */
    public void validacion_web() {
        Cuentas[] cuentas = Cuentas.values();

        for (int i = 0; i < cuentas.length; i++) {
            Cuentas cuenta = cuentas[i];
            boolean Error = false;

            System.out.println("Validando: " + cuenta.getCorreo());

            if (!cuenta.getCorreo().contains("@")) {
                System.out.println(" Correo inválido");
                Error = true;
            }
            if (cuenta.getClave().length() < 8) {
                System.out.println("Clave débil");
                Error = true;
            }
            if (cuenta.getEdad() < 18) {
                System.out.println(" Registro inválido (menor de edad)");
                Error = true;
            }
            if (!Error) {
                System.out.println(" Cuenta válida");
            }
        }
    }

    /**
     * Análisis de datos climáticos Programa que simula las temperaturas de cada
     * día del año, cuenta cuántas veces hay ola de calor (>35 °C) y ola de frío
     * (<0 °C). Al final, calcula y muestra el promedio anual de temperatura.
     */
    public void analisis_climatico() {
        Random r = new Random();
        int dias = 365;
        int olaCalor = 0;
        int olaFrio = 0;
        double sumaTemperaturas = 0;
        for (int i = 1; i <= dias; i++) {
            double temperatura = -10 + r.nextDouble() * 55;
            sumaTemperaturas += temperatura;
            if (temperatura > 35) {
                olaCalor++;
            } else if (temperatura < 0) {
                olaFrio++;
            }
            double promedio = sumaTemperaturas / dias;

            System.out.println("Días con ola de calor (>35°C): " + olaCalor);
            System.out.println("Días con ola de frío (<0°C): " + olaFrio);
            System.out.printf("Temperatura promedio anual: %.2f °C\n", promedio);
        }
    }

    /**
     * Listado donde se guarda el registro aqui se guarda el cliente, fecha de
     * pedido y cuantos dias de retrazo lleva
     */
    public enum Listado {
        PRESTAMO1("Juan", "2024-05-01", 5),
        PRESTAMO2("Ana", "2024-04-10", 0),
        PRESTAMO3("Carlos", "2024-03-15", 35),
        PRESTAMO4("Lucía", "2024-05-20", 2),
        PRESTAMO5("Pedro", "2024-01-05", 50),
        PRESTAMO6("Henry", "2024-09-10", 0),
        PRESTAMO7("Jose", "2024-02-05", 15);
        private String cliente;
        private String fecha_de_entrega;
        private int dias_retraso;

        private Listado(String cliente, String fecha_de_pedido, int dias_retraso) {
            this.cliente = cliente;
            this.fecha_de_entrega = fecha_de_entrega;
            this.dias_retraso = dias_retraso;
        }

        public String getUsuario_prestado() {
            return cliente;
        }

        public String getFecha_de_entrega() {
            return fecha_de_entrega;
        }

        public int getDias_retraso() {
            return dias_retraso;
        }
    }

    /**
     * Calculo para determinar el numero de multas con mensajes en consola de
     * quienes tienen retraso y quienes no tambien les da cuanto deben pagar
     * segun la cnatidad de dias de retraso lleva al final se da una suma
     * general de todas las multas de los clientes
     */
    public void gestion_prestamo() {
        double multas = 0.0;
        Listado[] listado = Listado.values();
        for (int i = 0; i < listado.length; i++) {
            if (listado[i].dias_retraso > 0) {
                double total_multa = listado[i].dias_retraso * 0.50;
                multas += total_multa;
                System.out.println("El cliente " + listado[i].cliente + " tiene un retraso de : " + listado[i].dias_retraso + " días");
                System.out.println("Su multa es de $" + total_multa);
                if (listado[i].dias_retraso > 30) {
                    System.out.println("El préstamo de " + listado[i].cliente + " va a ser revisado por administración");
                }

            }
        }
        System.out.println("TOTAL DE MULTAS: $" + multas);
    }

    /**
     * Control de inventario en tienda de electrónica Una tienda quiere procesar
     * la lista de productos en stock. Por cada producto, si la cantidad es
     * menor a 5, agregarlo a la orden de reposición. Además, calcular el total
     * de unidades a reabastecer.
     */
    public enum Producto {
        PRODUCTO1("Monitor 24", 3),
        PRODUCTO2("Mouse inalámbrico", 10),
        PRODUCTO3("Teclado mecánico", 2),
        PRODUCTO4("Laptop Core i7", 1),
        PRODUCTO5("Cargador universal", 8),
        PRODUCTO6("Parlante Bluetooth", 4),
        PRODUCTO7("Webcam HD", 6);
        private String nombre;
        private int cantidad;

        private Producto(String nombre, int cantidad) {
            this.nombre = nombre;
            this.cantidad = cantidad;
        }
    }

    public void Control_inventario() {
        Producto[] productos = Producto.values();
        int totalReponer = 0;

        System.out.println("Productos a reponer:");

        for (int i = 0; i < productos.length; i++) {
            if (productos[i].cantidad < 5) {
                System.out.println("- " + productos[i].nombre + ": " + productos[i].cantidad + " unidades (Reponer)");
                totalReponer += (5 - productos[i].cantidad);
            }
        }

        System.out.println("Total de unidades a reponer: " + totalReponer);
    }

    /**
     * Enum donde se guarda el registro de los id de usuarios
     *  con sus respectivas claves
     */
    public enum Registro {
        USUARIO1("juan123", "claveJuan2024"),
        USUARIO2("ana456", "Ana!Segura789"),
        USUARIO3("pedro789", "P3dr0_Acc3s0"),
        USUARIO4("maria001", "Mari@Clave2025"),
        USUARIO5("lucas007", "Lucas#007Bond"),
        USUARIO6("sofia321", "SofiA321!"),
        USUARIO7("carlosX", "Xcarlos2025$"),
        USUARIO8("emilia21", "Emi21*pass"),
        USUARIO9("andres98", "A98_Login#"),
        USUARIO10("valeria65", "Vale#2025!");
        private String id_usuario;
        private String clave;

        private Registro(String id_usuario, String clave) {
            this.id_usuario = id_usuario;
            this.clave = clave;
        }

        public String getId_usuario() {
            return id_usuario;
        }

        public String getClave() {
            return clave;
        }

    }


    public void Contro_acceso() {
        Scanner sc = new Scanner(System.in);
        Registro[] registro = Registro.values();
        int intentos = 0;
        boolean acceso_concedido = false;
        while (intentos < 3 && !acceso_concedido) {
            boolean usuario_encontrado = false;
            System.out.println("Ingrese su id de usuario");
            String id = sc.nextLine();
            System.out.println("Ingrese su clave");
            String clave = sc.nextLine();
            for (int i = 0; i < registro.length; i++) {
                if (registro[i].id_usuario.equals(id) && registro[i].clave.equals(clave)) {
                    System.out.println(" Acceso concedido");
                    System.out.println(" Bienvenido " + id);
                    acceso_concedido = true;
                    usuario_encontrado = true;
                    break;
                }
            }
            if (!acceso_concedido && !usuario_encontrado) {
                System.out.println("¡Ataque detectado!");
                intentos++;
            }
            if (!acceso_concedido && intentos < 3) {
                System.out.println(" Credenciales incorrectas. Intentos restantes: " + (3 - intentos));
            } if(!acceso_concedido) {
                System.out.println(" Acceso bloqueado por demasiados intentos:"+id);

            }

        }

    }
}
