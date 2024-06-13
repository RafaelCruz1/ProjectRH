package Services;

import Entities.Employees;

import java.util.Scanner;

public class ResignationEmployee {

    public void resignationEmployee() {
        EmployeeDatabase empDB = new EmployeeDatabase();
        Employees employees = new Employees();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual cpf do funcionario desligado? ");
        int cpf = scanner.nextInt();

        for (int i = 0; i < empDB.employeesList.size(); i++) {
            if (cpf == empDB.employeesList.get(i).getCpf()) {
                System.out.println(empDB.employeesList.get(i).toString());
                System.out.println("Deseja realmente remover? S/N");
                String confirmation = scanner.next();
                if (confirmation == "S") {
                    empDB.employeesList.remove(i);
                    System.out.println("Usuario removido");
                }
                System.out.println("Usuario não encontrado");

            }
        }
    }
}
