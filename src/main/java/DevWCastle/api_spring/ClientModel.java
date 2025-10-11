package DevWCastle.api_spring;

import jakarta.persistence.*;

@Entity //A classe abaixo se torna uma entidade do database
@Table(name = "tb_client")//Cria a tabela no database
public class ClientModel {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//Definindo geração automatica de ids númericos
    private Long id;
    private String nome;
    private String email;
    private int idade;

    public ClientModel(){

    }

    public ClientModel(String email, int idade, String nome) {
        this.email = email;
        this.idade = idade;
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
