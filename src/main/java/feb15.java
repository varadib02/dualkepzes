/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author User
 */
public class feb15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Generáld le a fibonacci számsor első 12 elemét ciklusok és változók segítségével
        ArrayList<Integer>list=new ArrayList<Integer>();
        int a=1;
        int b=1;
        for(int i=0; i<=12;i++)
        {
            list.add(a);
            int temp=a;
            a=b;
            b+=temp;
        }
        System.out.println(list);
        
        
        //Készíts kő papír olló alkalmazást
        //A gép választását random szám generálásra alapozd
        //A felhasználó választását adatbekéréssel(scanner object) old meg (ez self learning)
        System.out.println("Hány kört szeretne játszani?: ");
        Scanner match = new Scanner(System.in);
        
        //A logikai feltétel a lehető leg optimálisabban, 
        //minél kevesebb vizsgálattal döntse el a játék végeredményét
        int hossz=match.nextInt();
        int gepW=0;
        int teW=0;
        int draw=0;
        for (int i = 0; i < hossz; i++) {
            Random r = new Random();
            int gep=r.nextInt(1,4);
            
            System.out.println((i+1)+". Kör a Tipped (1-3): ");
            Scanner bekert = new Scanner(System.in);
            int bekeres=bekert.nextInt();
            if((bekeres==1 && gep==3)||(bekeres==2 && gep==1)||(bekeres==3 && gep==2)){
                System.out.println("Nyertél");
                teW++;
            }
            else if((bekeres==3 && gep==1)||(bekeres==1 && gep==2)||(bekeres==2 && gep==3)){
                System.out.println("A gép nyert");
                gepW++;
            }
            else{
                System.out.println("Döntetlen");
                draw++;
            }
            
            bekert.close();
        }
        System.out.println("Te nyertél: "+teW+", Gép nyert: "+gepW+", Döntetlen: "+draw);
        if(teW>gepW) System.out.println("A játék győztese tehát te vagy.");
        if(teW<gepW) System.out.println("A játék győztese tehát a gép.");
        else System.out.println("A játéknak nincs győztese.");
        //Extra funkció: a játék elején kérdezd meg a usert hány kört szeretne játszani, 
        //és a játék végén az alábbi módon írd ki a végeredményt: 
        //Te nyertél: 2, Gép nyert: 1, Döntetlen: 3 , A játék győztese tehát te vagy/ a gép.
        
       
        match.close();
        
    }
    
}
