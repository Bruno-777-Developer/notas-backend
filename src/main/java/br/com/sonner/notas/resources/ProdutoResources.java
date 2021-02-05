package br.com.sonner.notas.resources;

import br.com.sonner.notas.models.Produto;
import br.com.sonner.notas.repository.ProdutoRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/produto")

public class ProdutoResources {

    final

    ProdutoRepository  produtoRepository;

    public ProdutoResources(ProdutoRepository produtoRepository){ this.produtoRepository = produtoRepository;}
    @GetMapping("/")
    public List<> listaProdutos(){
        return produtoRepository.findAll();
    }
    @GetMapping("/{id}")
    public Produto listaProduto(@PathVariable(value = "id") long id){
        Produto produto =  produtoRepository.findById(id);
        return produto;
    }



}
