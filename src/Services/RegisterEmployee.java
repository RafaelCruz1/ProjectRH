package Services;

import Entities.Employees;
import java.util.Scanner;

public class RegisterEmployee {
    Employees employees1 = new Employees();
    EmployeeDatabase employeeDatabase = new EmployeeDatabase();

    public void registerEmployee() {
        Scanner sc = new Scanner(System.in);

        int id = employeeDatabase.employeesList.size();
        System.out.println("Digite o nome: ");
        String name = sc.nextLine();
        System.out.println("Digite o CPF: ");
        Long cpf = sc.nextLong();
        System.out.println("Digite o genero: ");
        String gender = sc.next();
        System.out.println("Digite o numero de telefone: ");
        Long phoneNumber = sc.nextLong();
        sc.nextLine();
        System.out.println("Digite o email: ");
        String email = sc.nextLine();

        employeeDatabase.employeesList.add(new Employees(id,name,cpf,gender,phoneNumber,email));

//        employees1.setName(name);
//        employees1.setCpf(cpf);
//        employees1.setGender(gender);
//        employees1.setPhoneNumber(phoneNumber);
//        employees1.setEmail(email);



    }
}
