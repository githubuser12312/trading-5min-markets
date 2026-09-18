
package five.min.markets.poly.model.market;

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
    "externalId",
    "id",
    "partner",
    "partnerId",
    "sportId",
    "updatedAt"
})
@Generated("jsonschema2pojo")
public class SportExternalPartnerMapping {

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
    @JsonProperty("externalId")
    private String externalId;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("id")
    private Integer id;
    @JsonProperty("partner")
    private Partner partner;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("partnerId")
    private Integer partnerId;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("sportId")
    private Integer sportId;
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

    public SportExternalPartnerMapping with$schema(URI $schema) {
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

    public SportExternalPartnerMapping withCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("externalId")
    public String getExternalId() {
        return externalId;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("externalId")
    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    public SportExternalPartnerMapping withExternalId(String externalId) {
        this.externalId = externalId;
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

    public SportExternalPartnerMapping withId(Integer id) {
        this.id = id;
        return this;
    }

    @JsonProperty("partner")
    public Partner getPartner() {
        return partner;
    }

    @JsonProperty("partner")
    public void setPartner(Partner partner) {
        this.partner = partner;
    }

    public SportExternalPartnerMapping withPartner(Partner partner) {
        this.partner = partner;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("partnerId")
    public Integer getPartnerId() {
        return partnerId;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("partnerId")
    public void setPartnerId(Integer partnerId) {
        this.partnerId = partnerId;
    }

    public SportExternalPartnerMapping withPartnerId(Integer partnerId) {
        this.partnerId = partnerId;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("sportId")
    public Integer getSportId() {
        return sportId;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("sportId")
    public void setSportId(Integer sportId) {
        this.sportId = sportId;
    }

    public SportExternalPartnerMapping withSportId(Integer sportId) {
        this.sportId = sportId;
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

    public SportExternalPartnerMapping withUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SportExternalPartnerMapping.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("$schema");
        sb.append('=');
        sb.append(((this.$schema == null)?"<null>":this.$schema));
        sb.append(',');
        sb.append("createdAt");
        sb.append('=');
        sb.append(((this.createdAt == null)?"<null>":this.createdAt));
        sb.append(',');
        sb.append("externalId");
        sb.append('=');
        sb.append(((this.externalId == null)?"<null>":this.externalId));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("partner");
        sb.append('=');
        sb.append(((this.partner == null)?"<null>":this.partner));
        sb.append(',');
        sb.append("partnerId");
        sb.append('=');
        sb.append(((this.partnerId == null)?"<null>":this.partnerId));
        sb.append(',');
        sb.append("sportId");
        sb.append('=');
        sb.append(((this.sportId == null)?"<null>":this.sportId));
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
        result = ((result* 31)+((this.sportId == null)? 0 :this.sportId.hashCode()));
        result = ((result* 31)+((this.$schema == null)? 0 :this.$schema.hashCode()));
        result = ((result* 31)+((this.partner == null)? 0 :this.partner.hashCode()));
        result = ((result* 31)+((this.externalId == null)? 0 :this.externalId.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.partnerId == null)? 0 :this.partnerId.hashCode()));
        result = ((result* 31)+((this.updatedAt == null)? 0 :this.updatedAt.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SportExternalPartnerMapping) == false) {
            return false;
        }
        SportExternalPartnerMapping rhs = ((SportExternalPartnerMapping) other);
        return (((((((((this.createdAt == rhs.createdAt)||((this.createdAt!= null)&&this.createdAt.equals(rhs.createdAt)))&&((this.sportId == rhs.sportId)||((this.sportId!= null)&&this.sportId.equals(rhs.sportId))))&&((this.$schema == rhs.$schema)||((this.$schema!= null)&&this.$schema.equals(rhs.$schema))))&&((this.partner == rhs.partner)||((this.partner!= null)&&this.partner.equals(rhs.partner))))&&((this.externalId == rhs.externalId)||((this.externalId!= null)&&this.externalId.equals(rhs.externalId))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.partnerId == rhs.partnerId)||((this.partnerId!= null)&&this.partnerId.equals(rhs.partnerId))))&&((this.updatedAt == rhs.updatedAt)||((this.updatedAt!= null)&&this.updatedAt.equals(rhs.updatedAt))));
    }

}
