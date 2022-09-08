//Classe Objeto - Acervo

package entities;

import java.util.ArrayList;

public class Acervo {
    private static ArrayList<LivroLivraria> listaLivros = new ArrayList<>();
    
    // metodo GET

    public static ArrayList<LivroLivraria> getListaLivros() {
        return listaLivros;
    }
    
    // ADICIONAr UM OBJETO NA LISTA
    
    static public void adicionar(LivroLivraria l){
        listaLivros.add(l);
    }
    
    //lista os dados de todos os objetos na lista
    static public String listar(){
        String saida = "";
        int i=1;
        for (LivroLivraria l: listaLivros){
            saida += "\n===== LIVRO Nº " + (i++) + " =====\n";
            saida += l.imprimir() + "\n";
        }
        
        return saida;
    }
    // pesquisar por genero
    static public int pesquisar (String genero){
        int qtd = 0;
        for (LivroLivraria l: listaLivros){
            if (l.getGenero().equalsIgnoreCase(genero)){
                qtd++;
            }
        }
        
        return qtd;
    }
    
    //pesquisar passando uma faixa de preço
    
    static public int pesquisar(double vInicial, double vFinal){
        int qtd = 0;
        for (LivroLivraria l: listaLivros){
            if(l.getPreco() >= vInicial && l.getPreco() <= vFinal){
                qtd ++;
            }
        }
        return qtd;
    }
    
    //remover objeto pelo título
    
    static public boolean remover(String titulo){
        for(LivroLivraria l: listaLivros){
            if(l.getTitulo().equalsIgnoreCase(titulo)){
                listaLivros.remove(l);
                return true;
            }
        }
        return false;
    }
    
    // calcular o valor total de acervo
    
    static public double calcularTotalAcervo(){
        double total = 0;
        
        for (LivroLivraria l : listaLivros){
            total += l.getPreco();
        }
        return total;
    }
    
}
