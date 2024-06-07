package Application;

import Services.ListEmployee;
import Services.RegisterEmployee;
import Services.ResignationEmployee;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Deseja continuar? [S/N]");
        String seContinua = sc.nextLine();

        while (seContinua.equalsIgnoreCase("S")) {
            ListEmployee listEmployee = new ListEmployee();
            RegisterEmployee registerEmployee = new RegisterEmployee();
            ResignationEmployee resignationEmployee = new ResignationEmployee();

            int adicionar;
            int i = 0;
            String resposta;

            System.out.println("Para adicionar funcionario digite \"add\". ");
            System.out.println("Para excluir funcionario digite \"del\". ");
            System.out.println("Para encerrar a aplicacão \"fin\". ");
            System.out.println();
            System.out.println("Digite a opção: ");
            resposta = sc.next();

            if (resposta.equalsIgnoreCase("add")) {
                System.out.println("Deseja adicionar quantos funcionarios? ");
                adicionar = sc.nextInt();
                while (i < adicionar) {
                    registerEmployee.registerEmployee();
                    System.out.println("Usuario registrado");
                    i++;
                }
            } else if (resposta.equalsIgnoreCase("del")) {
                resignationEmployee.resignationEmployee();
            } else if (resposta.equalsIgnoreCase("fin")) {
                System.out.println("Lista de funcionarios: ");
                listEmployee.showList();

                break;
            } else {
                break;
            }

        }
    }
}

