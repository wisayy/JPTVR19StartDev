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
        int min = 5;
        int max = 10;
        Random random = new Random();
        int myNumber = random.nextInt(max-min+1)+min;       
        System.out.println("Отгадай: ");
        Scanner scanner = new Scanner(System.in);
        int attempt = 1;
        do{
            int gamerNumber = scanner.nextInt();
            if(myNumber == gamerNumber){
            System.out.println("Ты выиграл");
            break;
          }else{
                if(attempt < 3){
                    System.out.println("Не угадал, попробуй еще: ");
                    if(myNumber > gamerNumber){
                        System.out.println("(Задуманное число больше)");
                    }else{
                        System.out.println("(Задуманное число меньше)");
                    }
                }else{
                    System.out.println("Ты проиграл. Задуманное число было: "+myNumber);
                    System.out.println("----- конец задачи 2 ------");
                    break;
                }
            }
            attempt++;
        }while(true);
    }
}
