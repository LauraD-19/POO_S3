import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        //crear objetos:
        //Forma 1
        Vehiculo V1=new Vehiculo();
        V1.setModelo("Mazda");
        V1.setNum_motor("323abcd");
        V1.setSerial("222AAA");
        //Forma 2
        Vehiculo V2=new Vehiculo("Honda", "12334", "112ABC");
        //Forma 3
        Vehiculo V3=new Vehiculo();
        System.out.println("Ingrese el modelo");
        V3.setModelo(teclado.next());
        System.out.println("Ingrese el numero del motor");
        V3.setNum_motor(teclado.next());
        System.out.println("ingrese el serial");
        V3.setSerial(teclado.next());


        System.out.println(V1.toString());
        System.out.println(V2);
        System.out.println(V3);


    }
}