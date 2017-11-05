package com.ablx.daycare.backend.`object`

enum class Level(val level: Int ) {
    GOOD(10),
    MEDIUM(5),
    BAD(0);

    companion object {
        fun fromCode(level: Int): Level {
            when (level) {
                0 -> return BAD
                5 -> return MEDIUM
                10 -> return GOOD
                else ->
                    throw IllegalArgumentException("Invalid level " + level)
            }

        }
    }


}