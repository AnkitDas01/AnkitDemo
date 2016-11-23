
package com.training.spring.domain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
    "id",
    "name",
    "addressInfo",
    "branches",
    "timings",
    "price",
    "rating",
    "views",
    "shareUrl",
    "enrolledDate",
    "renewalDate",
    "facilities",
    "description",
    "ownerInfo",
    "images"
})
public class Daycare {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("addressInfo")
    private AddressInfo addressInfo;
    @JsonProperty("branches")
    private List<Integer> branches = new ArrayList<Integer>();
    @JsonProperty("timings")
    private String timings;
    @JsonProperty("price")
    private Price price;
    @JsonProperty("rating")
    private String rating;
    @JsonProperty("views")
    private Integer views;
    @JsonProperty("shareUrl")
    private String shareUrl;
    @JsonProperty("enrolledDate")
    private Integer enrolledDate;
    @JsonProperty("renewalDate")
    private Integer renewalDate;
    @JsonProperty("facilities")
    private List<String> facilities = new ArrayList<String>();
    @JsonProperty("description")
    private String description;
    @JsonProperty("ownerInfo")
    private OwnerInfo ownerInfo;
    @JsonProperty("images")
    private Images images;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The id
     */
    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 
     * @return
     *     The name
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name
     *     The name
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     * @return
     *     The addressInfo
     */
    @JsonProperty("addressInfo")
    public AddressInfo getAddressInfo() {
        return addressInfo;
    }

    /**
     * 
     * @param addressInfo
     *     The addressInfo
     */
    @JsonProperty("addressInfo")
    public void setAddressInfo(AddressInfo addressInfo) {
        this.addressInfo = addressInfo;
    }

    /**
     * 
     * @return
     *     The branches
     */
    @JsonProperty("branches")
    public List<Integer> getBranches() {
        return branches;
    }

    /**
     * 
     * @param branches
     *     The branches
     */
    @JsonProperty("branches")
    public void setBranches(List<Integer> branches) {
        this.branches = branches;
    }

    /**
     * 
     * @return
     *     The timings
     */
    @JsonProperty("timings")
    public String getTimings() {
        return timings;
    }

    /**
     * 
     * @param timings
     *     The timings
     */
    @JsonProperty("timings")
    public void setTimings(String timings) {
        this.timings = timings;
    }

    /**
     * 
     * @return
     *     The price
     */
    @JsonProperty("price")
    public Price getPrice() {
        return price;
    }

    /**
     * 
     * @param price
     *     The price
     */
    @JsonProperty("price")
    public void setPrice(Price price) {
        this.price = price;
    }

    /**
     * 
     * @return
     *     The rating
     */
    @JsonProperty("rating")
    public String getRating() {
        return rating;
    }

    /**
     * 
     * @param rating
     *     The rating
     */
    @JsonProperty("rating")
    public void setRating(String rating) {
        this.rating = rating;
    }

    /**
     * 
     * @return
     *     The views
     */
    @JsonProperty("views")
    public Integer getViews() {
        return views;
    }

    /**
     * 
     * @param views
     *     The views
     */
    @JsonProperty("views")
    public void setViews(Integer views) {
        this.views = views;
    }

    /**
     * 
     * @return
     *     The shareUrl
     */
    @JsonProperty("shareUrl")
    public String getShareUrl() {
        return shareUrl;
    }

    /**
     * 
     * @param shareUrl
     *     The shareUrl
     */
    @JsonProperty("shareUrl")
    public void setShareUrl(String shareUrl) {
        this.shareUrl = shareUrl;
    }

    /**
     * 
     * @return
     *     The enrolledDate
     */
    @JsonProperty("enrolledDate")
    public Integer getEnrolledDate() {
        return enrolledDate;
    }

    /**
     * 
     * @param enrolledDate
     *     The enrolledDate
     */
    @JsonProperty("enrolledDate")
    public void setEnrolledDate(Integer enrolledDate) {
        this.enrolledDate = enrolledDate;
    }

    /**
     * 
     * @return
     *     The renewalDate
     */
    @JsonProperty("renewalDate")
    public Integer getRenewalDate() {
        return renewalDate;
    }

    /**
     * 
     * @param renewalDate
     *     The renewalDate
     */
    @JsonProperty("renewalDate")
    public void setRenewalDate(Integer renewalDate) {
        this.renewalDate = renewalDate;
    }

    /**
     * 
     * @return
     *     The facilities
     */
    @JsonProperty("facilities")
    public List<String> getFacilities() {
        return facilities;
    }

    /**
     * 
     * @param facilities
     *     The facilities
     */
    @JsonProperty("facilities")
    public void setFacilities(List<String> facilities) {
        this.facilities = facilities;
    }

    /**
     * 
     * @return
     *     The description
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * 
     * @param description
     *     The description
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 
     * @return
     *     The ownerInfo
     */
    @JsonProperty("ownerInfo")
    public OwnerInfo getOwnerInfo() {
        return ownerInfo;
    }

    /**
     * 
     * @param ownerInfo
     *     The ownerInfo
     */
    @JsonProperty("ownerInfo")
    public void setOwnerInfo(OwnerInfo ownerInfo) {
        this.ownerInfo = ownerInfo;
    }

    /**
     * 
     * @return
     *     The images
     */
    @JsonProperty("images")
    public Images getImages() {
        return images;
    }

    /**
     * 
     * @param images
     *     The images
     */
    @JsonProperty("images")
    public void setImages(Images images) {
        this.images = images;
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
