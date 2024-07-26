import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Projeto> projetos = new ArrayList<>();

        while (true) {
            System.out.println("1. Adicionar Projeto");
            System.out.println("2. Adicionar Tarefa a um Projeto");
            System.out.println("3. Acompanhar Progresso de um Projeto");
            System.out.println("4. Sair");
            int opcao = scanner.nextInt();
            scanner.nextLine(); 

            if (opcao == 1) {
                System.out.println("Nome do Projeto: ");
                String nome = scanner.nextLine();
                System.out.println("Prazo do Projeto: ");
                String prazo = scanner.nextLine();
                projetos.add(new Projeto(nome, prazo));
            } else if (opcao == 2) {
                System.out.println("Nome do Projeto: ");
                String nome = scanner.nextLine();
                for (Projeto projeto : projetos) {
                    if (projeto.toString().contains(nome)) {
                        System.out.println("Descrição da Tarefa: ");
                        String descricao = scanner.nextLine();
                        System.out.println("Responsável: ");
                        String responsavel = scanner.nextLine();
                        System.out.println("Status: ");
                        String status = scanner.nextLine();
                        projeto.adicionarTarefa(new Tarefa(descricao, responsavel, status));
                    }
                }
            } else if (opcao == 3) {
                System.out.println("Nome do Projeto: ");
                String nome = scanner.nextLine();
                for (Projeto projeto : projetos) {
                    if (projeto.toString().contains(nome)) {
                        projeto.acompanharProgresso();
                    }
                }
            } else if (opcao == 4) {
                break;
            }
        }
        scanner.close();
    }
}
