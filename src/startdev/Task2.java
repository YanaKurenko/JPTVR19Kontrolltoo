/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package startdev;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Task2 {
    public void run(){
        System.out.println("----- Задача 2 ------");
        System.out.println("Загадано число от 5 до 10: ");
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int numRandom = random.nextInt( 10 - 5 + 1)+5;
        int gameNumber = scanner.nextInt() ;
        if (gameNumber == numRandom){
            System.out.println("Ты выиграл");
        }else{
            System.out.println("Ты проиграл");
        }
        
        System.out.println("Было загадано: "   );
        
        
        
        System.out.println("----- конец задачи 2 ------");
    }
   
}
