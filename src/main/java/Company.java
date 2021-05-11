import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Company {
    List<Employee> list = new ArrayList<Employee>();

    public void hire(Employee employeeName,Employee getMonthSalary){
        int salary = employeeName.getMonthSalary();
        list.add(salary, employeeName);
    }
    public void hireAll(List<Employee> addList){
        for (Employee employeeName:addList){
            int salary = employeeName.getMonthSalary();
            list.add(employeeName);
        }
    }
    public void fire(int count){
        while (count>0){
            list.remove(count-1);
            count--;
        }
    }
    List<Employee> getTopSalaryStaff(int count){
        
    }


}
