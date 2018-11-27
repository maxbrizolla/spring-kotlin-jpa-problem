package com.example.ktl.entity


import com.fasterxml.jackson.annotation.JsonIgnore

import javax.persistence.*
import java.io.Serializable
import java.util.Objects

@Entity
@Table(name = "SITUACAO")
data class Situacao (

    @Id
    @Column(name = "ID")
    val id: Long,

    @Column(name = "DESCRICAO")
    val descricao: String = "",

    @Column(name = "TIPOSITUACAO_ID")
    val tipoSituacaoId: Long? = null,

    @ManyToOne(fetch = FetchType.LAZY, optional = true)
    @JoinColumn(name = "TIPOSITUACAO_ID", referencedColumnName = "ID", insertable = false, updatable = false)
    val tipoSituacao: TipoSituacao? = null
)
