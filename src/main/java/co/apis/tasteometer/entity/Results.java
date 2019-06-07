package co.apis.tasteometer.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Results {

	private String title;

	@JsonProperty("release_date")
	private String releaseDate;

	@JsonProperty("poster_path")
	private String poster;

	public String getPoster() {
		return poster;
	}

	public void setPoster(String poster) {
		this.poster = poster;
	}

	public String getTitle() {
		return title;
	}

	public String getReleaseDate() {
		return releaseDate;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}

}
