/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Jennifer
 */
public class Test2 {
    //put maps into lists
    public static void main(String[] args) {
        Map<String, String> record1 = new HashMap<>();
        record1.put("name", "Dally");
        record1.put("ssn", "111-11-1111");
           Map<String, String> record2 = new HashMap<>();
        record2.put("na", "Dly");
        record2.put("ssn", "2221-11-1111");
        List<Map<String, String>> employees= new ArrayList<>();
        employees.add(record1);
        employees.add(record2);


        
    }
}
