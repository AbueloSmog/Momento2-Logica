// Modulo de ventas interactivo con estadisticas de Catalogo

/*
---------------------------------------------------------------------------------------
Variables

precio = double>0,
productoBasico = double < 10000 && > 0,
productoMedio = double =< 30000,
productoPremium = double > 30000,
valorBruto = double,
valorTotal = double,
articulosBasicos = int,
articulosMedios = int,
articulosPremium = int,
totalArticulos = int,
porcentajePremium = double = articulosPremium/totalArticulos,

---------------------------------------------------------------------------------------
CONSTANTES

DESCUENTO = double = 0.10,
IVA = double = 0.15,

---------------------------------------------------------------------------------------

*/

import java.util.Scanner;

public class ModuloVentas {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // contadores de productos para el % de premium

        double articulosBasicos = 0;
        double articulosMedios = 0;
        double articulosPremium = 0;
        double totalArticulos = (articulosBasicos + articulosMedios + articulosPremium);
        double precio;
        double valorBruto = 0;
        double valorTotal;
        double subtotal;
        // double porcentajePremium = articulosPremium / totalArticulos;

        // CONSTANTES
        double IVA = 0.19;
        double DESCUENTO = 0.10;

        // double porcentajePremium = articulosPremium/totalArticulos;
        String continuar = "s";
        String saltoLinea = System.getProperty("line.separator");
        // proceso

        do {
            System.out.print("Introduce el precio del producto: ");
            precio = teclado.nextDouble();
            if (precio < 0)
                System.out.print("Error, el precio no puede ser negativo" + saltoLinea);

            else if (precio < 10000) {
                System.out.print("Articulo Basico" + saltoLinea);
                articulosBasicos++;
            }

            else if (precio <= 30000) {
                System.out.print("Articulo Medio" + saltoLinea);
                articulosMedios++;

            } else if (precio > 30000) {
                System.out.print("Articulo Premium" + saltoLinea);
                articulosPremium++;

            }
            ;
            valorBruto = (precio + valorBruto);
            // valorBruto += precio
            System.out.print("¿Deseas registrar otro producto? (s/n)" + saltoLinea);
            continuar = teclado.next();

        } while (continuar.equalsIgnoreCase("s"));
        teclado.close();
        totalArticulos = (articulosBasicos + articulosMedios + articulosPremium);
        if (valorBruto > 100000.0)
            subtotal = valorBruto - (valorBruto * DESCUENTO);
        else
            subtotal = valorBruto;

        valorTotal = (subtotal + (subtotal * IVA));
        double porcentajePremium = articulosPremium / totalArticulos;
       

        // SALIDA 
        
        System.out.print("Subtotal: " +subtotal + saltoLinea);
        System.out.print("Valor Total: " + valorTotal+ saltoLinea);
        System.out.print("Porcentaje de Productos Premium: " + (porcentajePremium*100)+ "%" +saltoLinea);
        
    }

}
