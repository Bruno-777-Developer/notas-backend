package br.com.sonner.notas.models;

import javax.persistence.*;
import java.io.Serializable;

    @Entity
    @Table(name = "contribuinte")
    public class Contribuinte implements Serializable {

        private static final long serialVersionUID = 1L;

        @Id
        @GeneratedValue(strategy= GenerationType.IDENTITY)
        private long id;

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
