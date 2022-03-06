package reviews;
import reviews.data.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
public class Management {
    public User[] usuarios;
    public Business[] negocios;

    String comentario,busqueda;
    Random random = new Random();
    int puntosRandom,usuarioRandom;

    public Management() {
    }

    void initialize()
    {
        for (int i = 0; i < 11; i++){
            usuarios[i] = new User("Usuario" + i, "Contrasenya" + i);
        }
        negocios[0] = new Hairdresser("PeluOWO", "Alicante", false);
        negocios[1] = new Hairdresser("PeluMAD", "Madrid", true);
        negocios[2] = new Restaurant("RestaurontOwO", "Asturias", "Española");
        negocios[3] = new Restaurant("RestaurantEwE", "Murcia", "Italiana");
        negocios[4] = new Garage("Cocheplaza","Barcelona",23);
        negocios[5] = new Garage("CocheSite","Valencia",43);
        for(int i=0;i< negocios.length;i++){
            if(negocios[i].opiniones.length<2){
                for(int j=0;j<2;i++){
                    puntosRandom = random.nextInt(5 + 1) + 1;
                    usuarioRandom = random.nextInt(10 + 0) + 0;
                    if(puntosRandom==4||puntosRandom==3)
                        comentario="Bien";
                    else if(puntosRandom<3)
                        comentario="Mejorable";
                    else
                        comentario="Perfecto";
                    if(negocios[i].opiniones[j].getUser()!=usuarios[usuarioRandom])
                        negocios[i].opiniones[j]=new Review(usuarios[usuarioRandom],comentario,puntosRandom);
                }
            }
        }
    }
    public User login(String login,String password){
        for(int i=0;i<usuarios.length;i++){
            if(login==usuarios[i].login){
                if(password==usuarios[i].getPassword())
                {
                    return usuarios[i];
                }
            }
        }
        return null;
    }
    void showReviews(User usuarios){
        System.out.println("Introduce el usuario a buscar");
        Scanner sc=new Scanner(System.in);
        busqueda=sc.nextLine();
        for(int i=0;i< negocios.length;i++){
            for(int j=0;j<negocios[i].opiniones.length;j++){
                if(negocios[i].opiniones[j].getUser().login==busqueda){
                    System.out.println(negocios[i].opiniones[j]);
                }
            }
        }
    }
    void sortBusinessesByName(){
        Arrays.sort(negocios);
    }
    void sortBusinessesByRating(int rating){
        Arrays.sort(negocios);
    }
    public Business findBusiness(String busqueda){
        for(int i=0;i<negocios.length;i++){
            if(negocios[i].getName()==busqueda)
            {
                return negocios[i];
            }
        }
        return null;
    }
    public Review findReview(User user, Business business){
        System.out.println("Introduce el nombre del usuario autor de la review");
        Scanner sc=new Scanner(System.in);
        String autor=sc.nextLine();
        System.out.println("Introduce el nombre del negocio que tiene la review");
        Scanner sc2=new Scanner(System.in);
        String busqueda=sc2.nextLine();
        for(int i=0;i<usuarios.length;i++){
            if(usuarios[i].getLogin()==autor)
            {
                for(int j=0;j<negocios.length;j++){
                    if(negocios[i].getName()==busqueda)
                    {
                       for(int u=0;u<negocios[i].opiniones.length;u++){
                           if(negocios[i].opiniones[u].getUser().login==autor)
                           {return negocios[i].opiniones[u];}
                       }
                    }
                }
            }
        }
        return null;
    }
}
