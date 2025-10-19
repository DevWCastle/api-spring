package DevWCastle.api_spring.Client.Repository;

import DevWCastle.api_spring.Client.Model.ClientModel;
import org.springframework.data.jpa.repository.JpaRepository;


//é uma interface pois deve ser implementado
//esse extends serve só pq é inteface

//Jpa ta recebendo o tipo do objeto e o tipo do id
public interface ClientRepository extends JpaRepository<ClientModel, Long>{


}
