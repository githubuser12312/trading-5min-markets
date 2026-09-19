
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
    "id",
    "name",
    "slug",
    "updatedAt"
})
@Generated("jsonschema2pojo")
public class Partner {

    /**
     * A URL to the JSON Schema for this object.
     * 
     */
    @JsonProperty("$schema")
    @JsonPropertyDescription("A URL to the JSON Schema for this object.")
    private URI $schema;
    @JsonProperty("createdAt")
    private Date createdAt;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("id")
    private Integer id;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("name")
    private String name;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("slug")
    private String slug;
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

    public Partner with$schema(URI $schema) {
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

    public Partner withCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    public Partner withId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public Partner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("slug")
    public String getSlug() {
        return slug;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("slug")
    public void setSlug(String slug) {
        this.slug = slug;
    }

    public Partner withSlug(String slug) {
        this.slug = slug;
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

    public Partner withUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Partner.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("$schema");
        sb.append('=');
        sb.append(((this.$schema == null)?"<null>":this.$schema));
        sb.append(',');
        sb.append("createdAt");
        sb.append('=');
        sb.append(((this.createdAt == null)?"<null>":this.createdAt));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("slug");
        sb.append('=');
        sb.append(((this.slug == null)?"<null>":this.slug));
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
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.createdAt == null)? 0 :this.createdAt.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.$schema == null)? 0 :this.$schema.hashCode()));
        result = ((result* 31)+((this.slug == null)? 0 :this.slug.hashCode()));
        result = ((result* 31)+((this.updatedAt == null)? 0 :this.updatedAt.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Partner) == false) {
            return false;
        }
        Partner rhs = ((Partner) other);
        return (((((((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name)))&&((this.createdAt == rhs.createdAt)||((this.createdAt!= null)&&this.createdAt.equals(rhs.createdAt))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.$schema == rhs.$schema)||((this.$schema!= null)&&this.$schema.equals(rhs.$schema))))&&((this.slug == rhs.slug)||((this.slug!= null)&&this.slug.equals(rhs.slug))))&&((this.updatedAt == rhs.updatedAt)||((this.updatedAt!= null)&&this.updatedAt.equals(rhs.updatedAt))));
    }

}
