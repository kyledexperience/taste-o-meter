package co.apis.tasteometer.entity;

import java.util.List;

public class MovieResponse {

	private List<Results> results;

	public List<Results> getResults() {
		return results;
	}

	public void setResults(List<Results> results) {
		this.results = results;
	}

	@Override
	public String toString() {
		return "MovieResponse [results=" + results + "]";
	}

}
