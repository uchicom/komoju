// (c) 2016 uchicom
package com.uchicom.komoju.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author uchicom: Shigeki Uchiyama
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class PaymentDetails {

	private String type;

	private String email;

	private String store;

	@JsonProperty("confirmation_code")
	private String confirmationCode;

	private String receipt;

	@JsonProperty("instructions_url")
	private String instructionsUrl;

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
	 * emailを取得します.
	 *
	 * @return email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * emailを設定します.
	 *
	 * @param email email
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * storeを取得します.
	 *
	 * @return store
	 */
	public String getStore() {
		return store;
	}

	/**
	 * storeを設定します.
	 *
	 * @param store store
	 */
	public void setStore(String store) {
		this.store = store;
	}

	/**
	 * confirmationCodeを取得します.
	 *
	 * @return confirmationCode
	 */
	public String getConfirmationCode() {
		return confirmationCode;
	}

	/**
	 * confirmationCodeを設定します.
	 *
	 * @param confirmationCode confirmationCode
	 */
	public void setConfirmationCode(String confirmationCode) {
		this.confirmationCode = confirmationCode;
	}

	/**
	 * receiptを取得します.
	 *
	 * @return receipt
	 */
	public String getReceipt() {
		return receipt;
	}

	/**
	 * receiptを設定します.
	 *
	 * @param receipt receipt
	 */
	public void setReceipt(String receipt) {
		this.receipt = receipt;
	}

	/**
	 * instructionsUrlを取得します.
	 *
	 * @return instructionsUrl
	 */
	public String getInstructionsUrl() {
		return instructionsUrl;
	}

	/**
	 * instructionsUrlを設定します.
	 *
	 * @param instructionsUrl instructionsUrl
	 */
	public void setInstructionsUrl(String instructionsUrl) {
		this.instructionsUrl = instructionsUrl;
	}
}
