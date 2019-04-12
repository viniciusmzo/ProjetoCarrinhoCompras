package com.company;

public class Cesta {
        public Produto[] itens;
        public int indice;
        public Cesta(){
            itens = new Produto[15];
            indice=0;
        }

        public void adicionarItem(Produto produto){
            if (indice<15){
                itens[indice++] = produto;
            }
        }

        public void exibeLista(){
            if(indice==0){
                System.out.println("Impossível exibir lista!");
            }else{
                for(int i=0;i<indice;i++){
                    itens[i].imprimirEtiqueta();
                }
            }
        }
        public void calcularTotal(){
            if(indice==0){
                System.out.println("Nenhum item foi encontrado!");
            }else{
                double soma = 0;
                for (int i=0;i<indice;i++){
                    soma+=itens[i].getPreco();
                }
                System.out.println("O total da compra foi de: "+soma);
            }
        }
}
