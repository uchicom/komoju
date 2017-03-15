// (c) 2016 uchicom
package com.uchicom.komoju.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author uchicom: Shigeki Uchiyama
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Payment {

	private String id;

	private String type;

	private String resource;

	private Data data;

	@JsonProperty("created_at")
	private String createdAt;

	/**
	 * idを取得します.
	 *
	 * @return id
	 */
	public String getId() {
		return id;
	}

	/**
	 * idを設定します.
	 *
	 * @param id id
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * typeを取得します.
	 *
	 * @return type
	 */
	public String getType() {
		return type;
	}

	/**
	 * typeを設定します.
	 *
	 * @param type type
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * resourceを取得します.
	 *
	 * @return resource
	 */
	public String getResource() {
		return resource;
	}

	/**
	 * resourceを設定します.
	 *
	 * @param resource resource
	 */
	public void setResource(String resource) {
		this.resource = resource;
	}

	/**
	 * dataを取得します.
	 *
	 * @return data
	 */
	public Data getData() {
		return data;
	}

	/**
	 * dataを設定します.
	 *
	 * @param data data
	 */
	public void setData(Data data) {
		this.data = data;
	}

	/**
	 * createdAtを取得します.
	 *
	 * @return createdAt
	 */
	public String getCreatedAt() {
		return createdAt;
	}

	/**
	 * createdAtを設定します.
	 *
	 * @param createdAt createdAt
	 */
	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

}
