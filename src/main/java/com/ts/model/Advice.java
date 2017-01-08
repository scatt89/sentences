package com.ts.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "advices")
public class Advice {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
//	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="adv_seq")
//	@SequenceGenerator(name = "adv_seq", sequenceName = "adv_seq", allocationSize=1)
	@Column(name="id")
	private long id;
	
	@Column(name="author")
	private String author;
	
	@Column(name="advice",length = 500)
	@NotNull
	private String advice;
	
	public Advice() {
	}

	public Advice(long id) {
		this.id = id;
	}

	public Advice(String author, String advice) {
		this.author = author;
		this.advice = advice;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getAdvice() {
		return advice;
	}

	public void setAdvice(String advice) {
		this.advice = advice;
	}
	
	@Override
	public String toString(){
		return "id: "+id+" || author: "+author+" || advice: "+advice;
	}

}
