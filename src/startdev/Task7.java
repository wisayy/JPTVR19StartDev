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
        System.out.println("----- Задача 7 ------");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку");
        String str = scanner.nextLine();
        // посчитайте сколько раз в строке встречается введенная вами буква
        System.out.println("Введите букву: ");
        String letter = scanner.nextLine();
        int n = 0;
        int index = -1;
        while(true) {
            index = str.indexOf(letter, index + 1);
            if (index != -1) {
                n++;
                continue;
            }
            break;
        }
        System.out.println("Буква \""+letter+"\" встречается в тексте "+ n + " раз");
        System.out.println("");
        System.out.println("----- конец задачи 7 ------");
    }
}
