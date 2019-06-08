package co.apis.tasteometer;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import co.apis.tasteometer.entity.MovieResponse;
import co.apis.tasteometer.entity.Results;

@Component
public class ApiService {

	RestTemplate restTemplate = new RestTemplate();

	@Value("${api_key}")
	private String api_key;

	public List<Results> movies(Integer page) {

		String url = "https://api.themoviedb.org/3/discover/movie?page=" + String.valueOf(page)
				+ "&language=en-US&include_video=false&include_adult=false&sort_by=revenue.desc&api_key=" + api_key;

		MovieResponse response = restTemplate.getForObject(url, MovieResponse.class);

		return response.getResults();

	}

}
