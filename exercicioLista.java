import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class exercicioLista {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        char verificador;
        String armazenar;
        do{
            System.out.print("Digite um nome para adicionar a lista: ");
            armazenar = sc.nextLine();
            if(lista.contains(armazenar) || lista.contains(armazenar.toLowerCase()) || lista.contains(armazenar.toUpperCase())){ //pra não adicionar nomes repetidos escritos de forma diferente
                System.out.println("Já contém esse nome, digite outro. ");
                continue;
            }
            else{
                System.out.println("Nome adicionado.");
                lista.add(armazenar);
            }
            System.out.println("Deseja continuar? (n para sair, outro caracter para seguir): ");
            verificador = sc.next().charAt(0);
            sc.nextLine();
            if(verificador == 'n' || verificador == 'N'){
                break;
            }
        }while(true);
        Collections.sort(lista);
        System.out.println("Deseja remover um nome da lista? (s para remover, outro caracter para seguir): ");
        verificador = sc.next().charAt(0);
        sc.nextLine();
        if(verificador == 's' || verificador == 'S'){
            do {
                System.out.println("Qual nome você deseja remover? ");
                armazenar = sc.nextLine();
                if (lista.contains(armazenar) || lista.contains(armazenar.toLowerCase()) || lista.contains(armazenar.toUpperCase())) {//mesma coisa
                    System.out.println("Nome removido.");
                    lista.remove(armazenar);
                } else {
                    System.out.println("Nome não encontrado, digite outro.");
                    continue;
                }
                System.out.println("Deseja sair ou remover mais nomes? (n para sair, outro caracter para seguir): ");
                verificador = sc.next().charAt(0);
                sc.nextLine();
                if(verificador == 'n' || verificador == 'N'){
                    break;
                }
            }while(true);
            System.out.println("Lista finalizada em ordem alfabética: ");
            Iterator <String> iterator = lista.iterator();
            while(iterator.hasNext()){
                System.out.println(iterator.next());
            }
        }


    }
}
