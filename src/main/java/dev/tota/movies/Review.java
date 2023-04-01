package dev.tota.movies;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document(collection = "reviews")
@Data

public class Review {
	private ObjectId id;
	private String body;

	public Review(String body) {
		super();
		this.body = body;
	}

	public Review() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ObjectId getId() {
		return id;
	}

	public void setId(ObjectId id) {
		this.id = id;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

}
