package com.cadastrorecursos.model;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;
import java.util.Objects;

@Entity(name = "grupo_recurso_recurso")
public class GrupoRecursoRecursoVO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_GRUPO_RECURSO_RECURSO")
    private Long idGrupoRecursoRecurso;
    @ManyToOne
    @JoinColumn(name = "ID_RECURSO")
    private RecursoVO recurso;
    @ManyToOne
    @JoinColumn(name = "ID_GRUPO_RECURSO")
    private GrupoRecursoVO grupoRecurso;
    @Column(name = "ID_VERSAO")
    @Version
    private Long idVersao;
    @Column(name = "DATA_CADASTRO", updatable = false)
    @CreationTimestamp
    private LocalDateTime dataCadastro;
    @Column(name = "DATA_ATUALIZACAO")
    @UpdateTimestamp
    private LocalDateTime dataAtualizacao;

    public Long getIdGrupoRecursoRecurso() {
        return idGrupoRecursoRecurso;
    }

    public void setIdGrupoRecursoRecurso(Long idGrupoRecursoRecurso) {
        this.idGrupoRecursoRecurso = idGrupoRecursoRecurso;
    }

    public RecursoVO getRecurso() {
        return recurso;
    }

    public void setRecurso(RecursoVO recurso) {
        this.recurso = recurso;
    }

    public GrupoRecursoVO getGrupoRecurso() {
        return grupoRecurso;
    }

    public void setGrupoRecurso(GrupoRecursoVO grupoRecurso) {
        this.grupoRecurso = grupoRecurso;
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
        if (!(o instanceof GrupoRecursoRecursoVO that)) return false;
        return Objects.equals(idGrupoRecursoRecurso, that.idGrupoRecursoRecurso);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(idGrupoRecursoRecurso);
    }
}
