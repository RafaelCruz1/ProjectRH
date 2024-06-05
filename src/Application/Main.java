package Application;


import Services.RegisterEmployee;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        RegisterEmployee registerEmployee = new RegisterEmployee();

        System.out.println("Deseja registrar um funcionario? [S/N]" );
        String resposta = sc.next();
        if (resposta.equalsIgnoreCase("S")){
            registerEmployee.registerEmployee();
            System.out.println("Usuario registrado");
        }else {
            System.out.println("Ok");
        }

    }
}
