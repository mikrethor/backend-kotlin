package com.ablx.daycare.backend.`object`

enum class Level(val level: Int ) {
    GOOD(10),
    MEDIUM(5),
    BAD(0);

    fun fromCode(level: Int): Level {
        when (level) {
            0 -> return BAD
            5 -> return MEDIUM
            10 -> return GOOD

            else ->
                // do we need this? if for nothing else it catches forgotten case
                // when enum is modified
                throw IllegalArgumentException("Invalid level " + level!!)
        }

    }
}