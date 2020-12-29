package br.com.sonner.notas.resources;
import br.com.sonner.notas.models.Produtos;
import br.com.sonner.notas.repository.ProdutoRepository;
import org.springframework.web.bind.annotation.*;

@RestController // Classe API REST e vai receber a requisições http.
@RequestMapping(value = "/cadastro") // URI Padrão para a API
public class ProdutoResources {
    final // para utilizar os métodos para se conectar com o Banco de Dados.
    ProdutoRepository produtoRepository;

    public ProdutoResources(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    @GetMapping("/produtos") // Método que lista todos os produtos salvos no Banco de Dados
    public Object listaProdutos() {
        return produtoRepository.findAll();// Retorno
        //http://localhost:8080/cadastro/notas  link da pagina Web.
    }

    @GetMapping("/produto/{id}") // Lista um único produto pelo código do Id = (1, 2, 3 ... )
    public Produtos listaProduto(@PathVariable(value = "id") long id){
        return produtoRepository.findById(id);// Retorna a pesquisa feita pelo Id.
        //http://localhost:8080/cadastro/produto/1  link da pagina Web.
    }

//    @PostMapping("/produto") // Recebe um produto para salvar - O Produto vem no corpo da requisição. @RequestBody
//    public Produtos salvaProdutoUnico(@RequestBody Produtos produtos){
//        return produtoRepository.save(produtos);// Retorna uma nota cadastrada que foi salva
//        //http://localhost:8080/cadastro/produto
//    }

}