
package com.training.spring.domain;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "currentPrice",
    "offerPrice",
    "discount",
    "discountMessage",
    "subscriptionFees",
    "revenueShare"
})
public class Price {

    @JsonProperty("currentPrice")
    private String currentPrice;
    @JsonProperty("offerPrice")
    private String offerPrice;
    @JsonProperty("discount")
    private String discount;
    @JsonProperty("discountMessage")
    private String discountMessage;
    @JsonProperty("subscriptionFees")
    private String subscriptionFees;
    @JsonProperty("revenueShare")
    private String revenueShare;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The currentPrice
     */
    @JsonProperty("currentPrice")
    public String getCurrentPrice() {
        return currentPrice;
    }

    /**
     * 
     * @param currentPrice
     *     The currentPrice
     */
    @JsonProperty("currentPrice")
    public void setCurrentPrice(String currentPrice) {
        this.currentPrice = currentPrice;
    }

    /**
     * 
     * @return
     *     The offerPrice
     */
    @JsonProperty("offerPrice")
    public String getOfferPrice() {
        return offerPrice;
    }

    /**
     * 
     * @param offerPrice
     *     The offerPrice
     */
    @JsonProperty("offerPrice")
    public void setOfferPrice(String offerPrice) {
        this.offerPrice = offerPrice;
    }

    /**
     * 
     * @return
     *     The discount
     */
    @JsonProperty("discount")
    public String getDiscount() {
        return discount;
    }

    /**
     * 
     * @param discount
     *     The discount
     */
    @JsonProperty("discount")
    public void setDiscount(String discount) {
        this.discount = discount;
    }

    /**
     * 
     * @return
     *     The discountMessage
     */
    @JsonProperty("discountMessage")
    public String getDiscountMessage() {
        return discountMessage;
    }

    /**
     * 
     * @param discountMessage
     *     The discountMessage
     */
    @JsonProperty("discountMessage")
    public void setDiscountMessage(String discountMessage) {
        this.discountMessage = discountMessage;
    }

    /**
     * 
     * @return
     *     The subscriptionFees
     */
    @JsonProperty("subscriptionFees")
    public String getSubscriptionFees() {
        return subscriptionFees;
    }

    /**
     * 
     * @param subscriptionFees
     *     The subscriptionFees
     */
    @JsonProperty("subscriptionFees")
    public void setSubscriptionFees(String subscriptionFees) {
        this.subscriptionFees = subscriptionFees;
    }

    /**
     * 
     * @return
     *     The revenueShare
     */
    @JsonProperty("revenueShare")
    public String getRevenueShare() {
        return revenueShare;
    }

    /**
     * 
     * @param revenueShare
     *     The revenueShare
     */
    @JsonProperty("revenueShare")
    public void setRevenueShare(String revenueShare) {
        this.revenueShare = revenueShare;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
