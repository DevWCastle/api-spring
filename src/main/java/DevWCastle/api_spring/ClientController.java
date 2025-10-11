package DevWCastle.api_spring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController// definindo que a classe é um controller rest
public class ClientController {

    @GetMapping("/home") //Anotação para definir rotas gets
    public String home(){
        return  "Tudo na paz tropa";
    }


}
