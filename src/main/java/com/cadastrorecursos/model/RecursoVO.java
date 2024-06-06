package com.cadastrorecursos.model;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;
import java.util.Objects;

@Entity(name = "recurso")
public class RecursoVO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_RECURSO")
    private Long idRecurso;
    @Column(name = "DS_NOME_INTERNO")
    private String dsNomeInterno;
    @Column(name = "DS_NOME_EXIBICAO")
    private String dsNomeExibicao;
    @Column(name = "DS_DESCRICAO")
    private String dsDescricao;
    @Column(name = "ID_VERSAO")
    @Version
    private Long idVersao;
    @Column(name = "DATA_CADASTRO", updatable = false)
    @CreationTimestamp
    private LocalDateTime dataCadastro;
    @Column(name = "DATA_ATUALIZACAO")
    @UpdateTimestamp
    private LocalDateTime dataAtualizacao;

    public Long getIdRecurso() {
        return idRecurso;
    }

    public void setIdRecurso(Long idRecurso) {
        this.idRecurso = idRecurso;
    }

    public String getDsNomeInterno() {
        return dsNomeInterno;
    }

    public void setDsNomeInterno(String dsNomeInterno) {
        this.dsNomeInterno = dsNomeInterno;
    }

    public String getDsNomeExibicao() {
        return dsNomeExibicao;
    }

    public void setDsNomeExibicao(String dsNomeExibicao) {
        this.dsNomeExibicao = dsNomeExibicao;
    }

    public String getDsDescricao() {
        return dsDescricao;
    }

    public void setDsDescricao(String dsDescricao) {
        this.dsDescricao = dsDescricao;
    }

    public Long getIdVersao() {
        return idVersao;
    }

    public void setIdVersao(Long idVersao) {
        this.idVersao = idVersao;
    }

    public LocalDateTime getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalDateTime dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public LocalDateTime getDataAtualizacao() {
        return dataAtualizacao;
    }

    public void setDataAtualizacao(LocalDateTime dataAtualizacao) {
        this.dataAtualizacao = dataAtualizacao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RecursoVO recursoVO)) return false;
        return Objects.equals(idRecurso, recursoVO.idRecurso);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(idRecurso);
    }
}
