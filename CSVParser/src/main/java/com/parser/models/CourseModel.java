package com.parser.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({ "title", "author", "price" })
public class CourseModel {

	private String title;
	private String author;
	private int price;

	public CourseModel(@JsonProperty("title") String title, @JsonProperty("author") String author,
			@JsonProperty("price") int price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public boolean equals(Object obj) {
		CourseModel courseModel = (CourseModel) obj;
		return (courseModel.author != null && this.author != null ? this.author.equals(courseModel.author)
				: courseModel.author == null && this.author == null ? true : false) && (this.price == courseModel.price)
				&& (this.title != null && courseModel.title != null ? this.title.equals(courseModel.title)
						: this.title == null && courseModel.title == null ? true : false);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CourseModel [title=");
		builder.append(title);
		builder.append(", author=");
		builder.append(author);
		builder.append(", price=");
		builder.append(price);
		builder.append("]");
		return builder.toString();
	}

}
