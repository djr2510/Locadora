package br.com.fundatec.locadoraveiculo.tela.modelo;

public class Endereco {
    private String logradouro;
    private Integer numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private String uf;
    private String cep;

    public Endereco(  String logradouro, Integer numero, String complemento, String bairro, String cidade, String uf, String cep){
        this.logradouro=logradouro;
        this.numero=numero;
        this.complemento=complemento;
        this.bairro=bairro;
        this.cidade=cidade;
        this.uf=uf;
        this.cep=cep;

    }
}
