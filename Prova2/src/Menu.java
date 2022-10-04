import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    ArrayList<String> moradorNomeLista = new ArrayList<String>();
    ArrayList<String> moradorBlocoLista = new ArrayList<String>();
    ArrayList<String> moradorApLista = new ArrayList<String>();
    ArrayList<Integer> idLista = new ArrayList<Integer>();
    ArrayList<String>  perguntaLista= new ArrayList<String>();
    public void menu(){
        Scanner input = new Scanner(System.in);
        int escolha;

        System.out.println("""
                           1- cadastro de moradores \n
                           2- consulta de moradores \n
                           3- cadastro de perguntas \n
                           4 consulta de perguntas \n
                           5- responder pesquisa \n""");

        escolha = input.nextInt();

        switch(escolha){
            case 1 -> {
                cadastroMorador();
                menu();
            }
            case 2 ->{
                int i = 0;
                while (i < moradorNomeLista.size()) {
                    System.out.print(
                            "Morador:" + i + "\n" +
                            "Nome:" + moradorNomeLista.get(i) + "\n" +
                            "Bloco:" + moradorBlocoLista.get(i) + "\n" +
                            "Apartamento:" + moradorApLista.get(i) + "\n"
                            );
                    i++;
                }
                menu();
            }
            case 3 ->{
                cadastroPergunta();
                menu();
            }
            case 4 ->{
                int i = 0;
                while (i < idLista.size() ) {
                    System.out.println(
                            "Id:" + idLista.get(i) + "\n" +
                            "Pergunta:" + perguntaLista.get(i) + "\n");
                    i++;
                }
                menu();
            }

            case 5 ->{
                /*registroPesquisa();*/
                menu();
            }
            default->{
            }
        }
    }


    public void cadastroMorador() {

        /* Salvar informações do morador*/
        Scanner input = new Scanner(System.in);

        /* Construtor */
        Morador morador = new Morador(" ", " "," ");

        System.out.println("Digite seu Nome:");
        morador.setNome(input.next());
        moradorNomeLista.add(morador.getNome());

        System.out.println("Digite seu Bloco:");
        morador.setBloco(input.next());
        moradorBlocoLista.add(morador.getBloco());

        System.out.println("Digite o número do seu Apartamento:");
        morador.setApartamento(input.next());
        moradorApLista.add(morador.getApartamento());

    }
    public void cadastroPergunta() {
        /*scanner input*/
        Scanner input = new Scanner(System.in);

        int quantPergunta;
        int x = 1;

        System.out.println("digite a quantidade de perguntas: \n");
        quantPergunta = input.nextInt();

        while (x <= quantPergunta) {

            Perguntas pergunta = new Perguntas(x, " ");

            System.out.println("digite sua pergunta: \n");
            pergunta.setPergunta(input.next());
            perguntaLista.add(pergunta.getPergunta());

            pergunta.setId(x);
            idLista.add(pergunta.getId());
            x++;
        }
    }
}
