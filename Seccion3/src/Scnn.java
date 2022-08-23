import java.util.Scanner;

public class Scnn {
    public static void main(String args []){
        System.out.println("Por favor Escriba Su Nombre");
        Scanner sc= new Scanner(System.in);
        String name= sc.next();
        System.out.println("Cual es su edad");
        int edad= sc.nextInt();
        System.out.println("Edad de tu Novio");
        String edad1=sc.next();
        int Intedad= Integer.parseInt(edad1);

        sc.close();

        System.out.println(name + " Dentro de 10 años tendras " + (edad+10));
        System.out.println("Yo tendre " + (Intedad+5));


    }
}
