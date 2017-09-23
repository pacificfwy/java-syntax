package ru.job4j.array;

/**
 * Класс сортирует массив алгоритмом пузырька.
 */
public class BubbleSort {

    public int[] sort (int[] array){
		
		for (int indexExt = 0; indexExt < array.length-1; indexExt++)	{
		
			for (int indexInt = 0; indexInt < array.length-1-indexExt; indexInt++){
					
					int first	= array[indexInt];
					int second	= array[indexInt+1];
					
					if (first > second){
						array[indexInt]	= second;
						array[indexInt+1] = first;
					}
			}
		
		}
		return array;
    }
}
