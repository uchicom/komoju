// (c) 2016 uchicom
package com.uchicom.komoju.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author uchicom: Shigeki Uchiyama
 *
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class Metadata {

	@JsonProperty("komoju_buys_uuid")
	private String komojuBuysUuid;

	/**
	 * komojuBuysUuidを取得します.
	 *
	 * @return komojuBuysUuid
	 */
	public String getKomojuBuysUuid() {
		return komojuBuysUuid;
	}

	/**
	 * komojuBuysUuidを設定します.
	 *
	 * @param komojuBuysUuid komojuBuysUuid
	 */
	public void setKomojuBuysUuid(String komojuBuysUuid) {
		this.komojuBuysUuid = komojuBuysUuid;
	}
}
