package com.coursera.Service;
import java.sql.Date;
import java.sql.Time;
import java.time.LocalDate;
import java.util.ArrayList;

public class Course {
	private int CourseID;
	private String Name;
	private String Field;
	private LocalDate StartDate;
	private LocalDate EndDate;
	private Date Duration;
	private ArrayList<Section> Sections =new ArrayList<Section>();
	private ArrayList<Announcement> Announcements = new ArrayList<Announcement>();
	public static int NumberOfCourses=0;
	private int NumberOfStudents;
	private int NumberOfInstructors;
	
	public Course(int CourseID,String Name,String Field,Date StartDate,Date EndDate,Date Duration,int NumberOfStudents,int NumberOfInstructors){
		NumberOfCourses+=1;
		this.CourseID=CourseID;
		this.Name=Name;
		this.Field=Field;
		this.StartDate=StartDate.toLocalDate();
		this.EndDate=EndDate.toLocalDate();
		this.Duration=Duration;
		this.NumberOfStudents=NumberOfStudents;
		this.NumberOfInstructors=NumberOfInstructors;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getField() {
		return Field;
	}

	public void setField(String field) {
		Field = field;
	}

	public LocalDate getStartDate() {
		return StartDate;
	}

	public void setStartDate(Date startDate) {
		StartDate = startDate.toLocalDate();
	}

	public LocalDate getEndDate() {
		return EndDate;
	}

	public void setEndDate(Date endDate) {
		EndDate = endDate.toLocalDate();
	}

	public Date getDuration() {
		return Duration;
	}

	public void setDuration(Date duration) {
		Duration = duration;
	}

	public int getCourseID() {
		return CourseID;
	}
	
	
	
}