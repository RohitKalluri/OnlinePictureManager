package com.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="commentmodel")
public class CommentModel {
	   @Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
	  @Column(name="id")
	   private Long id;
	   @Column(name="imageid")
	   private Long imageid;
	   @Column(name="username")
	   private String username;
	   @Column(name="comment")
	   private String comment;
	   
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public CommentModel() {
		super();
	}
	public CommentModel(Long imageid, String username, String comment) {
		super();
		this.imageid = imageid;
		this.username = username;
		this.comment = comment;
	}
	public Long getImageid() {
		return imageid;
	}
	public void setImageid(Long imageid) {
		this.imageid = imageid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	   
}
