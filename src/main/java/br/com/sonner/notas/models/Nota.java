package br.com.sonner.notas.models;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "nota")
public class Nota implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private long numero;

    private long contribuinte;

    private String descricao;

    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date data;

    @OneToMany(mappedBy="nota", fetch=FetchType.LAZY, cascade = CascadeType.ALL)
	private List<NotaItem> itens;




    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getNumero() {
        return numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

	public long getContribuinte() {
		return contribuinte;
	}

	public void setContribuinte(long contribuinte) {
		this.contribuinte = contribuinte;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public List<NotaItem> getItens() {
		return itens;
	}

	public void setItens(List<NotaItem> itens) {
		this.itens = itens;
	}
}
