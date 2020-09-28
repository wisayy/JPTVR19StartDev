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
class Task1 {
    public void run(){
        System.out.println("----- Задача 1 ------");
        int a;
        int d = 32;
        double c;
        double b = 1.8;
        System.out.println("Введите число градусов по Цельсию: ");
        // решение задачи
        a = new Scanner(System.in).nextInt();
        c = a * b + d;
        System.out.println("По Фарингейту это будет: " + c);
        System.out.println("----- конец задачи 1 ------");
    }
}
