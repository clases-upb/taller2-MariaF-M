/*
 * Este es el segundo taller de lógica de programación. En este taller deben comenzar a prácticar hacer las validaciones
 * de los datos que va a recibir la función usando los condicionales if. 
 * 
 * Como en el anterior, tenga en cuenta la siguiente rúbrica para cada ejercicio la cual, 
 * se basa en los mandamientos del programador. El taller es una herramienta para comenzar a preparar la evaluación 
 * donde los descuentos si van a ser tenidos en cuenta. 
 * Con este taller, usted irá aprendiendo a aplicar buenas prácticas en la programación.
 * 
 * La siguiente rúbrica se descuenta en cada ejercicio y es acumulativa:
 * Descuento por quemar valores en el código y no usar constantes: -0.5
 * Descuento por no implementar control de errores con trycatch: -0.8
 * Descuento por no escribir el código ordenado, identado: -0.4
 * 
 * RÉTESE, PÓNGASE A PRUEBA!!!
 * 
 */
package taller2;

public class App {

    public static void main(String[] args) {
        System.out.println(Calcular_saldo(2000000, 500000, 1000000));
        System.out.println(Calcular_tip((float)100));
        System.out.println(Obtener_puntos(3, 2, 1));
        System.out.println(Calcular_definitiva((float)4, (float)4, (float)4, (float)4, (float)4, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f));
        System.out.println(Calcular_para_ganar(3, 3, 3, 3, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f));
        System.out.println(Calcular_salario(40, 10, 5, (float)20000));
        System.out.println(Calcular_area_triangulo((float)10, (float)5));
        System.out.println(Calcular_perimetro_cuadrado((float)5));
        System.out.println(Calcular_volumen_cilindro((float)5, (float)10));
        System.out.println(Calcular_area_circulo((float)5));
    }
    
    /*
     * 1. Diseñe un algoritmo e implemente la función Calcular_saldo que reciba
     * tres enteros: la base de dinero en la taquilla, el total de recaudos y
     * el total de retiros, y retorne un entero que represente el saldo final
     * en la taquilla.
     * 
     * Valide que la base sea igual a 2.000.000. Si no es así, retorne -1.
     * 
     * saldo_taquilla = base + total recaudos - total_retiros
     * Si hay algún error, retorne -1.
     */
    
        public static int Calcular_saldo (int base, int total_recaudos, int total_retiros){
    
            if (base != 2000000)
                return -1;
    
            try {
                int saldo_taquilla = 0;
                saldo_taquilla = base + total_recaudos - total_retiros;
                return saldo_taquilla;
            } 
            catch (Exception e) {
                return -1;
            }
         }

    /*
     * 2. Diseñe un algoritmo e implemente la función Calcular_tip que reciba
     * un float representando el valor del consumo de un cliente, y devuelva
     * un string que contenga el valor de la propina (10%), el impuesto al
     * consumo (8%) y el valor total a pagar.
     * 
     * MUY IMPORTANTE:
     * 
     * El formato del string debe ser: valor comida: $### - valor propina $### -
     * valor impoconsumo $### - total a pagar $###.
     * 
     * Si hay algún error, retorne "Error en la función Calcular_tip".
     * 
     * Ademas de esto, primero valide que el valor del consumo sea mayor a 0. Si no
     * es así, retorne "Error calculando consumo".
     * 
     */
        public static String Calcular_tip (float valor_consumo){

            if (valor_consumo <= 0)
                return "Error calculando consumo";
            
            try {
                float valor_propina = 10, impuesto_consumo = 8;
                float valor_total = 0;
                valor_total = valor_consumo + valor_propina + impuesto_consumo;
                return ("valor comida: $" + valor_consumo + " - valor propina $" + valor_propina + " - valor impoconsumo $" + impuesto_consumo + " - total a pagar $" + valor_total);
            } 
            catch (Exception e) {
                return "Error en la función Calcular_tip";
            }
         }

    /*
     * 3. Diseñe un algoritmo e implemente la función Obtener_puntos que reciba
     * tres enteros representando el número de partidos ganados, perdidos y
     * empatados de un equipo de fútbol, y devuelva un entero que represente
     * los puntos totales del equipo. La puntuación sigue los lineamientos
     * de la FIFA: 3 puntos por partido ganado, 1 punto por partido empatado y
     * 0 puntos por partido perdido. Si hay algún error, retorne -1.
     * 
     * Valide ademas que los partidos ganados, perdidos y empatados sean mayores o
     * iguales a 0. Si no es así, retorne -1.
     * 
     */
        public static int Obtener_puntos (int ganados, int perdidos, int empatados){

            byte min = 0;
            if (ganados < min || perdidos < min || empatados < min )
                return -1;
    
            try {
                int puntos_totales = 0;
                byte p_ganado = 3, p_perdido = 0;
                puntos_totales = (ganados * p_ganado) + (perdidos * p_perdido) + empatados;
                return puntos_totales;  
            } 
            catch (Exception e) {
                return -1;
            }
         }

    /*
     * 4. Diseñe un algoritmo e implemente la función Calcular_definitiva que
     * reciba cinco floats representando las notas (entre 0 y 5) y cinco floats
     * representando los porcentajes (que entre todos deberán sumar 1 y cada uno
     * estar entre 0 y 1),
     * y devuelva un float que represente la nota definitiva. Si algo está mal
     * con los porcentajes o con las notas, retorne -1.
     */
        public static float Calcular_definitiva (float nota1, float nota2, float nota3, float nota4, float nota5, 
        float porcentaje1, float porcentaje2, float porcentaje3, float porcentaje4, float porcentaje5){

            byte min = 0, max = 1, max2 = 5;
            if (nota1 < min && nota2 < min && nota3 < min  && nota4 < min && nota5 < min && nota1 > max2 && nota2 > max2 && nota3 > max2 && nota4 > max2 && nota5 > max2
            && porcentaje1 < min && porcentaje1 > max && porcentaje2 < min && porcentaje2 > max && porcentaje3 < min && porcentaje3 > max && porcentaje4 < min && porcentaje4 > max && porcentaje5 < min && porcentaje5 > max
            || porcentaje1 + porcentaje2 + porcentaje3 + porcentaje4 + porcentaje5 > max)
                return -1;
    
            try {
                float nota_definitiva = 0;
                nota_definitiva = (nota1 * porcentaje1) + (nota2  * porcentaje2) + (nota3  * porcentaje3) + (nota4  * porcentaje4) + (nota5  * porcentaje5);
                return nota_definitiva;
            } 
            catch (Exception e) {
                return -1;
            }
         }

    /*
     * 5. Diseñe un algoritmo e implemente la función Calcular_para_ganar que
     * reciba cinco floats representando los porcentajes de una materia (que
     * deberán sumar 1 y estar entre 0 y 1) y cuatro floats representando las
     * primeras notas (entre 0 y 5), y devuelva un float que represente la
     * nota que deberá sacar para ganar si el puntaje mínimo es 3. Si algo
     * está mal con los porcentajes o con las notas, retorne -1.
     */
        public static float Calcular_para_ganar (float nota1, float nota2, float nota3, float nota4, 
        float porcentaje1, float porcentaje2, float porcentaje3, float porcentaje4, float porcentaje5){

            byte min = 0, max = 1, max2 = 5, nota_min = 3;
            if (nota1 < min && nota2 < min && nota3 < min && nota4 < min && nota1 > max2 && nota2 > max2 && nota3 > max2 && nota4 > max2 
            && porcentaje1 < min && porcentaje1 > max && porcentaje2 < min && porcentaje2 > max && porcentaje3 < min && porcentaje3 > max && porcentaje4 < min && porcentaje4 > max && porcentaje5 < min && porcentaje5 > max
            || porcentaje1 + porcentaje2 + porcentaje3 + porcentaje4 + porcentaje5 > max)
                return -1;
    
            try {
                float nota_para_ganar = 0, suma_notas = 0;
                suma_notas = (nota1 * porcentaje1) + (nota2  * porcentaje2) + (nota3  * porcentaje3) + (nota4  * porcentaje4);
                nota_para_ganar = (nota_min - suma_notas)/porcentaje5;
                return nota_para_ganar;
            } 
            catch (Exception e) {
                return -1;
            }
         }
    
    /*
     * 6. Diseñe un algoritmo e implemente la función Calcular_salario que
     * reciba cuatro enteros: cantidad de horas normales laboradas, cantidad
     * de horas extras diurnas laboradas, cantidad de horas extras nocturnas
     * laboradas, y el valor de la hora normal como un float. La función debe
     * retornar un float con el salario total. Las horas extras diurnas tienen
     * un recargo adicional del 15% sobre la hora normal, y las horas extras
     * nocturnas tienen un recargo adicional del 35% sobre la hora normal.
     * 
     * Valide que el valor de la hora normal sea mayor a 0. Si no es así, retorne
     * -1.
     * 
     * Si hay algún error, retorne -1.
     */
        public static float Calcular_salario (int horas_normales, int horas_extras_dia, int horas_extras_noche, float valor_hora){

            if (valor_hora <= 0)
                return -1;
    
            try {
                float por_dia = 15/100f, por_noche =35/100f;
                float salario_total = 0, recargo_adicional = 0;
                recargo_adicional = (horas_extras_dia * (valor_hora * por_dia)) + (horas_extras_noche * (valor_hora * por_noche));
                salario_total = (horas_normales * valor_hora) + recargo_adicional;
                return salario_total;  
            } 
            catch (Exception e) {
                return -1;
            }
         }

    /*
     * 7. Diseñe un algoritmo e implemente la función Calcular_area_triangulo
     * que reciba dos floats representando la base y la altura de un triángulo
     * rectángulo, y devuelva un float que represente el área del triángulo.
     * 
     * Valide que la base y la altura sean mayores a 0. Si no es así, retorne -1.
     * 
     * La fórmula del área es: área = 1/2 * base * altura.
     * 
     * Si hay algún error, retorne -1.
     */
         public static float Calcular_area_triangulo (float base, float altura){

            if (base <= 0 || altura <= 0)
                return -1;
    
            try {
                float area_triangulo = 0, val = 1/2f;
                area_triangulo = val * base * altura;
                return area_triangulo;
            } 
            catch (Exception e) {
                return -1;
            }
         }

    /*
     * 8. Diseñe un algoritmo e implemente la función Calcular_perimetro_cuadrado
     * que reciba un float representando el lado de un cuadrado, y devuelva un
     * float que represente el perímetro del cuadrado.
     * 
     * Valide que el lado sea mayor a 0. Si no es así, retorne -1.
     * 
     * La fórmula del perímetro es: perímetro = lado * 4.
     * 
     * Si hay algún error, retorne -1.
     */
        public static float Calcular_perimetro_cuadrado (float lado_cuadrado){
    
            if (lado_cuadrado <= 0)
                return -1;
    
            try {
                byte val = 4;
                float perimnetro = 0;
                perimnetro = lado_cuadrado * val;
                return perimnetro;
            } 
            catch (Exception e) {
                return -1;
            }
         }

    /*
     * 9. Diseñe un algoritmo e implemente la función Calcular_volumen_cilindro
     * que reciba dos floats representando el radio de la base y la altura de
     * un cilindro, y devuelva un float que represente el volumen del cilindro.
     * 
     * Valide que el radio y la altura sean mayores a 0. Si no es así, retorne -1.
     * 
     * La fórmula del volumen es: V = pi * radio^2 * altura, usando pi con
     * precisión de 7 decimales (3.1415927).
     * 
     * Si hay algún error, retorne -1.
     */
        public static float Calcular_volumen_cilindro (float radio_base, float altura){
    
            if (radio_base <= 0 || altura <= 0)
                return -1;
    
            try {
                float volumen_cilindro = 0, radio_base_2 = radio_base * radio_base;
                double pi = 3.1415927;
                volumen_cilindro = (float)(pi * radio_base_2 * altura);
                return volumen_cilindro;
            } 
            catch (Exception e) {
                return -1;
            }
         }

    /*
     * 10. Diseñe un algoritmo e implemente la función Calcular_area_circulo
     * que reciba un float representando el radio de un círculo, y devuelva un
     * float que represente el área del círculo.
     * 
     * Valide que el radio sea mayor a 0. Si no es así, retorne -1.
     * 
     * La fórmula del área es: área = pi * radio^2, usando pi con precisión
     * de 7 decimales (3.1415927).
     * 
     * Si hay algún error, retorne -1.
     */
        public static float Calcular_area_circulo (float radio){
    
            if (radio <= 0)
                return -1;
    
            try {
                float area_circulo = 0, radio_2 = radio * radio;
                double pi = 3.1415927;
                area_circulo = (float)(pi * radio_2);
                return area_circulo;  
            } 
            catch (Exception e) {
                return -1;
            }
         }
}
