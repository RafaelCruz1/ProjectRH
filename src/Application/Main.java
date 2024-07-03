package Application;

import Entities.Employees;
import Services.EmployeeDatabase;
import Services.RegisterEmployee;
import Services.ResignationEmployee;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EmployeeDatabase employeeDatabase = new EmployeeDatabase();
        RegisterEmployee registerEmployee = new RegisterEmployee();
        ResignationEmployee resignationEmployee = new ResignationEmployee();

        while (true) {
            System.out.println("Sistema iniciado.");
            System.out.println("1. Para executar alguma função");
            System.out.println("2. Para sair.");
            int resp = sc.nextInt();
            sc.nextLine(); //Limpa buffer

            switch (resp) {
                case 1:
                    System.out.println("*** Para adicionar funcionario digite \"1\". ***");
                    System.out.println("*** Para excluir funcionario digite \"2\". ***");
                    System.out.println("*** Para mostrar lista de funcionarios \"3\". ***");
                    System.out.println();
                    System.out.println("Digite a opção: ");

                    int resposta = sc.nextInt();
                    sc.nextLine(); //Limpa buffer

                    switch (resposta) {
                        case 1:
                            System.out.println("==========Adicionando funcionario.==========");
                            System.out.println("Deseja adicionar quantos funcionarios? ");
                            int adicionar = sc.nextInt();
                            sc.nextLine(); //Limpa buffer

                            for (int i = 0; i < adicionar; i++) {
                                registerEmployee.registerEmployee();
                                System.out.println("Usuario registrado");
                            }
                            break;
                        case 2:
                            System.out.println("=============Excluindo funcionario.===========");
                            resignationEmployee.resignationEmployee();
                            break;
                        case 3:
                            System.out.println("==========Mostrando lista=======");
                            for (int j = 0; j < employeeDatabase.employeesList.size(); j++) {
                                System.out.println(employeeDatabase.employeesList.get(j));
                            }
                            break;
                    }

                case 2:
                    sc.close();
                    System.out.println("Programa encerrado.");
                    System.exit(0);

            }
        }
    }
}

