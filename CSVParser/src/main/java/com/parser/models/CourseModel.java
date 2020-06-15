package com.parser.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({ "title", "author", "price", "frozen", "test2", "test1", "str1", "str2", "str3", "ryp" })
public class CourseModel implements Model {

	private String title;
	private Test2 test2;
	private String author;
	private int price;
	private boolean frozen;
	private Test1 test1 = Test1.BONY;
	private String str1;
	private String str2;
	private String str3;
	private boolean ryp;

	public boolean isFrozen() {
		return frozen;
	}

	public void setFrozen(boolean frozen) {
		this.frozen = frozen;
	}

	public Test2 getTest2() {
		return test2;
	}

	public void setTest2(Test2 test2) {
		this.test2 = test2;
	}

	public Test1 getTest1() {
		return test1;
	}

	public void setTest1(Test1 test1) {
		this.test1 = null == test1 ? Test1.BONY : test1;
	}

	public String getStr1() {
		return str1;
	}

	public void setStr1(String str1) {
		this.str1 = str1;
	}

	public String getStr2() {
		return str2;
	}

	public void setStr2(String str2) {
		this.str2 = str2;
	}

	public String getStr3() {
		return str3;
	}

	public void setStr3(String str3) {
		this.str3 = str3;
	}

	public CourseModel() {
		this("", "");
	}

//
	public CourseModel(String title, String author) {
		this(title, author, 0, false ,Test2.BLE,Test1.BONY, "str1", "str2", "str3", false);
	}
//	public CourseModel(String title, String author) {
//		this(title, author, 0);
//	}

//	public CourseModel(@JsonProperty("title") String title, @JsonProperty("author") String author,
//			@JsonProperty("price") int price) {
//		this.title = title;
//		this.author = author;
//		this.price = price;
//	}

	public CourseModel(@JsonProperty("title") String title,
			@JsonProperty("author") String author, @JsonProperty("price") int price,
			@JsonProperty("frozen") boolean frozen,@JsonProperty("test2") Test2 test2 ,@JsonProperty("test1") Test1 test1,
			@JsonProperty("str1") String str1, @JsonProperty("str2") String str2, @JsonProperty("str3") String str3, @JsonProperty("ryp") boolean ryp) {
		this.title = title;
		this.test2 = test2;
		this.author = author;
		this.price = price;
		this.frozen = frozen;
		this.test1 = test1;
		this.str1 = str1;
		this.str2 = str2;
		this.str3 = str3;
		this.ryp = ryp;
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
	
	public void setRyp(boolean ryp) {
		this.ryp = ryp;
	}
	
	public boolean isRyp() {
		return ryp;
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
		builder.append(", test2=");
		builder.append(test2);
		builder.append(", author=");
		builder.append(author);
		builder.append(", price=");
		builder.append(price);
		builder.append(", frozen=");
		builder.append(frozen);
		builder.append(", test1=");
		builder.append(test1);
		builder.append(", str1=");
		builder.append(str1);
		builder.append(", str2=");
		builder.append(str2);
		builder.append(", str3=");
		builder.append(str3);
		builder.append(", ryp=");
		builder.append(ryp);
		builder.append("]");
		return builder.toString();
	}





}
