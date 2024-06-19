package Services;

import Entities.Employees;
import java.util.ArrayList;

public class EmployeeDatabase {

    ArrayList<Employees> employeesList = new ArrayList<>();

    public void showList(){
       for (int i =0; i< employeesList.size(); i++){
           System.out.println(employeesList.get(i).toString());
       }
    }
}
