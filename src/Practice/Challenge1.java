/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practice;

import common.Employee;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jennifer
 */
public class Challenge1 {public static void main(String[] args) {
        
    
          Employee e1 = new Employee(1, "Harenda", "Jen", "111-11-1111");
        Employee e2 = new Employee(2, "Scheidegger", "Jen", "222-11-1111");
        Employee e3 = new Employee(3, "Pope", "Jen", "333-11-1111");
          Employee e4 = new Employee(1, "Harenda", "Jen", "111-11-1111");
         // List <Employee> randomList= new ArrayList<>();
          List e = new ArrayList();
          
          
          e.add(e1); 
          e.add(e2);
          e.add(e4);
          
          for(int i = 0; i > e.size(); i++){
              Employee emp = (Employee)e.get(i); 
              System.out.println(emp.getFirstName());
    
}
                  
} 
}
