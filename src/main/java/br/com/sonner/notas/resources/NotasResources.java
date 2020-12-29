package br.com.sonner.notas.resources;

import br.com.sonner.notas.models.Nota;
import br.com.sonner.notas.repository.NotasRepository;
import org.springframework.web.bind.annotation.*;

@RestController // Classe API REST e vai receber a requisições http.
@RequestMapping(value = "/cadastro") // URI Padrão para a API
public class NotasResources {
    final // para utilizar os métodos para se conectar com o Banco de Dados.
    NotasRepository notasRepository;

    public NotasResources(NotasRepository notasRepository) {
        this.notasRepository = notasRepository;
    }

    @GetMapping("/notas") // Método que lista todos os produtos salvos no Banco de Dados
        public Object listaNotas(){
            return notasRepository.findAll();// Retorno
        //http://localhost:8080/cadastro/notas  link da pagina Web.
    }

    @GetMapping("/nota/{id}") // Lista um único produto pelo código do Id = (1, 2, 3 ... )
        public Nota listaCadastroNotaUnica(@PathVariable(value = "id") long id){
            return notasRepository.findById(id);// Retorna a pesquisa feita pelo Id.
          //http://localhost:8080/cadastro/nota/1  link da pagina Web.
            }

   @PostMapping("/nota") // Recebe um produto para salvar - O Produto vem no corpo da requisição. @RequestBody
           public Nota salvaCadastroNotaUnica(@RequestBody Nota cadastronota){
               return notasRepository.save(cadastronota);// Retorna uma nota cadastrada que foi salva
                //http://localhost:8080/cadastro/nota
    }

}
