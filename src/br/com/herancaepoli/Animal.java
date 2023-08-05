package br.com.herancaepoli;

public class Animal {
   private String nome;
   private int idade;
   private String som;
   private String acao;

   public String getNome(){
       return this.nome;
   }

   public void setNome(String pNome){
        this.nome = pNome;
   }

   public int getIdade(){
       return this.idade;
   }

   public void setIdade(int pIdade){
       this.idade = pIdade;
   }

   public String setSom(){
       return this.som;
    }

    public void getSom(String pSom){
       this.som = pSom;
    }

    public String setAcao(){
       return this.acao;
    }

    public void getAcao(String pAcao){
       this.acao = pAcao;
    }
}
