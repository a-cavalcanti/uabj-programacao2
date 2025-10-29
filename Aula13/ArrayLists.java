package Aula13;

import java.util.ArrayList;
import java.lang.*;
public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();
        array.add(1); 
        array.add(2); 
        array.add(3);
        
        System.out.println(array); // [1, 2, 3]
        System.out.println(array.size()); // 3 
        
        int index = array.indexOf(3);         
        System.out.println(index); // 2 
        
        array.remove(index);
        array.
        
        System.out.println(array); // [1, 2]
        System.out.println(array.get(1)); // 2 
        
        if(array.contains(5)){
            System.out.println("Contém valor 5");
        }
        else{
            System.out.println("Não contém valor 5");             
        }

    }
}
