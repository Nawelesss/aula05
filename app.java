package pacote1;
import java.util.ArrayList;
import java.util.Scanner;
import programas.Pessoa;
public class app {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;
        int contador;
        contador = 0;
        int x;
    

        Pessoa[] contatos = new Pessoa[5];
    System.out.println("DIGITE 0 PARA FINALIZAR O PROGAMA!!");
    do {
        System.out.println("Escolha uma opção:");
      System.out.println("1 - Incluir pessoa");
      System.out.println("2 - Listar todos os cadastrados");
      System.out.print("Opção: ");
      

      opcao = sc.nextInt();
      sc.nextLine(); // Limpa o ENTER q fica na entrada
      switch (opcao) {
        case 0:
          System.out.println("Fim do programa!");
          break;
        case 1:
        System.out.println("Digite o nome e sobrenome e telefone: ");
        //ArrayList<Pessoa> contatos = new ArrayList<Pessoa>();
        
        
        Pessoa people = new Pessoa(sc.nextLine(),sc.nextLine(),sc.nextInt());
        contatos[contador] = people;
        contador++;
        
          break;
        case 2:
        for(x = 0;x < contador;x++){
          System.out.println("Nome e sobrenome e telefone da pessoa "+x);
        System.out.println("nome: "+contatos[x].getNome());
        System.out.println("sobrenome: "+contatos[x].getSobrenome());
        System.out.println("telefone: "+contatos[x].getTelefone()+"\n");
        }
        

          break;
        default:
          System.out.println("Opção inválida!");
          break;
      }
    } while (opcao != 0);
    sc.close();
    }
   


}
