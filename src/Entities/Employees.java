package Entities;

public class Employees {
    private int id;
    private String name;
    private String cpf;
    private String gender;
    private long phoneNumber;
    private String email;

    public Employees() {
    }

    public Employees(int id, String name, String cpf, String gender, long phoneNumber, String email) {
        this.name = name;
        this.cpf = cpf;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    @Override
    public String toString() {
        return "Funcionario: "+ this.name +
                ", Cpf: " + this.cpf +
                ", Telefone: " + this.phoneNumber;
    }
}
