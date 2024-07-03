package Services;

import Entities.Employees;
import java.util.Scanner;

public class RegisterEmployee {
    EmployeeDatabase employeeDatabase = new EmployeeDatabase();
    Employees employees = new Employees();

    public void registerEmployee() {
        Scanner sc = new Scanner(System.in);

        int id = employeeDatabase.employeesList.size();
        System.out.println("Digite o nome: ");
        String name = sc.nextLine();
        System.out.println("Digite o CPF: ");
        String cpf = sc.nextLine();
        System.out.println("Digite o genero: ");
        String gender = sc.next();
        System.out.println("Digite o numero de telefone: ");
        Long phoneNumber = sc.nextLong();
        sc.nextLine();
        System.out.println("Digite o email: ");
        String email = sc.nextLine();

        employees.setId(id);
        employees.setName(name);
        employees.setCpf(cpf);
        employees.setGender(gender);
        employees.setPhoneNumber(phoneNumber);
        employees.setEmail(email);
        System.out.println(employees.toString());

        employeeDatabase.employeesList.add(new Employees(id,name,cpf,gender,phoneNumber,email));

    }
}
