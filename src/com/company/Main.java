package com.company;

//NOME: Gabriel Bauer
//NOME: Luciano Guarnieri
//NOME: Matheus Pissinatti
//NOME: Vinicius Marques

import java.util.Scanner;




public static class Main {

    public static void main(String[] args) {
	// write your code here
        int indice = 0;
        Produto[] produtos = new Produto[100];
        Scanner sc = new Scanner(System.in);
        int opcao=0;
        do{
            System.out.println("1.. Cadastrar Fornecedor");
            System.out.println("2.. Cadastrar Produto");
            System.out.println("3.. Abrir Carrinho");
            System.out.println("4.. Fechar Carrinho");
            System.out.println("9.. Sair");
            System.out.println("Digite sua opção: ");
            opcao = Integer.parseInt(sc.nextLine());
            switch (opcao){
                case 1:
                    cadastrarFornecedor();
                    break;
                case 2:
                    cadastrarProduto();
                    break;
                case 3:
                    adicionarItem();
                    break;
                case 4:
                    exibeLista();
                    break;
                case 9:
                    System.out.println("Fim");
                    break;
                default:
                    System.out.println("opção inválida");
            }
        }while(opcao!=9);
    }

    public static void cadastrarFornecedor(){
        var fornecedor = new Fornecedor();
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o ID do fornecedor:");
        int id = sc.nextInt();
        fornecedor.setIdFornecedor(id);

        System.out.println("Digite o Nome do fornecedor:");
        String nome = sc.nextLine();
        fornecedor.setNome(nome);

        System.out.println("Digite o Contato do fornecedor:");
        String contato = sc.nextLine();
        fornecedor.setContato(contato);

        System.out.println("Digite o Fone do fornecedor:");
        String fone = sc.nextLine();
        fornecedor.setFone(fone);

        System.out.println("Digite o Email do fornecedor:");
        String email = sc.nextLine();
        fornecedor.setEmail(email);
    }

    public static void cadastrarProduto(int indice){

        Produto produtos[indice] = new Produto();
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o Codigo do produto:");
        int codprod = sc.nextInt();
        produtos[indice].setCodProd(codprod);

        System.out.println("Digite a Descricao do produto");
        String descr = sc.nextLine();
        produtos[indice].setDescricao(descr);

        System.out.println("Digite o valor do produto");
        double preco = sc.nextDouble();
        produtos[indice].setPreco(preco);
        indice ++;
    }

    public static void adicionarItem(Object produto){
        Cesta cesta = new Cesta();
        var produtos[] = produtos[];
        Scanner sc = new Scanner (System.in);
        System.out.println("Digite o indice do produto:");
        int in = Integer.parseInt(sc.nextLine());
        adicionarItem(produtos[in]);
    }

    public static void exibeLista(){
        exibeLista();
    }

    public static void calcularTotal(){
        calcularTotal();
    }
    }
}
