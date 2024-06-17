package Application;


import Services.EmployeeDatabase;
import Services.RegisterEmployee;
import Services.ResignationEmployee;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EmployeeDatabase database = new EmployeeDatabase();
        RegisterEmployee registerEmployee = new RegisterEmployee();
        ResignationEmployee resignationEmployee = new ResignationEmployee();


        int cont;

        do {
            System.out.println("*** Para adicionar funcionario digite \"1\". ***");
            System.out.println("*** Para excluir funcionario digite \"2\". ***");
            System.out.println("*** Para encerrar a aplicacão \"3\". ***");
            System.out.println();
            System.out.println("Digite a opção: ");
            int resposta = sc.nextInt();

            switch (resposta) {
                case 1:
                    System.out.println("==========Adicionando funcionario.==========");
                    System.out.println("Deseja adicionar quantos funcionarios? ");
                    int adicionar = sc.nextInt();
                    int i = 0;
                    while (i < adicionar) {
                        registerEmployee.registerEmployee();
                        System.out.println("Usuario registrado");
                        i++;
                    }
                    database.showList();
                    break;
                case 2:
                    System.out.println("=============Excluindo funcionario.===========");

                    resignationEmployee.resignationEmployee();
                    database.showList();
                    break;
                case 3:
                    System.out.println("============Finalizando.============");
                    System.out.println("Lista de funcionarios: ");
                    database.showList();
                    break;
            }
            System.out.println("Continua? 1 para SIM e 2 para NAO");
            cont = sc.nextInt();

        } while (cont == 1);
        System.out.println("Ok");

    }
}

