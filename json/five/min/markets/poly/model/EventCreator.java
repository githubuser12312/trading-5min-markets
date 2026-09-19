
package five.min.markets.poly.model;

import java.net.URI;
import java.util.Date;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "$schema",
    "createdAt",
    "creatorHandle",
    "creatorImage",
    "creatorName",
    "creatorUrl",
    "id",
    "updatedAt"
})
@Generated("jsonschema2pojo")
public class EventCreator {

    /**
     * A URL to the JSON Schema for this object.
     * 
     */
    @JsonProperty("$schema")
    @JsonPropertyDescription("A URL to the JSON Schema for this object.")
    private URI $schema;
    @JsonProperty("createdAt")
    private Date createdAt;
    @JsonProperty("creatorHandle")
    private String creatorHandle;
    @JsonProperty("creatorImage")
    private String creatorImage;
    @JsonProperty("creatorName")
    private String creatorName;
    @JsonProperty("creatorUrl")
    private String creatorUrl;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("id")
    private String id;
    @JsonProperty("updatedAt")
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

    public EventCreator with$schema(URI $schema) {
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

    public EventCreator withCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    @JsonProperty("creatorHandle")
    public String getCreatorHandle() {
        return creatorHandle;
    }

    @JsonProperty("creatorHandle")
    public void setCreatorHandle(String creatorHandle) {
        this.creatorHandle = creatorHandle;
    }

    public EventCreator withCreatorHandle(String creatorHandle) {
        this.creatorHandle = creatorHandle;
        return this;
    }

    @JsonProperty("creatorImage")
    public String getCreatorImage() {
        return creatorImage;
    }

    @JsonProperty("creatorImage")
    public void setCreatorImage(String creatorImage) {
        this.creatorImage = creatorImage;
    }

    public EventCreator withCreatorImage(String creatorImage) {
        this.creatorImage = creatorImage;
        return this;
    }

    @JsonProperty("creatorName")
    public String getCreatorName() {
        return creatorName;
    }

    @JsonProperty("creatorName")
    public void setCreatorName(String creatorName) {
        this.creatorName = creatorName;
    }

    public EventCreator withCreatorName(String creatorName) {
        this.creatorName = creatorName;
        return this;
    }

    @JsonProperty("creatorUrl")
    public String getCreatorUrl() {
        return creatorUrl;
    }

    @JsonProperty("creatorUrl")
    public void setCreatorUrl(String creatorUrl) {
        this.creatorUrl = creatorUrl;
    }

    public EventCreator withCreatorUrl(String creatorUrl) {
        this.creatorUrl = creatorUrl;
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

    public EventCreator withId(String id) {
        this.id = id;
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

    public EventCreator withUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(EventCreator.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("$schema");
        sb.append('=');
        sb.append(((this.$schema == null)?"<null>":this.$schema));
        sb.append(',');
        sb.append("createdAt");
        sb.append('=');
        sb.append(((this.createdAt == null)?"<null>":this.createdAt));
        sb.append(',');
        sb.append("creatorHandle");
        sb.append('=');
        sb.append(((this.creatorHandle == null)?"<null>":this.creatorHandle));
        sb.append(',');
        sb.append("creatorImage");
        sb.append('=');
        sb.append(((this.creatorImage == null)?"<null>":this.creatorImage));
        sb.append(',');
        sb.append("creatorName");
        sb.append('=');
        sb.append(((this.creatorName == null)?"<null>":this.creatorName));
        sb.append(',');
        sb.append("creatorUrl");
        sb.append('=');
        sb.append(((this.creatorUrl == null)?"<null>":this.creatorUrl));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
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
        result = ((result* 31)+((this.createdAt == null)? 0 :this.createdAt.hashCode()));
        result = ((result* 31)+((this.creatorImage == null)? 0 :this.creatorImage.hashCode()));
        result = ((result* 31)+((this.$schema == null)? 0 :this.$schema.hashCode()));
        result = ((result* 31)+((this.creatorUrl == null)? 0 :this.creatorUrl.hashCode()));
        result = ((result* 31)+((this.creatorName == null)? 0 :this.creatorName.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.creatorHandle == null)? 0 :this.creatorHandle.hashCode()));
        result = ((result* 31)+((this.updatedAt == null)? 0 :this.updatedAt.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EventCreator) == false) {
            return false;
        }
        EventCreator rhs = ((EventCreator) other);
        return (((((((((this.createdAt == rhs.createdAt)||((this.createdAt!= null)&&this.createdAt.equals(rhs.createdAt)))&&((this.creatorImage == rhs.creatorImage)||((this.creatorImage!= null)&&this.creatorImage.equals(rhs.creatorImage))))&&((this.$schema == rhs.$schema)||((this.$schema!= null)&&this.$schema.equals(rhs.$schema))))&&((this.creatorUrl == rhs.creatorUrl)||((this.creatorUrl!= null)&&this.creatorUrl.equals(rhs.creatorUrl))))&&((this.creatorName == rhs.creatorName)||((this.creatorName!= null)&&this.creatorName.equals(rhs.creatorName))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.creatorHandle == rhs.creatorHandle)||((this.creatorHandle!= null)&&this.creatorHandle.equals(rhs.creatorHandle))))&&((this.updatedAt == rhs.updatedAt)||((this.updatedAt!= null)&&this.updatedAt.equals(rhs.updatedAt))));
    }

}
