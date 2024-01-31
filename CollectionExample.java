package demo;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionExample 
{
    public static void main(String[] args)
    {
      
        Collection<String> list = new ArrayList<>();

       
        list.add("Papaya");
        list.add("Pineapple");
        list.add("Grape"); 

        boolean containsBanana = list.contains("Pineapple");  
        
        
        System.out.println("Contains Pineapple: " + containsBanana);

      
        boolean removed = list.remove("Grape");
        System.out.println("Removed Grape: " + removed);

      
        for (String fruit : list) {
            System.out.println(fruit);
        }
    }
}