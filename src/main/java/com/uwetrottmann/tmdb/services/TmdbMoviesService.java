
package com.uwetrottmann.tmdb.services;

import com.uwetrottmann.tmdb.entities.Movie;

import retrofit.http.GET;
import retrofit.http.Path;
import retrofit.http.Query;

public interface TmdbMoviesService {

    /**
     * Get the basic movie information for a specific movie id.
     * 
     * @param id
     */
    @GET("/movie/{id}")
    Movie summary(
            @Path("id")
            int id);

    /**
     * Get the basic movie information for a specific movie id. Allows to set
     * the language. Attention: will not default to English, but instead will
     * return empty field.
     * 
     * @param languageCode ISO 639-1 code.
     */
    @GET("/movie/{id}")
    Movie summary(
            @Path("id")
            int id,
            @Query("language")
            String languageCode);
}
