
package five.min.markets.poly.model.market;

import java.net.URI;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "$schema",
    "acceptingOrders",
    "acceptingOrdersTimestamp",
    "acceptingOrdersUntil",
    "active",
    "ammType",
    "approved",
    "archived",
    "automaticallyActive",
    "automaticallyResolved",
    "bestAsk",
    "bestBid",
    "category",
    "categoryMailchimpTag",
    "chartColor",
    "clearBookOnStart",
    "clobRewards",
    "clobTokenIds",
    "closed",
    "closedTime",
    "comboStatus",
    "commentsEnabled",
    "competitive",
    "conditionId",
    "createdAt",
    "createdBy",
    "creator",
    "cryptoMarketConfig",
    "cryptoMarketConfigId",
    "curationOrder",
    "customLiveness",
    "cyom",
    "denominationToken",
    "deploying",
    "deployingTimestamp",
    "description",
    "disqusThread",
    "enableOrderBook",
    "endDate",
    "endDateIso",
    "eventStartTime",
    "events",
    "featured",
    "fee",
    "feeExponent",
    "feeRate",
    "feeSchedule",
    "feeType",
    "feesEnabled",
    "formatType",
    "fpmmLive",
    "funded",
    "fundedTimestamp",
    "gameId",
    "gameStartTime",
    "groupItemRange",
    "groupItemThreshold",
    "groupItemTitle",
    "hasReviewedDates",
    "holdingRewardsEnabled",
    "icon",
    "iconOptimized",
    "id",
    "image",
    "imageOptimized",
    "lastTradePrice",
    "line",
    "liquidity",
    "liquidityAmm",
    "liquidityClob",
    "liquidityNum",
    "lowerBound",
    "lowerBoundDate",
    "mailchimpTag",
    "makerBaseFee",
    "makerRebatesFeeShareBps",
    "manualActivation",
    "marketGroup",
    "marketMakerAddress",
    "marketMetadata",
    "marketType",
    "markets",
    "negRisk",
    "negRiskMarketID",
    "negRiskOther",
    "negRiskRequestID",
    "new",
    "notificationsEnabled",
    "onchainEventId",
    "oneDayPriceChange",
    "oneHourPriceChange",
    "oneMonthPriceChange",
    "oneWeekPriceChange",
    "oneYearPriceChange",
    "orderMinSize",
    "orderPriceMinTickSize",
    "outcomePrices",
    "outcomes",
    "pagerDutyNotificationEnabled",
    "pastSlugs",
    "pendingDeployment",
    "positionIds",
    "question",
    "questionID",
    "ready",
    "readyForCron",
    "readyTimestamp",
    "requestId",
    "requiresTranslation",
    "resolutionSource",
    "resolutionStatus",
    "resolvedBy",
    "restricted",
    "rewardsMaxSpread",
    "rewardsMinSize",
    "rfqEnabled",
    "scheduledDeploymentTimestamp",
    "score",
    "secondsDelay",
    "sentDiscord",
    "seriesColor",
    "shortOutcomes",
    "showGmpOutcome",
    "showGmpSeries",
    "slug",
    "sponsorImage",
    "sponsorName",
    "sportsMarketType",
    "spread",
    "startDate",
    "startDateIso",
    "subcategory",
    "submitted_by",
    "tags",
    "takerBaseFee",
    "teamAID",
    "teamBID",
    "twitterCardImage",
    "twitterCardLastRefreshed",
    "twitterCardLastValidated",
    "twitterCardLocation",
    "umaBond",
    "umaEndDate",
    "umaEndDateIso",
    "umaResolutionStatus",
    "umaResolutionStatuses",
    "umaReward",
    "updatedAt",
    "updatedBy",
    "upperBound",
    "upperBoundDate",
    "version",
    "volume",
    "volume1mo",
    "volume1moAmm",
    "volume1moClob",
    "volume1wk",
    "volume1wkAmm",
    "volume1wkClob",
    "volume1yr",
    "volume1yrAmm",
    "volume1yrClob",
    "volume24hr",
    "volume24hrAmm",
    "volume24hrClob",
    "volumeAmm",
    "volumeClob",
    "volumeNum",
    "wideFormat",
    "xAxisValue",
    "yAxisValue"
})
@Generated("jsonschema2pojo")
public class Market {

    /**
     * A URL to the JSON Schema for this object.
     * 
     */
    @JsonProperty("$schema")
    @JsonPropertyDescription("A URL to the JSON Schema for this object.")
    private URI $schema;
    @JsonProperty("acceptingOrders")
    private Boolean acceptingOrders;
    @JsonProperty("acceptingOrdersTimestamp")
    private Date acceptingOrdersTimestamp;
    @JsonProperty("acceptingOrdersUntil")
    private Date acceptingOrdersUntil;
    @JsonProperty("active")
    private Boolean active;
    @JsonProperty("ammType")
    private String ammType;
    @JsonProperty("approved")
    private Boolean approved;
    @JsonProperty("archived")
    private Boolean archived;
    @JsonProperty("automaticallyActive")
    private Boolean automaticallyActive;
    @JsonProperty("automaticallyResolved")
    private Boolean automaticallyResolved;
    @JsonProperty("bestAsk")
    private Double bestAsk;
    @JsonProperty("bestBid")
    private Double bestBid;
    @JsonProperty("category")
    private String category;
    @JsonProperty("categoryMailchimpTag")
    private String categoryMailchimpTag;
    @JsonProperty("chartColor")
    private String chartColor;
    @JsonProperty("clearBookOnStart")
    private Boolean clearBookOnStart;
    @JsonProperty("clobRewards")
    private List<ClobRewards> clobRewards = new ArrayList<ClobRewards>();
    @JsonProperty("clobTokenIds")
    private String clobTokenIds;
    @JsonProperty("closed")
    private Boolean closed;
    @JsonProperty("closedTime")
    private String closedTime;
    /**
     * Combo eligibility state: pending/enabled/disabled. May be set at creation — enabled requires a conditionId and two positionIds. After creation it can only be changed through the combo-status endpoint.
     * 
     */
    @JsonProperty("comboStatus")
    @JsonPropertyDescription("Combo eligibility state: pending/enabled/disabled. May be set at creation \u2014 enabled requires a conditionId and two positionIds. After creation it can only be changed through the combo-status endpoint.")
    private Market.ComboStatus comboStatus;
    @JsonProperty("commentsEnabled")
    private Boolean commentsEnabled;
    @JsonProperty("competitive")
    private Double competitive;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("conditionId")
    private String conditionId;
    @JsonProperty("createdAt")
    private Date createdAt;
    @JsonProperty("createdBy")
    private Integer createdBy;
    @JsonProperty("creator")
    private String creator;
    @JsonProperty("cryptoMarketConfig")
    private CryptoMarketConfig cryptoMarketConfig;
    @JsonProperty("cryptoMarketConfigId")
    private String cryptoMarketConfigId;
    @JsonProperty("curationOrder")
    private Integer curationOrder;
    @JsonProperty("customLiveness")
    private Integer customLiveness;
    @JsonProperty("cyom")
    private Boolean cyom;
    @JsonProperty("denominationToken")
    private String denominationToken;
    @JsonProperty("deploying")
    private Boolean deploying;
    @JsonProperty("deployingTimestamp")
    private Date deployingTimestamp;
    @JsonProperty("description")
    private String description;
    @JsonProperty("disqusThread")
    private String disqusThread;
    @JsonProperty("enableOrderBook")
    private Boolean enableOrderBook;
    @JsonProperty("endDate")
    private Date endDate;
    @JsonProperty("endDateIso")
    private String endDateIso;
    @JsonProperty("eventStartTime")
    private Date eventStartTime;
    @JsonProperty("events")
    private List<Event> events = new ArrayList<Event>();
    @JsonProperty("featured")
    private Boolean featured;
    @JsonProperty("fee")
    private String fee;
    @JsonProperty("feeExponent")
    private Double feeExponent;
    @JsonProperty("feeRate")
    private Double feeRate;
    @JsonProperty("feeSchedule")
    private FeeSchedule feeSchedule;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("feeType")
    private String feeType;
    @JsonProperty("feesEnabled")
    private Boolean feesEnabled;
    @JsonProperty("formatType")
    private String formatType;
    @JsonProperty("fpmmLive")
    private Boolean fpmmLive;
    @JsonProperty("funded")
    private Boolean funded;
    @JsonProperty("fundedTimestamp")
    private Date fundedTimestamp;
    @JsonProperty("gameId")
    private String gameId;
    @JsonProperty("gameStartTime")
    private String gameStartTime;
    @JsonProperty("groupItemRange")
    private String groupItemRange;
    @JsonProperty("groupItemThreshold")
    private String groupItemThreshold;
    @JsonProperty("groupItemTitle")
    private String groupItemTitle;
    @JsonProperty("hasReviewedDates")
    private Boolean hasReviewedDates;
    @JsonProperty("holdingRewardsEnabled")
    private Boolean holdingRewardsEnabled;
    @JsonProperty("icon")
    private String icon;
    @JsonProperty("iconOptimized")
    private ImageOptimization iconOptimized;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("id")
    private String id;
    @JsonProperty("image")
    private String image;
    @JsonProperty("imageOptimized")
    private ImageOptimization imageOptimized;
    @JsonProperty("lastTradePrice")
    private Double lastTradePrice;
    @JsonProperty("line")
    private Double line;
    @JsonProperty("liquidity")
    private String liquidity;
    @JsonProperty("liquidityAmm")
    private Double liquidityAmm;
    @JsonProperty("liquidityClob")
    private Double liquidityClob;
    @JsonProperty("liquidityNum")
    private Double liquidityNum;
    @JsonProperty("lowerBound")
    private String lowerBound;
    @JsonProperty("lowerBoundDate")
    private String lowerBoundDate;
    @JsonProperty("mailchimpTag")
    private String mailchimpTag;
    @JsonProperty("makerBaseFee")
    private Integer makerBaseFee;
    @JsonProperty("makerRebatesFeeShareBps")
    private Integer makerRebatesFeeShareBps;
    @JsonProperty("manualActivation")
    private Boolean manualActivation;
    @JsonProperty("marketGroup")
    private Integer marketGroup;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("marketMakerAddress")
    private String marketMakerAddress;
    @JsonProperty("marketMetadata")
    private MarketMetadata marketMetadata;
    @JsonProperty("marketType")
    private String marketType;
    @JsonProperty("markets")
    private List<Market> markets = new ArrayList<Market>();
    @JsonProperty("negRisk")
    private Boolean negRisk;
    @JsonProperty("negRiskMarketID")
    private String negRiskMarketID;
    @JsonProperty("negRiskOther")
    private Boolean negRiskOther;
    @JsonProperty("negRiskRequestID")
    private String negRiskRequestID;
    @JsonProperty("new")
    private Boolean _new;
    @JsonProperty("notificationsEnabled")
    private Boolean notificationsEnabled;
    /**
     * Parent v2 on-chain event ID: bytes32 hex with the bottom 3 bytes zero, equal to the v2 conditionId with its conditionIndex cleared. Shared by every market of a neg-risk event. Only present on v2 markets. Read-only: derived from the v2 conditionId; writes are rejected unless echoing the stored value.
     * 
     */
    @JsonProperty("onchainEventId")
    @JsonPropertyDescription("Parent v2 on-chain event ID: bytes32 hex with the bottom 3 bytes zero, equal to the v2 conditionId with its conditionIndex cleared. Shared by every market of a neg-risk event. Only present on v2 markets. Read-only: derived from the v2 conditionId; writes are rejected unless echoing the stored value.")
    private String onchainEventId;
    @JsonProperty("oneDayPriceChange")
    private Double oneDayPriceChange;
    @JsonProperty("oneHourPriceChange")
    private Double oneHourPriceChange;
    @JsonProperty("oneMonthPriceChange")
    private Double oneMonthPriceChange;
    @JsonProperty("oneWeekPriceChange")
    private Double oneWeekPriceChange;
    @JsonProperty("oneYearPriceChange")
    private Double oneYearPriceChange;
    @JsonProperty("orderMinSize")
    private Double orderMinSize;
    @JsonProperty("orderPriceMinTickSize")
    private Double orderPriceMinTickSize;
    @JsonProperty("outcomePrices")
    private String outcomePrices;
    @JsonProperty("outcomes")
    private String outcomes;
    @JsonProperty("pagerDutyNotificationEnabled")
    private Boolean pagerDutyNotificationEnabled;
    @JsonProperty("pastSlugs")
    private String pastSlugs;
    @JsonProperty("pendingDeployment")
    private Boolean pendingDeployment;
    @JsonProperty("positionIds")
    private List<String> positionIds = new ArrayList<String>();
    @JsonProperty("question")
    private String question;
    @JsonProperty("questionID")
    private String questionID;
    @JsonProperty("ready")
    private Boolean ready;
    @JsonProperty("readyForCron")
    private Boolean readyForCron;
    @JsonProperty("readyTimestamp")
    private Date readyTimestamp;
    /**
     * V2 oracle request ID (bytes32 hex): the key the OracleAggregator resolves the market under. Equals the conditionId for binary and incremental neg-risk markets, and the onchainEventId for atomic neg-risk markets. Only present on v2 markets. Auto-derived for binary markets; for neg-risk markets it is set at creation and must equal the conditionId or the onchainEventId.
     * 
     */
    @JsonProperty("requestId")
    @JsonPropertyDescription("V2 oracle request ID (bytes32 hex): the key the OracleAggregator resolves the market under. Equals the conditionId for binary and incremental neg-risk markets, and the onchainEventId for atomic neg-risk markets. Only present on v2 markets. Auto-derived for binary markets; for neg-risk markets it is set at creation and must equal the conditionId or the onchainEventId.")
    private String requestId;
    @JsonProperty("requiresTranslation")
    private Boolean requiresTranslation;
    @JsonProperty("resolutionSource")
    private String resolutionSource;
    /**
     * High-level resolution state of the market: inactive (drafted, not yet deployed on chain), active (deployed, not resolved yet) or resolved. Only written for v2 markets; v1 markets keep using umaResolutionStatus.
     * 
     */
    @JsonProperty("resolutionStatus")
    @JsonPropertyDescription("High-level resolution state of the market: inactive (drafted, not yet deployed on chain), active (deployed, not resolved yet) or resolved. Only written for v2 markets; v1 markets keep using umaResolutionStatus.")
    private Market.ResolutionStatus resolutionStatus;
    @JsonProperty("resolvedBy")
    private String resolvedBy;
    @JsonProperty("restricted")
    private Boolean restricted;
    @JsonProperty("rewardsMaxSpread")
    private Double rewardsMaxSpread;
    @JsonProperty("rewardsMinSize")
    private Double rewardsMinSize;
    @JsonProperty("rfqEnabled")
    private Boolean rfqEnabled;
    @JsonProperty("scheduledDeploymentTimestamp")
    private Date scheduledDeploymentTimestamp;
    @JsonProperty("score")
    private Integer score;
    @JsonProperty("secondsDelay")
    private Integer secondsDelay;
    @JsonProperty("sentDiscord")
    private Boolean sentDiscord;
    @JsonProperty("seriesColor")
    private String seriesColor;
    @JsonProperty("shortOutcomes")
    private String shortOutcomes;
    @JsonProperty("showGmpOutcome")
    private Boolean showGmpOutcome;
    @JsonProperty("showGmpSeries")
    private Boolean showGmpSeries;
    @JsonProperty("slug")
    private String slug;
    @JsonProperty("sponsorImage")
    private String sponsorImage;
    @JsonProperty("sponsorName")
    private String sponsorName;
    @JsonProperty("sportsMarketType")
    private String sportsMarketType;
    @JsonProperty("spread")
    private Double spread;
    @JsonProperty("startDate")
    private Date startDate;
    @JsonProperty("startDateIso")
    private String startDateIso;
    @JsonProperty("subcategory")
    private String subcategory;
    @JsonProperty("submitted_by")
    private String submittedBy;
    @JsonProperty("tags")
    private List<Tag> tags = new ArrayList<Tag>();
    @JsonProperty("takerBaseFee")
    private Integer takerBaseFee;
    @JsonProperty("teamAID")
    private String teamAID;
    @JsonProperty("teamBID")
    private String teamBID;
    @JsonProperty("twitterCardImage")
    private String twitterCardImage;
    @JsonProperty("twitterCardLastRefreshed")
    private String twitterCardLastRefreshed;
    @JsonProperty("twitterCardLastValidated")
    private String twitterCardLastValidated;
    @JsonProperty("twitterCardLocation")
    private String twitterCardLocation;
    @JsonProperty("umaBond")
    private String umaBond;
    @JsonProperty("umaEndDate")
    private String umaEndDate;
    @JsonProperty("umaEndDateIso")
    private String umaEndDateIso;
    @JsonProperty("umaResolutionStatus")
    private String umaResolutionStatus;
    @JsonProperty("umaResolutionStatuses")
    private String umaResolutionStatuses;
    @JsonProperty("umaReward")
    private String umaReward;
    @JsonProperty("updatedAt")
    private Date updatedAt;
    @JsonProperty("updatedBy")
    private Integer updatedBy;
    @JsonProperty("upperBound")
    private String upperBound;
    @JsonProperty("upperBoundDate")
    private String upperBoundDate;
    /**
     * Protocol version the market trades on: v1 (legacy CTF/CLOB) or v2 (polymarket-v2 modules). Clients must match exact values and treat unknown values as unsupported.
     * 
     */
    @JsonProperty("version")
    @JsonPropertyDescription("Protocol version the market trades on: v1 (legacy CTF/CLOB) or v2 (polymarket-v2 modules). Clients must match exact values and treat unknown values as unsupported.")
    private Market.Version version;
    @JsonProperty("volume")
    private String volume;
    @JsonProperty("volume1mo")
    private Double volume1mo;
    @JsonProperty("volume1moAmm")
    private Double volume1moAmm;
    @JsonProperty("volume1moClob")
    private Double volume1moClob;
    @JsonProperty("volume1wk")
    private Double volume1wk;
    @JsonProperty("volume1wkAmm")
    private Double volume1wkAmm;
    @JsonProperty("volume1wkClob")
    private Double volume1wkClob;
    @JsonProperty("volume1yr")
    private Double volume1yr;
    @JsonProperty("volume1yrAmm")
    private Double volume1yrAmm;
    @JsonProperty("volume1yrClob")
    private Double volume1yrClob;
    @JsonProperty("volume24hr")
    private Double volume24hr;
    @JsonProperty("volume24hrAmm")
    private Double volume24hrAmm;
    @JsonProperty("volume24hrClob")
    private Double volume24hrClob;
    @JsonProperty("volumeAmm")
    private Double volumeAmm;
    @JsonProperty("volumeClob")
    private Double volumeClob;
    @JsonProperty("volumeNum")
    private Double volumeNum;
    @JsonProperty("wideFormat")
    private Boolean wideFormat;
    @JsonProperty("xAxisValue")
    private String xAxisValue;
    @JsonProperty("yAxisValue")
    private String yAxisValue;

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

    public Market with$schema(URI $schema) {
        this.$schema = $schema;
        return this;
    }

    @JsonProperty("acceptingOrders")
    public Boolean getAcceptingOrders() {
        return acceptingOrders;
    }

    @JsonProperty("acceptingOrders")
    public void setAcceptingOrders(Boolean acceptingOrders) {
        this.acceptingOrders = acceptingOrders;
    }

    public Market withAcceptingOrders(Boolean acceptingOrders) {
        this.acceptingOrders = acceptingOrders;
        return this;
    }

    @JsonProperty("acceptingOrdersTimestamp")
    public Date getAcceptingOrdersTimestamp() {
        return acceptingOrdersTimestamp;
    }

    @JsonProperty("acceptingOrdersTimestamp")
    public void setAcceptingOrdersTimestamp(Date acceptingOrdersTimestamp) {
        this.acceptingOrdersTimestamp = acceptingOrdersTimestamp;
    }

    public Market withAcceptingOrdersTimestamp(Date acceptingOrdersTimestamp) {
        this.acceptingOrdersTimestamp = acceptingOrdersTimestamp;
        return this;
    }

    @JsonProperty("acceptingOrdersUntil")
    public Date getAcceptingOrdersUntil() {
        return acceptingOrdersUntil;
    }

    @JsonProperty("acceptingOrdersUntil")
    public void setAcceptingOrdersUntil(Date acceptingOrdersUntil) {
        this.acceptingOrdersUntil = acceptingOrdersUntil;
    }

    public Market withAcceptingOrdersUntil(Date acceptingOrdersUntil) {
        this.acceptingOrdersUntil = acceptingOrdersUntil;
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

    public Market withActive(Boolean active) {
        this.active = active;
        return this;
    }

    @JsonProperty("ammType")
    public String getAmmType() {
        return ammType;
    }

    @JsonProperty("ammType")
    public void setAmmType(String ammType) {
        this.ammType = ammType;
    }

    public Market withAmmType(String ammType) {
        this.ammType = ammType;
        return this;
    }

    @JsonProperty("approved")
    public Boolean getApproved() {
        return approved;
    }

    @JsonProperty("approved")
    public void setApproved(Boolean approved) {
        this.approved = approved;
    }

    public Market withApproved(Boolean approved) {
        this.approved = approved;
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

    public Market withArchived(Boolean archived) {
        this.archived = archived;
        return this;
    }

    @JsonProperty("automaticallyActive")
    public Boolean getAutomaticallyActive() {
        return automaticallyActive;
    }

    @JsonProperty("automaticallyActive")
    public void setAutomaticallyActive(Boolean automaticallyActive) {
        this.automaticallyActive = automaticallyActive;
    }

    public Market withAutomaticallyActive(Boolean automaticallyActive) {
        this.automaticallyActive = automaticallyActive;
        return this;
    }

    @JsonProperty("automaticallyResolved")
    public Boolean getAutomaticallyResolved() {
        return automaticallyResolved;
    }

    @JsonProperty("automaticallyResolved")
    public void setAutomaticallyResolved(Boolean automaticallyResolved) {
        this.automaticallyResolved = automaticallyResolved;
    }

    public Market withAutomaticallyResolved(Boolean automaticallyResolved) {
        this.automaticallyResolved = automaticallyResolved;
        return this;
    }

    @JsonProperty("bestAsk")
    public Double getBestAsk() {
        return bestAsk;
    }

    @JsonProperty("bestAsk")
    public void setBestAsk(Double bestAsk) {
        this.bestAsk = bestAsk;
    }

    public Market withBestAsk(Double bestAsk) {
        this.bestAsk = bestAsk;
        return this;
    }

    @JsonProperty("bestBid")
    public Double getBestBid() {
        return bestBid;
    }

    @JsonProperty("bestBid")
    public void setBestBid(Double bestBid) {
        this.bestBid = bestBid;
    }

    public Market withBestBid(Double bestBid) {
        this.bestBid = bestBid;
        return this;
    }

    @JsonProperty("category")
    public String getCategory() {
        return category;
    }

    @JsonProperty("category")
    public void setCategory(String category) {
        this.category = category;
    }

    public Market withCategory(String category) {
        this.category = category;
        return this;
    }

    @JsonProperty("categoryMailchimpTag")
    public String getCategoryMailchimpTag() {
        return categoryMailchimpTag;
    }

    @JsonProperty("categoryMailchimpTag")
    public void setCategoryMailchimpTag(String categoryMailchimpTag) {
        this.categoryMailchimpTag = categoryMailchimpTag;
    }

    public Market withCategoryMailchimpTag(String categoryMailchimpTag) {
        this.categoryMailchimpTag = categoryMailchimpTag;
        return this;
    }

    @JsonProperty("chartColor")
    public String getChartColor() {
        return chartColor;
    }

    @JsonProperty("chartColor")
    public void setChartColor(String chartColor) {
        this.chartColor = chartColor;
    }

    public Market withChartColor(String chartColor) {
        this.chartColor = chartColor;
        return this;
    }

    @JsonProperty("clearBookOnStart")
    public Boolean getClearBookOnStart() {
        return clearBookOnStart;
    }

    @JsonProperty("clearBookOnStart")
    public void setClearBookOnStart(Boolean clearBookOnStart) {
        this.clearBookOnStart = clearBookOnStart;
    }

    public Market withClearBookOnStart(Boolean clearBookOnStart) {
        this.clearBookOnStart = clearBookOnStart;
        return this;
    }

    @JsonProperty("clobRewards")
    public List<ClobRewards> getClobRewards() {
        return clobRewards;
    }

    @JsonProperty("clobRewards")
    public void setClobRewards(List<ClobRewards> clobRewards) {
        this.clobRewards = clobRewards;
    }

    public Market withClobRewards(List<ClobRewards> clobRewards) {
        this.clobRewards = clobRewards;
        return this;
    }

    @JsonProperty("clobTokenIds")
    public String getClobTokenIds() {
        return clobTokenIds;
    }

    @JsonProperty("clobTokenIds")
    public void setClobTokenIds(String clobTokenIds) {
        this.clobTokenIds = clobTokenIds;
    }

    public Market withClobTokenIds(String clobTokenIds) {
        this.clobTokenIds = clobTokenIds;
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

    public Market withClosed(Boolean closed) {
        this.closed = closed;
        return this;
    }

    @JsonProperty("closedTime")
    public String getClosedTime() {
        return closedTime;
    }

    @JsonProperty("closedTime")
    public void setClosedTime(String closedTime) {
        this.closedTime = closedTime;
    }

    public Market withClosedTime(String closedTime) {
        this.closedTime = closedTime;
        return this;
    }

    /**
     * Combo eligibility state: pending/enabled/disabled. May be set at creation — enabled requires a conditionId and two positionIds. After creation it can only be changed through the combo-status endpoint.
     * 
     */
    @JsonProperty("comboStatus")
    public Market.ComboStatus getComboStatus() {
        return comboStatus;
    }

    /**
     * Combo eligibility state: pending/enabled/disabled. May be set at creation — enabled requires a conditionId and two positionIds. After creation it can only be changed through the combo-status endpoint.
     * 
     */
    @JsonProperty("comboStatus")
    public void setComboStatus(Market.ComboStatus comboStatus) {
        this.comboStatus = comboStatus;
    }

    public Market withComboStatus(Market.ComboStatus comboStatus) {
        this.comboStatus = comboStatus;
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

    public Market withCommentsEnabled(Boolean commentsEnabled) {
        this.commentsEnabled = commentsEnabled;
        return this;
    }

    @JsonProperty("competitive")
    public Double getCompetitive() {
        return competitive;
    }

    @JsonProperty("competitive")
    public void setCompetitive(Double competitive) {
        this.competitive = competitive;
    }

    public Market withCompetitive(Double competitive) {
        this.competitive = competitive;
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

    public Market withConditionId(String conditionId) {
        this.conditionId = conditionId;
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

    public Market withCreatedAt(Date createdAt) {
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

    public Market withCreatedBy(Integer createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    @JsonProperty("creator")
    public String getCreator() {
        return creator;
    }

    @JsonProperty("creator")
    public void setCreator(String creator) {
        this.creator = creator;
    }

    public Market withCreator(String creator) {
        this.creator = creator;
        return this;
    }

    @JsonProperty("cryptoMarketConfig")
    public CryptoMarketConfig getCryptoMarketConfig() {
        return cryptoMarketConfig;
    }

    @JsonProperty("cryptoMarketConfig")
    public void setCryptoMarketConfig(CryptoMarketConfig cryptoMarketConfig) {
        this.cryptoMarketConfig = cryptoMarketConfig;
    }

    public Market withCryptoMarketConfig(CryptoMarketConfig cryptoMarketConfig) {
        this.cryptoMarketConfig = cryptoMarketConfig;
        return this;
    }

    @JsonProperty("cryptoMarketConfigId")
    public String getCryptoMarketConfigId() {
        return cryptoMarketConfigId;
    }

    @JsonProperty("cryptoMarketConfigId")
    public void setCryptoMarketConfigId(String cryptoMarketConfigId) {
        this.cryptoMarketConfigId = cryptoMarketConfigId;
    }

    public Market withCryptoMarketConfigId(String cryptoMarketConfigId) {
        this.cryptoMarketConfigId = cryptoMarketConfigId;
        return this;
    }

    @JsonProperty("curationOrder")
    public Integer getCurationOrder() {
        return curationOrder;
    }

    @JsonProperty("curationOrder")
    public void setCurationOrder(Integer curationOrder) {
        this.curationOrder = curationOrder;
    }

    public Market withCurationOrder(Integer curationOrder) {
        this.curationOrder = curationOrder;
        return this;
    }

    @JsonProperty("customLiveness")
    public Integer getCustomLiveness() {
        return customLiveness;
    }

    @JsonProperty("customLiveness")
    public void setCustomLiveness(Integer customLiveness) {
        this.customLiveness = customLiveness;
    }

    public Market withCustomLiveness(Integer customLiveness) {
        this.customLiveness = customLiveness;
        return this;
    }

    @JsonProperty("cyom")
    public Boolean getCyom() {
        return cyom;
    }

    @JsonProperty("cyom")
    public void setCyom(Boolean cyom) {
        this.cyom = cyom;
    }

    public Market withCyom(Boolean cyom) {
        this.cyom = cyom;
        return this;
    }

    @JsonProperty("denominationToken")
    public String getDenominationToken() {
        return denominationToken;
    }

    @JsonProperty("denominationToken")
    public void setDenominationToken(String denominationToken) {
        this.denominationToken = denominationToken;
    }

    public Market withDenominationToken(String denominationToken) {
        this.denominationToken = denominationToken;
        return this;
    }

    @JsonProperty("deploying")
    public Boolean getDeploying() {
        return deploying;
    }

    @JsonProperty("deploying")
    public void setDeploying(Boolean deploying) {
        this.deploying = deploying;
    }

    public Market withDeploying(Boolean deploying) {
        this.deploying = deploying;
        return this;
    }

    @JsonProperty("deployingTimestamp")
    public Date getDeployingTimestamp() {
        return deployingTimestamp;
    }

    @JsonProperty("deployingTimestamp")
    public void setDeployingTimestamp(Date deployingTimestamp) {
        this.deployingTimestamp = deployingTimestamp;
    }

    public Market withDeployingTimestamp(Date deployingTimestamp) {
        this.deployingTimestamp = deployingTimestamp;
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

    public Market withDescription(String description) {
        this.description = description;
        return this;
    }

    @JsonProperty("disqusThread")
    public String getDisqusThread() {
        return disqusThread;
    }

    @JsonProperty("disqusThread")
    public void setDisqusThread(String disqusThread) {
        this.disqusThread = disqusThread;
    }

    public Market withDisqusThread(String disqusThread) {
        this.disqusThread = disqusThread;
        return this;
    }

    @JsonProperty("enableOrderBook")
    public Boolean getEnableOrderBook() {
        return enableOrderBook;
    }

    @JsonProperty("enableOrderBook")
    public void setEnableOrderBook(Boolean enableOrderBook) {
        this.enableOrderBook = enableOrderBook;
    }

    public Market withEnableOrderBook(Boolean enableOrderBook) {
        this.enableOrderBook = enableOrderBook;
        return this;
    }

    @JsonProperty("endDate")
    public Date getEndDate() {
        return endDate;
    }

    @JsonProperty("endDate")
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Market withEndDate(Date endDate) {
        this.endDate = endDate;
        return this;
    }

    @JsonProperty("endDateIso")
    public String getEndDateIso() {
        return endDateIso;
    }

    @JsonProperty("endDateIso")
    public void setEndDateIso(String endDateIso) {
        this.endDateIso = endDateIso;
    }

    public Market withEndDateIso(String endDateIso) {
        this.endDateIso = endDateIso;
        return this;
    }

    @JsonProperty("eventStartTime")
    public Date getEventStartTime() {
        return eventStartTime;
    }

    @JsonProperty("eventStartTime")
    public void setEventStartTime(Date eventStartTime) {
        this.eventStartTime = eventStartTime;
    }

    public Market withEventStartTime(Date eventStartTime) {
        this.eventStartTime = eventStartTime;
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

    public Market withEvents(List<Event> events) {
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

    public Market withFeatured(Boolean featured) {
        this.featured = featured;
        return this;
    }

    @JsonProperty("fee")
    public String getFee() {
        return fee;
    }

    @JsonProperty("fee")
    public void setFee(String fee) {
        this.fee = fee;
    }

    public Market withFee(String fee) {
        this.fee = fee;
        return this;
    }

    @JsonProperty("feeExponent")
    public Double getFeeExponent() {
        return feeExponent;
    }

    @JsonProperty("feeExponent")
    public void setFeeExponent(Double feeExponent) {
        this.feeExponent = feeExponent;
    }

    public Market withFeeExponent(Double feeExponent) {
        this.feeExponent = feeExponent;
        return this;
    }

    @JsonProperty("feeRate")
    public Double getFeeRate() {
        return feeRate;
    }

    @JsonProperty("feeRate")
    public void setFeeRate(Double feeRate) {
        this.feeRate = feeRate;
    }

    public Market withFeeRate(Double feeRate) {
        this.feeRate = feeRate;
        return this;
    }

    @JsonProperty("feeSchedule")
    public FeeSchedule getFeeSchedule() {
        return feeSchedule;
    }

    @JsonProperty("feeSchedule")
    public void setFeeSchedule(FeeSchedule feeSchedule) {
        this.feeSchedule = feeSchedule;
    }

    public Market withFeeSchedule(FeeSchedule feeSchedule) {
        this.feeSchedule = feeSchedule;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("feeType")
    public String getFeeType() {
        return feeType;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("feeType")
    public void setFeeType(String feeType) {
        this.feeType = feeType;
    }

    public Market withFeeType(String feeType) {
        this.feeType = feeType;
        return this;
    }

    @JsonProperty("feesEnabled")
    public Boolean getFeesEnabled() {
        return feesEnabled;
    }

    @JsonProperty("feesEnabled")
    public void setFeesEnabled(Boolean feesEnabled) {
        this.feesEnabled = feesEnabled;
    }

    public Market withFeesEnabled(Boolean feesEnabled) {
        this.feesEnabled = feesEnabled;
        return this;
    }

    @JsonProperty("formatType")
    public String getFormatType() {
        return formatType;
    }

    @JsonProperty("formatType")
    public void setFormatType(String formatType) {
        this.formatType = formatType;
    }

    public Market withFormatType(String formatType) {
        this.formatType = formatType;
        return this;
    }

    @JsonProperty("fpmmLive")
    public Boolean getFpmmLive() {
        return fpmmLive;
    }

    @JsonProperty("fpmmLive")
    public void setFpmmLive(Boolean fpmmLive) {
        this.fpmmLive = fpmmLive;
    }

    public Market withFpmmLive(Boolean fpmmLive) {
        this.fpmmLive = fpmmLive;
        return this;
    }

    @JsonProperty("funded")
    public Boolean getFunded() {
        return funded;
    }

    @JsonProperty("funded")
    public void setFunded(Boolean funded) {
        this.funded = funded;
    }

    public Market withFunded(Boolean funded) {
        this.funded = funded;
        return this;
    }

    @JsonProperty("fundedTimestamp")
    public Date getFundedTimestamp() {
        return fundedTimestamp;
    }

    @JsonProperty("fundedTimestamp")
    public void setFundedTimestamp(Date fundedTimestamp) {
        this.fundedTimestamp = fundedTimestamp;
    }

    public Market withFundedTimestamp(Date fundedTimestamp) {
        this.fundedTimestamp = fundedTimestamp;
        return this;
    }

    @JsonProperty("gameId")
    public String getGameId() {
        return gameId;
    }

    @JsonProperty("gameId")
    public void setGameId(String gameId) {
        this.gameId = gameId;
    }

    public Market withGameId(String gameId) {
        this.gameId = gameId;
        return this;
    }

    @JsonProperty("gameStartTime")
    public String getGameStartTime() {
        return gameStartTime;
    }

    @JsonProperty("gameStartTime")
    public void setGameStartTime(String gameStartTime) {
        this.gameStartTime = gameStartTime;
    }

    public Market withGameStartTime(String gameStartTime) {
        this.gameStartTime = gameStartTime;
        return this;
    }

    @JsonProperty("groupItemRange")
    public String getGroupItemRange() {
        return groupItemRange;
    }

    @JsonProperty("groupItemRange")
    public void setGroupItemRange(String groupItemRange) {
        this.groupItemRange = groupItemRange;
    }

    public Market withGroupItemRange(String groupItemRange) {
        this.groupItemRange = groupItemRange;
        return this;
    }

    @JsonProperty("groupItemThreshold")
    public String getGroupItemThreshold() {
        return groupItemThreshold;
    }

    @JsonProperty("groupItemThreshold")
    public void setGroupItemThreshold(String groupItemThreshold) {
        this.groupItemThreshold = groupItemThreshold;
    }

    public Market withGroupItemThreshold(String groupItemThreshold) {
        this.groupItemThreshold = groupItemThreshold;
        return this;
    }

    @JsonProperty("groupItemTitle")
    public String getGroupItemTitle() {
        return groupItemTitle;
    }

    @JsonProperty("groupItemTitle")
    public void setGroupItemTitle(String groupItemTitle) {
        this.groupItemTitle = groupItemTitle;
    }

    public Market withGroupItemTitle(String groupItemTitle) {
        this.groupItemTitle = groupItemTitle;
        return this;
    }

    @JsonProperty("hasReviewedDates")
    public Boolean getHasReviewedDates() {
        return hasReviewedDates;
    }

    @JsonProperty("hasReviewedDates")
    public void setHasReviewedDates(Boolean hasReviewedDates) {
        this.hasReviewedDates = hasReviewedDates;
    }

    public Market withHasReviewedDates(Boolean hasReviewedDates) {
        this.hasReviewedDates = hasReviewedDates;
        return this;
    }

    @JsonProperty("holdingRewardsEnabled")
    public Boolean getHoldingRewardsEnabled() {
        return holdingRewardsEnabled;
    }

    @JsonProperty("holdingRewardsEnabled")
    public void setHoldingRewardsEnabled(Boolean holdingRewardsEnabled) {
        this.holdingRewardsEnabled = holdingRewardsEnabled;
    }

    public Market withHoldingRewardsEnabled(Boolean holdingRewardsEnabled) {
        this.holdingRewardsEnabled = holdingRewardsEnabled;
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

    public Market withIcon(String icon) {
        this.icon = icon;
        return this;
    }

    @JsonProperty("iconOptimized")
    public ImageOptimization getIconOptimized() {
        return iconOptimized;
    }

    @JsonProperty("iconOptimized")
    public void setIconOptimized(ImageOptimization iconOptimized) {
        this.iconOptimized = iconOptimized;
    }

    public Market withIconOptimized(ImageOptimization iconOptimized) {
        this.iconOptimized = iconOptimized;
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

    public Market withId(String id) {
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

    public Market withImage(String image) {
        this.image = image;
        return this;
    }

    @JsonProperty("imageOptimized")
    public ImageOptimization getImageOptimized() {
        return imageOptimized;
    }

    @JsonProperty("imageOptimized")
    public void setImageOptimized(ImageOptimization imageOptimized) {
        this.imageOptimized = imageOptimized;
    }

    public Market withImageOptimized(ImageOptimization imageOptimized) {
        this.imageOptimized = imageOptimized;
        return this;
    }

    @JsonProperty("lastTradePrice")
    public Double getLastTradePrice() {
        return lastTradePrice;
    }

    @JsonProperty("lastTradePrice")
    public void setLastTradePrice(Double lastTradePrice) {
        this.lastTradePrice = lastTradePrice;
    }

    public Market withLastTradePrice(Double lastTradePrice) {
        this.lastTradePrice = lastTradePrice;
        return this;
    }

    @JsonProperty("line")
    public Double getLine() {
        return line;
    }

    @JsonProperty("line")
    public void setLine(Double line) {
        this.line = line;
    }

    public Market withLine(Double line) {
        this.line = line;
        return this;
    }

    @JsonProperty("liquidity")
    public String getLiquidity() {
        return liquidity;
    }

    @JsonProperty("liquidity")
    public void setLiquidity(String liquidity) {
        this.liquidity = liquidity;
    }

    public Market withLiquidity(String liquidity) {
        this.liquidity = liquidity;
        return this;
    }

    @JsonProperty("liquidityAmm")
    public Double getLiquidityAmm() {
        return liquidityAmm;
    }

    @JsonProperty("liquidityAmm")
    public void setLiquidityAmm(Double liquidityAmm) {
        this.liquidityAmm = liquidityAmm;
    }

    public Market withLiquidityAmm(Double liquidityAmm) {
        this.liquidityAmm = liquidityAmm;
        return this;
    }

    @JsonProperty("liquidityClob")
    public Double getLiquidityClob() {
        return liquidityClob;
    }

    @JsonProperty("liquidityClob")
    public void setLiquidityClob(Double liquidityClob) {
        this.liquidityClob = liquidityClob;
    }

    public Market withLiquidityClob(Double liquidityClob) {
        this.liquidityClob = liquidityClob;
        return this;
    }

    @JsonProperty("liquidityNum")
    public Double getLiquidityNum() {
        return liquidityNum;
    }

    @JsonProperty("liquidityNum")
    public void setLiquidityNum(Double liquidityNum) {
        this.liquidityNum = liquidityNum;
    }

    public Market withLiquidityNum(Double liquidityNum) {
        this.liquidityNum = liquidityNum;
        return this;
    }

    @JsonProperty("lowerBound")
    public String getLowerBound() {
        return lowerBound;
    }

    @JsonProperty("lowerBound")
    public void setLowerBound(String lowerBound) {
        this.lowerBound = lowerBound;
    }

    public Market withLowerBound(String lowerBound) {
        this.lowerBound = lowerBound;
        return this;
    }

    @JsonProperty("lowerBoundDate")
    public String getLowerBoundDate() {
        return lowerBoundDate;
    }

    @JsonProperty("lowerBoundDate")
    public void setLowerBoundDate(String lowerBoundDate) {
        this.lowerBoundDate = lowerBoundDate;
    }

    public Market withLowerBoundDate(String lowerBoundDate) {
        this.lowerBoundDate = lowerBoundDate;
        return this;
    }

    @JsonProperty("mailchimpTag")
    public String getMailchimpTag() {
        return mailchimpTag;
    }

    @JsonProperty("mailchimpTag")
    public void setMailchimpTag(String mailchimpTag) {
        this.mailchimpTag = mailchimpTag;
    }

    public Market withMailchimpTag(String mailchimpTag) {
        this.mailchimpTag = mailchimpTag;
        return this;
    }

    @JsonProperty("makerBaseFee")
    public Integer getMakerBaseFee() {
        return makerBaseFee;
    }

    @JsonProperty("makerBaseFee")
    public void setMakerBaseFee(Integer makerBaseFee) {
        this.makerBaseFee = makerBaseFee;
    }

    public Market withMakerBaseFee(Integer makerBaseFee) {
        this.makerBaseFee = makerBaseFee;
        return this;
    }

    @JsonProperty("makerRebatesFeeShareBps")
    public Integer getMakerRebatesFeeShareBps() {
        return makerRebatesFeeShareBps;
    }

    @JsonProperty("makerRebatesFeeShareBps")
    public void setMakerRebatesFeeShareBps(Integer makerRebatesFeeShareBps) {
        this.makerRebatesFeeShareBps = makerRebatesFeeShareBps;
    }

    public Market withMakerRebatesFeeShareBps(Integer makerRebatesFeeShareBps) {
        this.makerRebatesFeeShareBps = makerRebatesFeeShareBps;
        return this;
    }

    @JsonProperty("manualActivation")
    public Boolean getManualActivation() {
        return manualActivation;
    }

    @JsonProperty("manualActivation")
    public void setManualActivation(Boolean manualActivation) {
        this.manualActivation = manualActivation;
    }

    public Market withManualActivation(Boolean manualActivation) {
        this.manualActivation = manualActivation;
        return this;
    }

    @JsonProperty("marketGroup")
    public Integer getMarketGroup() {
        return marketGroup;
    }

    @JsonProperty("marketGroup")
    public void setMarketGroup(Integer marketGroup) {
        this.marketGroup = marketGroup;
    }

    public Market withMarketGroup(Integer marketGroup) {
        this.marketGroup = marketGroup;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("marketMakerAddress")
    public String getMarketMakerAddress() {
        return marketMakerAddress;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("marketMakerAddress")
    public void setMarketMakerAddress(String marketMakerAddress) {
        this.marketMakerAddress = marketMakerAddress;
    }

    public Market withMarketMakerAddress(String marketMakerAddress) {
        this.marketMakerAddress = marketMakerAddress;
        return this;
    }

    @JsonProperty("marketMetadata")
    public MarketMetadata getMarketMetadata() {
        return marketMetadata;
    }

    @JsonProperty("marketMetadata")
    public void setMarketMetadata(MarketMetadata marketMetadata) {
        this.marketMetadata = marketMetadata;
    }

    public Market withMarketMetadata(MarketMetadata marketMetadata) {
        this.marketMetadata = marketMetadata;
        return this;
    }

    @JsonProperty("marketType")
    public String getMarketType() {
        return marketType;
    }

    @JsonProperty("marketType")
    public void setMarketType(String marketType) {
        this.marketType = marketType;
    }

    public Market withMarketType(String marketType) {
        this.marketType = marketType;
        return this;
    }

    @JsonProperty("markets")
    public List<Market> getMarkets() {
        return markets;
    }

    @JsonProperty("markets")
    public void setMarkets(List<Market> markets) {
        this.markets = markets;
    }

    public Market withMarkets(List<Market> markets) {
        this.markets = markets;
        return this;
    }

    @JsonProperty("negRisk")
    public Boolean getNegRisk() {
        return negRisk;
    }

    @JsonProperty("negRisk")
    public void setNegRisk(Boolean negRisk) {
        this.negRisk = negRisk;
    }

    public Market withNegRisk(Boolean negRisk) {
        this.negRisk = negRisk;
        return this;
    }

    @JsonProperty("negRiskMarketID")
    public String getNegRiskMarketID() {
        return negRiskMarketID;
    }

    @JsonProperty("negRiskMarketID")
    public void setNegRiskMarketID(String negRiskMarketID) {
        this.negRiskMarketID = negRiskMarketID;
    }

    public Market withNegRiskMarketID(String negRiskMarketID) {
        this.negRiskMarketID = negRiskMarketID;
        return this;
    }

    @JsonProperty("negRiskOther")
    public Boolean getNegRiskOther() {
        return negRiskOther;
    }

    @JsonProperty("negRiskOther")
    public void setNegRiskOther(Boolean negRiskOther) {
        this.negRiskOther = negRiskOther;
    }

    public Market withNegRiskOther(Boolean negRiskOther) {
        this.negRiskOther = negRiskOther;
        return this;
    }

    @JsonProperty("negRiskRequestID")
    public String getNegRiskRequestID() {
        return negRiskRequestID;
    }

    @JsonProperty("negRiskRequestID")
    public void setNegRiskRequestID(String negRiskRequestID) {
        this.negRiskRequestID = negRiskRequestID;
    }

    public Market withNegRiskRequestID(String negRiskRequestID) {
        this.negRiskRequestID = negRiskRequestID;
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

    public Market withNew(Boolean _new) {
        this._new = _new;
        return this;
    }

    @JsonProperty("notificationsEnabled")
    public Boolean getNotificationsEnabled() {
        return notificationsEnabled;
    }

    @JsonProperty("notificationsEnabled")
    public void setNotificationsEnabled(Boolean notificationsEnabled) {
        this.notificationsEnabled = notificationsEnabled;
    }

    public Market withNotificationsEnabled(Boolean notificationsEnabled) {
        this.notificationsEnabled = notificationsEnabled;
        return this;
    }

    /**
     * Parent v2 on-chain event ID: bytes32 hex with the bottom 3 bytes zero, equal to the v2 conditionId with its conditionIndex cleared. Shared by every market of a neg-risk event. Only present on v2 markets. Read-only: derived from the v2 conditionId; writes are rejected unless echoing the stored value.
     * 
     */
    @JsonProperty("onchainEventId")
    public String getOnchainEventId() {
        return onchainEventId;
    }

    /**
     * Parent v2 on-chain event ID: bytes32 hex with the bottom 3 bytes zero, equal to the v2 conditionId with its conditionIndex cleared. Shared by every market of a neg-risk event. Only present on v2 markets. Read-only: derived from the v2 conditionId; writes are rejected unless echoing the stored value.
     * 
     */
    @JsonProperty("onchainEventId")
    public void setOnchainEventId(String onchainEventId) {
        this.onchainEventId = onchainEventId;
    }

    public Market withOnchainEventId(String onchainEventId) {
        this.onchainEventId = onchainEventId;
        return this;
    }

    @JsonProperty("oneDayPriceChange")
    public Double getOneDayPriceChange() {
        return oneDayPriceChange;
    }

    @JsonProperty("oneDayPriceChange")
    public void setOneDayPriceChange(Double oneDayPriceChange) {
        this.oneDayPriceChange = oneDayPriceChange;
    }

    public Market withOneDayPriceChange(Double oneDayPriceChange) {
        this.oneDayPriceChange = oneDayPriceChange;
        return this;
    }

    @JsonProperty("oneHourPriceChange")
    public Double getOneHourPriceChange() {
        return oneHourPriceChange;
    }

    @JsonProperty("oneHourPriceChange")
    public void setOneHourPriceChange(Double oneHourPriceChange) {
        this.oneHourPriceChange = oneHourPriceChange;
    }

    public Market withOneHourPriceChange(Double oneHourPriceChange) {
        this.oneHourPriceChange = oneHourPriceChange;
        return this;
    }

    @JsonProperty("oneMonthPriceChange")
    public Double getOneMonthPriceChange() {
        return oneMonthPriceChange;
    }

    @JsonProperty("oneMonthPriceChange")
    public void setOneMonthPriceChange(Double oneMonthPriceChange) {
        this.oneMonthPriceChange = oneMonthPriceChange;
    }

    public Market withOneMonthPriceChange(Double oneMonthPriceChange) {
        this.oneMonthPriceChange = oneMonthPriceChange;
        return this;
    }

    @JsonProperty("oneWeekPriceChange")
    public Double getOneWeekPriceChange() {
        return oneWeekPriceChange;
    }

    @JsonProperty("oneWeekPriceChange")
    public void setOneWeekPriceChange(Double oneWeekPriceChange) {
        this.oneWeekPriceChange = oneWeekPriceChange;
    }

    public Market withOneWeekPriceChange(Double oneWeekPriceChange) {
        this.oneWeekPriceChange = oneWeekPriceChange;
        return this;
    }

    @JsonProperty("oneYearPriceChange")
    public Double getOneYearPriceChange() {
        return oneYearPriceChange;
    }

    @JsonProperty("oneYearPriceChange")
    public void setOneYearPriceChange(Double oneYearPriceChange) {
        this.oneYearPriceChange = oneYearPriceChange;
    }

    public Market withOneYearPriceChange(Double oneYearPriceChange) {
        this.oneYearPriceChange = oneYearPriceChange;
        return this;
    }

    @JsonProperty("orderMinSize")
    public Double getOrderMinSize() {
        return orderMinSize;
    }

    @JsonProperty("orderMinSize")
    public void setOrderMinSize(Double orderMinSize) {
        this.orderMinSize = orderMinSize;
    }

    public Market withOrderMinSize(Double orderMinSize) {
        this.orderMinSize = orderMinSize;
        return this;
    }

    @JsonProperty("orderPriceMinTickSize")
    public Double getOrderPriceMinTickSize() {
        return orderPriceMinTickSize;
    }

    @JsonProperty("orderPriceMinTickSize")
    public void setOrderPriceMinTickSize(Double orderPriceMinTickSize) {
        this.orderPriceMinTickSize = orderPriceMinTickSize;
    }

    public Market withOrderPriceMinTickSize(Double orderPriceMinTickSize) {
        this.orderPriceMinTickSize = orderPriceMinTickSize;
        return this;
    }

    @JsonProperty("outcomePrices")
    public String getOutcomePrices() {
        return outcomePrices;
    }

    @JsonProperty("outcomePrices")
    public void setOutcomePrices(String outcomePrices) {
        this.outcomePrices = outcomePrices;
    }

    public Market withOutcomePrices(String outcomePrices) {
        this.outcomePrices = outcomePrices;
        return this;
    }

    @JsonProperty("outcomes")
    public String getOutcomes() {
        return outcomes;
    }

    @JsonProperty("outcomes")
    public void setOutcomes(String outcomes) {
        this.outcomes = outcomes;
    }

    public Market withOutcomes(String outcomes) {
        this.outcomes = outcomes;
        return this;
    }

    @JsonProperty("pagerDutyNotificationEnabled")
    public Boolean getPagerDutyNotificationEnabled() {
        return pagerDutyNotificationEnabled;
    }

    @JsonProperty("pagerDutyNotificationEnabled")
    public void setPagerDutyNotificationEnabled(Boolean pagerDutyNotificationEnabled) {
        this.pagerDutyNotificationEnabled = pagerDutyNotificationEnabled;
    }

    public Market withPagerDutyNotificationEnabled(Boolean pagerDutyNotificationEnabled) {
        this.pagerDutyNotificationEnabled = pagerDutyNotificationEnabled;
        return this;
    }

    @JsonProperty("pastSlugs")
    public String getPastSlugs() {
        return pastSlugs;
    }

    @JsonProperty("pastSlugs")
    public void setPastSlugs(String pastSlugs) {
        this.pastSlugs = pastSlugs;
    }

    public Market withPastSlugs(String pastSlugs) {
        this.pastSlugs = pastSlugs;
        return this;
    }

    @JsonProperty("pendingDeployment")
    public Boolean getPendingDeployment() {
        return pendingDeployment;
    }

    @JsonProperty("pendingDeployment")
    public void setPendingDeployment(Boolean pendingDeployment) {
        this.pendingDeployment = pendingDeployment;
    }

    public Market withPendingDeployment(Boolean pendingDeployment) {
        this.pendingDeployment = pendingDeployment;
        return this;
    }

    @JsonProperty("positionIds")
    public List<String> getPositionIds() {
        return positionIds;
    }

    @JsonProperty("positionIds")
    public void setPositionIds(List<String> positionIds) {
        this.positionIds = positionIds;
    }

    public Market withPositionIds(List<String> positionIds) {
        this.positionIds = positionIds;
        return this;
    }

    @JsonProperty("question")
    public String getQuestion() {
        return question;
    }

    @JsonProperty("question")
    public void setQuestion(String question) {
        this.question = question;
    }

    public Market withQuestion(String question) {
        this.question = question;
        return this;
    }

    @JsonProperty("questionID")
    public String getQuestionID() {
        return questionID;
    }

    @JsonProperty("questionID")
    public void setQuestionID(String questionID) {
        this.questionID = questionID;
    }

    public Market withQuestionID(String questionID) {
        this.questionID = questionID;
        return this;
    }

    @JsonProperty("ready")
    public Boolean getReady() {
        return ready;
    }

    @JsonProperty("ready")
    public void setReady(Boolean ready) {
        this.ready = ready;
    }

    public Market withReady(Boolean ready) {
        this.ready = ready;
        return this;
    }

    @JsonProperty("readyForCron")
    public Boolean getReadyForCron() {
        return readyForCron;
    }

    @JsonProperty("readyForCron")
    public void setReadyForCron(Boolean readyForCron) {
        this.readyForCron = readyForCron;
    }

    public Market withReadyForCron(Boolean readyForCron) {
        this.readyForCron = readyForCron;
        return this;
    }

    @JsonProperty("readyTimestamp")
    public Date getReadyTimestamp() {
        return readyTimestamp;
    }

    @JsonProperty("readyTimestamp")
    public void setReadyTimestamp(Date readyTimestamp) {
        this.readyTimestamp = readyTimestamp;
    }

    public Market withReadyTimestamp(Date readyTimestamp) {
        this.readyTimestamp = readyTimestamp;
        return this;
    }

    /**
     * V2 oracle request ID (bytes32 hex): the key the OracleAggregator resolves the market under. Equals the conditionId for binary and incremental neg-risk markets, and the onchainEventId for atomic neg-risk markets. Only present on v2 markets. Auto-derived for binary markets; for neg-risk markets it is set at creation and must equal the conditionId or the onchainEventId.
     * 
     */
    @JsonProperty("requestId")
    public String getRequestId() {
        return requestId;
    }

    /**
     * V2 oracle request ID (bytes32 hex): the key the OracleAggregator resolves the market under. Equals the conditionId for binary and incremental neg-risk markets, and the onchainEventId for atomic neg-risk markets. Only present on v2 markets. Auto-derived for binary markets; for neg-risk markets it is set at creation and must equal the conditionId or the onchainEventId.
     * 
     */
    @JsonProperty("requestId")
    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public Market withRequestId(String requestId) {
        this.requestId = requestId;
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

    public Market withRequiresTranslation(Boolean requiresTranslation) {
        this.requiresTranslation = requiresTranslation;
        return this;
    }

    @JsonProperty("resolutionSource")
    public String getResolutionSource() {
        return resolutionSource;
    }

    @JsonProperty("resolutionSource")
    public void setResolutionSource(String resolutionSource) {
        this.resolutionSource = resolutionSource;
    }

    public Market withResolutionSource(String resolutionSource) {
        this.resolutionSource = resolutionSource;
        return this;
    }

    /**
     * High-level resolution state of the market: inactive (drafted, not yet deployed on chain), active (deployed, not resolved yet) or resolved. Only written for v2 markets; v1 markets keep using umaResolutionStatus.
     * 
     */
    @JsonProperty("resolutionStatus")
    public Market.ResolutionStatus getResolutionStatus() {
        return resolutionStatus;
    }

    /**
     * High-level resolution state of the market: inactive (drafted, not yet deployed on chain), active (deployed, not resolved yet) or resolved. Only written for v2 markets; v1 markets keep using umaResolutionStatus.
     * 
     */
    @JsonProperty("resolutionStatus")
    public void setResolutionStatus(Market.ResolutionStatus resolutionStatus) {
        this.resolutionStatus = resolutionStatus;
    }

    public Market withResolutionStatus(Market.ResolutionStatus resolutionStatus) {
        this.resolutionStatus = resolutionStatus;
        return this;
    }

    @JsonProperty("resolvedBy")
    public String getResolvedBy() {
        return resolvedBy;
    }

    @JsonProperty("resolvedBy")
    public void setResolvedBy(String resolvedBy) {
        this.resolvedBy = resolvedBy;
    }

    public Market withResolvedBy(String resolvedBy) {
        this.resolvedBy = resolvedBy;
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

    public Market withRestricted(Boolean restricted) {
        this.restricted = restricted;
        return this;
    }

    @JsonProperty("rewardsMaxSpread")
    public Double getRewardsMaxSpread() {
        return rewardsMaxSpread;
    }

    @JsonProperty("rewardsMaxSpread")
    public void setRewardsMaxSpread(Double rewardsMaxSpread) {
        this.rewardsMaxSpread = rewardsMaxSpread;
    }

    public Market withRewardsMaxSpread(Double rewardsMaxSpread) {
        this.rewardsMaxSpread = rewardsMaxSpread;
        return this;
    }

    @JsonProperty("rewardsMinSize")
    public Double getRewardsMinSize() {
        return rewardsMinSize;
    }

    @JsonProperty("rewardsMinSize")
    public void setRewardsMinSize(Double rewardsMinSize) {
        this.rewardsMinSize = rewardsMinSize;
    }

    public Market withRewardsMinSize(Double rewardsMinSize) {
        this.rewardsMinSize = rewardsMinSize;
        return this;
    }

    @JsonProperty("rfqEnabled")
    public Boolean getRfqEnabled() {
        return rfqEnabled;
    }

    @JsonProperty("rfqEnabled")
    public void setRfqEnabled(Boolean rfqEnabled) {
        this.rfqEnabled = rfqEnabled;
    }

    public Market withRfqEnabled(Boolean rfqEnabled) {
        this.rfqEnabled = rfqEnabled;
        return this;
    }

    @JsonProperty("scheduledDeploymentTimestamp")
    public Date getScheduledDeploymentTimestamp() {
        return scheduledDeploymentTimestamp;
    }

    @JsonProperty("scheduledDeploymentTimestamp")
    public void setScheduledDeploymentTimestamp(Date scheduledDeploymentTimestamp) {
        this.scheduledDeploymentTimestamp = scheduledDeploymentTimestamp;
    }

    public Market withScheduledDeploymentTimestamp(Date scheduledDeploymentTimestamp) {
        this.scheduledDeploymentTimestamp = scheduledDeploymentTimestamp;
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

    public Market withScore(Integer score) {
        this.score = score;
        return this;
    }

    @JsonProperty("secondsDelay")
    public Integer getSecondsDelay() {
        return secondsDelay;
    }

    @JsonProperty("secondsDelay")
    public void setSecondsDelay(Integer secondsDelay) {
        this.secondsDelay = secondsDelay;
    }

    public Market withSecondsDelay(Integer secondsDelay) {
        this.secondsDelay = secondsDelay;
        return this;
    }

    @JsonProperty("sentDiscord")
    public Boolean getSentDiscord() {
        return sentDiscord;
    }

    @JsonProperty("sentDiscord")
    public void setSentDiscord(Boolean sentDiscord) {
        this.sentDiscord = sentDiscord;
    }

    public Market withSentDiscord(Boolean sentDiscord) {
        this.sentDiscord = sentDiscord;
        return this;
    }

    @JsonProperty("seriesColor")
    public String getSeriesColor() {
        return seriesColor;
    }

    @JsonProperty("seriesColor")
    public void setSeriesColor(String seriesColor) {
        this.seriesColor = seriesColor;
    }

    public Market withSeriesColor(String seriesColor) {
        this.seriesColor = seriesColor;
        return this;
    }

    @JsonProperty("shortOutcomes")
    public String getShortOutcomes() {
        return shortOutcomes;
    }

    @JsonProperty("shortOutcomes")
    public void setShortOutcomes(String shortOutcomes) {
        this.shortOutcomes = shortOutcomes;
    }

    public Market withShortOutcomes(String shortOutcomes) {
        this.shortOutcomes = shortOutcomes;
        return this;
    }

    @JsonProperty("showGmpOutcome")
    public Boolean getShowGmpOutcome() {
        return showGmpOutcome;
    }

    @JsonProperty("showGmpOutcome")
    public void setShowGmpOutcome(Boolean showGmpOutcome) {
        this.showGmpOutcome = showGmpOutcome;
    }

    public Market withShowGmpOutcome(Boolean showGmpOutcome) {
        this.showGmpOutcome = showGmpOutcome;
        return this;
    }

    @JsonProperty("showGmpSeries")
    public Boolean getShowGmpSeries() {
        return showGmpSeries;
    }

    @JsonProperty("showGmpSeries")
    public void setShowGmpSeries(Boolean showGmpSeries) {
        this.showGmpSeries = showGmpSeries;
    }

    public Market withShowGmpSeries(Boolean showGmpSeries) {
        this.showGmpSeries = showGmpSeries;
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

    public Market withSlug(String slug) {
        this.slug = slug;
        return this;
    }

    @JsonProperty("sponsorImage")
    public String getSponsorImage() {
        return sponsorImage;
    }

    @JsonProperty("sponsorImage")
    public void setSponsorImage(String sponsorImage) {
        this.sponsorImage = sponsorImage;
    }

    public Market withSponsorImage(String sponsorImage) {
        this.sponsorImage = sponsorImage;
        return this;
    }

    @JsonProperty("sponsorName")
    public String getSponsorName() {
        return sponsorName;
    }

    @JsonProperty("sponsorName")
    public void setSponsorName(String sponsorName) {
        this.sponsorName = sponsorName;
    }

    public Market withSponsorName(String sponsorName) {
        this.sponsorName = sponsorName;
        return this;
    }

    @JsonProperty("sportsMarketType")
    public String getSportsMarketType() {
        return sportsMarketType;
    }

    @JsonProperty("sportsMarketType")
    public void setSportsMarketType(String sportsMarketType) {
        this.sportsMarketType = sportsMarketType;
    }

    public Market withSportsMarketType(String sportsMarketType) {
        this.sportsMarketType = sportsMarketType;
        return this;
    }

    @JsonProperty("spread")
    public Double getSpread() {
        return spread;
    }

    @JsonProperty("spread")
    public void setSpread(Double spread) {
        this.spread = spread;
    }

    public Market withSpread(Double spread) {
        this.spread = spread;
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

    public Market withStartDate(Date startDate) {
        this.startDate = startDate;
        return this;
    }

    @JsonProperty("startDateIso")
    public String getStartDateIso() {
        return startDateIso;
    }

    @JsonProperty("startDateIso")
    public void setStartDateIso(String startDateIso) {
        this.startDateIso = startDateIso;
    }

    public Market withStartDateIso(String startDateIso) {
        this.startDateIso = startDateIso;
        return this;
    }

    @JsonProperty("subcategory")
    public String getSubcategory() {
        return subcategory;
    }

    @JsonProperty("subcategory")
    public void setSubcategory(String subcategory) {
        this.subcategory = subcategory;
    }

    public Market withSubcategory(String subcategory) {
        this.subcategory = subcategory;
        return this;
    }

    @JsonProperty("submitted_by")
    public String getSubmittedBy() {
        return submittedBy;
    }

    @JsonProperty("submitted_by")
    public void setSubmittedBy(String submittedBy) {
        this.submittedBy = submittedBy;
    }

    public Market withSubmittedBy(String submittedBy) {
        this.submittedBy = submittedBy;
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

    public Market withTags(List<Tag> tags) {
        this.tags = tags;
        return this;
    }

    @JsonProperty("takerBaseFee")
    public Integer getTakerBaseFee() {
        return takerBaseFee;
    }

    @JsonProperty("takerBaseFee")
    public void setTakerBaseFee(Integer takerBaseFee) {
        this.takerBaseFee = takerBaseFee;
    }

    public Market withTakerBaseFee(Integer takerBaseFee) {
        this.takerBaseFee = takerBaseFee;
        return this;
    }

    @JsonProperty("teamAID")
    public String getTeamAID() {
        return teamAID;
    }

    @JsonProperty("teamAID")
    public void setTeamAID(String teamAID) {
        this.teamAID = teamAID;
    }

    public Market withTeamAID(String teamAID) {
        this.teamAID = teamAID;
        return this;
    }

    @JsonProperty("teamBID")
    public String getTeamBID() {
        return teamBID;
    }

    @JsonProperty("teamBID")
    public void setTeamBID(String teamBID) {
        this.teamBID = teamBID;
    }

    public Market withTeamBID(String teamBID) {
        this.teamBID = teamBID;
        return this;
    }

    @JsonProperty("twitterCardImage")
    public String getTwitterCardImage() {
        return twitterCardImage;
    }

    @JsonProperty("twitterCardImage")
    public void setTwitterCardImage(String twitterCardImage) {
        this.twitterCardImage = twitterCardImage;
    }

    public Market withTwitterCardImage(String twitterCardImage) {
        this.twitterCardImage = twitterCardImage;
        return this;
    }

    @JsonProperty("twitterCardLastRefreshed")
    public String getTwitterCardLastRefreshed() {
        return twitterCardLastRefreshed;
    }

    @JsonProperty("twitterCardLastRefreshed")
    public void setTwitterCardLastRefreshed(String twitterCardLastRefreshed) {
        this.twitterCardLastRefreshed = twitterCardLastRefreshed;
    }

    public Market withTwitterCardLastRefreshed(String twitterCardLastRefreshed) {
        this.twitterCardLastRefreshed = twitterCardLastRefreshed;
        return this;
    }

    @JsonProperty("twitterCardLastValidated")
    public String getTwitterCardLastValidated() {
        return twitterCardLastValidated;
    }

    @JsonProperty("twitterCardLastValidated")
    public void setTwitterCardLastValidated(String twitterCardLastValidated) {
        this.twitterCardLastValidated = twitterCardLastValidated;
    }

    public Market withTwitterCardLastValidated(String twitterCardLastValidated) {
        this.twitterCardLastValidated = twitterCardLastValidated;
        return this;
    }

    @JsonProperty("twitterCardLocation")
    public String getTwitterCardLocation() {
        return twitterCardLocation;
    }

    @JsonProperty("twitterCardLocation")
    public void setTwitterCardLocation(String twitterCardLocation) {
        this.twitterCardLocation = twitterCardLocation;
    }

    public Market withTwitterCardLocation(String twitterCardLocation) {
        this.twitterCardLocation = twitterCardLocation;
        return this;
    }

    @JsonProperty("umaBond")
    public String getUmaBond() {
        return umaBond;
    }

    @JsonProperty("umaBond")
    public void setUmaBond(String umaBond) {
        this.umaBond = umaBond;
    }

    public Market withUmaBond(String umaBond) {
        this.umaBond = umaBond;
        return this;
    }

    @JsonProperty("umaEndDate")
    public String getUmaEndDate() {
        return umaEndDate;
    }

    @JsonProperty("umaEndDate")
    public void setUmaEndDate(String umaEndDate) {
        this.umaEndDate = umaEndDate;
    }

    public Market withUmaEndDate(String umaEndDate) {
        this.umaEndDate = umaEndDate;
        return this;
    }

    @JsonProperty("umaEndDateIso")
    public String getUmaEndDateIso() {
        return umaEndDateIso;
    }

    @JsonProperty("umaEndDateIso")
    public void setUmaEndDateIso(String umaEndDateIso) {
        this.umaEndDateIso = umaEndDateIso;
    }

    public Market withUmaEndDateIso(String umaEndDateIso) {
        this.umaEndDateIso = umaEndDateIso;
        return this;
    }

    @JsonProperty("umaResolutionStatus")
    public String getUmaResolutionStatus() {
        return umaResolutionStatus;
    }

    @JsonProperty("umaResolutionStatus")
    public void setUmaResolutionStatus(String umaResolutionStatus) {
        this.umaResolutionStatus = umaResolutionStatus;
    }

    public Market withUmaResolutionStatus(String umaResolutionStatus) {
        this.umaResolutionStatus = umaResolutionStatus;
        return this;
    }

    @JsonProperty("umaResolutionStatuses")
    public String getUmaResolutionStatuses() {
        return umaResolutionStatuses;
    }

    @JsonProperty("umaResolutionStatuses")
    public void setUmaResolutionStatuses(String umaResolutionStatuses) {
        this.umaResolutionStatuses = umaResolutionStatuses;
    }

    public Market withUmaResolutionStatuses(String umaResolutionStatuses) {
        this.umaResolutionStatuses = umaResolutionStatuses;
        return this;
    }

    @JsonProperty("umaReward")
    public String getUmaReward() {
        return umaReward;
    }

    @JsonProperty("umaReward")
    public void setUmaReward(String umaReward) {
        this.umaReward = umaReward;
    }

    public Market withUmaReward(String umaReward) {
        this.umaReward = umaReward;
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

    public Market withUpdatedAt(Date updatedAt) {
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

    public Market withUpdatedBy(Integer updatedBy) {
        this.updatedBy = updatedBy;
        return this;
    }

    @JsonProperty("upperBound")
    public String getUpperBound() {
        return upperBound;
    }

    @JsonProperty("upperBound")
    public void setUpperBound(String upperBound) {
        this.upperBound = upperBound;
    }

    public Market withUpperBound(String upperBound) {
        this.upperBound = upperBound;
        return this;
    }

    @JsonProperty("upperBoundDate")
    public String getUpperBoundDate() {
        return upperBoundDate;
    }

    @JsonProperty("upperBoundDate")
    public void setUpperBoundDate(String upperBoundDate) {
        this.upperBoundDate = upperBoundDate;
    }

    public Market withUpperBoundDate(String upperBoundDate) {
        this.upperBoundDate = upperBoundDate;
        return this;
    }

    /**
     * Protocol version the market trades on: v1 (legacy CTF/CLOB) or v2 (polymarket-v2 modules). Clients must match exact values and treat unknown values as unsupported.
     * 
     */
    @JsonProperty("version")
    public Market.Version getVersion() {
        return version;
    }

    /**
     * Protocol version the market trades on: v1 (legacy CTF/CLOB) or v2 (polymarket-v2 modules). Clients must match exact values and treat unknown values as unsupported.
     * 
     */
    @JsonProperty("version")
    public void setVersion(Market.Version version) {
        this.version = version;
    }

    public Market withVersion(Market.Version version) {
        this.version = version;
        return this;
    }

    @JsonProperty("volume")
    public String getVolume() {
        return volume;
    }

    @JsonProperty("volume")
    public void setVolume(String volume) {
        this.volume = volume;
    }

    public Market withVolume(String volume) {
        this.volume = volume;
        return this;
    }

    @JsonProperty("volume1mo")
    public Double getVolume1mo() {
        return volume1mo;
    }

    @JsonProperty("volume1mo")
    public void setVolume1mo(Double volume1mo) {
        this.volume1mo = volume1mo;
    }

    public Market withVolume1mo(Double volume1mo) {
        this.volume1mo = volume1mo;
        return this;
    }

    @JsonProperty("volume1moAmm")
    public Double getVolume1moAmm() {
        return volume1moAmm;
    }

    @JsonProperty("volume1moAmm")
    public void setVolume1moAmm(Double volume1moAmm) {
        this.volume1moAmm = volume1moAmm;
    }

    public Market withVolume1moAmm(Double volume1moAmm) {
        this.volume1moAmm = volume1moAmm;
        return this;
    }

    @JsonProperty("volume1moClob")
    public Double getVolume1moClob() {
        return volume1moClob;
    }

    @JsonProperty("volume1moClob")
    public void setVolume1moClob(Double volume1moClob) {
        this.volume1moClob = volume1moClob;
    }

    public Market withVolume1moClob(Double volume1moClob) {
        this.volume1moClob = volume1moClob;
        return this;
    }

    @JsonProperty("volume1wk")
    public Double getVolume1wk() {
        return volume1wk;
    }

    @JsonProperty("volume1wk")
    public void setVolume1wk(Double volume1wk) {
        this.volume1wk = volume1wk;
    }

    public Market withVolume1wk(Double volume1wk) {
        this.volume1wk = volume1wk;
        return this;
    }

    @JsonProperty("volume1wkAmm")
    public Double getVolume1wkAmm() {
        return volume1wkAmm;
    }

    @JsonProperty("volume1wkAmm")
    public void setVolume1wkAmm(Double volume1wkAmm) {
        this.volume1wkAmm = volume1wkAmm;
    }

    public Market withVolume1wkAmm(Double volume1wkAmm) {
        this.volume1wkAmm = volume1wkAmm;
        return this;
    }

    @JsonProperty("volume1wkClob")
    public Double getVolume1wkClob() {
        return volume1wkClob;
    }

    @JsonProperty("volume1wkClob")
    public void setVolume1wkClob(Double volume1wkClob) {
        this.volume1wkClob = volume1wkClob;
    }

    public Market withVolume1wkClob(Double volume1wkClob) {
        this.volume1wkClob = volume1wkClob;
        return this;
    }

    @JsonProperty("volume1yr")
    public Double getVolume1yr() {
        return volume1yr;
    }

    @JsonProperty("volume1yr")
    public void setVolume1yr(Double volume1yr) {
        this.volume1yr = volume1yr;
    }

    public Market withVolume1yr(Double volume1yr) {
        this.volume1yr = volume1yr;
        return this;
    }

    @JsonProperty("volume1yrAmm")
    public Double getVolume1yrAmm() {
        return volume1yrAmm;
    }

    @JsonProperty("volume1yrAmm")
    public void setVolume1yrAmm(Double volume1yrAmm) {
        this.volume1yrAmm = volume1yrAmm;
    }

    public Market withVolume1yrAmm(Double volume1yrAmm) {
        this.volume1yrAmm = volume1yrAmm;
        return this;
    }

    @JsonProperty("volume1yrClob")
    public Double getVolume1yrClob() {
        return volume1yrClob;
    }

    @JsonProperty("volume1yrClob")
    public void setVolume1yrClob(Double volume1yrClob) {
        this.volume1yrClob = volume1yrClob;
    }

    public Market withVolume1yrClob(Double volume1yrClob) {
        this.volume1yrClob = volume1yrClob;
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

    public Market withVolume24hr(Double volume24hr) {
        this.volume24hr = volume24hr;
        return this;
    }

    @JsonProperty("volume24hrAmm")
    public Double getVolume24hrAmm() {
        return volume24hrAmm;
    }

    @JsonProperty("volume24hrAmm")
    public void setVolume24hrAmm(Double volume24hrAmm) {
        this.volume24hrAmm = volume24hrAmm;
    }

    public Market withVolume24hrAmm(Double volume24hrAmm) {
        this.volume24hrAmm = volume24hrAmm;
        return this;
    }

    @JsonProperty("volume24hrClob")
    public Double getVolume24hrClob() {
        return volume24hrClob;
    }

    @JsonProperty("volume24hrClob")
    public void setVolume24hrClob(Double volume24hrClob) {
        this.volume24hrClob = volume24hrClob;
    }

    public Market withVolume24hrClob(Double volume24hrClob) {
        this.volume24hrClob = volume24hrClob;
        return this;
    }

    @JsonProperty("volumeAmm")
    public Double getVolumeAmm() {
        return volumeAmm;
    }

    @JsonProperty("volumeAmm")
    public void setVolumeAmm(Double volumeAmm) {
        this.volumeAmm = volumeAmm;
    }

    public Market withVolumeAmm(Double volumeAmm) {
        this.volumeAmm = volumeAmm;
        return this;
    }

    @JsonProperty("volumeClob")
    public Double getVolumeClob() {
        return volumeClob;
    }

    @JsonProperty("volumeClob")
    public void setVolumeClob(Double volumeClob) {
        this.volumeClob = volumeClob;
    }

    public Market withVolumeClob(Double volumeClob) {
        this.volumeClob = volumeClob;
        return this;
    }

    @JsonProperty("volumeNum")
    public Double getVolumeNum() {
        return volumeNum;
    }

    @JsonProperty("volumeNum")
    public void setVolumeNum(Double volumeNum) {
        this.volumeNum = volumeNum;
    }

    public Market withVolumeNum(Double volumeNum) {
        this.volumeNum = volumeNum;
        return this;
    }

    @JsonProperty("wideFormat")
    public Boolean getWideFormat() {
        return wideFormat;
    }

    @JsonProperty("wideFormat")
    public void setWideFormat(Boolean wideFormat) {
        this.wideFormat = wideFormat;
    }

    public Market withWideFormat(Boolean wideFormat) {
        this.wideFormat = wideFormat;
        return this;
    }

    @JsonProperty("xAxisValue")
    public String getxAxisValue() {
        return xAxisValue;
    }

    @JsonProperty("xAxisValue")
    public void setxAxisValue(String xAxisValue) {
        this.xAxisValue = xAxisValue;
    }

    public Market withxAxisValue(String xAxisValue) {
        this.xAxisValue = xAxisValue;
        return this;
    }

    @JsonProperty("yAxisValue")
    public String getyAxisValue() {
        return yAxisValue;
    }

    @JsonProperty("yAxisValue")
    public void setyAxisValue(String yAxisValue) {
        this.yAxisValue = yAxisValue;
    }

    public Market withyAxisValue(String yAxisValue) {
        this.yAxisValue = yAxisValue;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Market.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("$schema");
        sb.append('=');
        sb.append(((this.$schema == null)?"<null>":this.$schema));
        sb.append(',');
        sb.append("acceptingOrders");
        sb.append('=');
        sb.append(((this.acceptingOrders == null)?"<null>":this.acceptingOrders));
        sb.append(',');
        sb.append("acceptingOrdersTimestamp");
        sb.append('=');
        sb.append(((this.acceptingOrdersTimestamp == null)?"<null>":this.acceptingOrdersTimestamp));
        sb.append(',');
        sb.append("acceptingOrdersUntil");
        sb.append('=');
        sb.append(((this.acceptingOrdersUntil == null)?"<null>":this.acceptingOrdersUntil));
        sb.append(',');
        sb.append("active");
        sb.append('=');
        sb.append(((this.active == null)?"<null>":this.active));
        sb.append(',');
        sb.append("ammType");
        sb.append('=');
        sb.append(((this.ammType == null)?"<null>":this.ammType));
        sb.append(',');
        sb.append("approved");
        sb.append('=');
        sb.append(((this.approved == null)?"<null>":this.approved));
        sb.append(',');
        sb.append("archived");
        sb.append('=');
        sb.append(((this.archived == null)?"<null>":this.archived));
        sb.append(',');
        sb.append("automaticallyActive");
        sb.append('=');
        sb.append(((this.automaticallyActive == null)?"<null>":this.automaticallyActive));
        sb.append(',');
        sb.append("automaticallyResolved");
        sb.append('=');
        sb.append(((this.automaticallyResolved == null)?"<null>":this.automaticallyResolved));
        sb.append(',');
        sb.append("bestAsk");
        sb.append('=');
        sb.append(((this.bestAsk == null)?"<null>":this.bestAsk));
        sb.append(',');
        sb.append("bestBid");
        sb.append('=');
        sb.append(((this.bestBid == null)?"<null>":this.bestBid));
        sb.append(',');
        sb.append("category");
        sb.append('=');
        sb.append(((this.category == null)?"<null>":this.category));
        sb.append(',');
        sb.append("categoryMailchimpTag");
        sb.append('=');
        sb.append(((this.categoryMailchimpTag == null)?"<null>":this.categoryMailchimpTag));
        sb.append(',');
        sb.append("chartColor");
        sb.append('=');
        sb.append(((this.chartColor == null)?"<null>":this.chartColor));
        sb.append(',');
        sb.append("clearBookOnStart");
        sb.append('=');
        sb.append(((this.clearBookOnStart == null)?"<null>":this.clearBookOnStart));
        sb.append(',');
        sb.append("clobRewards");
        sb.append('=');
        sb.append(((this.clobRewards == null)?"<null>":this.clobRewards));
        sb.append(',');
        sb.append("clobTokenIds");
        sb.append('=');
        sb.append(((this.clobTokenIds == null)?"<null>":this.clobTokenIds));
        sb.append(',');
        sb.append("closed");
        sb.append('=');
        sb.append(((this.closed == null)?"<null>":this.closed));
        sb.append(',');
        sb.append("closedTime");
        sb.append('=');
        sb.append(((this.closedTime == null)?"<null>":this.closedTime));
        sb.append(',');
        sb.append("comboStatus");
        sb.append('=');
        sb.append(((this.comboStatus == null)?"<null>":this.comboStatus));
        sb.append(',');
        sb.append("commentsEnabled");
        sb.append('=');
        sb.append(((this.commentsEnabled == null)?"<null>":this.commentsEnabled));
        sb.append(',');
        sb.append("competitive");
        sb.append('=');
        sb.append(((this.competitive == null)?"<null>":this.competitive));
        sb.append(',');
        sb.append("conditionId");
        sb.append('=');
        sb.append(((this.conditionId == null)?"<null>":this.conditionId));
        sb.append(',');
        sb.append("createdAt");
        sb.append('=');
        sb.append(((this.createdAt == null)?"<null>":this.createdAt));
        sb.append(',');
        sb.append("createdBy");
        sb.append('=');
        sb.append(((this.createdBy == null)?"<null>":this.createdBy));
        sb.append(',');
        sb.append("creator");
        sb.append('=');
        sb.append(((this.creator == null)?"<null>":this.creator));
        sb.append(',');
        sb.append("cryptoMarketConfig");
        sb.append('=');
        sb.append(((this.cryptoMarketConfig == null)?"<null>":this.cryptoMarketConfig));
        sb.append(',');
        sb.append("cryptoMarketConfigId");
        sb.append('=');
        sb.append(((this.cryptoMarketConfigId == null)?"<null>":this.cryptoMarketConfigId));
        sb.append(',');
        sb.append("curationOrder");
        sb.append('=');
        sb.append(((this.curationOrder == null)?"<null>":this.curationOrder));
        sb.append(',');
        sb.append("customLiveness");
        sb.append('=');
        sb.append(((this.customLiveness == null)?"<null>":this.customLiveness));
        sb.append(',');
        sb.append("cyom");
        sb.append('=');
        sb.append(((this.cyom == null)?"<null>":this.cyom));
        sb.append(',');
        sb.append("denominationToken");
        sb.append('=');
        sb.append(((this.denominationToken == null)?"<null>":this.denominationToken));
        sb.append(',');
        sb.append("deploying");
        sb.append('=');
        sb.append(((this.deploying == null)?"<null>":this.deploying));
        sb.append(',');
        sb.append("deployingTimestamp");
        sb.append('=');
        sb.append(((this.deployingTimestamp == null)?"<null>":this.deployingTimestamp));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("disqusThread");
        sb.append('=');
        sb.append(((this.disqusThread == null)?"<null>":this.disqusThread));
        sb.append(',');
        sb.append("enableOrderBook");
        sb.append('=');
        sb.append(((this.enableOrderBook == null)?"<null>":this.enableOrderBook));
        sb.append(',');
        sb.append("endDate");
        sb.append('=');
        sb.append(((this.endDate == null)?"<null>":this.endDate));
        sb.append(',');
        sb.append("endDateIso");
        sb.append('=');
        sb.append(((this.endDateIso == null)?"<null>":this.endDateIso));
        sb.append(',');
        sb.append("eventStartTime");
        sb.append('=');
        sb.append(((this.eventStartTime == null)?"<null>":this.eventStartTime));
        sb.append(',');
        sb.append("events");
        sb.append('=');
        sb.append(((this.events == null)?"<null>":this.events));
        sb.append(',');
        sb.append("featured");
        sb.append('=');
        sb.append(((this.featured == null)?"<null>":this.featured));
        sb.append(',');
        sb.append("fee");
        sb.append('=');
        sb.append(((this.fee == null)?"<null>":this.fee));
        sb.append(',');
        sb.append("feeExponent");
        sb.append('=');
        sb.append(((this.feeExponent == null)?"<null>":this.feeExponent));
        sb.append(',');
        sb.append("feeRate");
        sb.append('=');
        sb.append(((this.feeRate == null)?"<null>":this.feeRate));
        sb.append(',');
        sb.append("feeSchedule");
        sb.append('=');
        sb.append(((this.feeSchedule == null)?"<null>":this.feeSchedule));
        sb.append(',');
        sb.append("feeType");
        sb.append('=');
        sb.append(((this.feeType == null)?"<null>":this.feeType));
        sb.append(',');
        sb.append("feesEnabled");
        sb.append('=');
        sb.append(((this.feesEnabled == null)?"<null>":this.feesEnabled));
        sb.append(',');
        sb.append("formatType");
        sb.append('=');
        sb.append(((this.formatType == null)?"<null>":this.formatType));
        sb.append(',');
        sb.append("fpmmLive");
        sb.append('=');
        sb.append(((this.fpmmLive == null)?"<null>":this.fpmmLive));
        sb.append(',');
        sb.append("funded");
        sb.append('=');
        sb.append(((this.funded == null)?"<null>":this.funded));
        sb.append(',');
        sb.append("fundedTimestamp");
        sb.append('=');
        sb.append(((this.fundedTimestamp == null)?"<null>":this.fundedTimestamp));
        sb.append(',');
        sb.append("gameId");
        sb.append('=');
        sb.append(((this.gameId == null)?"<null>":this.gameId));
        sb.append(',');
        sb.append("gameStartTime");
        sb.append('=');
        sb.append(((this.gameStartTime == null)?"<null>":this.gameStartTime));
        sb.append(',');
        sb.append("groupItemRange");
        sb.append('=');
        sb.append(((this.groupItemRange == null)?"<null>":this.groupItemRange));
        sb.append(',');
        sb.append("groupItemThreshold");
        sb.append('=');
        sb.append(((this.groupItemThreshold == null)?"<null>":this.groupItemThreshold));
        sb.append(',');
        sb.append("groupItemTitle");
        sb.append('=');
        sb.append(((this.groupItemTitle == null)?"<null>":this.groupItemTitle));
        sb.append(',');
        sb.append("hasReviewedDates");
        sb.append('=');
        sb.append(((this.hasReviewedDates == null)?"<null>":this.hasReviewedDates));
        sb.append(',');
        sb.append("holdingRewardsEnabled");
        sb.append('=');
        sb.append(((this.holdingRewardsEnabled == null)?"<null>":this.holdingRewardsEnabled));
        sb.append(',');
        sb.append("icon");
        sb.append('=');
        sb.append(((this.icon == null)?"<null>":this.icon));
        sb.append(',');
        sb.append("iconOptimized");
        sb.append('=');
        sb.append(((this.iconOptimized == null)?"<null>":this.iconOptimized));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("image");
        sb.append('=');
        sb.append(((this.image == null)?"<null>":this.image));
        sb.append(',');
        sb.append("imageOptimized");
        sb.append('=');
        sb.append(((this.imageOptimized == null)?"<null>":this.imageOptimized));
        sb.append(',');
        sb.append("lastTradePrice");
        sb.append('=');
        sb.append(((this.lastTradePrice == null)?"<null>":this.lastTradePrice));
        sb.append(',');
        sb.append("line");
        sb.append('=');
        sb.append(((this.line == null)?"<null>":this.line));
        sb.append(',');
        sb.append("liquidity");
        sb.append('=');
        sb.append(((this.liquidity == null)?"<null>":this.liquidity));
        sb.append(',');
        sb.append("liquidityAmm");
        sb.append('=');
        sb.append(((this.liquidityAmm == null)?"<null>":this.liquidityAmm));
        sb.append(',');
        sb.append("liquidityClob");
        sb.append('=');
        sb.append(((this.liquidityClob == null)?"<null>":this.liquidityClob));
        sb.append(',');
        sb.append("liquidityNum");
        sb.append('=');
        sb.append(((this.liquidityNum == null)?"<null>":this.liquidityNum));
        sb.append(',');
        sb.append("lowerBound");
        sb.append('=');
        sb.append(((this.lowerBound == null)?"<null>":this.lowerBound));
        sb.append(',');
        sb.append("lowerBoundDate");
        sb.append('=');
        sb.append(((this.lowerBoundDate == null)?"<null>":this.lowerBoundDate));
        sb.append(',');
        sb.append("mailchimpTag");
        sb.append('=');
        sb.append(((this.mailchimpTag == null)?"<null>":this.mailchimpTag));
        sb.append(',');
        sb.append("makerBaseFee");
        sb.append('=');
        sb.append(((this.makerBaseFee == null)?"<null>":this.makerBaseFee));
        sb.append(',');
        sb.append("makerRebatesFeeShareBps");
        sb.append('=');
        sb.append(((this.makerRebatesFeeShareBps == null)?"<null>":this.makerRebatesFeeShareBps));
        sb.append(',');
        sb.append("manualActivation");
        sb.append('=');
        sb.append(((this.manualActivation == null)?"<null>":this.manualActivation));
        sb.append(',');
        sb.append("marketGroup");
        sb.append('=');
        sb.append(((this.marketGroup == null)?"<null>":this.marketGroup));
        sb.append(',');
        sb.append("marketMakerAddress");
        sb.append('=');
        sb.append(((this.marketMakerAddress == null)?"<null>":this.marketMakerAddress));
        sb.append(',');
        sb.append("marketMetadata");
        sb.append('=');
        sb.append(((this.marketMetadata == null)?"<null>":this.marketMetadata));
        sb.append(',');
        sb.append("marketType");
        sb.append('=');
        sb.append(((this.marketType == null)?"<null>":this.marketType));
        sb.append(',');
        sb.append("markets");
        sb.append('=');
        sb.append(((this.markets == null)?"<null>":this.markets));
        sb.append(',');
        sb.append("negRisk");
        sb.append('=');
        sb.append(((this.negRisk == null)?"<null>":this.negRisk));
        sb.append(',');
        sb.append("negRiskMarketID");
        sb.append('=');
        sb.append(((this.negRiskMarketID == null)?"<null>":this.negRiskMarketID));
        sb.append(',');
        sb.append("negRiskOther");
        sb.append('=');
        sb.append(((this.negRiskOther == null)?"<null>":this.negRiskOther));
        sb.append(',');
        sb.append("negRiskRequestID");
        sb.append('=');
        sb.append(((this.negRiskRequestID == null)?"<null>":this.negRiskRequestID));
        sb.append(',');
        sb.append("_new");
        sb.append('=');
        sb.append(((this._new == null)?"<null>":this._new));
        sb.append(',');
        sb.append("notificationsEnabled");
        sb.append('=');
        sb.append(((this.notificationsEnabled == null)?"<null>":this.notificationsEnabled));
        sb.append(',');
        sb.append("onchainEventId");
        sb.append('=');
        sb.append(((this.onchainEventId == null)?"<null>":this.onchainEventId));
        sb.append(',');
        sb.append("oneDayPriceChange");
        sb.append('=');
        sb.append(((this.oneDayPriceChange == null)?"<null>":this.oneDayPriceChange));
        sb.append(',');
        sb.append("oneHourPriceChange");
        sb.append('=');
        sb.append(((this.oneHourPriceChange == null)?"<null>":this.oneHourPriceChange));
        sb.append(',');
        sb.append("oneMonthPriceChange");
        sb.append('=');
        sb.append(((this.oneMonthPriceChange == null)?"<null>":this.oneMonthPriceChange));
        sb.append(',');
        sb.append("oneWeekPriceChange");
        sb.append('=');
        sb.append(((this.oneWeekPriceChange == null)?"<null>":this.oneWeekPriceChange));
        sb.append(',');
        sb.append("oneYearPriceChange");
        sb.append('=');
        sb.append(((this.oneYearPriceChange == null)?"<null>":this.oneYearPriceChange));
        sb.append(',');
        sb.append("orderMinSize");
        sb.append('=');
        sb.append(((this.orderMinSize == null)?"<null>":this.orderMinSize));
        sb.append(',');
        sb.append("orderPriceMinTickSize");
        sb.append('=');
        sb.append(((this.orderPriceMinTickSize == null)?"<null>":this.orderPriceMinTickSize));
        sb.append(',');
        sb.append("outcomePrices");
        sb.append('=');
        sb.append(((this.outcomePrices == null)?"<null>":this.outcomePrices));
        sb.append(',');
        sb.append("outcomes");
        sb.append('=');
        sb.append(((this.outcomes == null)?"<null>":this.outcomes));
        sb.append(',');
        sb.append("pagerDutyNotificationEnabled");
        sb.append('=');
        sb.append(((this.pagerDutyNotificationEnabled == null)?"<null>":this.pagerDutyNotificationEnabled));
        sb.append(',');
        sb.append("pastSlugs");
        sb.append('=');
        sb.append(((this.pastSlugs == null)?"<null>":this.pastSlugs));
        sb.append(',');
        sb.append("pendingDeployment");
        sb.append('=');
        sb.append(((this.pendingDeployment == null)?"<null>":this.pendingDeployment));
        sb.append(',');
        sb.append("positionIds");
        sb.append('=');
        sb.append(((this.positionIds == null)?"<null>":this.positionIds));
        sb.append(',');
        sb.append("question");
        sb.append('=');
        sb.append(((this.question == null)?"<null>":this.question));
        sb.append(',');
        sb.append("questionID");
        sb.append('=');
        sb.append(((this.questionID == null)?"<null>":this.questionID));
        sb.append(',');
        sb.append("ready");
        sb.append('=');
        sb.append(((this.ready == null)?"<null>":this.ready));
        sb.append(',');
        sb.append("readyForCron");
        sb.append('=');
        sb.append(((this.readyForCron == null)?"<null>":this.readyForCron));
        sb.append(',');
        sb.append("readyTimestamp");
        sb.append('=');
        sb.append(((this.readyTimestamp == null)?"<null>":this.readyTimestamp));
        sb.append(',');
        sb.append("requestId");
        sb.append('=');
        sb.append(((this.requestId == null)?"<null>":this.requestId));
        sb.append(',');
        sb.append("requiresTranslation");
        sb.append('=');
        sb.append(((this.requiresTranslation == null)?"<null>":this.requiresTranslation));
        sb.append(',');
        sb.append("resolutionSource");
        sb.append('=');
        sb.append(((this.resolutionSource == null)?"<null>":this.resolutionSource));
        sb.append(',');
        sb.append("resolutionStatus");
        sb.append('=');
        sb.append(((this.resolutionStatus == null)?"<null>":this.resolutionStatus));
        sb.append(',');
        sb.append("resolvedBy");
        sb.append('=');
        sb.append(((this.resolvedBy == null)?"<null>":this.resolvedBy));
        sb.append(',');
        sb.append("restricted");
        sb.append('=');
        sb.append(((this.restricted == null)?"<null>":this.restricted));
        sb.append(',');
        sb.append("rewardsMaxSpread");
        sb.append('=');
        sb.append(((this.rewardsMaxSpread == null)?"<null>":this.rewardsMaxSpread));
        sb.append(',');
        sb.append("rewardsMinSize");
        sb.append('=');
        sb.append(((this.rewardsMinSize == null)?"<null>":this.rewardsMinSize));
        sb.append(',');
        sb.append("rfqEnabled");
        sb.append('=');
        sb.append(((this.rfqEnabled == null)?"<null>":this.rfqEnabled));
        sb.append(',');
        sb.append("scheduledDeploymentTimestamp");
        sb.append('=');
        sb.append(((this.scheduledDeploymentTimestamp == null)?"<null>":this.scheduledDeploymentTimestamp));
        sb.append(',');
        sb.append("score");
        sb.append('=');
        sb.append(((this.score == null)?"<null>":this.score));
        sb.append(',');
        sb.append("secondsDelay");
        sb.append('=');
        sb.append(((this.secondsDelay == null)?"<null>":this.secondsDelay));
        sb.append(',');
        sb.append("sentDiscord");
        sb.append('=');
        sb.append(((this.sentDiscord == null)?"<null>":this.sentDiscord));
        sb.append(',');
        sb.append("seriesColor");
        sb.append('=');
        sb.append(((this.seriesColor == null)?"<null>":this.seriesColor));
        sb.append(',');
        sb.append("shortOutcomes");
        sb.append('=');
        sb.append(((this.shortOutcomes == null)?"<null>":this.shortOutcomes));
        sb.append(',');
        sb.append("showGmpOutcome");
        sb.append('=');
        sb.append(((this.showGmpOutcome == null)?"<null>":this.showGmpOutcome));
        sb.append(',');
        sb.append("showGmpSeries");
        sb.append('=');
        sb.append(((this.showGmpSeries == null)?"<null>":this.showGmpSeries));
        sb.append(',');
        sb.append("slug");
        sb.append('=');
        sb.append(((this.slug == null)?"<null>":this.slug));
        sb.append(',');
        sb.append("sponsorImage");
        sb.append('=');
        sb.append(((this.sponsorImage == null)?"<null>":this.sponsorImage));
        sb.append(',');
        sb.append("sponsorName");
        sb.append('=');
        sb.append(((this.sponsorName == null)?"<null>":this.sponsorName));
        sb.append(',');
        sb.append("sportsMarketType");
        sb.append('=');
        sb.append(((this.sportsMarketType == null)?"<null>":this.sportsMarketType));
        sb.append(',');
        sb.append("spread");
        sb.append('=');
        sb.append(((this.spread == null)?"<null>":this.spread));
        sb.append(',');
        sb.append("startDate");
        sb.append('=');
        sb.append(((this.startDate == null)?"<null>":this.startDate));
        sb.append(',');
        sb.append("startDateIso");
        sb.append('=');
        sb.append(((this.startDateIso == null)?"<null>":this.startDateIso));
        sb.append(',');
        sb.append("subcategory");
        sb.append('=');
        sb.append(((this.subcategory == null)?"<null>":this.subcategory));
        sb.append(',');
        sb.append("submittedBy");
        sb.append('=');
        sb.append(((this.submittedBy == null)?"<null>":this.submittedBy));
        sb.append(',');
        sb.append("tags");
        sb.append('=');
        sb.append(((this.tags == null)?"<null>":this.tags));
        sb.append(',');
        sb.append("takerBaseFee");
        sb.append('=');
        sb.append(((this.takerBaseFee == null)?"<null>":this.takerBaseFee));
        sb.append(',');
        sb.append("teamAID");
        sb.append('=');
        sb.append(((this.teamAID == null)?"<null>":this.teamAID));
        sb.append(',');
        sb.append("teamBID");
        sb.append('=');
        sb.append(((this.teamBID == null)?"<null>":this.teamBID));
        sb.append(',');
        sb.append("twitterCardImage");
        sb.append('=');
        sb.append(((this.twitterCardImage == null)?"<null>":this.twitterCardImage));
        sb.append(',');
        sb.append("twitterCardLastRefreshed");
        sb.append('=');
        sb.append(((this.twitterCardLastRefreshed == null)?"<null>":this.twitterCardLastRefreshed));
        sb.append(',');
        sb.append("twitterCardLastValidated");
        sb.append('=');
        sb.append(((this.twitterCardLastValidated == null)?"<null>":this.twitterCardLastValidated));
        sb.append(',');
        sb.append("twitterCardLocation");
        sb.append('=');
        sb.append(((this.twitterCardLocation == null)?"<null>":this.twitterCardLocation));
        sb.append(',');
        sb.append("umaBond");
        sb.append('=');
        sb.append(((this.umaBond == null)?"<null>":this.umaBond));
        sb.append(',');
        sb.append("umaEndDate");
        sb.append('=');
        sb.append(((this.umaEndDate == null)?"<null>":this.umaEndDate));
        sb.append(',');
        sb.append("umaEndDateIso");
        sb.append('=');
        sb.append(((this.umaEndDateIso == null)?"<null>":this.umaEndDateIso));
        sb.append(',');
        sb.append("umaResolutionStatus");
        sb.append('=');
        sb.append(((this.umaResolutionStatus == null)?"<null>":this.umaResolutionStatus));
        sb.append(',');
        sb.append("umaResolutionStatuses");
        sb.append('=');
        sb.append(((this.umaResolutionStatuses == null)?"<null>":this.umaResolutionStatuses));
        sb.append(',');
        sb.append("umaReward");
        sb.append('=');
        sb.append(((this.umaReward == null)?"<null>":this.umaReward));
        sb.append(',');
        sb.append("updatedAt");
        sb.append('=');
        sb.append(((this.updatedAt == null)?"<null>":this.updatedAt));
        sb.append(',');
        sb.append("updatedBy");
        sb.append('=');
        sb.append(((this.updatedBy == null)?"<null>":this.updatedBy));
        sb.append(',');
        sb.append("upperBound");
        sb.append('=');
        sb.append(((this.upperBound == null)?"<null>":this.upperBound));
        sb.append(',');
        sb.append("upperBoundDate");
        sb.append('=');
        sb.append(((this.upperBoundDate == null)?"<null>":this.upperBoundDate));
        sb.append(',');
        sb.append("version");
        sb.append('=');
        sb.append(((this.version == null)?"<null>":this.version));
        sb.append(',');
        sb.append("volume");
        sb.append('=');
        sb.append(((this.volume == null)?"<null>":this.volume));
        sb.append(',');
        sb.append("volume1mo");
        sb.append('=');
        sb.append(((this.volume1mo == null)?"<null>":this.volume1mo));
        sb.append(',');
        sb.append("volume1moAmm");
        sb.append('=');
        sb.append(((this.volume1moAmm == null)?"<null>":this.volume1moAmm));
        sb.append(',');
        sb.append("volume1moClob");
        sb.append('=');
        sb.append(((this.volume1moClob == null)?"<null>":this.volume1moClob));
        sb.append(',');
        sb.append("volume1wk");
        sb.append('=');
        sb.append(((this.volume1wk == null)?"<null>":this.volume1wk));
        sb.append(',');
        sb.append("volume1wkAmm");
        sb.append('=');
        sb.append(((this.volume1wkAmm == null)?"<null>":this.volume1wkAmm));
        sb.append(',');
        sb.append("volume1wkClob");
        sb.append('=');
        sb.append(((this.volume1wkClob == null)?"<null>":this.volume1wkClob));
        sb.append(',');
        sb.append("volume1yr");
        sb.append('=');
        sb.append(((this.volume1yr == null)?"<null>":this.volume1yr));
        sb.append(',');
        sb.append("volume1yrAmm");
        sb.append('=');
        sb.append(((this.volume1yrAmm == null)?"<null>":this.volume1yrAmm));
        sb.append(',');
        sb.append("volume1yrClob");
        sb.append('=');
        sb.append(((this.volume1yrClob == null)?"<null>":this.volume1yrClob));
        sb.append(',');
        sb.append("volume24hr");
        sb.append('=');
        sb.append(((this.volume24hr == null)?"<null>":this.volume24hr));
        sb.append(',');
        sb.append("volume24hrAmm");
        sb.append('=');
        sb.append(((this.volume24hrAmm == null)?"<null>":this.volume24hrAmm));
        sb.append(',');
        sb.append("volume24hrClob");
        sb.append('=');
        sb.append(((this.volume24hrClob == null)?"<null>":this.volume24hrClob));
        sb.append(',');
        sb.append("volumeAmm");
        sb.append('=');
        sb.append(((this.volumeAmm == null)?"<null>":this.volumeAmm));
        sb.append(',');
        sb.append("volumeClob");
        sb.append('=');
        sb.append(((this.volumeClob == null)?"<null>":this.volumeClob));
        sb.append(',');
        sb.append("volumeNum");
        sb.append('=');
        sb.append(((this.volumeNum == null)?"<null>":this.volumeNum));
        sb.append(',');
        sb.append("wideFormat");
        sb.append('=');
        sb.append(((this.wideFormat == null)?"<null>":this.wideFormat));
        sb.append(',');
        sb.append("xAxisValue");
        sb.append('=');
        sb.append(((this.xAxisValue == null)?"<null>":this.xAxisValue));
        sb.append(',');
        sb.append("yAxisValue");
        sb.append('=');
        sb.append(((this.yAxisValue == null)?"<null>":this.yAxisValue));
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
        result = ((result* 31)+((this.umaResolutionStatus == null)? 0 :this.umaResolutionStatus.hashCode()));
        result = ((result* 31)+((this.commentsEnabled == null)? 0 :this.commentsEnabled.hashCode()));
        result = ((result* 31)+((this.positionIds == null)? 0 :this.positionIds.hashCode()));
        result = ((result* 31)+((this.endDate == null)? 0 :this.endDate.hashCode()));
        result = ((result* 31)+((this.volume1wkAmm == null)? 0 :this.volume1wkAmm.hashCode()));
        result = ((result* 31)+((this.endDateIso == null)? 0 :this.endDateIso.hashCode()));
        result = ((result* 31)+((this.closedTime == null)? 0 :this.closedTime.hashCode()));
        result = ((result* 31)+((this.marketType == null)? 0 :this.marketType.hashCode()));
        result = ((result* 31)+((this.automaticallyResolved == null)? 0 :this.automaticallyResolved.hashCode()));
        result = ((result* 31)+((this.score == null)? 0 :this.score.hashCode()));
        result = ((result* 31)+((this.approved == null)? 0 :this.approved.hashCode()));
        result = ((result* 31)+((this.marketGroup == null)? 0 :this.marketGroup.hashCode()));
        result = ((result* 31)+((this.lastTradePrice == null)? 0 :this.lastTradePrice.hashCode()));
        result = ((result* 31)+((this.outcomes == null)? 0 :this.outcomes.hashCode()));
        result = ((result* 31)+((this.enableOrderBook == null)? 0 :this.enableOrderBook.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.volume1moAmm == null)? 0 :this.volume1moAmm.hashCode()));
        result = ((result* 31)+((this.volume1mo == null)? 0 :this.volume1mo.hashCode()));
        result = ((result* 31)+((this.events == null)? 0 :this.events.hashCode()));
        result = ((result* 31)+((this.acceptingOrdersUntil == null)? 0 :this.acceptingOrdersUntil.hashCode()));
        result = ((result* 31)+((this.automaticallyActive == null)? 0 :this.automaticallyActive.hashCode()));
        result = ((result* 31)+((this.negRiskOther == null)? 0 :this.negRiskOther.hashCode()));
        result = ((result* 31)+((this.requiresTranslation == null)? 0 :this.requiresTranslation.hashCode()));
        result = ((result* 31)+((this.volumeNum == null)? 0 :this.volumeNum.hashCode()));
        result = ((result* 31)+((this.active == null)? 0 :this.active.hashCode()));
        result = ((result* 31)+((this.takerBaseFee == null)? 0 :this.takerBaseFee.hashCode()));
        result = ((result* 31)+((this.feeType == null)? 0 :this.feeType.hashCode()));
        result = ((result* 31)+((this.version == null)? 0 :this.version.hashCode()));
        result = ((result* 31)+((this.oneYearPriceChange == null)? 0 :this.oneYearPriceChange.hashCode()));
        result = ((result* 31)+((this.tags == null)? 0 :this.tags.hashCode()));
        result = ((result* 31)+((this.groupItemTitle == null)? 0 :this.groupItemTitle.hashCode()));
        result = ((result* 31)+((this.orderMinSize == null)? 0 :this.orderMinSize.hashCode()));
        result = ((result* 31)+((this.resolutionStatus == null)? 0 :this.resolutionStatus.hashCode()));
        result = ((result* 31)+((this.startDateIso == null)? 0 :this.startDateIso.hashCode()));
        result = ((result* 31)+((this.twitterCardLocation == null)? 0 :this.twitterCardLocation.hashCode()));
        result = ((result* 31)+((this.competitive == null)? 0 :this.competitive.hashCode()));
        result = ((result* 31)+((this.startDate == null)? 0 :this.startDate.hashCode()));
        result = ((result* 31)+((this.cryptoMarketConfigId == null)? 0 :this.cryptoMarketConfigId.hashCode()));
        result = ((result* 31)+((this.readyTimestamp == null)? 0 :this.readyTimestamp.hashCode()));
        result = ((result* 31)+((this.marketMetadata == null)? 0 :this.marketMetadata.hashCode()));
        result = ((result* 31)+((this.rewardsMinSize == null)? 0 :this.rewardsMinSize.hashCode()));
        result = ((result* 31)+((this.scheduledDeploymentTimestamp == null)? 0 :this.scheduledDeploymentTimestamp.hashCode()));
        result = ((result* 31)+((this.icon == null)? 0 :this.icon.hashCode()));
        result = ((result* 31)+((this.sponsorName == null)? 0 :this.sponsorName.hashCode()));
        result = ((result* 31)+((this.umaEndDate == null)? 0 :this.umaEndDate.hashCode()));
        result = ((result* 31)+((this.feeRate == null)? 0 :this.feeRate.hashCode()));
        result = ((result* 31)+((this.oneWeekPriceChange == null)? 0 :this.oneWeekPriceChange.hashCode()));
        result = ((result* 31)+((this.umaReward == null)? 0 :this.umaReward.hashCode()));
        result = ((result* 31)+((this.volume1wk == null)? 0 :this.volume1wk.hashCode()));
        result = ((result* 31)+((this.archived == null)? 0 :this.archived.hashCode()));
        result = ((result* 31)+((this.clearBookOnStart == null)? 0 :this.clearBookOnStart.hashCode()));
        result = ((result* 31)+((this.clobTokenIds == null)? 0 :this.clobTokenIds.hashCode()));
        result = ((result* 31)+((this.feesEnabled == null)? 0 :this.feesEnabled.hashCode()));
        result = ((result* 31)+((this.pastSlugs == null)? 0 :this.pastSlugs.hashCode()));
        result = ((result* 31)+((this.onchainEventId == null)? 0 :this.onchainEventId.hashCode()));
        result = ((result* 31)+((this.teamBID == null)? 0 :this.teamBID.hashCode()));
        result = ((result* 31)+((this.requestId == null)? 0 :this.requestId.hashCode()));
        result = ((result* 31)+((this.xAxisValue == null)? 0 :this.xAxisValue.hashCode()));
        result = ((result* 31)+((this.outcomePrices == null)? 0 :this.outcomePrices.hashCode()));
        result = ((result* 31)+((this.volumeClob == null)? 0 :this.volumeClob.hashCode()));
        result = ((result* 31)+((this.deployingTimestamp == null)? 0 :this.deployingTimestamp.hashCode()));
        result = ((result* 31)+((this.fpmmLive == null)? 0 :this.fpmmLive.hashCode()));
        result = ((result* 31)+((this.rfqEnabled == null)? 0 :this.rfqEnabled.hashCode()));
        result = ((result* 31)+((this.creator == null)? 0 :this.creator.hashCode()));
        result = ((result* 31)+((this.questionID == null)? 0 :this.questionID.hashCode()));
        result = ((result* 31)+((this.volumeAmm == null)? 0 :this.volumeAmm.hashCode()));
        result = ((result* 31)+((this.feeSchedule == null)? 0 :this.feeSchedule.hashCode()));
        result = ((result* 31)+((this.question == null)? 0 :this.question.hashCode()));
        result = ((result* 31)+((this.curationOrder == null)? 0 :this.curationOrder.hashCode()));
        result = ((result* 31)+((this.negRisk == null)? 0 :this.negRisk.hashCode()));
        result = ((result* 31)+((this.volume24hrClob == null)? 0 :this.volume24hrClob.hashCode()));
        result = ((result* 31)+((this.volume1moClob == null)? 0 :this.volume1moClob.hashCode()));
        result = ((result* 31)+((this.imageOptimized == null)? 0 :this.imageOptimized.hashCode()));
        result = ((result* 31)+((this.wideFormat == null)? 0 :this.wideFormat.hashCode()));
        result = ((result* 31)+((this.makerRebatesFeeShareBps == null)? 0 :this.makerRebatesFeeShareBps.hashCode()));
        result = ((result* 31)+((this.feeExponent == null)? 0 :this.feeExponent.hashCode()));
        result = ((result* 31)+((this.fundedTimestamp == null)? 0 :this.fundedTimestamp.hashCode()));
        result = ((result* 31)+((this.categoryMailchimpTag == null)? 0 :this.categoryMailchimpTag.hashCode()));
        result = ((result* 31)+((this.deploying == null)? 0 :this.deploying.hashCode()));
        result = ((result* 31)+((this.closed == null)? 0 :this.closed.hashCode()));
        result = ((result* 31)+((this.lowerBound == null)? 0 :this.lowerBound.hashCode()));
        result = ((result* 31)+((this.cryptoMarketConfig == null)? 0 :this.cryptoMarketConfig.hashCode()));
        result = ((result* 31)+((this.groupItemRange == null)? 0 :this.groupItemRange.hashCode()));
        result = ((result* 31)+((this.bestBid == null)? 0 :this.bestBid.hashCode()));
        result = ((result* 31)+((this.twitterCardImage == null)? 0 :this.twitterCardImage.hashCode()));
        result = ((result* 31)+((this.featured == null)? 0 :this.featured.hashCode()));
        result = ((result* 31)+((this.oneHourPriceChange == null)? 0 :this.oneHourPriceChange.hashCode()));
        result = ((result* 31)+((this.umaBond == null)? 0 :this.umaBond.hashCode()));
        result = ((result* 31)+((this.volume24hr == null)? 0 :this.volume24hr.hashCode()));
        result = ((result* 31)+((this.$schema == null)? 0 :this.$schema.hashCode()));
        result = ((result* 31)+((this.holdingRewardsEnabled == null)? 0 :this.holdingRewardsEnabled.hashCode()));
        result = ((result* 31)+((this.comboStatus == null)? 0 :this.comboStatus.hashCode()));
        result = ((result* 31)+((this.fee == null)? 0 :this.fee.hashCode()));
        result = ((result* 31)+((this.sentDiscord == null)? 0 :this.sentDiscord.hashCode()));
        result = ((result* 31)+((this.liquidity == null)? 0 :this.liquidity.hashCode()));
        result = ((result* 31)+((this.notificationsEnabled == null)? 0 :this.notificationsEnabled.hashCode()));
        result = ((result* 31)+((this.marketMakerAddress == null)? 0 :this.marketMakerAddress.hashCode()));
        result = ((result* 31)+((this.volume1yrAmm == null)? 0 :this.volume1yrAmm.hashCode()));
        result = ((result* 31)+((this.volume1wkClob == null)? 0 :this.volume1wkClob.hashCode()));
        result = ((result* 31)+((this.createdAt == null)? 0 :this.createdAt.hashCode()));
        result = ((result* 31)+((this.conditionId == null)? 0 :this.conditionId.hashCode()));
        result = ((result* 31)+((this.volume1yr == null)? 0 :this.volume1yr.hashCode()));
        result = ((result* 31)+((this.gameStartTime == null)? 0 :this.gameStartTime.hashCode()));
        result = ((result* 31)+((this.funded == null)? 0 :this.funded.hashCode()));
        result = ((result* 31)+((this.clobRewards == null)? 0 :this.clobRewards.hashCode()));
        result = ((result* 31)+((this.formatType == null)? 0 :this.formatType.hashCode()));
        result = ((result* 31)+((this.pagerDutyNotificationEnabled == null)? 0 :this.pagerDutyNotificationEnabled.hashCode()));
        result = ((result* 31)+((this.slug == null)? 0 :this.slug.hashCode()));
        result = ((result* 31)+((this.updatedAt == null)? 0 :this.updatedAt.hashCode()));
        result = ((result* 31)+((this.image == null)? 0 :this.image.hashCode()));
        result = ((result* 31)+((this.customLiveness == null)? 0 :this.customLiveness.hashCode()));
        result = ((result* 31)+((this.updatedBy == null)? 0 :this.updatedBy.hashCode()));
        result = ((result* 31)+((this.negRiskRequestID == null)? 0 :this.negRiskRequestID.hashCode()));
        result = ((result* 31)+((this.volume1yrClob == null)? 0 :this.volume1yrClob.hashCode()));
        result = ((result* 31)+((this.negRiskMarketID == null)? 0 :this.negRiskMarketID.hashCode()));
        result = ((result* 31)+((this.teamAID == null)? 0 :this.teamAID.hashCode()));
        result = ((result* 31)+((this.resolutionSource == null)? 0 :this.resolutionSource.hashCode()));
        result = ((result* 31)+((this.showGmpSeries == null)? 0 :this.showGmpSeries.hashCode()));
        result = ((result* 31)+((this.seriesColor == null)? 0 :this.seriesColor.hashCode()));
        result = ((result* 31)+((this.umaResolutionStatuses == null)? 0 :this.umaResolutionStatuses.hashCode()));
        result = ((result* 31)+((this.volume == null)? 0 :this.volume.hashCode()));
        result = ((result* 31)+((this.markets == null)? 0 :this.markets.hashCode()));
        result = ((result* 31)+((this.secondsDelay == null)? 0 :this.secondsDelay.hashCode()));
        result = ((result* 31)+((this.twitterCardLastValidated == null)? 0 :this.twitterCardLastValidated.hashCode()));
        result = ((result* 31)+((this.liquidityNum == null)? 0 :this.liquidityNum.hashCode()));
        result = ((result* 31)+((this.sponsorImage == null)? 0 :this.sponsorImage.hashCode()));
        result = ((result* 31)+((this.makerBaseFee == null)? 0 :this.makerBaseFee.hashCode()));
        result = ((result* 31)+((this.rewardsMaxSpread == null)? 0 :this.rewardsMaxSpread.hashCode()));
        result = ((result* 31)+((this.subcategory == null)? 0 :this.subcategory.hashCode()));
        result = ((result* 31)+((this.upperBound == null)? 0 :this.upperBound.hashCode()));
        result = ((result* 31)+((this.denominationToken == null)? 0 :this.denominationToken.hashCode()));
        result = ((result* 31)+((this.line == null)? 0 :this.line.hashCode()));
        result = ((result* 31)+((this.chartColor == null)? 0 :this.chartColor.hashCode()));
        result = ((result* 31)+((this.resolvedBy == null)? 0 :this.resolvedBy.hashCode()));
        result = ((result* 31)+((this.manualActivation == null)? 0 :this.manualActivation.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.shortOutcomes == null)? 0 :this.shortOutcomes.hashCode()));
        result = ((result* 31)+((this.groupItemThreshold == null)? 0 :this.groupItemThreshold.hashCode()));
        result = ((result* 31)+((this.mailchimpTag == null)? 0 :this.mailchimpTag.hashCode()));
        result = ((result* 31)+((this.readyForCron == null)? 0 :this.readyForCron.hashCode()));
        result = ((result* 31)+((this._new == null)? 0 :this._new.hashCode()));
        result = ((result* 31)+((this.umaEndDateIso == null)? 0 :this.umaEndDateIso.hashCode()));
        result = ((result* 31)+((this.orderPriceMinTickSize == null)? 0 :this.orderPriceMinTickSize.hashCode()));
        result = ((result* 31)+((this.iconOptimized == null)? 0 :this.iconOptimized.hashCode()));
        result = ((result* 31)+((this.ready == null)? 0 :this.ready.hashCode()));
        result = ((result* 31)+((this.sportsMarketType == null)? 0 :this.sportsMarketType.hashCode()));
        result = ((result* 31)+((this.liquidityClob == null)? 0 :this.liquidityClob.hashCode()));
        result = ((result* 31)+((this.eventStartTime == null)? 0 :this.eventStartTime.hashCode()));
        result = ((result* 31)+((this.acceptingOrdersTimestamp == null)? 0 :this.acceptingOrdersTimestamp.hashCode()));
        result = ((result* 31)+((this.gameId == null)? 0 :this.gameId.hashCode()));
        result = ((result* 31)+((this.submittedBy == null)? 0 :this.submittedBy.hashCode()));
        result = ((result* 31)+((this.hasReviewedDates == null)? 0 :this.hasReviewedDates.hashCode()));
        result = ((result* 31)+((this.upperBoundDate == null)? 0 :this.upperBoundDate.hashCode()));
        result = ((result* 31)+((this.twitterCardLastRefreshed == null)? 0 :this.twitterCardLastRefreshed.hashCode()));
        result = ((result* 31)+((this.acceptingOrders == null)? 0 :this.acceptingOrders.hashCode()));
        result = ((result* 31)+((this.volume24hrAmm == null)? 0 :this.volume24hrAmm.hashCode()));
        result = ((result* 31)+((this.disqusThread == null)? 0 :this.disqusThread.hashCode()));
        result = ((result* 31)+((this.oneDayPriceChange == null)? 0 :this.oneDayPriceChange.hashCode()));
        result = ((result* 31)+((this.liquidityAmm == null)? 0 :this.liquidityAmm.hashCode()));
        result = ((result* 31)+((this.oneMonthPriceChange == null)? 0 :this.oneMonthPriceChange.hashCode()));
        result = ((result* 31)+((this.spread == null)? 0 :this.spread.hashCode()));
        result = ((result* 31)+((this.yAxisValue == null)? 0 :this.yAxisValue.hashCode()));
        result = ((result* 31)+((this.lowerBoundDate == null)? 0 :this.lowerBoundDate.hashCode()));
        result = ((result* 31)+((this.bestAsk == null)? 0 :this.bestAsk.hashCode()));
        result = ((result* 31)+((this.createdBy == null)? 0 :this.createdBy.hashCode()));
        result = ((result* 31)+((this.restricted == null)? 0 :this.restricted.hashCode()));
        result = ((result* 31)+((this.pendingDeployment == null)? 0 :this.pendingDeployment.hashCode()));
        result = ((result* 31)+((this.cyom == null)? 0 :this.cyom.hashCode()));
        result = ((result* 31)+((this.category == null)? 0 :this.category.hashCode()));
        result = ((result* 31)+((this.showGmpOutcome == null)? 0 :this.showGmpOutcome.hashCode()));
        result = ((result* 31)+((this.ammType == null)? 0 :this.ammType.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Market) == false) {
            return false;
        }
        Market rhs = ((Market) other);
        return ((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((this.umaResolutionStatus == rhs.umaResolutionStatus)||((this.umaResolutionStatus!= null)&&this.umaResolutionStatus.equals(rhs.umaResolutionStatus)))&&((this.commentsEnabled == rhs.commentsEnabled)||((this.commentsEnabled!= null)&&this.commentsEnabled.equals(rhs.commentsEnabled))))&&((this.positionIds == rhs.positionIds)||((this.positionIds!= null)&&this.positionIds.equals(rhs.positionIds))))&&((this.endDate == rhs.endDate)||((this.endDate!= null)&&this.endDate.equals(rhs.endDate))))&&((this.volume1wkAmm == rhs.volume1wkAmm)||((this.volume1wkAmm!= null)&&this.volume1wkAmm.equals(rhs.volume1wkAmm))))&&((this.endDateIso == rhs.endDateIso)||((this.endDateIso!= null)&&this.endDateIso.equals(rhs.endDateIso))))&&((this.closedTime == rhs.closedTime)||((this.closedTime!= null)&&this.closedTime.equals(rhs.closedTime))))&&((this.marketType == rhs.marketType)||((this.marketType!= null)&&this.marketType.equals(rhs.marketType))))&&((this.automaticallyResolved == rhs.automaticallyResolved)||((this.automaticallyResolved!= null)&&this.automaticallyResolved.equals(rhs.automaticallyResolved))))&&((this.score == rhs.score)||((this.score!= null)&&this.score.equals(rhs.score))))&&((this.approved == rhs.approved)||((this.approved!= null)&&this.approved.equals(rhs.approved))))&&((this.marketGroup == rhs.marketGroup)||((this.marketGroup!= null)&&this.marketGroup.equals(rhs.marketGroup))))&&((this.lastTradePrice == rhs.lastTradePrice)||((this.lastTradePrice!= null)&&this.lastTradePrice.equals(rhs.lastTradePrice))))&&((this.outcomes == rhs.outcomes)||((this.outcomes!= null)&&this.outcomes.equals(rhs.outcomes))))&&((this.enableOrderBook == rhs.enableOrderBook)||((this.enableOrderBook!= null)&&this.enableOrderBook.equals(rhs.enableOrderBook))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.volume1moAmm == rhs.volume1moAmm)||((this.volume1moAmm!= null)&&this.volume1moAmm.equals(rhs.volume1moAmm))))&&((this.volume1mo == rhs.volume1mo)||((this.volume1mo!= null)&&this.volume1mo.equals(rhs.volume1mo))))&&((this.events == rhs.events)||((this.events!= null)&&this.events.equals(rhs.events))))&&((this.acceptingOrdersUntil == rhs.acceptingOrdersUntil)||((this.acceptingOrdersUntil!= null)&&this.acceptingOrdersUntil.equals(rhs.acceptingOrdersUntil))))&&((this.automaticallyActive == rhs.automaticallyActive)||((this.automaticallyActive!= null)&&this.automaticallyActive.equals(rhs.automaticallyActive))))&&((this.negRiskOther == rhs.negRiskOther)||((this.negRiskOther!= null)&&this.negRiskOther.equals(rhs.negRiskOther))))&&((this.requiresTranslation == rhs.requiresTranslation)||((this.requiresTranslation!= null)&&this.requiresTranslation.equals(rhs.requiresTranslation))))&&((this.volumeNum == rhs.volumeNum)||((this.volumeNum!= null)&&this.volumeNum.equals(rhs.volumeNum))))&&((this.active == rhs.active)||((this.active!= null)&&this.active.equals(rhs.active))))&&((this.takerBaseFee == rhs.takerBaseFee)||((this.takerBaseFee!= null)&&this.takerBaseFee.equals(rhs.takerBaseFee))))&&((this.feeType == rhs.feeType)||((this.feeType!= null)&&this.feeType.equals(rhs.feeType))))&&((this.version == rhs.version)||((this.version!= null)&&this.version.equals(rhs.version))))&&((this.oneYearPriceChange == rhs.oneYearPriceChange)||((this.oneYearPriceChange!= null)&&this.oneYearPriceChange.equals(rhs.oneYearPriceChange))))&&((this.tags == rhs.tags)||((this.tags!= null)&&this.tags.equals(rhs.tags))))&&((this.groupItemTitle == rhs.groupItemTitle)||((this.groupItemTitle!= null)&&this.groupItemTitle.equals(rhs.groupItemTitle))))&&((this.orderMinSize == rhs.orderMinSize)||((this.orderMinSize!= null)&&this.orderMinSize.equals(rhs.orderMinSize))))&&((this.resolutionStatus == rhs.resolutionStatus)||((this.resolutionStatus!= null)&&this.resolutionStatus.equals(rhs.resolutionStatus))))&&((this.startDateIso == rhs.startDateIso)||((this.startDateIso!= null)&&this.startDateIso.equals(rhs.startDateIso))))&&((this.twitterCardLocation == rhs.twitterCardLocation)||((this.twitterCardLocation!= null)&&this.twitterCardLocation.equals(rhs.twitterCardLocation))))&&((this.competitive == rhs.competitive)||((this.competitive!= null)&&this.competitive.equals(rhs.competitive))))&&((this.startDate == rhs.startDate)||((this.startDate!= null)&&this.startDate.equals(rhs.startDate))))&&((this.cryptoMarketConfigId == rhs.cryptoMarketConfigId)||((this.cryptoMarketConfigId!= null)&&this.cryptoMarketConfigId.equals(rhs.cryptoMarketConfigId))))&&((this.readyTimestamp == rhs.readyTimestamp)||((this.readyTimestamp!= null)&&this.readyTimestamp.equals(rhs.readyTimestamp))))&&((this.marketMetadata == rhs.marketMetadata)||((this.marketMetadata!= null)&&this.marketMetadata.equals(rhs.marketMetadata))))&&((this.rewardsMinSize == rhs.rewardsMinSize)||((this.rewardsMinSize!= null)&&this.rewardsMinSize.equals(rhs.rewardsMinSize))))&&((this.scheduledDeploymentTimestamp == rhs.scheduledDeploymentTimestamp)||((this.scheduledDeploymentTimestamp!= null)&&this.scheduledDeploymentTimestamp.equals(rhs.scheduledDeploymentTimestamp))))&&((this.icon == rhs.icon)||((this.icon!= null)&&this.icon.equals(rhs.icon))))&&((this.sponsorName == rhs.sponsorName)||((this.sponsorName!= null)&&this.sponsorName.equals(rhs.sponsorName))))&&((this.umaEndDate == rhs.umaEndDate)||((this.umaEndDate!= null)&&this.umaEndDate.equals(rhs.umaEndDate))))&&((this.feeRate == rhs.feeRate)||((this.feeRate!= null)&&this.feeRate.equals(rhs.feeRate))))&&((this.oneWeekPriceChange == rhs.oneWeekPriceChange)||((this.oneWeekPriceChange!= null)&&this.oneWeekPriceChange.equals(rhs.oneWeekPriceChange))))&&((this.umaReward == rhs.umaReward)||((this.umaReward!= null)&&this.umaReward.equals(rhs.umaReward))))&&((this.volume1wk == rhs.volume1wk)||((this.volume1wk!= null)&&this.volume1wk.equals(rhs.volume1wk))))&&((this.archived == rhs.archived)||((this.archived!= null)&&this.archived.equals(rhs.archived))))&&((this.clearBookOnStart == rhs.clearBookOnStart)||((this.clearBookOnStart!= null)&&this.clearBookOnStart.equals(rhs.clearBookOnStart))))&&((this.clobTokenIds == rhs.clobTokenIds)||((this.clobTokenIds!= null)&&this.clobTokenIds.equals(rhs.clobTokenIds))))&&((this.feesEnabled == rhs.feesEnabled)||((this.feesEnabled!= null)&&this.feesEnabled.equals(rhs.feesEnabled))))&&((this.pastSlugs == rhs.pastSlugs)||((this.pastSlugs!= null)&&this.pastSlugs.equals(rhs.pastSlugs))))&&((this.onchainEventId == rhs.onchainEventId)||((this.onchainEventId!= null)&&this.onchainEventId.equals(rhs.onchainEventId))))&&((this.teamBID == rhs.teamBID)||((this.teamBID!= null)&&this.teamBID.equals(rhs.teamBID))))&&((this.requestId == rhs.requestId)||((this.requestId!= null)&&this.requestId.equals(rhs.requestId))))&&((this.xAxisValue == rhs.xAxisValue)||((this.xAxisValue!= null)&&this.xAxisValue.equals(rhs.xAxisValue))))&&((this.outcomePrices == rhs.outcomePrices)||((this.outcomePrices!= null)&&this.outcomePrices.equals(rhs.outcomePrices))))&&((this.volumeClob == rhs.volumeClob)||((this.volumeClob!= null)&&this.volumeClob.equals(rhs.volumeClob))))&&((this.deployingTimestamp == rhs.deployingTimestamp)||((this.deployingTimestamp!= null)&&this.deployingTimestamp.equals(rhs.deployingTimestamp))))&&((this.fpmmLive == rhs.fpmmLive)||((this.fpmmLive!= null)&&this.fpmmLive.equals(rhs.fpmmLive))))&&((this.rfqEnabled == rhs.rfqEnabled)||((this.rfqEnabled!= null)&&this.rfqEnabled.equals(rhs.rfqEnabled))))&&((this.creator == rhs.creator)||((this.creator!= null)&&this.creator.equals(rhs.creator))))&&((this.questionID == rhs.questionID)||((this.questionID!= null)&&this.questionID.equals(rhs.questionID))))&&((this.volumeAmm == rhs.volumeAmm)||((this.volumeAmm!= null)&&this.volumeAmm.equals(rhs.volumeAmm))))&&((this.feeSchedule == rhs.feeSchedule)||((this.feeSchedule!= null)&&this.feeSchedule.equals(rhs.feeSchedule))))&&((this.question == rhs.question)||((this.question!= null)&&this.question.equals(rhs.question))))&&((this.curationOrder == rhs.curationOrder)||((this.curationOrder!= null)&&this.curationOrder.equals(rhs.curationOrder))))&&((this.negRisk == rhs.negRisk)||((this.negRisk!= null)&&this.negRisk.equals(rhs.negRisk))))&&((this.volume24hrClob == rhs.volume24hrClob)||((this.volume24hrClob!= null)&&this.volume24hrClob.equals(rhs.volume24hrClob))))&&((this.volume1moClob == rhs.volume1moClob)||((this.volume1moClob!= null)&&this.volume1moClob.equals(rhs.volume1moClob))))&&((this.imageOptimized == rhs.imageOptimized)||((this.imageOptimized!= null)&&this.imageOptimized.equals(rhs.imageOptimized))))&&((this.wideFormat == rhs.wideFormat)||((this.wideFormat!= null)&&this.wideFormat.equals(rhs.wideFormat))))&&((this.makerRebatesFeeShareBps == rhs.makerRebatesFeeShareBps)||((this.makerRebatesFeeShareBps!= null)&&this.makerRebatesFeeShareBps.equals(rhs.makerRebatesFeeShareBps))))&&((this.feeExponent == rhs.feeExponent)||((this.feeExponent!= null)&&this.feeExponent.equals(rhs.feeExponent))))&&((this.fundedTimestamp == rhs.fundedTimestamp)||((this.fundedTimestamp!= null)&&this.fundedTimestamp.equals(rhs.fundedTimestamp))))&&((this.categoryMailchimpTag == rhs.categoryMailchimpTag)||((this.categoryMailchimpTag!= null)&&this.categoryMailchimpTag.equals(rhs.categoryMailchimpTag))))&&((this.deploying == rhs.deploying)||((this.deploying!= null)&&this.deploying.equals(rhs.deploying))))&&((this.closed == rhs.closed)||((this.closed!= null)&&this.closed.equals(rhs.closed))))&&((this.lowerBound == rhs.lowerBound)||((this.lowerBound!= null)&&this.lowerBound.equals(rhs.lowerBound))))&&((this.cryptoMarketConfig == rhs.cryptoMarketConfig)||((this.cryptoMarketConfig!= null)&&this.cryptoMarketConfig.equals(rhs.cryptoMarketConfig))))&&((this.groupItemRange == rhs.groupItemRange)||((this.groupItemRange!= null)&&this.groupItemRange.equals(rhs.groupItemRange))))&&((this.bestBid == rhs.bestBid)||((this.bestBid!= null)&&this.bestBid.equals(rhs.bestBid))))&&((this.twitterCardImage == rhs.twitterCardImage)||((this.twitterCardImage!= null)&&this.twitterCardImage.equals(rhs.twitterCardImage))))&&((this.featured == rhs.featured)||((this.featured!= null)&&this.featured.equals(rhs.featured))))&&((this.oneHourPriceChange == rhs.oneHourPriceChange)||((this.oneHourPriceChange!= null)&&this.oneHourPriceChange.equals(rhs.oneHourPriceChange))))&&((this.umaBond == rhs.umaBond)||((this.umaBond!= null)&&this.umaBond.equals(rhs.umaBond))))&&((this.volume24hr == rhs.volume24hr)||((this.volume24hr!= null)&&this.volume24hr.equals(rhs.volume24hr))))&&((this.$schema == rhs.$schema)||((this.$schema!= null)&&this.$schema.equals(rhs.$schema))))&&((this.holdingRewardsEnabled == rhs.holdingRewardsEnabled)||((this.holdingRewardsEnabled!= null)&&this.holdingRewardsEnabled.equals(rhs.holdingRewardsEnabled))))&&((this.comboStatus == rhs.comboStatus)||((this.comboStatus!= null)&&this.comboStatus.equals(rhs.comboStatus))))&&((this.fee == rhs.fee)||((this.fee!= null)&&this.fee.equals(rhs.fee))))&&((this.sentDiscord == rhs.sentDiscord)||((this.sentDiscord!= null)&&this.sentDiscord.equals(rhs.sentDiscord))))&&((this.liquidity == rhs.liquidity)||((this.liquidity!= null)&&this.liquidity.equals(rhs.liquidity))))&&((this.notificationsEnabled == rhs.notificationsEnabled)||((this.notificationsEnabled!= null)&&this.notificationsEnabled.equals(rhs.notificationsEnabled))))&&((this.marketMakerAddress == rhs.marketMakerAddress)||((this.marketMakerAddress!= null)&&this.marketMakerAddress.equals(rhs.marketMakerAddress))))&&((this.volume1yrAmm == rhs.volume1yrAmm)||((this.volume1yrAmm!= null)&&this.volume1yrAmm.equals(rhs.volume1yrAmm))))&&((this.volume1wkClob == rhs.volume1wkClob)||((this.volume1wkClob!= null)&&this.volume1wkClob.equals(rhs.volume1wkClob))))&&((this.createdAt == rhs.createdAt)||((this.createdAt!= null)&&this.createdAt.equals(rhs.createdAt))))&&((this.conditionId == rhs.conditionId)||((this.conditionId!= null)&&this.conditionId.equals(rhs.conditionId))))&&((this.volume1yr == rhs.volume1yr)||((this.volume1yr!= null)&&this.volume1yr.equals(rhs.volume1yr))))&&((this.gameStartTime == rhs.gameStartTime)||((this.gameStartTime!= null)&&this.gameStartTime.equals(rhs.gameStartTime))))&&((this.funded == rhs.funded)||((this.funded!= null)&&this.funded.equals(rhs.funded))))&&((this.clobRewards == rhs.clobRewards)||((this.clobRewards!= null)&&this.clobRewards.equals(rhs.clobRewards))))&&((this.formatType == rhs.formatType)||((this.formatType!= null)&&this.formatType.equals(rhs.formatType))))&&((this.pagerDutyNotificationEnabled == rhs.pagerDutyNotificationEnabled)||((this.pagerDutyNotificationEnabled!= null)&&this.pagerDutyNotificationEnabled.equals(rhs.pagerDutyNotificationEnabled))))&&((this.slug == rhs.slug)||((this.slug!= null)&&this.slug.equals(rhs.slug))))&&((this.updatedAt == rhs.updatedAt)||((this.updatedAt!= null)&&this.updatedAt.equals(rhs.updatedAt))))&&((this.image == rhs.image)||((this.image!= null)&&this.image.equals(rhs.image))))&&((this.customLiveness == rhs.customLiveness)||((this.customLiveness!= null)&&this.customLiveness.equals(rhs.customLiveness))))&&((this.updatedBy == rhs.updatedBy)||((this.updatedBy!= null)&&this.updatedBy.equals(rhs.updatedBy))))&&((this.negRiskRequestID == rhs.negRiskRequestID)||((this.negRiskRequestID!= null)&&this.negRiskRequestID.equals(rhs.negRiskRequestID))))&&((this.volume1yrClob == rhs.volume1yrClob)||((this.volume1yrClob!= null)&&this.volume1yrClob.equals(rhs.volume1yrClob))))&&((this.negRiskMarketID == rhs.negRiskMarketID)||((this.negRiskMarketID!= null)&&this.negRiskMarketID.equals(rhs.negRiskMarketID))))&&((this.teamAID == rhs.teamAID)||((this.teamAID!= null)&&this.teamAID.equals(rhs.teamAID))))&&((this.resolutionSource == rhs.resolutionSource)||((this.resolutionSource!= null)&&this.resolutionSource.equals(rhs.resolutionSource))))&&((this.showGmpSeries == rhs.showGmpSeries)||((this.showGmpSeries!= null)&&this.showGmpSeries.equals(rhs.showGmpSeries))))&&((this.seriesColor == rhs.seriesColor)||((this.seriesColor!= null)&&this.seriesColor.equals(rhs.seriesColor))))&&((this.umaResolutionStatuses == rhs.umaResolutionStatuses)||((this.umaResolutionStatuses!= null)&&this.umaResolutionStatuses.equals(rhs.umaResolutionStatuses))))&&((this.volume == rhs.volume)||((this.volume!= null)&&this.volume.equals(rhs.volume))))&&((this.markets == rhs.markets)||((this.markets!= null)&&this.markets.equals(rhs.markets))))&&((this.secondsDelay == rhs.secondsDelay)||((this.secondsDelay!= null)&&this.secondsDelay.equals(rhs.secondsDelay))))&&((this.twitterCardLastValidated == rhs.twitterCardLastValidated)||((this.twitterCardLastValidated!= null)&&this.twitterCardLastValidated.equals(rhs.twitterCardLastValidated))))&&((this.liquidityNum == rhs.liquidityNum)||((this.liquidityNum!= null)&&this.liquidityNum.equals(rhs.liquidityNum))))&&((this.sponsorImage == rhs.sponsorImage)||((this.sponsorImage!= null)&&this.sponsorImage.equals(rhs.sponsorImage))))&&((this.makerBaseFee == rhs.makerBaseFee)||((this.makerBaseFee!= null)&&this.makerBaseFee.equals(rhs.makerBaseFee))))&&((this.rewardsMaxSpread == rhs.rewardsMaxSpread)||((this.rewardsMaxSpread!= null)&&this.rewardsMaxSpread.equals(rhs.rewardsMaxSpread))))&&((this.subcategory == rhs.subcategory)||((this.subcategory!= null)&&this.subcategory.equals(rhs.subcategory))))&&((this.upperBound == rhs.upperBound)||((this.upperBound!= null)&&this.upperBound.equals(rhs.upperBound))))&&((this.denominationToken == rhs.denominationToken)||((this.denominationToken!= null)&&this.denominationToken.equals(rhs.denominationToken))))&&((this.line == rhs.line)||((this.line!= null)&&this.line.equals(rhs.line))))&&((this.chartColor == rhs.chartColor)||((this.chartColor!= null)&&this.chartColor.equals(rhs.chartColor))))&&((this.resolvedBy == rhs.resolvedBy)||((this.resolvedBy!= null)&&this.resolvedBy.equals(rhs.resolvedBy))))&&((this.manualActivation == rhs.manualActivation)||((this.manualActivation!= null)&&this.manualActivation.equals(rhs.manualActivation))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.shortOutcomes == rhs.shortOutcomes)||((this.shortOutcomes!= null)&&this.shortOutcomes.equals(rhs.shortOutcomes))))&&((this.groupItemThreshold == rhs.groupItemThreshold)||((this.groupItemThreshold!= null)&&this.groupItemThreshold.equals(rhs.groupItemThreshold))))&&((this.mailchimpTag == rhs.mailchimpTag)||((this.mailchimpTag!= null)&&this.mailchimpTag.equals(rhs.mailchimpTag))))&&((this.readyForCron == rhs.readyForCron)||((this.readyForCron!= null)&&this.readyForCron.equals(rhs.readyForCron))))&&((this._new == rhs._new)||((this._new!= null)&&this._new.equals(rhs._new))))&&((this.umaEndDateIso == rhs.umaEndDateIso)||((this.umaEndDateIso!= null)&&this.umaEndDateIso.equals(rhs.umaEndDateIso))))&&((this.orderPriceMinTickSize == rhs.orderPriceMinTickSize)||((this.orderPriceMinTickSize!= null)&&this.orderPriceMinTickSize.equals(rhs.orderPriceMinTickSize))))&&((this.iconOptimized == rhs.iconOptimized)||((this.iconOptimized!= null)&&this.iconOptimized.equals(rhs.iconOptimized))))&&((this.ready == rhs.ready)||((this.ready!= null)&&this.ready.equals(rhs.ready))))&&((this.sportsMarketType == rhs.sportsMarketType)||((this.sportsMarketType!= null)&&this.sportsMarketType.equals(rhs.sportsMarketType))))&&((this.liquidityClob == rhs.liquidityClob)||((this.liquidityClob!= null)&&this.liquidityClob.equals(rhs.liquidityClob))))&&((this.eventStartTime == rhs.eventStartTime)||((this.eventStartTime!= null)&&this.eventStartTime.equals(rhs.eventStartTime))))&&((this.acceptingOrdersTimestamp == rhs.acceptingOrdersTimestamp)||((this.acceptingOrdersTimestamp!= null)&&this.acceptingOrdersTimestamp.equals(rhs.acceptingOrdersTimestamp))))&&((this.gameId == rhs.gameId)||((this.gameId!= null)&&this.gameId.equals(rhs.gameId))))&&((this.submittedBy == rhs.submittedBy)||((this.submittedBy!= null)&&this.submittedBy.equals(rhs.submittedBy))))&&((this.hasReviewedDates == rhs.hasReviewedDates)||((this.hasReviewedDates!= null)&&this.hasReviewedDates.equals(rhs.hasReviewedDates))))&&((this.upperBoundDate == rhs.upperBoundDate)||((this.upperBoundDate!= null)&&this.upperBoundDate.equals(rhs.upperBoundDate))))&&((this.twitterCardLastRefreshed == rhs.twitterCardLastRefreshed)||((this.twitterCardLastRefreshed!= null)&&this.twitterCardLastRefreshed.equals(rhs.twitterCardLastRefreshed))))&&((this.acceptingOrders == rhs.acceptingOrders)||((this.acceptingOrders!= null)&&this.acceptingOrders.equals(rhs.acceptingOrders))))&&((this.volume24hrAmm == rhs.volume24hrAmm)||((this.volume24hrAmm!= null)&&this.volume24hrAmm.equals(rhs.volume24hrAmm))))&&((this.disqusThread == rhs.disqusThread)||((this.disqusThread!= null)&&this.disqusThread.equals(rhs.disqusThread))))&&((this.oneDayPriceChange == rhs.oneDayPriceChange)||((this.oneDayPriceChange!= null)&&this.oneDayPriceChange.equals(rhs.oneDayPriceChange))))&&((this.liquidityAmm == rhs.liquidityAmm)||((this.liquidityAmm!= null)&&this.liquidityAmm.equals(rhs.liquidityAmm))))&&((this.oneMonthPriceChange == rhs.oneMonthPriceChange)||((this.oneMonthPriceChange!= null)&&this.oneMonthPriceChange.equals(rhs.oneMonthPriceChange))))&&((this.spread == rhs.spread)||((this.spread!= null)&&this.spread.equals(rhs.spread))))&&((this.yAxisValue == rhs.yAxisValue)||((this.yAxisValue!= null)&&this.yAxisValue.equals(rhs.yAxisValue))))&&((this.lowerBoundDate == rhs.lowerBoundDate)||((this.lowerBoundDate!= null)&&this.lowerBoundDate.equals(rhs.lowerBoundDate))))&&((this.bestAsk == rhs.bestAsk)||((this.bestAsk!= null)&&this.bestAsk.equals(rhs.bestAsk))))&&((this.createdBy == rhs.createdBy)||((this.createdBy!= null)&&this.createdBy.equals(rhs.createdBy))))&&((this.restricted == rhs.restricted)||((this.restricted!= null)&&this.restricted.equals(rhs.restricted))))&&((this.pendingDeployment == rhs.pendingDeployment)||((this.pendingDeployment!= null)&&this.pendingDeployment.equals(rhs.pendingDeployment))))&&((this.cyom == rhs.cyom)||((this.cyom!= null)&&this.cyom.equals(rhs.cyom))))&&((this.category == rhs.category)||((this.category!= null)&&this.category.equals(rhs.category))))&&((this.showGmpOutcome == rhs.showGmpOutcome)||((this.showGmpOutcome!= null)&&this.showGmpOutcome.equals(rhs.showGmpOutcome))))&&((this.ammType == rhs.ammType)||((this.ammType!= null)&&this.ammType.equals(rhs.ammType))));
    }


    /**
     * Combo eligibility state: pending/enabled/disabled. May be set at creation — enabled requires a conditionId and two positionIds. After creation it can only be changed through the combo-status endpoint.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum ComboStatus {

        PENDING("pending"),
        ENABLED("enabled"),
        DISABLED("disabled");
        private final String value;
        private final static Map<String, Market.ComboStatus> CONSTANTS = new HashMap<String, Market.ComboStatus>();

        static {
            for (Market.ComboStatus c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        ComboStatus(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        @JsonValue
        public String value() {
            return this.value;
        }

        @JsonCreator
        public static Market.ComboStatus fromValue(String value) {
            Market.ComboStatus constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }


    /**
     * High-level resolution state of the market: inactive (drafted, not yet deployed on chain), active (deployed, not resolved yet) or resolved. Only written for v2 markets; v1 markets keep using umaResolutionStatus.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum ResolutionStatus {

        INACTIVE("inactive"),
        ACTIVE("active"),
        RESOLVED("resolved");
        private final String value;
        private final static Map<String, Market.ResolutionStatus> CONSTANTS = new HashMap<String, Market.ResolutionStatus>();

        static {
            for (Market.ResolutionStatus c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        ResolutionStatus(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        @JsonValue
        public String value() {
            return this.value;
        }

        @JsonCreator
        public static Market.ResolutionStatus fromValue(String value) {
            Market.ResolutionStatus constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }


    /**
     * Protocol version the market trades on: v1 (legacy CTF/CLOB) or v2 (polymarket-v2 modules). Clients must match exact values and treat unknown values as unsupported.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Version {

        V_1("v1"),
        V_2("v2");
        private final String value;
        private final static Map<String, Market.Version> CONSTANTS = new HashMap<String, Market.Version>();

        static {
            for (Market.Version c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        Version(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        @JsonValue
        public String value() {
            return this.value;
        }

        @JsonCreator
        public static Market.Version fromValue(String value) {
            Market.Version constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
