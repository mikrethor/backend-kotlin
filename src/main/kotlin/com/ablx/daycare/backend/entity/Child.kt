package com.ablx.daycare.backend.entity

import javax.persistence.*

@Entity
internal data class Child(
        @field: Id @field: GeneratedValue var Id : Long = 0, //Primary Key
        var name:String = "",
        var surname:String = "",
        @OneToMany(fetch = FetchType.EAGER, mappedBy = "child", cascade = arrayOf(CascadeType.ALL), orphanRemoval = true)
        var children:List<Sumup>
)