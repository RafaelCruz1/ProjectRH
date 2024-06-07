package Services;

import Entities.Employees;

import java.util.Scanner;

public class ResignationEmployee {
    ListEmployee listEmployee = new ListEmployee();
    Employees emp = new Employees();

    public void resignationEmployee() {
        Scanner scanner = new Scanner(System.in);
        Long searchEmp;
        String confirmation;

        System.out.println("Qual cpf do funcionario desligado? ");
        searchEmp = scanner.nextLong();

        listEmployee.employeesList.contains(emp.getCpf()==searchEmp);

        if (listEmployee.employeesList.contains(searchEmp) == true) {
            System.out.println("Usuario encontrado: " + searchEmp);
            System.out.println("Deseja deletar? [S/N]");
            confirmation = scanner.next();
            if (confirmation.equalsIgnoreCase("S")) {
                listEmployee.employeesList.remove(searchEmp);
            } else {
                System.out.println("Ok");
            }

        } else {
            System.out.println("Usuario nao encontrado");
        }


    }
}
