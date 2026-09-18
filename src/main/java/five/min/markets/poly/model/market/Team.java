
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
    "abbreviation",
    "alias",
    "color",
    "createdAt",
    "externalPartners",
    "id",
    "league",
    "logo",
    "name",
    "ordering",
    "providerId",
    "record",
    "updatedAt"
})
@Generated("jsonschema2pojo")
public class Team {

    /**
     * A URL to the JSON Schema for this object.
     * 
     */
    @JsonProperty("$schema")
    @JsonPropertyDescription("A URL to the JSON Schema for this object.")
    private URI $schema;
    @JsonProperty("abbreviation")
    private String abbreviation;
    @JsonProperty("alias")
    private String alias;
    @JsonProperty("color")
    private String color;
    @JsonProperty("createdAt")
    private Date createdAt;
    @JsonProperty("externalPartners")
    private List<TeamExternalPartnerMapping> externalPartners = new ArrayList<TeamExternalPartnerMapping>();
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("id")
    private Integer id;
    @JsonProperty("league")
    private String league;
    @JsonProperty("logo")
    private String logo;
    @JsonProperty("name")
    private String name;
    @JsonProperty("ordering")
    private String ordering;
    @JsonProperty("providerId")
    private Integer providerId;
    @JsonProperty("record")
    private String record;
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

    public Team with$schema(URI $schema) {
        this.$schema = $schema;
        return this;
    }

    @JsonProperty("abbreviation")
    public String getAbbreviation() {
        return abbreviation;
    }

    @JsonProperty("abbreviation")
    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public Team withAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
        return this;
    }

    @JsonProperty("alias")
    public String getAlias() {
        return alias;
    }

    @JsonProperty("alias")
    public void setAlias(String alias) {
        this.alias = alias;
    }

    public Team withAlias(String alias) {
        this.alias = alias;
        return this;
    }

    @JsonProperty("color")
    public String getColor() {
        return color;
    }

    @JsonProperty("color")
    public void setColor(String color) {
        this.color = color;
    }

    public Team withColor(String color) {
        this.color = color;
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

    public Team withCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    @JsonProperty("externalPartners")
    public List<TeamExternalPartnerMapping> getExternalPartners() {
        return externalPartners;
    }

    @JsonProperty("externalPartners")
    public void setExternalPartners(List<TeamExternalPartnerMapping> externalPartners) {
        this.externalPartners = externalPartners;
    }

    public Team withExternalPartners(List<TeamExternalPartnerMapping> externalPartners) {
        this.externalPartners = externalPartners;
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

    public Team withId(Integer id) {
        this.id = id;
        return this;
    }

    @JsonProperty("league")
    public String getLeague() {
        return league;
    }

    @JsonProperty("league")
    public void setLeague(String league) {
        this.league = league;
    }

    public Team withLeague(String league) {
        this.league = league;
        return this;
    }

    @JsonProperty("logo")
    public String getLogo() {
        return logo;
    }

    @JsonProperty("logo")
    public void setLogo(String logo) {
        this.logo = logo;
    }

    public Team withLogo(String logo) {
        this.logo = logo;
        return this;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public Team withName(String name) {
        this.name = name;
        return this;
    }

    @JsonProperty("ordering")
    public String getOrdering() {
        return ordering;
    }

    @JsonProperty("ordering")
    public void setOrdering(String ordering) {
        this.ordering = ordering;
    }

    public Team withOrdering(String ordering) {
        this.ordering = ordering;
        return this;
    }

    @JsonProperty("providerId")
    public Integer getProviderId() {
        return providerId;
    }

    @JsonProperty("providerId")
    public void setProviderId(Integer providerId) {
        this.providerId = providerId;
    }

    public Team withProviderId(Integer providerId) {
        this.providerId = providerId;
        return this;
    }

    @JsonProperty("record")
    public String getRecord() {
        return record;
    }

    @JsonProperty("record")
    public void setRecord(String record) {
        this.record = record;
    }

    public Team withRecord(String record) {
        this.record = record;
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

    public Team withUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Team.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("$schema");
        sb.append('=');
        sb.append(((this.$schema == null)?"<null>":this.$schema));
        sb.append(',');
        sb.append("abbreviation");
        sb.append('=');
        sb.append(((this.abbreviation == null)?"<null>":this.abbreviation));
        sb.append(',');
        sb.append("alias");
        sb.append('=');
        sb.append(((this.alias == null)?"<null>":this.alias));
        sb.append(',');
        sb.append("color");
        sb.append('=');
        sb.append(((this.color == null)?"<null>":this.color));
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
        sb.append("league");
        sb.append('=');
        sb.append(((this.league == null)?"<null>":this.league));
        sb.append(',');
        sb.append("logo");
        sb.append('=');
        sb.append(((this.logo == null)?"<null>":this.logo));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("ordering");
        sb.append('=');
        sb.append(((this.ordering == null)?"<null>":this.ordering));
        sb.append(',');
        sb.append("providerId");
        sb.append('=');
        sb.append(((this.providerId == null)?"<null>":this.providerId));
        sb.append(',');
        sb.append("record");
        sb.append('=');
        sb.append(((this.record == null)?"<null>":this.record));
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
        result = ((result* 31)+((this.$schema == null)? 0 :this.$schema.hashCode()));
        result = ((result* 31)+((this.color == null)? 0 :this.color.hashCode()));
        result = ((result* 31)+((this.ordering == null)? 0 :this.ordering.hashCode()));
        result = ((result* 31)+((this.league == null)? 0 :this.league.hashCode()));
        result = ((result* 31)+((this.abbreviation == null)? 0 :this.abbreviation.hashCode()));
        result = ((result* 31)+((this.createdAt == null)? 0 :this.createdAt.hashCode()));
        result = ((result* 31)+((this.externalPartners == null)? 0 :this.externalPartners.hashCode()));
        result = ((result* 31)+((this.providerId == null)? 0 :this.providerId.hashCode()));
        result = ((result* 31)+((this.record == null)? 0 :this.record.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.alias == null)? 0 :this.alias.hashCode()));
        result = ((result* 31)+((this.logo == null)? 0 :this.logo.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.updatedAt == null)? 0 :this.updatedAt.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Team) == false) {
            return false;
        }
        Team rhs = ((Team) other);
        return (((((((((((((((this.$schema == rhs.$schema)||((this.$schema!= null)&&this.$schema.equals(rhs.$schema)))&&((this.color == rhs.color)||((this.color!= null)&&this.color.equals(rhs.color))))&&((this.ordering == rhs.ordering)||((this.ordering!= null)&&this.ordering.equals(rhs.ordering))))&&((this.league == rhs.league)||((this.league!= null)&&this.league.equals(rhs.league))))&&((this.abbreviation == rhs.abbreviation)||((this.abbreviation!= null)&&this.abbreviation.equals(rhs.abbreviation))))&&((this.createdAt == rhs.createdAt)||((this.createdAt!= null)&&this.createdAt.equals(rhs.createdAt))))&&((this.externalPartners == rhs.externalPartners)||((this.externalPartners!= null)&&this.externalPartners.equals(rhs.externalPartners))))&&((this.providerId == rhs.providerId)||((this.providerId!= null)&&this.providerId.equals(rhs.providerId))))&&((this.record == rhs.record)||((this.record!= null)&&this.record.equals(rhs.record))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.alias == rhs.alias)||((this.alias!= null)&&this.alias.equals(rhs.alias))))&&((this.logo == rhs.logo)||((this.logo!= null)&&this.logo.equals(rhs.logo))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.updatedAt == rhs.updatedAt)||((this.updatedAt!= null)&&this.updatedAt.equals(rhs.updatedAt))));
    }

}
