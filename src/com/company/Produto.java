package com.company;

public class Produto {
 private int codProd;
 private String descricao;
 private  double preco;
 private Fornecedor fornecedor;

    public int getCodProd() {
        return codProd;
    }

    public void setCodProd(int codProd) {
        this.codProd = codProd;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }


    public void imprimirEtiqueta(){

        System.out.println("\nCodigo do Produto: "+ getCodProd());
        System.out.println("Descrição: "+ getDescricao());
        System.out.println("Preço do Produto: " + getPreco());
        System.out.println("Fornecedor:" + getFornecedor());
    }

}