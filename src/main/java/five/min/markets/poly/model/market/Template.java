
package five.min.markets.poly.model.market;

import java.net.URI;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "$schema",
    "createdAt",
    "creatorUserId",
    "description",
    "displayName",
    "eventSlug",
    "eventTitle",
    "events",
    "id",
    "markets",
    "marketsAugmentedNegRisk",
    "marketsNegRisk",
    "marketsOrder",
    "marketsShowImages",
    "resolutionSource",
    "series",
    "tags",
    "updatedAt",
    "userVariables"
})
@Generated("jsonschema2pojo")
public class Template {

    /**
     * A URL to the JSON Schema for this object.
     * 
     */
    @JsonProperty("$schema")
    @JsonPropertyDescription("A URL to the JSON Schema for this object.")
    private URI $schema;
    @JsonProperty("createdAt")
    private Date createdAt;
    @JsonProperty("creatorUserId")
    private String creatorUserId;
    @JsonProperty("description")
    private String description;
    @JsonProperty("displayName")
    private String displayName;
    @JsonProperty("eventSlug")
    private String eventSlug;
    @JsonProperty("eventTitle")
    private String eventTitle;
    @JsonProperty("events")
    private List<Event> events = new ArrayList<Event>();
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("id")
    private String id;
    @JsonProperty("markets")
    private String markets;
    @JsonProperty("marketsAugmentedNegRisk")
    private Boolean marketsAugmentedNegRisk;
    @JsonProperty("marketsNegRisk")
    private Boolean marketsNegRisk;
    @JsonProperty("marketsOrder")
    private String marketsOrder;
    @JsonProperty("marketsShowImages")
    private Boolean marketsShowImages;
    @JsonProperty("resolutionSource")
    private String resolutionSource;
    @JsonProperty("series")
    private List<Series> series = new ArrayList<Series>();
    @JsonProperty("tags")
    private List<Tag> tags = new ArrayList<Tag>();
    @JsonProperty("updatedAt")
    private Date updatedAt;
    @JsonProperty("userVariables")
    private String userVariables;

    /**
     * A URL to the JSON Schema for this object.
     * 
     */
    @JsonProperty("$schema")
    public URI get$schema() {
        return $schema;
    }

    /**
     * A URL to the JSON Schema for this object.
     * 
     */
    @JsonProperty("$schema")
    public void set$schema(URI $schema) {
        this.$schema = $schema;
    }

    public Template with$schema(URI $schema) {
        this.$schema = $schema;
        return this;
    }

    @JsonProperty("createdAt")
    public Date getCreatedAt() {
        return createdAt;
    }

    @JsonProperty("createdAt")
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Template withCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    @JsonProperty("creatorUserId")
    public String getCreatorUserId() {
        return creatorUserId;
    }

    @JsonProperty("creatorUserId")
    public void setCreatorUserId(String creatorUserId) {
        this.creatorUserId = creatorUserId;
    }

    public Template withCreatorUserId(String creatorUserId) {
        this.creatorUserId = creatorUserId;
        return this;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    public Template withDescription(String description) {
        this.description = description;
        return this;
    }

    @JsonProperty("displayName")
    public String getDisplayName() {
        return displayName;
    }

    @JsonProperty("displayName")
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public Template withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    @JsonProperty("eventSlug")
    public String getEventSlug() {
        return eventSlug;
    }

    @JsonProperty("eventSlug")
    public void setEventSlug(String eventSlug) {
        this.eventSlug = eventSlug;
    }

    public Template withEventSlug(String eventSlug) {
        this.eventSlug = eventSlug;
        return this;
    }

    @JsonProperty("eventTitle")
    public String getEventTitle() {
        return eventTitle;
    }

    @JsonProperty("eventTitle")
    public void setEventTitle(String eventTitle) {
        this.eventTitle = eventTitle;
    }

    public Template withEventTitle(String eventTitle) {
        this.eventTitle = eventTitle;
        return this;
    }

    @JsonProperty("events")
    public List<Event> getEvents() {
        return events;
    }

    @JsonProperty("events")
    public void setEvents(List<Event> events) {
        this.events = events;
    }

    public Template withEvents(List<Event> events) {
        this.events = events;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public Template withId(String id) {
        this.id = id;
        return this;
    }

    @JsonProperty("markets")
    public String getMarkets() {
        return markets;
    }

    @JsonProperty("markets")
    public void setMarkets(String markets) {
        this.markets = markets;
    }

    public Template withMarkets(String markets) {
        this.markets = markets;
        return this;
    }

    @JsonProperty("marketsAugmentedNegRisk")
    public Boolean getMarketsAugmentedNegRisk() {
        return marketsAugmentedNegRisk;
    }

    @JsonProperty("marketsAugmentedNegRisk")
    public void setMarketsAugmentedNegRisk(Boolean marketsAugmentedNegRisk) {
        this.marketsAugmentedNegRisk = marketsAugmentedNegRisk;
    }

    public Template withMarketsAugmentedNegRisk(Boolean marketsAugmentedNegRisk) {
        this.marketsAugmentedNegRisk = marketsAugmentedNegRisk;
        return this;
    }

    @JsonProperty("marketsNegRisk")
    public Boolean getMarketsNegRisk() {
        return marketsNegRisk;
    }

    @JsonProperty("marketsNegRisk")
    public void setMarketsNegRisk(Boolean marketsNegRisk) {
        this.marketsNegRisk = marketsNegRisk;
    }

    public Template withMarketsNegRisk(Boolean marketsNegRisk) {
        this.marketsNegRisk = marketsNegRisk;
        return this;
    }

    @JsonProperty("marketsOrder")
    public String getMarketsOrder() {
        return marketsOrder;
    }

    @JsonProperty("marketsOrder")
    public void setMarketsOrder(String marketsOrder) {
        this.marketsOrder = marketsOrder;
    }

    public Template withMarketsOrder(String marketsOrder) {
        this.marketsOrder = marketsOrder;
        return this;
    }

    @JsonProperty("marketsShowImages")
    public Boolean getMarketsShowImages() {
        return marketsShowImages;
    }

    @JsonProperty("marketsShowImages")
    public void setMarketsShowImages(Boolean marketsShowImages) {
        this.marketsShowImages = marketsShowImages;
    }

    public Template withMarketsShowImages(Boolean marketsShowImages) {
        this.marketsShowImages = marketsShowImages;
        return this;
    }

    @JsonProperty("resolutionSource")
    public String getResolutionSource() {
        return resolutionSource;
    }

    @JsonProperty("resolutionSource")
    public void setResolutionSource(String resolutionSource) {
        this.resolutionSource = resolutionSource;
    }

    public Template withResolutionSource(String resolutionSource) {
        this.resolutionSource = resolutionSource;
        return this;
    }

    @JsonProperty("series")
    public List<Series> getSeries() {
        return series;
    }

    @JsonProperty("series")
    public void setSeries(List<Series> series) {
        this.series = series;
    }

    public Template withSeries(List<Series> series) {
        this.series = series;
        return this;
    }

    @JsonProperty("tags")
    public List<Tag> getTags() {
        return tags;
    }

    @JsonProperty("tags")
    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public Template withTags(List<Tag> tags) {
        this.tags = tags;
        return this;
    }

    @JsonProperty("updatedAt")
    public Date getUpdatedAt() {
        return updatedAt;
    }

    @JsonProperty("updatedAt")
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Template withUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    @JsonProperty("userVariables")
    public String getUserVariables() {
        return userVariables;
    }

    @JsonProperty("userVariables")
    public void setUserVariables(String userVariables) {
        this.userVariables = userVariables;
    }

    public Template withUserVariables(String userVariables) {
        this.userVariables = userVariables;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Template.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("$schema");
        sb.append('=');
        sb.append(((this.$schema == null)?"<null>":this.$schema));
        sb.append(',');
        sb.append("createdAt");
        sb.append('=');
        sb.append(((this.createdAt == null)?"<null>":this.createdAt));
        sb.append(',');
        sb.append("creatorUserId");
        sb.append('=');
        sb.append(((this.creatorUserId == null)?"<null>":this.creatorUserId));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("displayName");
        sb.append('=');
        sb.append(((this.displayName == null)?"<null>":this.displayName));
        sb.append(',');
        sb.append("eventSlug");
        sb.append('=');
        sb.append(((this.eventSlug == null)?"<null>":this.eventSlug));
        sb.append(',');
        sb.append("eventTitle");
        sb.append('=');
        sb.append(((this.eventTitle == null)?"<null>":this.eventTitle));
        sb.append(',');
        sb.append("events");
        sb.append('=');
        sb.append(((this.events == null)?"<null>":this.events));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("markets");
        sb.append('=');
        sb.append(((this.markets == null)?"<null>":this.markets));
        sb.append(',');
        sb.append("marketsAugmentedNegRisk");
        sb.append('=');
        sb.append(((this.marketsAugmentedNegRisk == null)?"<null>":this.marketsAugmentedNegRisk));
        sb.append(',');
        sb.append("marketsNegRisk");
        sb.append('=');
        sb.append(((this.marketsNegRisk == null)?"<null>":this.marketsNegRisk));
        sb.append(',');
        sb.append("marketsOrder");
        sb.append('=');
        sb.append(((this.marketsOrder == null)?"<null>":this.marketsOrder));
        sb.append(',');
        sb.append("marketsShowImages");
        sb.append('=');
        sb.append(((this.marketsShowImages == null)?"<null>":this.marketsShowImages));
        sb.append(',');
        sb.append("resolutionSource");
        sb.append('=');
        sb.append(((this.resolutionSource == null)?"<null>":this.resolutionSource));
        sb.append(',');
        sb.append("series");
        sb.append('=');
        sb.append(((this.series == null)?"<null>":this.series));
        sb.append(',');
        sb.append("tags");
        sb.append('=');
        sb.append(((this.tags == null)?"<null>":this.tags));
        sb.append(',');
        sb.append("updatedAt");
        sb.append('=');
        sb.append(((this.updatedAt == null)?"<null>":this.updatedAt));
        sb.append(',');
        sb.append("userVariables");
        sb.append('=');
        sb.append(((this.userVariables == null)?"<null>":this.userVariables));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.creatorUserId == null)? 0 :this.creatorUserId.hashCode()));
        result = ((result* 31)+((this.$schema == null)? 0 :this.$schema.hashCode()));
        result = ((result* 31)+((this.displayName == null)? 0 :this.displayName.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.userVariables == null)? 0 :this.userVariables.hashCode()));
        result = ((result* 31)+((this.marketsAugmentedNegRisk == null)? 0 :this.marketsAugmentedNegRisk.hashCode()));
        result = ((result* 31)+((this.resolutionSource == null)? 0 :this.resolutionSource.hashCode()));
        result = ((result* 31)+((this.tags == null)? 0 :this.tags.hashCode()));
        result = ((result* 31)+((this.createdAt == null)? 0 :this.createdAt.hashCode()));
        result = ((result* 31)+((this.eventTitle == null)? 0 :this.eventTitle.hashCode()));
        result = ((result* 31)+((this.markets == null)? 0 :this.markets.hashCode()));
        result = ((result* 31)+((this.marketsNegRisk == null)? 0 :this.marketsNegRisk.hashCode()));
        result = ((result* 31)+((this.series == null)? 0 :this.series.hashCode()));
        result = ((result* 31)+((this.marketsOrder == null)? 0 :this.marketsOrder.hashCode()));
        result = ((result* 31)+((this.eventSlug == null)? 0 :this.eventSlug.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.events == null)? 0 :this.events.hashCode()));
        result = ((result* 31)+((this.marketsShowImages == null)? 0 :this.marketsShowImages.hashCode()));
        result = ((result* 31)+((this.updatedAt == null)? 0 :this.updatedAt.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Template) == false) {
            return false;
        }
        Template rhs = ((Template) other);
        return ((((((((((((((((((((this.creatorUserId == rhs.creatorUserId)||((this.creatorUserId!= null)&&this.creatorUserId.equals(rhs.creatorUserId)))&&((this.$schema == rhs.$schema)||((this.$schema!= null)&&this.$schema.equals(rhs.$schema))))&&((this.displayName == rhs.displayName)||((this.displayName!= null)&&this.displayName.equals(rhs.displayName))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.userVariables == rhs.userVariables)||((this.userVariables!= null)&&this.userVariables.equals(rhs.userVariables))))&&((this.marketsAugmentedNegRisk == rhs.marketsAugmentedNegRisk)||((this.marketsAugmentedNegRisk!= null)&&this.marketsAugmentedNegRisk.equals(rhs.marketsAugmentedNegRisk))))&&((this.resolutionSource == rhs.resolutionSource)||((this.resolutionSource!= null)&&this.resolutionSource.equals(rhs.resolutionSource))))&&((this.tags == rhs.tags)||((this.tags!= null)&&this.tags.equals(rhs.tags))))&&((this.createdAt == rhs.createdAt)||((this.createdAt!= null)&&this.createdAt.equals(rhs.createdAt))))&&((this.eventTitle == rhs.eventTitle)||((this.eventTitle!= null)&&this.eventTitle.equals(rhs.eventTitle))))&&((this.markets == rhs.markets)||((this.markets!= null)&&this.markets.equals(rhs.markets))))&&((this.marketsNegRisk == rhs.marketsNegRisk)||((this.marketsNegRisk!= null)&&this.marketsNegRisk.equals(rhs.marketsNegRisk))))&&((this.series == rhs.series)||((this.series!= null)&&this.series.equals(rhs.series))))&&((this.marketsOrder == rhs.marketsOrder)||((this.marketsOrder!= null)&&this.marketsOrder.equals(rhs.marketsOrder))))&&((this.eventSlug == rhs.eventSlug)||((this.eventSlug!= null)&&this.eventSlug.equals(rhs.eventSlug))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.events == rhs.events)||((this.events!= null)&&this.events.equals(rhs.events))))&&((this.marketsShowImages == rhs.marketsShowImages)||((this.marketsShowImages!= null)&&this.marketsShowImages.equals(rhs.marketsShowImages))))&&((this.updatedAt == rhs.updatedAt)||((this.updatedAt!= null)&&this.updatedAt.equals(rhs.updatedAt))));
    }

}
