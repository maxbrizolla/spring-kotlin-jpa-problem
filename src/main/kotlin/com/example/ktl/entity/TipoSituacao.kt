package com.example.ktl.entity


import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "TIPOSITUACAO")
open class TipoSituacao(
        @Id
        @Column(name = "ID")
        open val id: Long? = null,

        @Column(name = "DESCRICAO")
        open val descricao: String? = null
)