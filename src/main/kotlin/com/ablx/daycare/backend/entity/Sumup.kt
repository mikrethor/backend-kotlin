package com.ablx.daycare.backend.entity

import java.util.*

import com.ablx.daycare.backend.objects.Level
import javax.persistence.*

@Entity
internal data class Sumup(
        @field: Id @field: GeneratedValue var Id : Long = 0, //Primary Key
        @ManyToOne(fetch = FetchType.LAZY)
        @JoinColumn(name = "ID_CHILD", referencedColumnName = "ID")
        var child:Child,
        var day:Calendar,
        var mood:Level,
        var sleep:Level,
        var appetite:Level
)