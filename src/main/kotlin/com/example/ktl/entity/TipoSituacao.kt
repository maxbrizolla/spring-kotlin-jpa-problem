package com.example.ktl.entity


import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "TIPOSITUACAO")
data class TipoSituacao (
    @Id
    @Column(name = "ID")
    val id: Long? = null,

    @Column(name = "DESCRICAO")
    val descricao: String? = null
)
