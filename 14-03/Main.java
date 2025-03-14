package ex2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> projetoBanco = new ArrayList<>();
        ArrayList<String> programacaoOrientada = new ArrayList<>();
        ArrayList<String> estruturaDados = new ArrayList<>();

        ArrayList<ArrayList<String>> cienciaComputacao = new ArrayList<>();
        cienciaComputacao.add(projetoBanco);
        cienciaComputacao.add(programacaoOrientada);
        cienciaComputacao.add(estruturaDados);

        Scanner sc = new Scanner(System.in);
        char opcao;

        while (true) {
            String nomeAluno;
            System.out.print("Digite o nome do aluno que você deseja adicionar: ");
            nomeAluno = sc.nextLine();
            System.out.print("\nEscolha a matéria que você deseja adicionar o aluno:\n" +
                    "1 = Projeto de banco de dados\n" +
                    "2 = Programação orientada a objetos\n" +
                    "3 = Estrutura de dados\n");
            opcao = sc.next().charAt(0);

            switch (opcao) {
                case '1':
                    projetoBanco.add(nomeAluno);
                    break;
                case '2':
                    programacaoOrientada.add(nomeAluno);
                    break;
                case '3':
                    estruturaDados.add(nomeAluno);
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente.");
                    continue;
            }

            System.out.print("\nDeseja adicionar mais algum aluno? (S para adicionar, N para sair): ");
            opcao = sc.next().charAt(0);
            sc.nextLine();
            if (opcao == 'N' || opcao == 'n') {
                break;
            }
        }

        System.out.print("\nDeseja verificar em que matéria algum aluno está? (S para verificar, N para sair): ");
        char opcaoVerificacao = sc.next().charAt(0);
        sc.nextLine();

        if (opcaoVerificacao == 'S' || opcaoVerificacao == 's') {
            while (true) {
                System.out.println("Selecione a ação que você deseja realizar.\n" +
                        "a = Verificar aluno\n" +
                        "b = Lista completa de alunos\n" +
                        "c = Sair");
                opcao = sc.next().charAt(0);
                sc.nextLine();

                if (opcao == 'c' || opcao == 'C') {
                    break;
                }

                switch (opcao) {
                    case 'a': {
                        System.out.println("Digite o aluno que você deseja verificar: ");
                        String aluno = sc.nextLine();
                        int i = 0;

                        for (ArrayList<String> disciplina : cienciaComputacao) {
                            if (disciplina.contains(aluno)) {
                                switch (i) {
                                    case 0:
                                        System.out.println(aluno + " está matriculado na disciplina de Projeto de Banco de Dados.");
                                        break;
                                    case 1:
                                        System.out.println(aluno + " está matriculado na disciplina de Programação Orientada a Objetos.");
                                        break;
                                    case 2:
                                        System.out.println(aluno + " está matriculado na disciplina de Estrutura de Dados.");
                                        break;
                                }
                            }
                            i++;
                        }
                        break;
                    }

                    case 'b': {
                        int i = 0;
                        for (ArrayList<String> disciplina : cienciaComputacao) {
                            switch (i) {
                                case 0:
                                    System.out.println("Projeto de banco de dados: " + disciplina);
                                    break;
                                case 1:
                                    System.out.println("Programação orientada a objetos: " + disciplina);
                                    break;
                                case 2:
                                    System.out.println("Estrutura de dados: " + disciplina);
                                    break;
                            }
                            i++;
                        }
                        break;
                    }
                }
            }
        }
        sc.close();
    }
}
