package co.edu.cesde;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" ingrese el numero de personas");
        int numeroPersonas = scanner.nextInt();
        String[] platos = new String[numeroPersonas];
        double valorPlatos = 0;
        double valorTotal = 0;

        int cantidadHamburguesas = 0;
        int cantidadPerros = 0;
        int cantidadSalchipapas = 0;
        int cantidadChorizos = 0;

        for (int i = 0; i <numeroPersonas; i++) {
            System.out.println(" ingrese el plato a pedir del usuario "+i);
            platos[i] = scanner.next();

            if(platos[i].equals("Hamburguesa")) {
                valorPlatos = valorPlatos + 10000;
                cantidadHamburguesas++;
                System.out.println(cantidadHamburguesas);
            } else if(platos[i].equals("Perro")) {
                valorPlatos = valorPlatos + 8000;
                cantidadPerros++;
            } else if(platos[i].equals("Salchipapa")) {
                valorPlatos = valorPlatos + 6000;
                cantidadSalchipapas++;
            } else if(platos[i].equals("Chorizo")) {
                valorPlatos = valorPlatos + 7000;
                cantidadChorizos++;
            }
        }
        double descuentoGeneral=0;
        if(valorPlatos>20000){
            descuentoGeneral = valorPlatos  * 0.10;
            System.out.println(" descuento por compras mayores a 20000: " + descuentoGeneral );
        }

        double valorPropina=0;
        double descuentoPlatosIguales=0;
        if(cantidadHamburguesas>=2 || cantidadPerros>=2 || cantidadSalchipapas>=2 || cantidadChorizos>=2 ){
            descuentoPlatosIguales = valorPlatos * 0.05;
            System.out.println(" descuento por compras de 2 o mas platos iguales : "+ descuentoPlatosIguales );
        }
        System.out.println(" ingrese Si si desea incluir propina de lo contrario No ");
        String propina = scanner.next();
        boolean estado=true;
        if(estado==true){
            if("Si".equals(propina) || "si".equals(propina)){
                valorPropina = valorPlatos * 0.10;
                System.out.println("se adiciona una propina de: " + valorPropina);
            }else{
                estado=false;
            }
        }



        valorTotal = valorPlatos + valorPropina;

        valorTotal = valorTotal - descuentoGeneral-descuentoPlatosIguales;
        System.out.println("El valor total es : "+valorTotal);

        System.out.println("");

    }
}
