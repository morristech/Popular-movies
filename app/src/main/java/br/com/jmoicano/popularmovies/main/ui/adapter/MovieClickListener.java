package br.com.jmoicano.popularmovies.main.ui.adapter;

import br.com.jmoicano.popularmovies.services.movies_models.MovieResultModel;

public interface MovieClickListener {
    void onMovieClick(MovieResultModel movie);
}