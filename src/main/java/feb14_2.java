/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author User
 */
public class feb14_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        for (int szam=1;szam<1000;szam++){
        if(szam%2==0){
            if (szam%3==0){
                System.out.println("Osztaható hárommal");
            break;
            }
            System.out.println("Páros szám");
        }
        else{
            System.out.println("Páratlan szám");
        }
        }
    }
    
}
