
/**
 * Conversión de tipos primitivos a objetos en Java
 * Autor: [Esteban Moreno]
 * Fecha: [28/04/2025]
 */
package trabajos.poo;

public class TareaConversiones {
    public static void main(String[] args) {

        // 1. Convertir int a Integer
        int numeroInt = 10;
        Integer numeroInteger = Integer.valueOf(numeroInt);
        System.out.println("int a Integer: " + numeroInteger);

        // 2. Convertir float a Float
        float numeroFloat = 5.75f;
        Float numeroFloatObj = Float.valueOf(numeroFloat);
        System.out.println("float a Float: " + numeroFloatObj);

        // 3. Convertir double a Double
        double numeroDouble = 3.1416;
        Double numeroDoubleObj = Double.valueOf(numeroDouble);
        System.out.println("double a Double: " + numeroDoubleObj);

        // 4. Convertir char a Character
        char letra = 'A';
        Character letraObj = Character.valueOf(letra);
        System.out.println("char a Character: " + letraObj);

        // 5. Convertir boolean a Boolean
        boolean valorBoolean = true;
        Boolean valorBooleanObj = Boolean.valueOf(valorBoolean);
        System.out.println("boolean a Boolean: " + valorBooleanObj);

    }
   }
