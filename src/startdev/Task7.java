/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package startdev;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Task7 {
    public void run(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("----- Задача 7 ------");
        System.out.println("Введите строку");
        String str = scanner.nextLine();
        System.out.println("Введите букву : ");
        String letter = scanner.nextLine();
       // посчитайте сколько раз в строке встречается введенная вами буква
            
        int count = 0;
        int index = str.indexOf(letter);
            while (index != -1){
                count++;
                str = str.substring(index + 1);
                index = str.indexOf(letter);
            }
                       
        System.out.println("Буква \""+letter+"\" встречается в тексте "+ count + "раз");
        System.out.println("");
        System.out.println("----- конец задачи 7 ------");
    }
}
