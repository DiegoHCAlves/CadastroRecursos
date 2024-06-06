package com.cadastrorecursos.model;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;
import java.util.Objects;

@Entity(name = "grupo_recurso")
public class GrupoRecursoVO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_GRUPO_RECURSO")
    private Long idGrupoRecurso;
    @Column(name = "DS_NOME")
    private String dsNome;
    @Column(name = "DS_DESCRICAO")
    private String dsDescricao;
    @Column(name = "DATA_CADASTRO", updatable = false)
    @CreationTimestamp
    private LocalDateTime dataCadastro;
    @UpdateTimestamp
    @Column(name = "DATA_ATUALIZACAO")
    private LocalDateTime dataAtualizacao;
    @Version
    @Column(name = "ID_VERSAO")
    private Integer versao;

    public Long getIdGrupoRecurso() {
        return idGrupoRecurso;
    }

    public void setIdGrupoRecurso(Long idGrupoRecurso) {
        this.idGrupoRecurso = idGrupoRecurso;
    }

    public String getDsNome() {
        return dsNome;
    }

    public void setDsNome(String dsNome) {
        this.dsNome = dsNome;
    }

    public String getDsDescricao() {
        return dsDescricao;
    }

    public void setDsDescricao(String dsDescricao) {
        this.dsDescricao = dsDescricao;
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

    public Integer getVersao() {
        return versao;
    }

    public void setVersao(Integer versao) {
        this.versao = versao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof GrupoRecursoVO that)) return false;
        return Objects.equals(idGrupoRecurso, that.idGrupoRecurso);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(idGrupoRecurso);
    }
}
