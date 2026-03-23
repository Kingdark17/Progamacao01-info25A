/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package ifc.pedrohenrique;

import java.util.Date;

/**
 *
 * @author aluno
 */
public class Estudante {

    private static String nome;
    private Date dataNascimento;
    private String cpf;
    private char genero;
    private String matricula;
    private String email;
    private String nivelEnsino;
    private String telefone;
    private String dataDeIngresso;
    private String semestreInicial;
    private String situancaoAcademica;
    private String digito;

    public Estudante() {
        this.nome = "Nobody";
    }

    public int obterIdade(Date hoje) {
        int idade = 0;

        //Lógica para calcular idade
        return idade;

    }

    public static String getNome() {

        return nome;
    }

    public static void setNome(String _nome) {
        nome = _nome;
    }

    public static void setMatricula(String digito) {
        digito = digito;
    }
    public static void dataDenascimento(){
    
    }
    public static void cpf(){
        
    }
    public static void genero(){
        
    }
    public static void email(){
        
    }
    public static void nivelDeEnsino(){
        
    }
    public static void telefone(){
        
    }
    public static void dataDeIngresso(){
        
    }
    public static void semestreInicial(){
        
    }
    public static void situancaoAcademica(){
        
    }
    public static void digito(){
        
    }
}
