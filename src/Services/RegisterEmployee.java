package Services;

import Entities.Employees;

import java.util.Scanner;

public class RegisterEmployee extends Employees{

    public void registerEmployee() {
        Scanner sc = new Scanner(System.in);
        Employees employees = new Employees();
        ListEmployee listEmployee = new ListEmployee();

        employees.setId(listEmployee.employeesList.size() + 1);
        System.out.println("Digite o nome: ");
        String name = sc.nextLine();
        System.out.println("Digite o CPF: ");
        long cpf = sc.nextLong();
        System.out.println("Digite o genero: ");
        String gender = sc.next();
        System.out.println("Digite o numero de telefone: ");
        long phoneNumber = sc.nextLong();
        System.out.println("Digite o email: ");
        sc.nextLine();
        String email = sc.nextLine();


//        employees.setName(name);
//        employees.setCpf(cpf);
//        employees.setGender(gender);
//        employees.setPhoneNumber(phoneNumber);
//        employees.setEmail(email);

        listEmployee.employeesList.add(employees);

    }
}
