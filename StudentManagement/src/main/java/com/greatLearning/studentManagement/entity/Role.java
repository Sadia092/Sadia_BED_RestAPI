package com.greatLearning.studentManagement.entity;

import lombok.Data;


import javax.persistence.*;

@Entity
@Table(name="roles")
@Data
public class Role {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;

    @Column(name="name")
    private String name;

	public Role(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Role() {
		super();
	
	}

	@Override
	public String toString() {
		return "Role [id=" + id + ", name=" + name + "]";
	}

	
	
	
	
}
