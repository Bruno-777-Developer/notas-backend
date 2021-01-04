package br.com.sonner.notas.models;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;
import java.io.Serializable;

    @Entity
    @Table(name = "contribuinte")
    //@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
    public class Contribuinte implements Serializable {

        private static final long serialVersionUID = 1L;

        @Id // Anotação Id
        @GeneratedValue(strategy= GenerationType.IDENTITY)
        private long id; // Toda Anotação tem que estar próxima do objeto.

        private long codigo;

        private String nome;

        public long getId() {
            return id;
        }

        public void setId(long id) {
            this.id = id;
        }

        public long getCodigo() {
            return codigo;
        }

        public void setCodigo(long codigo) {
            this.codigo = codigo;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }
    }
