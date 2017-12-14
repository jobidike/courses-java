package com.coursesjava;

public class CourseTopic {

	private Long id; // key
	private String name; // value
	private String description;
	private String instructor;

	public CourseTopic(Long id, String name, String description, String instructor) {

		this.id = id;
		this.name = name;
		this.description = description;
		this.instructor = instructor;
	}

	public CourseTopic(String name, String description, String instructor) {
		this.name = name;
		this.description = description;
		this.instructor = instructor;
		id = (Long)(long)(Math.random() * 1000);
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public String getInstructor() {
		return instructor;
	}

}
