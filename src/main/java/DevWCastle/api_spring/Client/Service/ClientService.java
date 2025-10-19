package DevWCastle.api_spring.Client.Service;

import DevWCastle.api_spring.Client.Model.ClientModel;
import DevWCastle.api_spring.Client.Repository.ClientRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
//@RequiredArgsConstructor //- faz a mesma função da injeção de dependencia
public class ClientService {

    private final ClientRepository clientRepository;

    public ClientService(ClientRepository clientRepository){
        this.clientRepository = clientRepository;
    }

    public List<ClientModel> getAll(){
        return this.clientRepository.findAll();
    }
    
    public Optional<ClientModel> getById(Long id){//optional sinaliza que nenhum valor pode ser encontrado.
        return this.clientRepository.findById(id);
    }

    public ClientModel createClient(ClientModel clientModel){
        return this.clientRepository.save(clientModel);
    }

    @Transactional
    public Optional<ClientModel> updateClient(ClientModel clientModel, Long id){
        //setar coisas se existem no objeto do user buscado pelo id
        Optional<ClientModel> clientObject = this.clientRepository.findById(id);

        //Metodo não escaavel sem mapStruct
        return clientObject.map(clientMap -> {
                if(clientModel.getNome() != null){
                    clientMap.setNome(clientModel.getNome());
                }

                if(clientModel.getEmail() != null){
                    clientMap.setEmail(clientModel.getEmail());
                }
                if(clientModel.getIdade() != null){
                    clientMap.setIdade(clientModel.getIdade());
                }

                return clientMap;

        });

    }

}


