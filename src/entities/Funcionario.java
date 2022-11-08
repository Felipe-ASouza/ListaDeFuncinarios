package entities;

public class Funcionario {

    private Integer id;
    private String name;
    private Double salary;

    public Funcionario(String name, Integer id, Double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public Funcionario() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void aumentarSalario(double porcentagem){
       salary += salary * porcentagem /100.0;
    }
    public String toString(){
        return id + ", " + name + ", " + String.format("%.2f", salary);
    }
}
