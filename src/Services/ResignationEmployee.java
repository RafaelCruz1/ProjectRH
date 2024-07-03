package Services;

import java.util.Scanner;

public class ResignationEmployee {

    public void resignationEmployee() {
        EmployeeDatabase empDB = new EmployeeDatabase();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual id do funcionario desligado? ");
        int id = scanner.nextInt();

        for (int i = 0; i < empDB.employeesList.size(); i++) {
            System.out.println(empDB.employeesList.get(i).toString());
            if (empDB.employeesList.get(i).getId() == id) {
                System.out.println(empDB.employeesList.get(i).toString());
                System.out.println("Deseja remover ? 1.Sim /  2.Nao");
                int confirm = scanner.nextInt();
                if (confirm == 1) {
                    empDB.employeesList.remove(i);
                    System.out.println("Removido");
                }else {
                    System.out.println("Funcionario nao encontrado.");
                }

            }
        }
    }
}

