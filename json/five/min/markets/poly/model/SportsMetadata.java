
package five.min.markets.poly.model;

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
    "externalPartners",
    "id",
    "image",
    "name",
    "ordering",
    "primaryTagId",
    "resolution",
    "series",
    "sport",
    "tags",
    "updatedAt"
})
@Generated("jsonschema2pojo")
public class SportsMetadata {

    /**
     * A URL to the JSON Schema for this object.
     * 
     */
    @JsonProperty("$schema")
    @JsonPropertyDescription("A URL to the JSON Schema for this object.")
    private URI $schema;
    /**
     * Time when the sports metadata was created.
     * 
     */
    @JsonProperty("createdAt")
    @JsonPropertyDescription("Time when the sports metadata was created.")
    private Date createdAt;
    /**
     * External partner mappings for this sport.
     * 
     */
    @JsonProperty("externalPartners")
    @JsonPropertyDescription("External partner mappings for this sport.")
    private List<SportExternalPartnerMapping> externalPartners = new ArrayList<SportExternalPartnerMapping>();
    /**
     * Unique sports metadata ID.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("Unique sports metadata ID.")
    private Integer id;
    /**
     * Image URL for the sport.
     * (Required)
     * 
     */
    @JsonProperty("image")
    @JsonPropertyDescription("Image URL for the sport.")
    private String image;
    /**
     * Display name for the sport or league.
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("Display name for the sport or league.")
    private String name;
    /**
     * Ordering configuration used for sport display.
     * (Required)
     * 
     */
    @JsonProperty("ordering")
    @JsonPropertyDescription("Ordering configuration used for sport display.")
    private String ordering;
    /**
     * ID of the league's own tag, as opposed to the shared base tags in the tags CSV.
     * 
     */
    @JsonProperty("primaryTagId")
    @JsonPropertyDescription("ID of the league's own tag, as opposed to the shared base tags in the tags CSV.")
    private Integer primaryTagId;
    /**
     * Default resolution source or display text for the sport.
     * (Required)
     * 
     */
    @JsonProperty("resolution")
    @JsonPropertyDescription("Default resolution source or display text for the sport.")
    private String resolution;
    /**
     * Comma-separated series identifiers associated with the sport.
     * (Required)
     * 
     */
    @JsonProperty("series")
    @JsonPropertyDescription("Comma-separated series identifiers associated with the sport.")
    private String series;
    /**
     * Sport slug this metadata applies to.
     * (Required)
     * 
     */
    @JsonProperty("sport")
    @JsonPropertyDescription("Sport slug this metadata applies to.")
    private String sport;
    /**
     * Comma-separated tag identifiers associated with the sport.
     * (Required)
     * 
     */
    @JsonProperty("tags")
    @JsonPropertyDescription("Comma-separated tag identifiers associated with the sport.")
    private String tags;
    /**
     * Time when the sports metadata was last updated.
     * 
     */
    @JsonProperty("updatedAt")
    @JsonPropertyDescription("Time when the sports metadata was last updated.")
    private Date updatedAt;

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

    public SportsMetadata with$schema(URI $schema) {
        this.$schema = $schema;
        return this;
    }

    /**
     * Time when the sports metadata was created.
     * 
     */
    @JsonProperty("createdAt")
    public Date getCreatedAt() {
        return createdAt;
    }

    /**
     * Time when the sports metadata was created.
     * 
     */
    @JsonProperty("createdAt")
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public SportsMetadata withCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * External partner mappings for this sport.
     * 
     */
    @JsonProperty("externalPartners")
    public List<SportExternalPartnerMapping> getExternalPartners() {
        return externalPartners;
    }

    /**
     * External partner mappings for this sport.
     * 
     */
    @JsonProperty("externalPartners")
    public void setExternalPartners(List<SportExternalPartnerMapping> externalPartners) {
        this.externalPartners = externalPartners;
    }

    public SportsMetadata withExternalPartners(List<SportExternalPartnerMapping> externalPartners) {
        this.externalPartners = externalPartners;
        return this;
    }

    /**
     * Unique sports metadata ID.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    /**
     * Unique sports metadata ID.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    public SportsMetadata withId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * Image URL for the sport.
     * (Required)
     * 
     */
    @JsonProperty("image")
    public String getImage() {
        return image;
    }

    /**
     * Image URL for the sport.
     * (Required)
     * 
     */
    @JsonProperty("image")
    public void setImage(String image) {
        this.image = image;
    }

    public SportsMetadata withImage(String image) {
        this.image = image;
        return this;
    }

    /**
     * Display name for the sport or league.
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * Display name for the sport or league.
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public SportsMetadata withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Ordering configuration used for sport display.
     * (Required)
     * 
     */
    @JsonProperty("ordering")
    public String getOrdering() {
        return ordering;
    }

    /**
     * Ordering configuration used for sport display.
     * (Required)
     * 
     */
    @JsonProperty("ordering")
    public void setOrdering(String ordering) {
        this.ordering = ordering;
    }

    public SportsMetadata withOrdering(String ordering) {
        this.ordering = ordering;
        return this;
    }

    /**
     * ID of the league's own tag, as opposed to the shared base tags in the tags CSV.
     * 
     */
    @JsonProperty("primaryTagId")
    public Integer getPrimaryTagId() {
        return primaryTagId;
    }

    /**
     * ID of the league's own tag, as opposed to the shared base tags in the tags CSV.
     * 
     */
    @JsonProperty("primaryTagId")
    public void setPrimaryTagId(Integer primaryTagId) {
        this.primaryTagId = primaryTagId;
    }

    public SportsMetadata withPrimaryTagId(Integer primaryTagId) {
        this.primaryTagId = primaryTagId;
        return this;
    }

    /**
     * Default resolution source or display text for the sport.
     * (Required)
     * 
     */
    @JsonProperty("resolution")
    public String getResolution() {
        return resolution;
    }

    /**
     * Default resolution source or display text for the sport.
     * (Required)
     * 
     */
    @JsonProperty("resolution")
    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public SportsMetadata withResolution(String resolution) {
        this.resolution = resolution;
        return this;
    }

    /**
     * Comma-separated series identifiers associated with the sport.
     * (Required)
     * 
     */
    @JsonProperty("series")
    public String getSeries() {
        return series;
    }

    /**
     * Comma-separated series identifiers associated with the sport.
     * (Required)
     * 
     */
    @JsonProperty("series")
    public void setSeries(String series) {
        this.series = series;
    }

    public SportsMetadata withSeries(String series) {
        this.series = series;
        return this;
    }

    /**
     * Sport slug this metadata applies to.
     * (Required)
     * 
     */
    @JsonProperty("sport")
    public String getSport() {
        return sport;
    }

    /**
     * Sport slug this metadata applies to.
     * (Required)
     * 
     */
    @JsonProperty("sport")
    public void setSport(String sport) {
        this.sport = sport;
    }

    public SportsMetadata withSport(String sport) {
        this.sport = sport;
        return this;
    }

    /**
     * Comma-separated tag identifiers associated with the sport.
     * (Required)
     * 
     */
    @JsonProperty("tags")
    public String getTags() {
        return tags;
    }

    /**
     * Comma-separated tag identifiers associated with the sport.
     * (Required)
     * 
     */
    @JsonProperty("tags")
    public void setTags(String tags) {
        this.tags = tags;
    }

    public SportsMetadata withTags(String tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Time when the sports metadata was last updated.
     * 
     */
    @JsonProperty("updatedAt")
    public Date getUpdatedAt() {
        return updatedAt;
    }

    /**
     * Time when the sports metadata was last updated.
     * 
     */
    @JsonProperty("updatedAt")
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public SportsMetadata withUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SportsMetadata.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("$schema");
        sb.append('=');
        sb.append(((this.$schema == null)?"<null>":this.$schema));
        sb.append(',');
        sb.append("createdAt");
        sb.append('=');
        sb.append(((this.createdAt == null)?"<null>":this.createdAt));
        sb.append(',');
        sb.append("externalPartners");
        sb.append('=');
        sb.append(((this.externalPartners == null)?"<null>":this.externalPartners));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("image");
        sb.append('=');
        sb.append(((this.image == null)?"<null>":this.image));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("ordering");
        sb.append('=');
        sb.append(((this.ordering == null)?"<null>":this.ordering));
        sb.append(',');
        sb.append("primaryTagId");
        sb.append('=');
        sb.append(((this.primaryTagId == null)?"<null>":this.primaryTagId));
        sb.append(',');
        sb.append("resolution");
        sb.append('=');
        sb.append(((this.resolution == null)?"<null>":this.resolution));
        sb.append(',');
        sb.append("series");
        sb.append('=');
        sb.append(((this.series == null)?"<null>":this.series));
        sb.append(',');
        sb.append("sport");
        sb.append('=');
        sb.append(((this.sport == null)?"<null>":this.sport));
        sb.append(',');
        sb.append("tags");
        sb.append('=');
        sb.append(((this.tags == null)?"<null>":this.tags));
        sb.append(',');
        sb.append("updatedAt");
        sb.append('=');
        sb.append(((this.updatedAt == null)?"<null>":this.updatedAt));
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
        result = ((result* 31)+((this.image == null)? 0 :this.image.hashCode()));
        result = ((result* 31)+((this.primaryTagId == null)? 0 :this.primaryTagId.hashCode()));
        result = ((result* 31)+((this.$schema == null)? 0 :this.$schema.hashCode()));
        result = ((result* 31)+((this.ordering == null)? 0 :this.ordering.hashCode()));
        result = ((result* 31)+((this.resolution == null)? 0 :this.resolution.hashCode()));
        result = ((result* 31)+((this.tags == null)? 0 :this.tags.hashCode()));
        result = ((result* 31)+((this.createdAt == null)? 0 :this.createdAt.hashCode()));
        result = ((result* 31)+((this.externalPartners == null)? 0 :this.externalPartners.hashCode()));
        result = ((result* 31)+((this.series == null)? 0 :this.series.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.sport == null)? 0 :this.sport.hashCode()));
        result = ((result* 31)+((this.updatedAt == null)? 0 :this.updatedAt.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SportsMetadata) == false) {
            return false;
        }
        SportsMetadata rhs = ((SportsMetadata) other);
        return ((((((((((((((this.image == rhs.image)||((this.image!= null)&&this.image.equals(rhs.image)))&&((this.primaryTagId == rhs.primaryTagId)||((this.primaryTagId!= null)&&this.primaryTagId.equals(rhs.primaryTagId))))&&((this.$schema == rhs.$schema)||((this.$schema!= null)&&this.$schema.equals(rhs.$schema))))&&((this.ordering == rhs.ordering)||((this.ordering!= null)&&this.ordering.equals(rhs.ordering))))&&((this.resolution == rhs.resolution)||((this.resolution!= null)&&this.resolution.equals(rhs.resolution))))&&((this.tags == rhs.tags)||((this.tags!= null)&&this.tags.equals(rhs.tags))))&&((this.createdAt == rhs.createdAt)||((this.createdAt!= null)&&this.createdAt.equals(rhs.createdAt))))&&((this.externalPartners == rhs.externalPartners)||((this.externalPartners!= null)&&this.externalPartners.equals(rhs.externalPartners))))&&((this.series == rhs.series)||((this.series!= null)&&this.series.equals(rhs.series))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.sport == rhs.sport)||((this.sport!= null)&&this.sport.equals(rhs.sport))))&&((this.updatedAt == rhs.updatedAt)||((this.updatedAt!= null)&&this.updatedAt.equals(rhs.updatedAt))));
    }

}
