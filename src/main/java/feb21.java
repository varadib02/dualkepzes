/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author User
 */
public class feb21 {

    public static void main(String[] args) {
        
        System.out.println(feb21.osszeadas(10.1, 5.2));
        
        //Double eredmeny=feb21.osszeadas(10.1, 5.2);
        
        Double szam1 = 2.5;
        Double szam2 = 5.6;
        //System.out.println(feb21.osszeadas(szam1,szam2));
        
        double szam3=3.0;
        double szam4=1.5;
        //System.out.println(feb21.osszeadas(szam3,szam4));
        
        System.out.println(feb21.osszeadas(szam1,szam2,szam3));
        Scanner muv = new Scanner(System.in);
        System.out.println(feb21.szamologep(szam1,szam2,muv.next()));
        
        
    }
    
    //Acces modifier
    //public,private ...
    //meghívás modja static vagy semmi
    //visszatérési érték típusa
    //függvény neve, bemenő paraméterek
    //függvény body
    
    public static Double osszeadas(Double a,Double b){
        return a+b;
    }
    public static Double osszeadas(Double a,Double b,Double c){
        return a+b+c;
    }
    public  static Double szamologep(Double a,Double b,String muvelet){
        if(muvelet=="+") {
            return a+b;
        }
        else if(muvelet=="-"){
            return a-b;
        }
        else if(muvelet=="*") {
            return a*b;
        }
        else if(muvelet=="/"){
            return a/b;
        }
        else{
            return -1.0;
        }
    }
    
}
