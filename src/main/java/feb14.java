/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author User
 */
public class feb14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner bekeres = new Scanner(System.in);
        int ev=bekeres.nextInt();
        if ((ev%100!=0 && ev%4==0) || ev%400==0)
        {
        System.out.println("Szokoev a "+ ev);
        }
        else{
        System.out.println("Nem szokoev a "+ev);
        }
        
    }
    
}
