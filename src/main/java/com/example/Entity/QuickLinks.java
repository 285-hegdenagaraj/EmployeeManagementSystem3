package com.example.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Entity
@Document
public class QuickLinks {
	@Id
	private String Link;

	public String getLink() {
		return Link;
	}

	public void setLink(String link) {
		Link = link;
	}

	public QuickLinks(String link) {
		super();
		Link = link;
	}
	public QuickLinks() {
		
	}

	@Override
	public String toString() {
		return "QuickLinks [Link=" + Link + "]";
	}

}
