package DevWCastle.api_spring.Produto;

import DevWCastle.api_spring.Client.Model.ClientModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_produtos")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProdutoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String nome;
    private Double preco;
    private String descricao;

    //@ManyToOne // relação muitos pra um, muitos produtos para um cliente...
    //@JoinColumn(name = "fk_id_client")
   // private ClientModel client;

}
