import entities.Funcionario;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Funcionario> list = new ArrayList<>();

        System.out.print("Quantos funcionários serão cadastrados? ");
        int n = sc.nextInt();
        for(int i =0; i < n; i++){

            System.out.println();
            System.out.println("Funcionário #" + (i + 1) + ": ");
            System.out.print("Id: ");
            Integer id = sc.nextInt();
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Salário: ");
            Double salary = sc.nextDouble();

           Funcionario funci = new Funcionario(name, id, salary);
           list.add(funci);
        }
        System.out.print("Qual o ID do funcionário que vai ter o salário aumentado: ");
        int idSalary = sc.nextInt();
        Integer pos = position(list, idSalary);
            if(pos == null){
            System.out.print("Esse ID não existe!");
        }
            else{
            System.out.println("Entre com a porcentagem: ");
            double percent = sc.nextDouble();
            list.get(pos).aumentarSalario(percent);
        }
        System.out.println();
        System.out.println("Lista de funcionários: ");
            for(Funcionario funci : list){
            System.out.println(funci);
        }


        sc.close();
    }
    public static Integer position(List<Funcionario> list, int id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                return i;
            }
        }
        return null;
    }
}