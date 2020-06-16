package app.web.drjackycv.omdbmultiplatform.presentation.mapper

import app.web.drjackycv.omdbmultiplatform.presentation.entity.MovieUI
import app.web.drjackycv.omdbmultiplatform.shared.data.base.mapper.Mapper
import app.web.drjackycv.omdbmultiplatform.shared.data.entity.Movie

class MoviesMapper : Mapper<List<Movie>, List<MovieUI>> {

    override fun mapTo(response: List<Movie>): List<MovieUI> = response.map {
        MovieUI(
            title = it.title,
            year = it.year,
            imdbID = it.imdbID,
            type = it.type,
            poster = it.poster
        )
    }

}