package br.com.sonner.notas.models;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "TB_CadastroNF")
public class CadastroNotas implements Serializable {
	
private static final long serialVersionUID = 1L;

@Id
@GeneratedValue(strategy= GenerationType.AUTO)
private long id;

private String contribuinte;

private long numero;

private Date data;

public long getId() {
	return id;
}

public void setId(long id) {
	this.id = id;
}

public String getContribuinte() {
	return contribuinte;
}

public void setContribuinte(String contribuinte) {
	this.contribuinte = contribuinte;
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

}
