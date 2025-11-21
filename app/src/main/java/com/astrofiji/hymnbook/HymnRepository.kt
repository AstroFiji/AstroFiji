package com.astrofiji.hymnbook

data class Hymn(
    val number: Int,
    val title: String,
    val lyrics: String
)

object HymnRepository {
    val hymns: List<Hymn> = (1..320).map { number ->
        Hymn(
            number = number,
            title = "Hymn ${'$'}number",
            lyrics = ""
        )
    }
}
