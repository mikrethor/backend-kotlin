package com.ablx.daycare.backend.entity

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
internal data class Educator(
        @field: Id @field: GeneratedValue var Id : Long = 0, //Primary Key
        var name:String = "",
        var surname:String = ""
)