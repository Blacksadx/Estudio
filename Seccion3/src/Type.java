import javax.swing.*;
import javax.xml.bind.SchemaOutputResolver;

public class Type {
    public static void main (String args[]){
        String a= JOptionPane.showInputDialog("Cual es tu nombre?");
        String b= JOptionPane.showInputDialog("Como estás?");
        String c= JOptionPane.showInputDialog("Cual es tu edad?");
        String f= JOptionPane.showInputDialog("/");
        int d= Integer.parseInt(c);
        double e= Double.parseDouble(f);
        System.out.println("Hola " + a);
        System.out.println("Espero " + a + " que sigas " + b + " y que el proximo año cumplas " + d);
        System.out.println("La Mitad de tu edad es: " +(d/e));


    }
}
