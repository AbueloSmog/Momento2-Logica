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

        int articulosBasicos = 0;
        int articulosMedios = 0;
        int articulosPremium = 0;
        int totalArticulos = (articulosBasicos + articulosMedios + articulosPremium);
        double precio;
        // double valorBruto;
        // double valorTotal;
        // double porcentajePremium = articulosPremium/totalArticulos;
        String continuar = "s";

        // proceso

        do {
            System.out.print("Introduce el precio del producto");
            precio = teclado.nextDouble();
            if (precio < 0)
                System.out.print("Error, el precio no puede ser negativo");

            else if (precio < 10000) { 
                System.out.print("Articulo Basico");
                articulosBasicos++;
            }

            else if (precio <= 30000) {
                System.out.print("Articulo Medio");
                articulosMedios++;

            } else if (precio > 30000) {
                System.out.print("Articulo Premium");
                articulosPremium++;

               

            }
            ;
             System.out.print("¿Deseas registrar otro producto? (s/n)");
                continuar = teclado.next();

        } while (continuar.equalsIgnoreCase("s"));
        teclado.close();
        
        System.out.print(totalArticulos + ("Total de articulos"));
    }

}
