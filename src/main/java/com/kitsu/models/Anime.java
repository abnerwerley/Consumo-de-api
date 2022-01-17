package com.kitsu.models;

import java.util.ArrayList;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Anime {

	public class Links {
		private String self;
		private String related;
	}

	public class Titles {
		private String en;
		private String en_jp;
		private String ja_jp;
	}

	public class RatingFrequencies {
		@JsonProperty("2")
		private String _2;
		@JsonProperty("3")
		private String _3;
		@JsonProperty("4")
		private String _4;
		@JsonProperty("5")
		private String _5;
		@JsonProperty("6")
		private String _6;
		@JsonProperty("7")
		private String _7;
		@JsonProperty("8")
		private String _8;
		@JsonProperty("9")
		private String _9;
		@JsonProperty("10")
		private String _10;
		@JsonProperty("11")
		private String _11;
		@JsonProperty("12")
		private String _12;
		@JsonProperty("13")
		private String _13;
		@JsonProperty("14")
		private String _14;
		@JsonProperty("15")
		private String _15;
		@JsonProperty("16")
		private String _16;
		@JsonProperty("17")
		private String _17;
		@JsonProperty("18")
		private String _18;
		@JsonProperty("19")
		private String _19;
		@JsonProperty("20")
		private String _20;
	}

	public class Tiny {
		private int width;
		private int height;
	}

	public class Large {
		private int width;
		private int height;
	}

	public class Small {
		private int width;
		private int height;
	}

	public class Medium {
		private int width;
		private int height;
	}

	public class Dimensions {
		private Tiny tiny;
		private Large large;
		private Small small;
		private Medium medium;
	}

	public class Meta {
		private Dimensions dimensions;
	}

	public class PosterImage {
		private String tiny;
		private String large;
		private String small;
		private String medium;
		private String original;
		private Meta meta;
	}

	public class CoverImage {
		private String tiny;
		private String large;
		private String small;
		private String original;
		private Meta meta;
	}

	public class Attributes {
		private Date createdAt;
		private Date updatedAt;
		private String slug;
		private String synopsis;
		private String description;
		private int coverImageTopOffset;
		private Titles titles;
		private String canonicalTitle;
		private ArrayList<String> abbreviatedTitles;
		private String averageRating;
		private RatingFrequencies ratingFrequencies;
		private int userCount;
		private int favoritesCount;
		private String startDate;
		private String endDate;
		private Object nextRelease;
		private int popularityRank;
		private int ratingRank;
		private String ageRating;
		private String ageRatingGuide;
		private String subtype;
		private String status;
		private Object tba;
		private PosterImage posterImage;
		private CoverImage coverImage;
		private int episodeCount;
		private int episodeLength;
		private int totalLength;
		private String youtubeVideoId;
		private String showType;
		private boolean nsfw;
	}

	public class Genres {
		private Links links;
	}

	public class Categories {
		private Links links;
	}

	public class Castings {
		private Links links;
	}

	public class Installments {
		private Links links;
	}

	public class Mappings {
		private Links links;
	}

	public class Reviews {
		private Links links;
	}

	public class MediaRelationships {
		private Links links;
	}

	public class Characters {
		private Links links;
	}

	public class Staff {
		private Links links;
	}

	public class Productions {
		private Links links;
	}

	public class Quotes {
		private Links links;
	}

	public class Episodes {
		private Links links;
	}

	public class StreamingLinks {
		private Links links;
	}

	public class AnimeProductions {
		private Links links;
	}

	public class AnimeCharacters {
		private Links links;
	}

	public class AnimeStaff {
		private Links links;
	}

	public class Relationships {
		private Genres genres;
		private Categories categories;
		private Castings castings;
		private Installments installments;
		private Mappings mappings;
		private Reviews reviews;
		private MediaRelationships mediaRelationships;
		private Characters characters;
		private Staff staff;
		private Productions productions;
		private Quotes quotes;
		private Episodes episodes;
		private StreamingLinks streamingLinks;
		private AnimeProductions animeProductions;
		private AnimeCharacters animeCharacters;
		private AnimeStaff animeStaff;
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
