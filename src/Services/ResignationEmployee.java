package Services;

import Entities.Employees;

import java.util.Scanner;

public class ResignationEmployee {
    Employees employee = new Employees();
    ListEmployee listEmployee = new ListEmployee();

    public void resignationEmployee() {
        Scanner scanner = new Scanner(System.in);
        Long searchEmp;
        System.out.println("Qual cpf do funcionario desligado? ");
        searchEmp = scanner.nextLong();
        listEmployee.employeesList.contains(employee.getCpf());

    }
}
