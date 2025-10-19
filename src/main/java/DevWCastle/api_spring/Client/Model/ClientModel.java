package DevWCastle.api_spring.Client.Model;

import DevWCastle.api_spring.Produto.ProdutoModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity //A classe abaixo se torna uma entidade do database
@Table(name = "tb_client")//Cria a tabela no database
@Data //Define os gettes e setters automaticamente para cada um dos atributs do Model
@AllArgsConstructor//Anotação para definir contructor com todos os argumentos automaticamente
@NoArgsConstructor
public class ClientModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//Definindo geração automatica de ids númericos
    private Long id;
    private String nome;
    private String email;
    private Integer idade;

//    public void setNome(String nome) {
//        this.nome = nome;
//    }

    //@OneToMany //Relação umpra muitos, um cliente muitos produtos
    //private List<ProdutoModel> produtos;


}
