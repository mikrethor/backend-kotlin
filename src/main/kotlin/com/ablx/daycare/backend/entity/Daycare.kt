package com.ablx.daycare.backend.entity

import javax.persistence.*

@Entity
internal data class Daycare(
        @field: Id @field: GeneratedValue var Id : Long = 0, //Primary Key
        var name : String = "", //Column
        @OneToMany(mappedBy = "daycare", cascade = arrayOf(CascadeType.ALL), fetch = FetchType.LAZY)
        var educators: List<Educator> = emptyList()
//        ,
//        @OneToMany(mappedBy = "daycare", cascade = arrayOf(CascadeType.ALL), fetch = FetchType.LAZY)
//        var children: List<Child> = emptyList()

)