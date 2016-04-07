/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practice;

import common.Employee;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Jennifer
 */
public class HomeworkPractice1 {
    // why use generics and what is the difference? 
    //https://docs.oracle.com/javase/tutorial/java/generics/why.html
    public static void main(String[] args) {
     
   Map<String, String> shoeMap = new HashMap<>();
   Shoe shoe1 = new Shoe("123a");
   Shoe shoe2 = new Shoe("456b");
   Shoe shoe3 = new Shoe("789c");
   shoe1.setStyle("Sneaks");
   shoe2.setStyle("Boots");
   shoe3.setStyle("Flats");
   shoeMap.put(shoe1.getBarCode(),shoe1.getStyle());
   shoeMap.put(shoe2.getBarCode(),shoe2.getStyle());
   shoeMap.put(shoe3.getBarCode(),shoe3.getStyle());
           
     Set<String> keys = shoeMap.keySet();
        for(String key : keys){
            String s = shoeMap.get(key);
            System.out.println(s);
        }
        
        Collection<String> v = shoeMap.values();
        for(String s: v){
            System.out.println(s);
        }   
      // Key will be dog's name, the value will be each dog. Using generics     
     Map<String, Dog> dogMap = new HashMap<>();   
     Dog d1 = new Dog("Hails", "Mutt", 11);
     Dog d2 = new Dog("Hanna", "German Shepherd", 13);
     Dog d3 = new Dog("Bandit", "Husky", 14);
     Dog d4 = new Dog("Tara", "German Shepherd", 9);
    
     //okay
  //   dogMap.put("Hails", d1);
    // dogMap.put("Hanna", d2); 
    // dogMap.put("Bandit", d3);
    // dogMap.put("Tara", d4);
     // better 
      dogMap.put(d1.getName(), d1);
     dogMap.put(d2.getName(), d2); 
     dogMap.put(d3.getName(), d3);
     dogMap.put(d4.getName(), d4);
    
     //getting keys of map
     // why are they in a set?
     //sets don't allow duplicates
//    Set<String> keys = dogMap.keySet();
//        for(String key : keys){
//            Dog d = dogMap.get(key);
//            System.out.println(d.getBreed());
//        }
//        
//        
//        //getting dogs (value portion of map)
//        Collection<Dog> v = dogMap.values();
//        for(Dog d: v){
//            System.out.println(d.getAge());
//        }
        
        // make a list of maps
        Map<String, Elephant> elephantMap = new HashMap<>(); 
        Elephant e1 = new Elephant("Jenny", "India", "1234");
        Elephant e2 = new Elephant("Kate", "South Africa", "5678");
        Elephant e3 = new Elephant("Lee", "China", "9012");
        elephantMap.put(e1.getTrackingID(), e1);
        elephantMap.put(e2.getTrackingID(), e2);
        elephantMap.put(e3.getTrackingID(), e3);

 List<Map> mapList = new ArrayList<>(); 
    mapList.add(elephantMap);
    mapList.add(dogMap);
    mapList.add(elephantMap);
    for(Map m: mapList) {
        System.out.println(m.get(keys));
    }
    
    for (int i = 0; i < mapList.size(); i++)
    { System.out.println(mapList.get(i).keySet());
    }
}
}