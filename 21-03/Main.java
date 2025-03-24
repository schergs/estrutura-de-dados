package atividade;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        String nome;
        ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
        Scanner sc = new Scanner(System.in);
        boolean loopzao = true;
        while (loopzao) {
            System.out.println("Digite o nome completo: ");
            nome = sc.nextLine().toUpperCase();
            String[] vetorNome = nome.split(" ");

            if (vetorNome.length < 2) {
                System.out.println("Digite o nome completo, tá incompleto.");
                continue;
            }
            String email = vetorNome[0].toLowerCase() + "." + vetorNome[vetorNome.length - 1].toLowerCase() + "@ufn.edu.br";
            boolean emailJaExiste = false;
            for (Pessoa p : pessoas) {
                if (p.getEmail().equals(email)) {
                    emailJaExiste = true;
                    break;
                }
            }
            if (emailJaExiste) {
                Random random = new Random();//botei um random pq pensei vai q tenham 200 guilherme scher ai ele gera por conta
                email = vetorNome[0].toLowerCase() + "." + vetorNome[vetorNome.length - 1].toLowerCase() + random.nextInt(100) + "@ufn.edu.br";
                        //nome 0 primeiro nome              //length - 1 ultimo nome                        //random caso repita nome
            }
            Pessoa pessoa = new Pessoa(nome, email);
            pessoas.add(pessoa);

            System.out.println("Deseja cadastrar mais alguma pessoa? (S para cadastrar, outra tecla pra sair)");
            char opcao = sc.next().charAt(0);
            sc.nextLine();
            if (opcao != 'S' && opcao != 's') {
                loopzao = false;
            }
        }
        System.out.println("\nLista:");
        for (Pessoa p : pessoas) {
            System.out.println(p);
        }
    }
}
