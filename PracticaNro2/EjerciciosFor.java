package PracticaNro2;

/**
 * 
 * @author Usuario iTC Ejercicios del ciclo for
 */
public class EjerciciosFor {

    /**
     * Generar la secuencia de Collatz de un número. (programa que al ingresar
     * un numero genere la secuencia de Collatz)
     *
     * @param num (numero que permite determinar desde donde va a empezar la
     * secuencia)
     * @return (devuelve 0 si el usuario ingresa un numero menor a 1 )
     * @return (devuelve el numero final de la secuencia)
     */
    public int secuenciaDeCollatz(int num) {
        if (num < 1) {
            System.out.println("Error el numero no puede ser menor a 1 ");
            return (0);
        }
        System.out.println("Secuencia para :" + num);
        for (int i = 1; num != 1; i++) {
            System.out.print(num + "-");
            if (num % 2 == 0) {
                num = num / 2;
            } else {
                num = num * 3 + 1;
            }

        }
        return num;
    }

    /**
     * Determinar la raíz cuadrada entera de un número sin usar funciones
     * matemáticas. (Programa que determina la raiz entera de un numero sin
     * aplicar funciones matematicas de Java como sqrt(num))
     *
     * @param num (numero que permite determinar la raiz cuadrada)
     * @return (devuelve el resultado en caso de num sea 0)
     * @return (devuelve 0)
     */
    public int raizCuadradadeunNumero(int num) {
        if (num < 0) {
            System.out.println("Error el numero no puede ser menor a 0 ");
            return 0;
        }
        for (int i = 1; i <= num; i++) {
            if (i * i == num) {
                return (i);
            } else if (i * i > num) {
                System.out.println("Error no tiene raiz exacta");
                return 0;
            }
        }
        return (0);
    }

    /**
     * Mostrar todos los números de 1 a 100 que no sean divisibles por 3 ni por
     * 5. (Programa que muestra los numeros del 1 al 100 sin contar al los que
     * son divisibles por 3 y 5)
     */
    public void numerosNoidivisiblespor3nipor5() {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 != 0 && i % 5 != 0) {
                System.out.print(i + ",");
            }
        }
    }

    /**
     * Generar todos los números de 3 dígitos donde la suma de los dígitos sea
     * igual a 10. (Programa que genera todos los numeros de tres digitos
     * posibles que sumados su respuesta sea 10)
     */
    public void sumaDe3digitossumadosiguala10() {
        int unidades = 1;
        int decenas = 1;
        int centenas = 1;
        for (int i = 100; i <= 999; i++) {
            unidades = i % 10;
            decenas = (i / 10) % 10;
            centenas = i / 100;
            if (unidades + decenas + centenas == 10) {
                System.out.print(i + "-");
            }

        }

    }
}
