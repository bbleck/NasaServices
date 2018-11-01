package edu.cnm.deepdive.nasaservices.service;

import edu.cnm.deepdive.nasaservices.model.Apod;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApodService {

  @GET("planetary/apod")
  Call<Apod> get(@Query("api_key") String apiKey, @Query("date") String date);

}
