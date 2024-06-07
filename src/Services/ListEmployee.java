package Services;

import Entities.Employees;

import java.util.ArrayList;

public class ListEmployee extends Employees {

    ArrayList<Employees> employeesList = new ArrayList<>();

    public void showList() {
        System.out.println(employeesList.size());
        for (int i = 0; i < employeesList.size(); i++) {
            System.out.println(employeesList.get(i));
        }
    }

}
