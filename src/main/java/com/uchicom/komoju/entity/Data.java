// (c) 2016 uchicom
package com.uchicom.komoju.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author uchicom: Shigeki Uchiyama
 *
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class Data {

	private String id;

	private String resource;

	private String status;

	private String url;

	private String active;

	@JsonProperty("event_list")
	private String[] eventList;

	private String amount;

	private String tax;

	private String customer;

	@JsonProperty("payment_deadline")
	private String paymentDeadline;

	@JsonProperty("payment_details")
	private PaymentDetails paymentDetails;

	@JsonProperty("payment_method_fee")
	private String paymentMethodFee;

	private String total;

	private String currency;

	private String description;

	private String subscription;

	@JsonProperty("captured_at")
	private String capturedAt;

	@JsonProperty("external_order_num")
	private String externalOrderNum;

	private Metadata metadata;

	@JsonProperty("created_at")
	private String createdAt;

	@JsonProperty("amount_refunded")
	private String amountRefunded;

	private String locale;

	private String[] refunds;

	@JsonProperty("refund_requests")
	private String[] refundRequests;

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
	 * statusを取得します.
	 *
	 * @return status
	 */
	public String getStatus() {
		return status;
	}
	/**
	 * statusを設定します.
	 *
	 * @param status status
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	/**
	 * urlを取得します.
	 *
	 * @return url
	 */
	public String getUrl() {
		return url;
	}
	/**
	 * urlを設定します.
	 *
	 * @param url url
	 */
	public void setUrl(String url) {
		this.url = url;
	}
	/**
	 * activeを取得します.
	 *
	 * @return active
	 */
	public String getActive() {
		return active;
	}
	/**
	 * activeを設定します.
	 *
	 * @param active active
	 */
	public void setActive(String active) {
		this.active = active;
	}
	/**
	 * eventListを取得します.
	 *
	 * @return eventList
	 */
	public String[] getEventList() {
		return eventList;
	}
	/**
	 * eventListを設定します.
	 *
	 * @param eventList eventList
	 */
	public void setEventList(String[] eventList) {
		this.eventList = eventList;
	}
	/**
	 * amountを取得します.
	 *
	 * @return amount
	 */
	public String getAmount() {
		return amount;
	}
	/**
	 * amountを設定します.
	 *
	 * @param amount amount
	 */
	public void setAmount(String amount) {
		this.amount = amount;
	}
	/**
	 * taxを取得します.
	 *
	 * @return tax
	 */
	public String getTax() {
		return tax;
	}
	/**
	 * taxを設定します.
	 *
	 * @param tax tax
	 */
	public void setTax(String tax) {
		this.tax = tax;
	}
	/**
	 * customerを取得します.
	 *
	 * @return customer
	 */
	public String getCustomer() {
		return customer;
	}
	/**
	 * customerを設定します.
	 *
	 * @param customer customer
	 */
	public void setCustomer(String customer) {
		this.customer = customer;
	}
	/**
	 * paymentDeadlineを取得します.
	 *
	 * @return paymentDeadline
	 */
	public String getPaymentDeadline() {
		return paymentDeadline;
	}
	/**
	 * paymentDeadlineを設定します.
	 *
	 * @param paymentDeadline paymentDeadline
	 */
	public void setPaymentDeadline(String paymentDeadline) {
		this.paymentDeadline = paymentDeadline;
	}
	/**
	 * paymentDetailsを取得します.
	 *
	 * @return paymentDetails
	 */
	public PaymentDetails getPaymentDetails() {
		return paymentDetails;
	}
	/**
	 * paymentDetailsを設定します.
	 *
	 * @param paymentDetails paymentDetails
	 */
	public void setPaymentDetails(PaymentDetails paymentDetails) {
		this.paymentDetails = paymentDetails;
	}
	/**
	 * paymentMethodFeeを取得します.
	 *
	 * @return paymentMethodFee
	 */
	public String getPaymentMethodFee() {
		return paymentMethodFee;
	}
	/**
	 * paymentMethodFeeを設定します.
	 *
	 * @param paymentMethodFee paymentMethodFee
	 */
	public void setPaymentMethodFee(String paymentMethodFee) {
		this.paymentMethodFee = paymentMethodFee;
	}
	/**
	 * totalを取得します.
	 *
	 * @return total
	 */
	public String getTotal() {
		return total;
	}
	/**
	 * totalを設定します.
	 *
	 * @param total total
	 */
	public void setTotal(String total) {
		this.total = total;
	}
	/**
	 * currencyを取得します.
	 *
	 * @return currency
	 */
	public String getCurrency() {
		return currency;
	}
	/**
	 * currencyを設定します.
	 *
	 * @param currency currency
	 */
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	/**
	 * descriptionを取得します.
	 *
	 * @return description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * descriptionを設定します.
	 *
	 * @param description description
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * subscriptionを取得します.
	 *
	 * @return subscription
	 */
	public String getSubscription() {
		return subscription;
	}
	/**
	 * subscriptionを設定します.
	 *
	 * @param subscription subscription
	 */
	public void setSubscription(String subscription) {
		this.subscription = subscription;
	}
	/**
	 * capturedAtを取得します.
	 *
	 * @return capturedAt
	 */
	public String getCapturedAt() {
		return capturedAt;
	}
	/**
	 * capturedAtを設定します.
	 *
	 * @param capturedAt capturedAt
	 */
	public void setCapturedAt(String capturedAt) {
		this.capturedAt = capturedAt;
	}
	/**
	 * externalOrderNumを取得します.
	 *
	 * @return externalOrderNum
	 */
	public String getExternalOrderNum() {
		return externalOrderNum;
	}
	/**
	 * externalOrderNumを設定します.
	 *
	 * @param externalOrderNum externalOrderNum
	 */
	public void setExternalOrderNum(String externalOrderNum) {
		this.externalOrderNum = externalOrderNum;
	}
	/**
	 * metadataを取得します.
	 *
	 * @return metadata
	 */
	public Metadata getMetadata() {
		return metadata;
	}
	/**
	 * metadataを設定します.
	 *
	 * @param metadata metadata
	 */
	public void setMetadata(Metadata metadata) {
		this.metadata = metadata;
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
	/**
	 * amountRefundedを取得します.
	 *
	 * @return amountRefunded
	 */
	public String getAmountRefunded() {
		return amountRefunded;
	}
	/**
	 * amountRefundedを設定します.
	 *
	 * @param amountRefunded amountRefunded
	 */
	public void setAmountRefunded(String amountRefunded) {
		this.amountRefunded = amountRefunded;
	}
	/**
	 * localeを取得します.
	 *
	 * @return locale
	 */
	public String getLocale() {
		return locale;
	}
	/**
	 * localeを設定します.
	 *
	 * @param locale locale
	 */
	public void setLocale(String locale) {
		this.locale = locale;
	}
	/**
	 * refundsを取得します.
	 *
	 * @return refunds
	 */
	public String[] getRefunds() {
		return refunds;
	}
	/**
	 * refundsを設定します.
	 *
	 * @param refunds refunds
	 */
	public void setRefunds(String[] refunds) {
		this.refunds = refunds;
	}
	/**
	 * refundRequestsを取得します.
	 *
	 * @return refundRequests
	 */
	public String[] getRefundRequests() {
		return refundRequests;
	}
	/**
	 * refundRequestsを設定します.
	 *
	 * @param refundRequests refundRequests
	 */
	public void setRefundRequests(String[] refundRequests) {
		this.refundRequests = refundRequests;
	}
}
