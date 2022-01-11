package com.kitsu.models;

import java.util.Date;

import lombok.Data;

//import com.fasterxml.jackson.databind.ObjectMapper; // version 2.11.1
// import com.fasterxml.jackson.annotation.JsonProperty; // version 2.11.1

@Data
public class Episodes {

	/*
	 * ObjectMapper om = new ObjectMapper(); Root root = om.readValue(myJsonString),
	 * Root.class);
	 */
	public class Links {
		private String self;
		private String related;
	}

	public class Titles {
		private String en_jp;
		private String en_us;
		private String ja_jp;
	}

	public class Dimensions {
	}

	public class Meta {
		private Dimensions dimensions;
	}

	public class Thumbnail {
		private String original;
		private Meta meta;
	}

	public class Attributes {
		private Date createdAt;
		private Date updatedAt;
		private String synopsis;
		private String description;
		private Titles titles;
		private String canonicalTitle;
		private int seasonNumber;
		private int number;
		private int relativeNumber;
		private String airdate;
		private int length;
		private Thumbnail thumbnail;
	}

	public class Media {
		private Links links;
	}

	public class Videos {
		private Links links;
	}

	public class Relationships {
		private Media media;
		private Videos videos;
	}

	public class Data {
		private String id;
		private String type;
		private Links links;
		private Attributes attributes;
		private Relationships relationships;
	}

	public class Root {
		private Data data;
	}

}