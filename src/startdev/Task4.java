/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package startdev;

import java.util.Random;

/**
 *
 * @author user
 */
public class Task4 {
    public void run(){
        System.out.println("----- Задача 4 ------");
        System.out.println("Создаем одномерный массив  из 10 ячеек типа int, \nзаполняем его случайными ЧЕТНЫМИ числами и выводим \nего значения в цикле");
        Random random = new Random();
        int myArr[] = new int[10];
        int number = 0;
        for(int i = 0; i<myArr.length;i++){
            number = random.nextInt(29-0+1)-0;
            if ((number%2) != 0) {
                number = number*2;
            }
            myArr[i] = number;
            System.out.printf("%4d", myArr[i]);
            System.out.println();
        }

        System.out.println("----- конец задачи 4 ------");
    }
}
