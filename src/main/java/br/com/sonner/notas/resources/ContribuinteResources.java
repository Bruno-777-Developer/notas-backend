package br.com.sonner.notas.resources;

import br.com.sonner.notas.models.Contribuinte;
import br.com.sonner.notas.repository.ContribuinteRepository;
import org.springframework.web.bind.annotation.*;

@RestController // Classe API REST e vai receber a requisições http.
@RequestMapping(value = "/cadastro") // URI Padrão para a API
public class ContribuinteResources {
    final // para utilizar os métodos para se conectar com o Banco de Dados.
    ContribuinteRepository contribuinteRepository;

    public ContribuinteResources(ContribuinteRepository contribuinteRepository) {
        this.contribuinteRepository = contribuinteRepository;
    }

    @GetMapping("/contribuintes") // Método que lista todos os contribuintes salvos no Banco de Dados
    public Object listaContribuintes() {
        return contribuinteRepository.findAll();// Retorno
        //http://localhost:8080/cadastro/contribuintes  link da pagina Web.
    }

    @GetMapping("/contribuinte/{id}") // Lista um único contribuinte pelo código do Id = (1, 2, 3 ... )
    public Contribuinte listaContribuinteUnico(@PathVariable(value = "id") long id) {
        return contribuinteRepository.findById(id);// Retorna a pesquisa feita pelo Id.
        //http://localhost:8080/cadastro/contribuinte/1  link da pagina Web.
    }

    @PostMapping("/contribuinte") // Recebe um produto para salvar - O Produto vem no corpo da requisição. @RequestBody
    public Contribuinte salvaContribuinteUnico(@RequestBody Contribuinte contribuinte) {
        return contribuinteRepository.save(contribuinte);// Retorna uma nota cadastrada que foi salva
        //http://localhost:8080/cadastro/contribuinte
    }
}