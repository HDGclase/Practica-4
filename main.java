package reviews;
import reviews.data.Business;
import reviews.data.User;

import java.util.Scanner;
public class main{
    public static void main(String[] args) {
            String login,password,buscar;
            Management gestion=new Management();
            gestion.initialize();
            System.out.println("Introduce tu login");
            System.out.print("Login: ");
            Scanner sc=new Scanner(System.in);
            login=sc.nextLine();
            System.out.println("Introduce tu contraseña");
            System.out.print("contraseña: ");
            Scanner sc2=new Scanner(System.in);
            password=sc2.nextLine();
            User usuario=gestion.login(login,password);
            int opcion=0;
            do{
                System.out.println("Menu de usuario.");

                System.out.println("1. My reviews");
                System.out.println("2. Business list");
                System.out.println("3. find Review");
                System.out.println("4. find bussiness");
                System.out.println("5. Quit");
                switch(opcion) {
                    case 1:
                        gestion.showReviews(usuario);
                        break;
                    case 2:
                        gestion.sortBusinessesByName();
                        break;
                    case 3:
                        System.out.println("Introduce el nombre del negocio a buscar");
                        Scanner bus=new Scanner(System.in);
                        buscar=bus.nextLine();
                        gestion.findBusiness(buscar);
                        break;
                    case 5:
                        System.out.println("Adios.");
                        break;
                    default:
                        System.out.println("Opción erronea");
                        break;
                }
            }
            while(opcion!=5);
    }
}