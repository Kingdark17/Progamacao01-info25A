/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ifc.pedrohenrique;

import java.util.Date;

/**
 *
 * @author aluno
 */
public class Professor {
    
        private static String nome;
        private static String SIAPE;
        private String email; 
        private String telefone;
        private String TitulacaoAcademica;
        private String areaDeAtuacao;
        private String Formacao;
        private Date dataNascimento;
        private String cpf;
        private char genero;
        
        public Professor (){
        this.nome = "nobody";
        }
       
        public int obterIdade(Date hoje) {
        int idade = 0;
            return idade;
        
            
        }
        public static String getNome() {

        return nome;
        }
        
         public static void setNome(String _nome) {
        nome = _nome;
    }
     public void TitulacaoAcademica(){
    
    }
    public void cpf(){
        
    }
    public void genero(){
        
    }
    public void email(){
        
    }
    public void areaDeAtuacao(){
        
    }
    public void telefone(){
        
    }
    public void Formacao(){
        
    }
    public void SIAPE(){
        
    }
   
}