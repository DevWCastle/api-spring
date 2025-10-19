package DevWCastle.api_spring.Client.Controller;

import DevWCastle.api_spring.Client.Model.ClientModel;
import DevWCastle.api_spring.Client.Service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@RestController// definindo que a classe é um controller rest
@RequestMapping("/clientes")
public class ClientController {

    private final ClientService clientService;

    //Autowired faz o negocio abaixo de injeção de dependencia
    public ClientController(ClientService clientService){
       this.clientService = clientService;
    }

    @GetMapping
    public List<ClientModel> getAll(){return this.clientService.getAll();}

    @GetMapping(value="/{id}")//ja considera o /clientes do controller então: /clientes/{id}
    public Optional<ClientModel> getById(@PathVariable Long id){ return this.clientService.getById(id);}

    @PostMapping
    public ClientModel create(@RequestBody ClientModel clientModel){return this.clientService.createClient(clientModel);}

    @PutMapping(value="/atualizar/{id}")
    public Optional<ClientModel> update(@RequestBody ClientModel clientModel, @PathVariable Long id){
        return this.clientService.updateClient(clientModel, id);
    }

    @DeleteMapping(value = "/deletar/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
       this.clientService.deleteClient(id);
       return ResponseEntity.noContent().build();
    }



}
