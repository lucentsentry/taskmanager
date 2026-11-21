package com.daniel.taskmanager.model;
import jakarta.persistence.*; import jakarta.validation.constraints.*; import java.time.LocalDate;
@Entity public class Task {
@Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Integer id;
@NotBlank private String title; private String description; @NotNull private LocalDate dueDate; private boolean completed;
public Task() {} public Task(Integer id, String title, String description, LocalDate dueDate, boolean completed) { this.id=id; this.title=title; this.description=description; this.dueDate=dueDate; this.completed=completed; } public Integer getId(){return id;} public void setId(Integer v){id=v;} public String getTitle(){return title;} public void setTitle(String v){title=v;} public String getDescription(){return description;} public void setDescription(String v){description=v;} public LocalDate getDueDate(){return dueDate;} public void setDueDate(LocalDate v){dueDate=v;} public boolean isCompleted(){return completed;} public void setCompleted(boolean v){completed=v;}}

