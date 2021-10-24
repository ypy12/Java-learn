package com.ypy;
import com.ypy.domain.Employee;
import com.ypy.service.NameListService;
import org.junit.Test;

public class testNamelist{
    
    @Test
    public void testgetAllEmployee() {
        NameListService service=new NameListService();
        Employee[] employees=service.getAllEmployee();
        for(int i=0;i<employees.length;i++){
            System.out.println(employees[i]);
        }
        
    }
}