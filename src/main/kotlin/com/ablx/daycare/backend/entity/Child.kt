package com.ablx.daycare.backend.entity

import javax.persistence.*

@Entity
internal data class Child(
        @field: Id @field: GeneratedValue var Id: Long = 0, //Primary Key
        var firstname: String = "",
        var lastname: String = "",
        @OneToMany(fetch = FetchType.EAGER, mappedBy = "child", cascade = arrayOf(CascadeType.ALL), orphanRemoval = true)
        var sumups: List<Sumup> = emptyList()
//        ,
//        @ManyToOne(fetch = FetchType.EAGER)
//        @JoinColumn(name = "daycare_id")
//        var daycare: Daycare = Daycare()
)