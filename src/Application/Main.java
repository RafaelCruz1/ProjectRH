package Application;


import Entities.Employees;
import Services.ListEmployee;
import Services.RegisterEmployee;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Employees employees = new Employees();
        ListEmployee listEmployee = new ListEmployee();

        Scanner sc = new Scanner(System.in);
        int adicionar;
        int i = 0;

        RegisterEmployee registerEmployee = new RegisterEmployee();

            System.out.println("Deseja registrar um funcionario? [S/N]" );
            String resposta = sc.next();

            if (resposta.equalsIgnoreCase("S")){
                System.out.println("Deseja adicionar quantos funcionarios? ");
                adicionar = sc.nextInt();
              while (i < adicionar){
                registerEmployee.registerEmployee();
                System.out.println("Usuario registrado");
                i++;
              }
            }else {
                System.out.println("Ok");
            }

        System.out.println(listEmployee.toString());

        }
    }

