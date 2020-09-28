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
public class Task3 {
    public void run(){
        System.out.println("----- Задача 3 ------");
        System.out.println("Создаем одномерный массив  из 10 ячеек типа int, \nзаполняем его случайными числами и выводим \nего значения в цикле");
        Random random = new Random();
        int myArr[] = new int[10];
        int min = 30;
        int max = 0;
        int summa = 0;
        for(int i = 0; i<myArr.length;i++){
            myArr[i] = random.nextInt(29-0+1)-0;
  
        }
        
        for(int i = 0; i<myArr.length;i++){
            summa = summa+myArr[i];
            if (myArr[i]<min) {
                min = myArr[i];
               
            }
            if (myArr[i]>max) {
                max = myArr[i];
            }
        }
        System.out.println("Сумма всех чисел массива: "+summa);
        System.out.println("min = "+min);
        System.out.println("max = "+max);
        System.out.println("----- конец задачи 3 ------");
    }
}
