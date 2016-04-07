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
public class Test1 {
    public static void main(String[] args) {
        Employee e1 = new Employee(1, "Harenda", "Jen", "111-11-1111");
        Employee e2 = new Employee(2, "Scheidegger", "Jen", "222-11-1111");
        Employee e3 = new Employee(3, "Pope", "Jen", "333-11-1111");
        
        // key first, then value
        // a key must be an object
       // Map employees = new HashMap(); 
       // can store values multiple times
         Map<String, Employee> employees = new HashMap<>(); 
        employees.put("111-11-1111", e1);
        employees.put(e2.getSsn(), e2); 
        employees.put(e3.getSsn(), e3);
        
        Set<String> keys = employees.keySet();
        for(String key : keys){
            Employee e = employees.get(key);
            System.out.println(e);
        }
        
        Collection<Employee> v = employees.values();
        for(Employee e: v){
            System.out.println(e);
        }
        // have to cast to employee- comes out as  plain old object
        // map makes it easier to retrive objects
        
        Employee e = (Employee)employees.get("111-11-1111");
        System.out.println(e.getSsn());
        // e1 will no longer be in the map, replaced by e3
        employees.put("333-11-1111", e3); 
        //keep the old value
        Employee old =  employees.put("333-11-1111", e3); 
        List <Employee> w = new ArrayList<>();
        w.add(e1); 
        w.add(e2); 
            List <Employee> p = new ArrayList<>();
      
        
       
        
    }
}
