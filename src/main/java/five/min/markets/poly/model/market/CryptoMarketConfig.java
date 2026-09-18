
package five.min.markets.poly.model.market;

import java.net.URI;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "$schema",
    "asset",
    "duration",
    "id",
    "twapEnabled",
    "twapLookbackSeconds"
})
@Generated("jsonschema2pojo")
public class CryptoMarketConfig {

    /**
     * A URL to the JSON Schema for this object.
     * 
     */
    @JsonProperty("$schema")
    @JsonPropertyDescription("A URL to the JSON Schema for this object.")
    private URI $schema;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("asset")
    private String asset;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("duration")
    private String duration;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("id")
    private String id;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("twapEnabled")
    private Boolean twapEnabled;
    @JsonProperty("twapLookbackSeconds")
    private Integer twapLookbackSeconds;

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

    public CryptoMarketConfig with$schema(URI $schema) {
        this.$schema = $schema;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("asset")
    public String getAsset() {
        return asset;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("asset")
    public void setAsset(String asset) {
        this.asset = asset;
    }

    public CryptoMarketConfig withAsset(String asset) {
        this.asset = asset;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("duration")
    public String getDuration() {
        return duration;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("duration")
    public void setDuration(String duration) {
        this.duration = duration;
    }

    public CryptoMarketConfig withDuration(String duration) {
        this.duration = duration;
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

    public CryptoMarketConfig withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("twapEnabled")
    public Boolean getTwapEnabled() {
        return twapEnabled;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("twapEnabled")
    public void setTwapEnabled(Boolean twapEnabled) {
        this.twapEnabled = twapEnabled;
    }

    public CryptoMarketConfig withTwapEnabled(Boolean twapEnabled) {
        this.twapEnabled = twapEnabled;
        return this;
    }

    @JsonProperty("twapLookbackSeconds")
    public Integer getTwapLookbackSeconds() {
        return twapLookbackSeconds;
    }

    @JsonProperty("twapLookbackSeconds")
    public void setTwapLookbackSeconds(Integer twapLookbackSeconds) {
        this.twapLookbackSeconds = twapLookbackSeconds;
    }

    public CryptoMarketConfig withTwapLookbackSeconds(Integer twapLookbackSeconds) {
        this.twapLookbackSeconds = twapLookbackSeconds;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CryptoMarketConfig.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("$schema");
        sb.append('=');
        sb.append(((this.$schema == null)?"<null>":this.$schema));
        sb.append(',');
        sb.append("asset");
        sb.append('=');
        sb.append(((this.asset == null)?"<null>":this.asset));
        sb.append(',');
        sb.append("duration");
        sb.append('=');
        sb.append(((this.duration == null)?"<null>":this.duration));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("twapEnabled");
        sb.append('=');
        sb.append(((this.twapEnabled == null)?"<null>":this.twapEnabled));
        sb.append(',');
        sb.append("twapLookbackSeconds");
        sb.append('=');
        sb.append(((this.twapLookbackSeconds == null)?"<null>":this.twapLookbackSeconds));
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
        result = ((result* 31)+((this.duration == null)? 0 :this.duration.hashCode()));
        result = ((result* 31)+((this.twapEnabled == null)? 0 :this.twapEnabled.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.$schema == null)? 0 :this.$schema.hashCode()));
        result = ((result* 31)+((this.asset == null)? 0 :this.asset.hashCode()));
        result = ((result* 31)+((this.twapLookbackSeconds == null)? 0 :this.twapLookbackSeconds.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CryptoMarketConfig) == false) {
            return false;
        }
        CryptoMarketConfig rhs = ((CryptoMarketConfig) other);
        return (((((((this.duration == rhs.duration)||((this.duration!= null)&&this.duration.equals(rhs.duration)))&&((this.twapEnabled == rhs.twapEnabled)||((this.twapEnabled!= null)&&this.twapEnabled.equals(rhs.twapEnabled))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.$schema == rhs.$schema)||((this.$schema!= null)&&this.$schema.equals(rhs.$schema))))&&((this.asset == rhs.asset)||((this.asset!= null)&&this.asset.equals(rhs.asset))))&&((this.twapLookbackSeconds == rhs.twapLookbackSeconds)||((this.twapLookbackSeconds!= null)&&this.twapLookbackSeconds.equals(rhs.twapLookbackSeconds))));
    }

}
