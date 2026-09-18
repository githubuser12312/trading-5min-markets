
package five.min.markets.poly.model.market;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "exponent",
    "rate",
    "rebateRate",
    "takerOnly"
})
@Generated("jsonschema2pojo")
public class FeeSchedule {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("exponent")
    private Double exponent;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("rate")
    private Double rate;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("rebateRate")
    private Double rebateRate;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("takerOnly")
    private Boolean takerOnly;

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("exponent")
    public Double getExponent() {
        return exponent;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("exponent")
    public void setExponent(Double exponent) {
        this.exponent = exponent;
    }

    public FeeSchedule withExponent(Double exponent) {
        this.exponent = exponent;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("rate")
    public Double getRate() {
        return rate;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("rate")
    public void setRate(Double rate) {
        this.rate = rate;
    }

    public FeeSchedule withRate(Double rate) {
        this.rate = rate;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("rebateRate")
    public Double getRebateRate() {
        return rebateRate;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("rebateRate")
    public void setRebateRate(Double rebateRate) {
        this.rebateRate = rebateRate;
    }

    public FeeSchedule withRebateRate(Double rebateRate) {
        this.rebateRate = rebateRate;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("takerOnly")
    public Boolean getTakerOnly() {
        return takerOnly;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("takerOnly")
    public void setTakerOnly(Boolean takerOnly) {
        this.takerOnly = takerOnly;
    }

    public FeeSchedule withTakerOnly(Boolean takerOnly) {
        this.takerOnly = takerOnly;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(FeeSchedule.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("exponent");
        sb.append('=');
        sb.append(((this.exponent == null)?"<null>":this.exponent));
        sb.append(',');
        sb.append("rate");
        sb.append('=');
        sb.append(((this.rate == null)?"<null>":this.rate));
        sb.append(',');
        sb.append("rebateRate");
        sb.append('=');
        sb.append(((this.rebateRate == null)?"<null>":this.rebateRate));
        sb.append(',');
        sb.append("takerOnly");
        sb.append('=');
        sb.append(((this.takerOnly == null)?"<null>":this.takerOnly));
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
        result = ((result* 31)+((this.rebateRate == null)? 0 :this.rebateRate.hashCode()));
        result = ((result* 31)+((this.takerOnly == null)? 0 :this.takerOnly.hashCode()));
        result = ((result* 31)+((this.rate == null)? 0 :this.rate.hashCode()));
        result = ((result* 31)+((this.exponent == null)? 0 :this.exponent.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FeeSchedule) == false) {
            return false;
        }
        FeeSchedule rhs = ((FeeSchedule) other);
        return (((((this.rebateRate == rhs.rebateRate)||((this.rebateRate!= null)&&this.rebateRate.equals(rhs.rebateRate)))&&((this.takerOnly == rhs.takerOnly)||((this.takerOnly!= null)&&this.takerOnly.equals(rhs.takerOnly))))&&((this.rate == rhs.rate)||((this.rate!= null)&&this.rate.equals(rhs.rate))))&&((this.exponent == rhs.exponent)||((this.exponent!= null)&&this.exponent.equals(rhs.exponent))));
    }

}
