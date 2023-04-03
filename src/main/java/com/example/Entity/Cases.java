package com.example.Entity;
import javax.persistence.Entity;
import javax.persistence.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Entity
@Document
public class Cases {

	@Id
	private String Name;

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public Cases(String name) {
		super();
		Name = name;
	}
	public Cases() {

	}

	@Override
	public String toString() {
		return "Cases [Name=" + Name + "]";
	}
}
