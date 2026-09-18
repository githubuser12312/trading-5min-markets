
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
    "activeEventsCount",
    "createdAt",
    "createdBy",
    "forceHide",
    "forceShow",
    "id",
    "isCarousel",
    "label",
    "publishedAt",
    "requiresTranslation",
    "slug",
    "templates",
    "updatedAt",
    "updatedBy"
})
@Generated("jsonschema2pojo")
public class Tag {

    /**
     * A URL to the JSON Schema for this object.
     * 
     */
    @JsonProperty("$schema")
    @JsonPropertyDescription("A URL to the JSON Schema for this object.")
    private URI $schema;
    @JsonProperty("activeEventsCount")
    private Integer activeEventsCount;
    @JsonProperty("createdAt")
    private Date createdAt;
    @JsonProperty("createdBy")
    private Integer createdBy;
    @JsonProperty("forceHide")
    private Boolean forceHide;
    @JsonProperty("forceShow")
    private Boolean forceShow;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("id")
    private String id;
    @JsonProperty("isCarousel")
    private Boolean isCarousel;
    @JsonProperty("label")
    private String label;
    @JsonProperty("publishedAt")
    private String publishedAt;
    @JsonProperty("requiresTranslation")
    private Boolean requiresTranslation;
    @JsonProperty("slug")
    private String slug;
    @JsonProperty("templates")
    private List<Template> templates = new ArrayList<Template>();
    @JsonProperty("updatedAt")
    private Date updatedAt;
    @JsonProperty("updatedBy")
    private Integer updatedBy;

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

    public Tag with$schema(URI $schema) {
        this.$schema = $schema;
        return this;
    }

    @JsonProperty("activeEventsCount")
    public Integer getActiveEventsCount() {
        return activeEventsCount;
    }

    @JsonProperty("activeEventsCount")
    public void setActiveEventsCount(Integer activeEventsCount) {
        this.activeEventsCount = activeEventsCount;
    }

    public Tag withActiveEventsCount(Integer activeEventsCount) {
        this.activeEventsCount = activeEventsCount;
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

    public Tag withCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    @JsonProperty("createdBy")
    public Integer getCreatedBy() {
        return createdBy;
    }

    @JsonProperty("createdBy")
    public void setCreatedBy(Integer createdBy) {
        this.createdBy = createdBy;
    }

    public Tag withCreatedBy(Integer createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    @JsonProperty("forceHide")
    public Boolean getForceHide() {
        return forceHide;
    }

    @JsonProperty("forceHide")
    public void setForceHide(Boolean forceHide) {
        this.forceHide = forceHide;
    }

    public Tag withForceHide(Boolean forceHide) {
        this.forceHide = forceHide;
        return this;
    }

    @JsonProperty("forceShow")
    public Boolean getForceShow() {
        return forceShow;
    }

    @JsonProperty("forceShow")
    public void setForceShow(Boolean forceShow) {
        this.forceShow = forceShow;
    }

    public Tag withForceShow(Boolean forceShow) {
        this.forceShow = forceShow;
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

    public Tag withId(String id) {
        this.id = id;
        return this;
    }

    @JsonProperty("isCarousel")
    public Boolean getIsCarousel() {
        return isCarousel;
    }

    @JsonProperty("isCarousel")
    public void setIsCarousel(Boolean isCarousel) {
        this.isCarousel = isCarousel;
    }

    public Tag withIsCarousel(Boolean isCarousel) {
        this.isCarousel = isCarousel;
        return this;
    }

    @JsonProperty("label")
    public String getLabel() {
        return label;
    }

    @JsonProperty("label")
    public void setLabel(String label) {
        this.label = label;
    }

    public Tag withLabel(String label) {
        this.label = label;
        return this;
    }

    @JsonProperty("publishedAt")
    public String getPublishedAt() {
        return publishedAt;
    }

    @JsonProperty("publishedAt")
    public void setPublishedAt(String publishedAt) {
        this.publishedAt = publishedAt;
    }

    public Tag withPublishedAt(String publishedAt) {
        this.publishedAt = publishedAt;
        return this;
    }

    @JsonProperty("requiresTranslation")
    public Boolean getRequiresTranslation() {
        return requiresTranslation;
    }

    @JsonProperty("requiresTranslation")
    public void setRequiresTranslation(Boolean requiresTranslation) {
        this.requiresTranslation = requiresTranslation;
    }

    public Tag withRequiresTranslation(Boolean requiresTranslation) {
        this.requiresTranslation = requiresTranslation;
        return this;
    }

    @JsonProperty("slug")
    public String getSlug() {
        return slug;
    }

    @JsonProperty("slug")
    public void setSlug(String slug) {
        this.slug = slug;
    }

    public Tag withSlug(String slug) {
        this.slug = slug;
        return this;
    }

    @JsonProperty("templates")
    public List<Template> getTemplates() {
        return templates;
    }

    @JsonProperty("templates")
    public void setTemplates(List<Template> templates) {
        this.templates = templates;
    }

    public Tag withTemplates(List<Template> templates) {
        this.templates = templates;
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

    public Tag withUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    @JsonProperty("updatedBy")
    public Integer getUpdatedBy() {
        return updatedBy;
    }

    @JsonProperty("updatedBy")
    public void setUpdatedBy(Integer updatedBy) {
        this.updatedBy = updatedBy;
    }

    public Tag withUpdatedBy(Integer updatedBy) {
        this.updatedBy = updatedBy;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Tag.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("$schema");
        sb.append('=');
        sb.append(((this.$schema == null)?"<null>":this.$schema));
        sb.append(',');
        sb.append("activeEventsCount");
        sb.append('=');
        sb.append(((this.activeEventsCount == null)?"<null>":this.activeEventsCount));
        sb.append(',');
        sb.append("createdAt");
        sb.append('=');
        sb.append(((this.createdAt == null)?"<null>":this.createdAt));
        sb.append(',');
        sb.append("createdBy");
        sb.append('=');
        sb.append(((this.createdBy == null)?"<null>":this.createdBy));
        sb.append(',');
        sb.append("forceHide");
        sb.append('=');
        sb.append(((this.forceHide == null)?"<null>":this.forceHide));
        sb.append(',');
        sb.append("forceShow");
        sb.append('=');
        sb.append(((this.forceShow == null)?"<null>":this.forceShow));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("isCarousel");
        sb.append('=');
        sb.append(((this.isCarousel == null)?"<null>":this.isCarousel));
        sb.append(',');
        sb.append("label");
        sb.append('=');
        sb.append(((this.label == null)?"<null>":this.label));
        sb.append(',');
        sb.append("publishedAt");
        sb.append('=');
        sb.append(((this.publishedAt == null)?"<null>":this.publishedAt));
        sb.append(',');
        sb.append("requiresTranslation");
        sb.append('=');
        sb.append(((this.requiresTranslation == null)?"<null>":this.requiresTranslation));
        sb.append(',');
        sb.append("slug");
        sb.append('=');
        sb.append(((this.slug == null)?"<null>":this.slug));
        sb.append(',');
        sb.append("templates");
        sb.append('=');
        sb.append(((this.templates == null)?"<null>":this.templates));
        sb.append(',');
        sb.append("updatedAt");
        sb.append('=');
        sb.append(((this.updatedAt == null)?"<null>":this.updatedAt));
        sb.append(',');
        sb.append("updatedBy");
        sb.append('=');
        sb.append(((this.updatedBy == null)?"<null>":this.updatedBy));
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
        result = ((result* 31)+((this.forceHide == null)? 0 :this.forceHide.hashCode()));
        result = ((result* 31)+((this.updatedBy == null)? 0 :this.updatedBy.hashCode()));
        result = ((result* 31)+((this.$schema == null)? 0 :this.$schema.hashCode()));
        result = ((result* 31)+((this.requiresTranslation == null)? 0 :this.requiresTranslation.hashCode()));
        result = ((result* 31)+((this.publishedAt == null)? 0 :this.publishedAt.hashCode()));
        result = ((result* 31)+((this.templates == null)? 0 :this.templates.hashCode()));
        result = ((result* 31)+((this.activeEventsCount == null)? 0 :this.activeEventsCount.hashCode()));
        result = ((result* 31)+((this.label == null)? 0 :this.label.hashCode()));
        result = ((result* 31)+((this.isCarousel == null)? 0 :this.isCarousel.hashCode()));
        result = ((result* 31)+((this.createdAt == null)? 0 :this.createdAt.hashCode()));
        result = ((result* 31)+((this.createdBy == null)? 0 :this.createdBy.hashCode()));
        result = ((result* 31)+((this.forceShow == null)? 0 :this.forceShow.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.slug == null)? 0 :this.slug.hashCode()));
        result = ((result* 31)+((this.updatedAt == null)? 0 :this.updatedAt.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Tag) == false) {
            return false;
        }
        Tag rhs = ((Tag) other);
        return ((((((((((((((((this.forceHide == rhs.forceHide)||((this.forceHide!= null)&&this.forceHide.equals(rhs.forceHide)))&&((this.updatedBy == rhs.updatedBy)||((this.updatedBy!= null)&&this.updatedBy.equals(rhs.updatedBy))))&&((this.$schema == rhs.$schema)||((this.$schema!= null)&&this.$schema.equals(rhs.$schema))))&&((this.requiresTranslation == rhs.requiresTranslation)||((this.requiresTranslation!= null)&&this.requiresTranslation.equals(rhs.requiresTranslation))))&&((this.publishedAt == rhs.publishedAt)||((this.publishedAt!= null)&&this.publishedAt.equals(rhs.publishedAt))))&&((this.templates == rhs.templates)||((this.templates!= null)&&this.templates.equals(rhs.templates))))&&((this.activeEventsCount == rhs.activeEventsCount)||((this.activeEventsCount!= null)&&this.activeEventsCount.equals(rhs.activeEventsCount))))&&((this.label == rhs.label)||((this.label!= null)&&this.label.equals(rhs.label))))&&((this.isCarousel == rhs.isCarousel)||((this.isCarousel!= null)&&this.isCarousel.equals(rhs.isCarousel))))&&((this.createdAt == rhs.createdAt)||((this.createdAt!= null)&&this.createdAt.equals(rhs.createdAt))))&&((this.createdBy == rhs.createdBy)||((this.createdBy!= null)&&this.createdBy.equals(rhs.createdBy))))&&((this.forceShow == rhs.forceShow)||((this.forceShow!= null)&&this.forceShow.equals(rhs.forceShow))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.slug == rhs.slug)||((this.slug!= null)&&this.slug.equals(rhs.slug))))&&((this.updatedAt == rhs.updatedAt)||((this.updatedAt!= null)&&this.updatedAt.equals(rhs.updatedAt))));
    }

}
