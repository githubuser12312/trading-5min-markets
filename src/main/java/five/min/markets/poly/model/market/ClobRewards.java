
package five.min.markets.poly.model.market;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "assetAddress",
    "conditionId",
    "endDate",
    "id",
    "rewardsAmount",
    "rewardsDailyRate",
    "startDate"
})
@Generated("jsonschema2pojo")
public class ClobRewards {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("assetAddress")
    private String assetAddress;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("conditionId")
    private String conditionId;
    @JsonProperty("endDate")
    private String endDate;
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
    @JsonProperty("rewardsAmount")
    private Double rewardsAmount;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("rewardsDailyRate")
    private Double rewardsDailyRate;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("startDate")
    private String startDate;

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("assetAddress")
    public String getAssetAddress() {
        return assetAddress;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("assetAddress")
    public void setAssetAddress(String assetAddress) {
        this.assetAddress = assetAddress;
    }

    public ClobRewards withAssetAddress(String assetAddress) {
        this.assetAddress = assetAddress;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("conditionId")
    public String getConditionId() {
        return conditionId;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("conditionId")
    public void setConditionId(String conditionId) {
        this.conditionId = conditionId;
    }

    public ClobRewards withConditionId(String conditionId) {
        this.conditionId = conditionId;
        return this;
    }

    @JsonProperty("endDate")
    public String getEndDate() {
        return endDate;
    }

    @JsonProperty("endDate")
    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public ClobRewards withEndDate(String endDate) {
        this.endDate = endDate;
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

    public ClobRewards withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("rewardsAmount")
    public Double getRewardsAmount() {
        return rewardsAmount;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("rewardsAmount")
    public void setRewardsAmount(Double rewardsAmount) {
        this.rewardsAmount = rewardsAmount;
    }

    public ClobRewards withRewardsAmount(Double rewardsAmount) {
        this.rewardsAmount = rewardsAmount;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("rewardsDailyRate")
    public Double getRewardsDailyRate() {
        return rewardsDailyRate;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("rewardsDailyRate")
    public void setRewardsDailyRate(Double rewardsDailyRate) {
        this.rewardsDailyRate = rewardsDailyRate;
    }

    public ClobRewards withRewardsDailyRate(Double rewardsDailyRate) {
        this.rewardsDailyRate = rewardsDailyRate;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("startDate")
    public String getStartDate() {
        return startDate;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("startDate")
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public ClobRewards withStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ClobRewards.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("assetAddress");
        sb.append('=');
        sb.append(((this.assetAddress == null)?"<null>":this.assetAddress));
        sb.append(',');
        sb.append("conditionId");
        sb.append('=');
        sb.append(((this.conditionId == null)?"<null>":this.conditionId));
        sb.append(',');
        sb.append("endDate");
        sb.append('=');
        sb.append(((this.endDate == null)?"<null>":this.endDate));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("rewardsAmount");
        sb.append('=');
        sb.append(((this.rewardsAmount == null)?"<null>":this.rewardsAmount));
        sb.append(',');
        sb.append("rewardsDailyRate");
        sb.append('=');
        sb.append(((this.rewardsDailyRate == null)?"<null>":this.rewardsDailyRate));
        sb.append(',');
        sb.append("startDate");
        sb.append('=');
        sb.append(((this.startDate == null)?"<null>":this.startDate));
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
        result = ((result* 31)+((this.rewardsAmount == null)? 0 :this.rewardsAmount.hashCode()));
        result = ((result* 31)+((this.conditionId == null)? 0 :this.conditionId.hashCode()));
        result = ((result* 31)+((this.endDate == null)? 0 :this.endDate.hashCode()));
        result = ((result* 31)+((this.assetAddress == null)? 0 :this.assetAddress.hashCode()));
        result = ((result* 31)+((this.rewardsDailyRate == null)? 0 :this.rewardsDailyRate.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.startDate == null)? 0 :this.startDate.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ClobRewards) == false) {
            return false;
        }
        ClobRewards rhs = ((ClobRewards) other);
        return ((((((((this.rewardsAmount == rhs.rewardsAmount)||((this.rewardsAmount!= null)&&this.rewardsAmount.equals(rhs.rewardsAmount)))&&((this.conditionId == rhs.conditionId)||((this.conditionId!= null)&&this.conditionId.equals(rhs.conditionId))))&&((this.endDate == rhs.endDate)||((this.endDate!= null)&&this.endDate.equals(rhs.endDate))))&&((this.assetAddress == rhs.assetAddress)||((this.assetAddress!= null)&&this.assetAddress.equals(rhs.assetAddress))))&&((this.rewardsDailyRate == rhs.rewardsDailyRate)||((this.rewardsDailyRate!= null)&&this.rewardsDailyRate.equals(rhs.rewardsDailyRate))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.startDate == rhs.startDate)||((this.startDate!= null)&&this.startDate.equals(rhs.startDate))));
    }

}
