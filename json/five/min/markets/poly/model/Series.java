
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
    "active",
    "archived",
    "cgAssetName",
    "closed",
    "commentCount",
    "commentsEnabled",
    "competitive",
    "createdAt",
    "createdBy",
    "description",
    "events",
    "featured",
    "icon",
    "id",
    "image",
    "isTemplate",
    "layout",
    "liquidity",
    "new",
    "publishedAt",
    "pythTokenID",
    "recurrence",
    "requiresTranslation",
    "restricted",
    "score",
    "seriesType",
    "slug",
    "startDate",
    "subtitle",
    "tags",
    "templateVariables",
    "ticker",
    "title",
    "updatedAt",
    "updatedBy",
    "volume",
    "volume24hr"
})
@Generated("jsonschema2pojo")
public class Series {

    /**
     * A URL to the JSON Schema for this object.
     * 
     */
    @JsonProperty("$schema")
    @JsonPropertyDescription("A URL to the JSON Schema for this object.")
    private URI $schema;
    @JsonProperty("active")
    private Boolean active;
    @JsonProperty("archived")
    private Boolean archived;
    @JsonProperty("cgAssetName")
    private String cgAssetName;
    @JsonProperty("closed")
    private Boolean closed;
    @JsonProperty("commentCount")
    private Integer commentCount;
    @JsonProperty("commentsEnabled")
    private Boolean commentsEnabled;
    @JsonProperty("competitive")
    private String competitive;
    @JsonProperty("createdAt")
    private Date createdAt;
    @JsonProperty("createdBy")
    private String createdBy;
    @JsonProperty("description")
    private String description;
    @JsonProperty("events")
    private List<Event> events = new ArrayList<Event>();
    @JsonProperty("featured")
    private Boolean featured;
    @JsonProperty("icon")
    private String icon;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("id")
    private String id;
    @JsonProperty("image")
    private String image;
    @JsonProperty("isTemplate")
    private Boolean isTemplate;
    @JsonProperty("layout")
    private String layout;
    @JsonProperty("liquidity")
    private Double liquidity;
    @JsonProperty("new")
    private Boolean _new;
    @JsonProperty("publishedAt")
    private String publishedAt;
    @JsonProperty("pythTokenID")
    private String pythTokenID;
    @JsonProperty("recurrence")
    private String recurrence;
    @JsonProperty("requiresTranslation")
    private Boolean requiresTranslation;
    @JsonProperty("restricted")
    private Boolean restricted;
    @JsonProperty("score")
    private Integer score;
    @JsonProperty("seriesType")
    private String seriesType;
    @JsonProperty("slug")
    private String slug;
    @JsonProperty("startDate")
    private Date startDate;
    @JsonProperty("subtitle")
    private String subtitle;
    @JsonProperty("tags")
    private List<Tag> tags = new ArrayList<Tag>();
    @JsonProperty("templateVariables")
    private Boolean templateVariables;
    @JsonProperty("ticker")
    private String ticker;
    @JsonProperty("title")
    private String title;
    @JsonProperty("updatedAt")
    private Date updatedAt;
    @JsonProperty("updatedBy")
    private String updatedBy;
    @JsonProperty("volume")
    private Double volume;
    @JsonProperty("volume24hr")
    private Double volume24hr;

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

    public Series with$schema(URI $schema) {
        this.$schema = $schema;
        return this;
    }

    @JsonProperty("active")
    public Boolean getActive() {
        return active;
    }

    @JsonProperty("active")
    public void setActive(Boolean active) {
        this.active = active;
    }

    public Series withActive(Boolean active) {
        this.active = active;
        return this;
    }

    @JsonProperty("archived")
    public Boolean getArchived() {
        return archived;
    }

    @JsonProperty("archived")
    public void setArchived(Boolean archived) {
        this.archived = archived;
    }

    public Series withArchived(Boolean archived) {
        this.archived = archived;
        return this;
    }

    @JsonProperty("cgAssetName")
    public String getCgAssetName() {
        return cgAssetName;
    }

    @JsonProperty("cgAssetName")
    public void setCgAssetName(String cgAssetName) {
        this.cgAssetName = cgAssetName;
    }

    public Series withCgAssetName(String cgAssetName) {
        this.cgAssetName = cgAssetName;
        return this;
    }

    @JsonProperty("closed")
    public Boolean getClosed() {
        return closed;
    }

    @JsonProperty("closed")
    public void setClosed(Boolean closed) {
        this.closed = closed;
    }

    public Series withClosed(Boolean closed) {
        this.closed = closed;
        return this;
    }

    @JsonProperty("commentCount")
    public Integer getCommentCount() {
        return commentCount;
    }

    @JsonProperty("commentCount")
    public void setCommentCount(Integer commentCount) {
        this.commentCount = commentCount;
    }

    public Series withCommentCount(Integer commentCount) {
        this.commentCount = commentCount;
        return this;
    }

    @JsonProperty("commentsEnabled")
    public Boolean getCommentsEnabled() {
        return commentsEnabled;
    }

    @JsonProperty("commentsEnabled")
    public void setCommentsEnabled(Boolean commentsEnabled) {
        this.commentsEnabled = commentsEnabled;
    }

    public Series withCommentsEnabled(Boolean commentsEnabled) {
        this.commentsEnabled = commentsEnabled;
        return this;
    }

    @JsonProperty("competitive")
    public String getCompetitive() {
        return competitive;
    }

    @JsonProperty("competitive")
    public void setCompetitive(String competitive) {
        this.competitive = competitive;
    }

    public Series withCompetitive(String competitive) {
        this.competitive = competitive;
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

    public Series withCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    @JsonProperty("createdBy")
    public String getCreatedBy() {
        return createdBy;
    }

    @JsonProperty("createdBy")
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Series withCreatedBy(String createdBy) {
        this.createdBy = createdBy;
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

    public Series withDescription(String description) {
        this.description = description;
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

    public Series withEvents(List<Event> events) {
        this.events = events;
        return this;
    }

    @JsonProperty("featured")
    public Boolean getFeatured() {
        return featured;
    }

    @JsonProperty("featured")
    public void setFeatured(Boolean featured) {
        this.featured = featured;
    }

    public Series withFeatured(Boolean featured) {
        this.featured = featured;
        return this;
    }

    @JsonProperty("icon")
    public String getIcon() {
        return icon;
    }

    @JsonProperty("icon")
    public void setIcon(String icon) {
        this.icon = icon;
    }

    public Series withIcon(String icon) {
        this.icon = icon;
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

    public Series withId(String id) {
        this.id = id;
        return this;
    }

    @JsonProperty("image")
    public String getImage() {
        return image;
    }

    @JsonProperty("image")
    public void setImage(String image) {
        this.image = image;
    }

    public Series withImage(String image) {
        this.image = image;
        return this;
    }

    @JsonProperty("isTemplate")
    public Boolean getIsTemplate() {
        return isTemplate;
    }

    @JsonProperty("isTemplate")
    public void setIsTemplate(Boolean isTemplate) {
        this.isTemplate = isTemplate;
    }

    public Series withIsTemplate(Boolean isTemplate) {
        this.isTemplate = isTemplate;
        return this;
    }

    @JsonProperty("layout")
    public String getLayout() {
        return layout;
    }

    @JsonProperty("layout")
    public void setLayout(String layout) {
        this.layout = layout;
    }

    public Series withLayout(String layout) {
        this.layout = layout;
        return this;
    }

    @JsonProperty("liquidity")
    public Double getLiquidity() {
        return liquidity;
    }

    @JsonProperty("liquidity")
    public void setLiquidity(Double liquidity) {
        this.liquidity = liquidity;
    }

    public Series withLiquidity(Double liquidity) {
        this.liquidity = liquidity;
        return this;
    }

    @JsonProperty("new")
    public Boolean getNew() {
        return _new;
    }

    @JsonProperty("new")
    public void setNew(Boolean _new) {
        this._new = _new;
    }

    public Series withNew(Boolean _new) {
        this._new = _new;
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

    public Series withPublishedAt(String publishedAt) {
        this.publishedAt = publishedAt;
        return this;
    }

    @JsonProperty("pythTokenID")
    public String getPythTokenID() {
        return pythTokenID;
    }

    @JsonProperty("pythTokenID")
    public void setPythTokenID(String pythTokenID) {
        this.pythTokenID = pythTokenID;
    }

    public Series withPythTokenID(String pythTokenID) {
        this.pythTokenID = pythTokenID;
        return this;
    }

    @JsonProperty("recurrence")
    public String getRecurrence() {
        return recurrence;
    }

    @JsonProperty("recurrence")
    public void setRecurrence(String recurrence) {
        this.recurrence = recurrence;
    }

    public Series withRecurrence(String recurrence) {
        this.recurrence = recurrence;
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

    public Series withRequiresTranslation(Boolean requiresTranslation) {
        this.requiresTranslation = requiresTranslation;
        return this;
    }

    @JsonProperty("restricted")
    public Boolean getRestricted() {
        return restricted;
    }

    @JsonProperty("restricted")
    public void setRestricted(Boolean restricted) {
        this.restricted = restricted;
    }

    public Series withRestricted(Boolean restricted) {
        this.restricted = restricted;
        return this;
    }

    @JsonProperty("score")
    public Integer getScore() {
        return score;
    }

    @JsonProperty("score")
    public void setScore(Integer score) {
        this.score = score;
    }

    public Series withScore(Integer score) {
        this.score = score;
        return this;
    }

    @JsonProperty("seriesType")
    public String getSeriesType() {
        return seriesType;
    }

    @JsonProperty("seriesType")
    public void setSeriesType(String seriesType) {
        this.seriesType = seriesType;
    }

    public Series withSeriesType(String seriesType) {
        this.seriesType = seriesType;
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

    public Series withSlug(String slug) {
        this.slug = slug;
        return this;
    }

    @JsonProperty("startDate")
    public Date getStartDate() {
        return startDate;
    }

    @JsonProperty("startDate")
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Series withStartDate(Date startDate) {
        this.startDate = startDate;
        return this;
    }

    @JsonProperty("subtitle")
    public String getSubtitle() {
        return subtitle;
    }

    @JsonProperty("subtitle")
    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public Series withSubtitle(String subtitle) {
        this.subtitle = subtitle;
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

    public Series withTags(List<Tag> tags) {
        this.tags = tags;
        return this;
    }

    @JsonProperty("templateVariables")
    public Boolean getTemplateVariables() {
        return templateVariables;
    }

    @JsonProperty("templateVariables")
    public void setTemplateVariables(Boolean templateVariables) {
        this.templateVariables = templateVariables;
    }

    public Series withTemplateVariables(Boolean templateVariables) {
        this.templateVariables = templateVariables;
        return this;
    }

    @JsonProperty("ticker")
    public String getTicker() {
        return ticker;
    }

    @JsonProperty("ticker")
    public void setTicker(String ticker) {
        this.ticker = ticker;
    }

    public Series withTicker(String ticker) {
        this.ticker = ticker;
        return this;
    }

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    public Series withTitle(String title) {
        this.title = title;
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

    public Series withUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    @JsonProperty("updatedBy")
    public String getUpdatedBy() {
        return updatedBy;
    }

    @JsonProperty("updatedBy")
    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public Series withUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
        return this;
    }

    @JsonProperty("volume")
    public Double getVolume() {
        return volume;
    }

    @JsonProperty("volume")
    public void setVolume(Double volume) {
        this.volume = volume;
    }

    public Series withVolume(Double volume) {
        this.volume = volume;
        return this;
    }

    @JsonProperty("volume24hr")
    public Double getVolume24hr() {
        return volume24hr;
    }

    @JsonProperty("volume24hr")
    public void setVolume24hr(Double volume24hr) {
        this.volume24hr = volume24hr;
    }

    public Series withVolume24hr(Double volume24hr) {
        this.volume24hr = volume24hr;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Series.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("$schema");
        sb.append('=');
        sb.append(((this.$schema == null)?"<null>":this.$schema));
        sb.append(',');
        sb.append("active");
        sb.append('=');
        sb.append(((this.active == null)?"<null>":this.active));
        sb.append(',');
        sb.append("archived");
        sb.append('=');
        sb.append(((this.archived == null)?"<null>":this.archived));
        sb.append(',');
        sb.append("cgAssetName");
        sb.append('=');
        sb.append(((this.cgAssetName == null)?"<null>":this.cgAssetName));
        sb.append(',');
        sb.append("closed");
        sb.append('=');
        sb.append(((this.closed == null)?"<null>":this.closed));
        sb.append(',');
        sb.append("commentCount");
        sb.append('=');
        sb.append(((this.commentCount == null)?"<null>":this.commentCount));
        sb.append(',');
        sb.append("commentsEnabled");
        sb.append('=');
        sb.append(((this.commentsEnabled == null)?"<null>":this.commentsEnabled));
        sb.append(',');
        sb.append("competitive");
        sb.append('=');
        sb.append(((this.competitive == null)?"<null>":this.competitive));
        sb.append(',');
        sb.append("createdAt");
        sb.append('=');
        sb.append(((this.createdAt == null)?"<null>":this.createdAt));
        sb.append(',');
        sb.append("createdBy");
        sb.append('=');
        sb.append(((this.createdBy == null)?"<null>":this.createdBy));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("events");
        sb.append('=');
        sb.append(((this.events == null)?"<null>":this.events));
        sb.append(',');
        sb.append("featured");
        sb.append('=');
        sb.append(((this.featured == null)?"<null>":this.featured));
        sb.append(',');
        sb.append("icon");
        sb.append('=');
        sb.append(((this.icon == null)?"<null>":this.icon));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("image");
        sb.append('=');
        sb.append(((this.image == null)?"<null>":this.image));
        sb.append(',');
        sb.append("isTemplate");
        sb.append('=');
        sb.append(((this.isTemplate == null)?"<null>":this.isTemplate));
        sb.append(',');
        sb.append("layout");
        sb.append('=');
        sb.append(((this.layout == null)?"<null>":this.layout));
        sb.append(',');
        sb.append("liquidity");
        sb.append('=');
        sb.append(((this.liquidity == null)?"<null>":this.liquidity));
        sb.append(',');
        sb.append("_new");
        sb.append('=');
        sb.append(((this._new == null)?"<null>":this._new));
        sb.append(',');
        sb.append("publishedAt");
        sb.append('=');
        sb.append(((this.publishedAt == null)?"<null>":this.publishedAt));
        sb.append(',');
        sb.append("pythTokenID");
        sb.append('=');
        sb.append(((this.pythTokenID == null)?"<null>":this.pythTokenID));
        sb.append(',');
        sb.append("recurrence");
        sb.append('=');
        sb.append(((this.recurrence == null)?"<null>":this.recurrence));
        sb.append(',');
        sb.append("requiresTranslation");
        sb.append('=');
        sb.append(((this.requiresTranslation == null)?"<null>":this.requiresTranslation));
        sb.append(',');
        sb.append("restricted");
        sb.append('=');
        sb.append(((this.restricted == null)?"<null>":this.restricted));
        sb.append(',');
        sb.append("score");
        sb.append('=');
        sb.append(((this.score == null)?"<null>":this.score));
        sb.append(',');
        sb.append("seriesType");
        sb.append('=');
        sb.append(((this.seriesType == null)?"<null>":this.seriesType));
        sb.append(',');
        sb.append("slug");
        sb.append('=');
        sb.append(((this.slug == null)?"<null>":this.slug));
        sb.append(',');
        sb.append("startDate");
        sb.append('=');
        sb.append(((this.startDate == null)?"<null>":this.startDate));
        sb.append(',');
        sb.append("subtitle");
        sb.append('=');
        sb.append(((this.subtitle == null)?"<null>":this.subtitle));
        sb.append(',');
        sb.append("tags");
        sb.append('=');
        sb.append(((this.tags == null)?"<null>":this.tags));
        sb.append(',');
        sb.append("templateVariables");
        sb.append('=');
        sb.append(((this.templateVariables == null)?"<null>":this.templateVariables));
        sb.append(',');
        sb.append("ticker");
        sb.append('=');
        sb.append(((this.ticker == null)?"<null>":this.ticker));
        sb.append(',');
        sb.append("title");
        sb.append('=');
        sb.append(((this.title == null)?"<null>":this.title));
        sb.append(',');
        sb.append("updatedAt");
        sb.append('=');
        sb.append(((this.updatedAt == null)?"<null>":this.updatedAt));
        sb.append(',');
        sb.append("updatedBy");
        sb.append('=');
        sb.append(((this.updatedBy == null)?"<null>":this.updatedBy));
        sb.append(',');
        sb.append("volume");
        sb.append('=');
        sb.append(((this.volume == null)?"<null>":this.volume));
        sb.append(',');
        sb.append("volume24hr");
        sb.append('=');
        sb.append(((this.volume24hr == null)?"<null>":this.volume24hr));
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
        result = ((result* 31)+((this.commentsEnabled == null)? 0 :this.commentsEnabled.hashCode()));
        result = ((result* 31)+((this.featured == null)? 0 :this.featured.hashCode()));
        result = ((result* 31)+((this.volume24hr == null)? 0 :this.volume24hr.hashCode()));
        result = ((result* 31)+((this.$schema == null)? 0 :this.$schema.hashCode()));
        result = ((result* 31)+((this.cgAssetName == null)? 0 :this.cgAssetName.hashCode()));
        result = ((result* 31)+((this.icon == null)? 0 :this.icon.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.liquidity == null)? 0 :this.liquidity.hashCode()));
        result = ((result* 31)+((this.title == null)? 0 :this.title.hashCode()));
        result = ((result* 31)+((this._new == null)? 0 :this._new.hashCode()));
        result = ((result* 31)+((this.archived == null)? 0 :this.archived.hashCode()));
        result = ((result* 31)+((this.createdAt == null)? 0 :this.createdAt.hashCode()));
        result = ((result* 31)+((this.score == null)? 0 :this.score.hashCode()));
        result = ((result* 31)+((this.seriesType == null)? 0 :this.seriesType.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.events == null)? 0 :this.events.hashCode()));
        result = ((result* 31)+((this.pythTokenID == null)? 0 :this.pythTokenID.hashCode()));
        result = ((result* 31)+((this.slug == null)? 0 :this.slug.hashCode()));
        result = ((result* 31)+((this.updatedAt == null)? 0 :this.updatedAt.hashCode()));
        result = ((result* 31)+((this.image == null)? 0 :this.image.hashCode()));
        result = ((result* 31)+((this.ticker == null)? 0 :this.ticker.hashCode()));
        result = ((result* 31)+((this.updatedBy == null)? 0 :this.updatedBy.hashCode()));
        result = ((result* 31)+((this.requiresTranslation == null)? 0 :this.requiresTranslation.hashCode()));
        result = ((result* 31)+((this.publishedAt == null)? 0 :this.publishedAt.hashCode()));
        result = ((result* 31)+((this.active == null)? 0 :this.active.hashCode()));
        result = ((result* 31)+((this.commentCount == null)? 0 :this.commentCount.hashCode()));
        result = ((result* 31)+((this.tags == null)? 0 :this.tags.hashCode()));
        result = ((result* 31)+((this.templateVariables == null)? 0 :this.templateVariables.hashCode()));
        result = ((result* 31)+((this.layout == null)? 0 :this.layout.hashCode()));
        result = ((result* 31)+((this.recurrence == null)? 0 :this.recurrence.hashCode()));
        result = ((result* 31)+((this.volume == null)? 0 :this.volume.hashCode()));
        result = ((result* 31)+((this.createdBy == null)? 0 :this.createdBy.hashCode()));
        result = ((result* 31)+((this.isTemplate == null)? 0 :this.isTemplate.hashCode()));
        result = ((result* 31)+((this.restricted == null)? 0 :this.restricted.hashCode()));
        result = ((result* 31)+((this.subtitle == null)? 0 :this.subtitle.hashCode()));
        result = ((result* 31)+((this.closed == null)? 0 :this.closed.hashCode()));
        result = ((result* 31)+((this.competitive == null)? 0 :this.competitive.hashCode()));
        result = ((result* 31)+((this.startDate == null)? 0 :this.startDate.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Series) == false) {
            return false;
        }
        Series rhs = ((Series) other);
        return (((((((((((((((((((((((((((((((((((((((this.commentsEnabled == rhs.commentsEnabled)||((this.commentsEnabled!= null)&&this.commentsEnabled.equals(rhs.commentsEnabled)))&&((this.featured == rhs.featured)||((this.featured!= null)&&this.featured.equals(rhs.featured))))&&((this.volume24hr == rhs.volume24hr)||((this.volume24hr!= null)&&this.volume24hr.equals(rhs.volume24hr))))&&((this.$schema == rhs.$schema)||((this.$schema!= null)&&this.$schema.equals(rhs.$schema))))&&((this.cgAssetName == rhs.cgAssetName)||((this.cgAssetName!= null)&&this.cgAssetName.equals(rhs.cgAssetName))))&&((this.icon == rhs.icon)||((this.icon!= null)&&this.icon.equals(rhs.icon))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.liquidity == rhs.liquidity)||((this.liquidity!= null)&&this.liquidity.equals(rhs.liquidity))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))))&&((this._new == rhs._new)||((this._new!= null)&&this._new.equals(rhs._new))))&&((this.archived == rhs.archived)||((this.archived!= null)&&this.archived.equals(rhs.archived))))&&((this.createdAt == rhs.createdAt)||((this.createdAt!= null)&&this.createdAt.equals(rhs.createdAt))))&&((this.score == rhs.score)||((this.score!= null)&&this.score.equals(rhs.score))))&&((this.seriesType == rhs.seriesType)||((this.seriesType!= null)&&this.seriesType.equals(rhs.seriesType))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.events == rhs.events)||((this.events!= null)&&this.events.equals(rhs.events))))&&((this.pythTokenID == rhs.pythTokenID)||((this.pythTokenID!= null)&&this.pythTokenID.equals(rhs.pythTokenID))))&&((this.slug == rhs.slug)||((this.slug!= null)&&this.slug.equals(rhs.slug))))&&((this.updatedAt == rhs.updatedAt)||((this.updatedAt!= null)&&this.updatedAt.equals(rhs.updatedAt))))&&((this.image == rhs.image)||((this.image!= null)&&this.image.equals(rhs.image))))&&((this.ticker == rhs.ticker)||((this.ticker!= null)&&this.ticker.equals(rhs.ticker))))&&((this.updatedBy == rhs.updatedBy)||((this.updatedBy!= null)&&this.updatedBy.equals(rhs.updatedBy))))&&((this.requiresTranslation == rhs.requiresTranslation)||((this.requiresTranslation!= null)&&this.requiresTranslation.equals(rhs.requiresTranslation))))&&((this.publishedAt == rhs.publishedAt)||((this.publishedAt!= null)&&this.publishedAt.equals(rhs.publishedAt))))&&((this.active == rhs.active)||((this.active!= null)&&this.active.equals(rhs.active))))&&((this.commentCount == rhs.commentCount)||((this.commentCount!= null)&&this.commentCount.equals(rhs.commentCount))))&&((this.tags == rhs.tags)||((this.tags!= null)&&this.tags.equals(rhs.tags))))&&((this.templateVariables == rhs.templateVariables)||((this.templateVariables!= null)&&this.templateVariables.equals(rhs.templateVariables))))&&((this.layout == rhs.layout)||((this.layout!= null)&&this.layout.equals(rhs.layout))))&&((this.recurrence == rhs.recurrence)||((this.recurrence!= null)&&this.recurrence.equals(rhs.recurrence))))&&((this.volume == rhs.volume)||((this.volume!= null)&&this.volume.equals(rhs.volume))))&&((this.createdBy == rhs.createdBy)||((this.createdBy!= null)&&this.createdBy.equals(rhs.createdBy))))&&((this.isTemplate == rhs.isTemplate)||((this.isTemplate!= null)&&this.isTemplate.equals(rhs.isTemplate))))&&((this.restricted == rhs.restricted)||((this.restricted!= null)&&this.restricted.equals(rhs.restricted))))&&((this.subtitle == rhs.subtitle)||((this.subtitle!= null)&&this.subtitle.equals(rhs.subtitle))))&&((this.closed == rhs.closed)||((this.closed!= null)&&this.closed.equals(rhs.closed))))&&((this.competitive == rhs.competitive)||((this.competitive!= null)&&this.competitive.equals(rhs.competitive))))&&((this.startDate == rhs.startDate)||((this.startDate!= null)&&this.startDate.equals(rhs.startDate))));
    }

}
