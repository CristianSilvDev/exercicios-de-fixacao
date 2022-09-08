//Classe Principal

package application;

import java.util.Scanner;

import entities.Acervo;

import entities.LivroLivraria;

public class LivrariaArrayList {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner entradaString = new Scanner(System.in);
        
        int menu;
        double vInicial, vFinal;
        LivroLivraria objLivro;
        String titulo, autor, genero;
        float preco;
        int isbn;
        
        do {
            exibirMenu();
            menu = sc.nextInt();
            switch (menu){
                case 1:
                    System.out.println("==== CADASTRAR LIVRO ====");
                    System.out.println("Digite o título: ");
                    titulo = entradaString.nextLine();
                    System.out.println("Digite o autor: ");
                    autor = entradaString.nextLine();
                    System.out.println("Digite o Gênero: ");
                    genero = entradaString.nextLine();
                    System.out.println("Digite o ISBN: ");
                    isbn = sc.nextInt();
                    System.out.println("Digite o preço: ");
                    preco = sc.nextFloat();
                    
                    // criar objeto da classe
                    objLivro = new LivroLivraria(titulo, autor, isbn, genero, preco);
                    
                    //guardar no ArrayList
                    Acervo.adicionar(objLivro);
                    break;
                case 2:
                    System.out.println("====> LISTAGEM DE LIVROS ");
                    System.out.println(Acervo.listar());
                    
                    break;
                case 3:
                    System.out.println("===> Exclusão do Livro");
                    System.out.print("Digite o título do livro ");
                    titulo = entradaString.nextLine();
                    
                    if(! (Acervo.getListaLivros().isEmpty())){ //acervo vazio
                        if ( Acervo.remover(titulo)){
                            System.out.println("LIVRO REMOVIDO COM SUCESSO");
                        } else {
                            System.out.println("TÍTULO NÃO ENCONTRADO");
                        }
                    } else {
                        System.out.println("Não existem livros no acervo");
                    }
                    break;
                case 4:
                    System.out.println("===> Pesquisar pelo gênero");
                    System.out.print("Digite o gênero: ");
                    genero = entradaString.nextLine();
                    System.out.println("Existem " + Acervo.pesquisar(genero) + 
                            " livro(s) do gênero " + genero);
                    break;
                case 5:
                    System.out.println("===> Pesquisar por faixa de preço");
                    System.out.println("Digite a faixa incial e a faixa final: ");
                    vInicial = sc.nextDouble();
                    vFinal = sc.nextDouble();
                    
                    System.out.println("Existe " + Acervo.pesquisar(vInicial, vFinal) + 
                            "Livro(s) com preço entre " + String.format("R$ %.2f e R$ %.2f", vInicial, vFinal));
                    break;
                case 6:
                    System.out.println("===> TOTAL DE R$ DE LIVROS NO ACERVO");
                    System.out.println("O total é: " + String.format(" R$ %.2f \n", Acervo.calcularTotalAcervo() ));
                    break;
                case 7:
                    System.out.println("Saindo");
                    break;
                default:
                    System.out.println("Opção de menu inválida!!");
            }
        } while (menu != 7);
        
    }
    static void exibirMenu(){
        System.out.println("===== LIVRO LIVRARIA ======");
        System.out.println("1 - CADASTRAR");
        System.out.println("2 - LISTAR");
        System.out.println("3 - EXCLUIR LIVRO");
        System.out.println("4 - PESQUISAR POR GENERO");
        System.out.println("5 - PESQUISAR POR FAIXA DE PREÇO");
        System.out.println("6 - CALCULAR TOTAL DO ACERVO");
        System.out.println("7 - SAIR");
    }
}
