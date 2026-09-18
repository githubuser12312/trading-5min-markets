
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
    "active",
    "archived",
    "automaticallyActive",
    "automaticallyResolved",
    "bestLines",
    "cantEstimate",
    "carouselMap",
    "category",
    "closed",
    "closedTime",
    "color",
    "commentCount",
    "commentsEnabled",
    "competitive",
    "countryName",
    "createdAt",
    "createdBy",
    "creationDate",
    "cumulativeMarkets",
    "cyom",
    "deploying",
    "deployingTimestamp",
    "description",
    "disqusThread",
    "elapsed",
    "electionType",
    "enableNegRisk",
    "enableOrderBook",
    "endDate",
    "ended",
    "estimateValue",
    "estimatedValue",
    "eventCreators",
    "eventDate",
    "eventMetadata",
    "eventWeek",
    "externalPartners",
    "featured",
    "featuredImage",
    "featuredImageOptimized",
    "featuredOrder",
    "finishedTimestamp",
    "gameId",
    "gmpChartMode",
    "icon",
    "iconOptimized",
    "id",
    "image",
    "imageOptimized",
    "isTemplate",
    "lastHighlight",
    "lastHighlightAt",
    "lastHighlightType",
    "liquidity",
    "liquidityAmm",
    "liquidityClob",
    "live",
    "markets",
    "maxMarketCount",
    "negRisk",
    "negRiskAugmented",
    "negRiskFeeBips",
    "negRiskMarketID",
    "new",
    "openInterest",
    "parentEventId",
    "pendingDeployment",
    "period",
    "published_at",
    "requiresTranslation",
    "rescheduledFromGameId",
    "resolutionSource",
    "restricted",
    "scheduledDeploymentTimestamp",
    "score",
    "series",
    "seriesSlug",
    "showAllOutcomes",
    "showMarketImages",
    "slug",
    "sortBy",
    "sport",
    "spreadsMainLine",
    "startDate",
    "startTime",
    "subEvents",
    "subcategory",
    "subtitle",
    "tag_labels",
    "tag_slugs",
    "tags",
    "teams",
    "templateVariables",
    "templates",
    "ticker",
    "title",
    "totalsMainLine",
    "turnProviderId",
    "tweetCount",
    "updatedAt",
    "updatedBy",
    "usId",
    "version",
    "volume",
    "volume1mo",
    "volume1wk",
    "volume1yr",
    "volume24hr"
})
@Generated("jsonschema2pojo")
public class Event {

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
    @JsonProperty("automaticallyActive")
    private Boolean automaticallyActive;
    @JsonProperty("automaticallyResolved")
    private Boolean automaticallyResolved;
    @JsonProperty("bestLines")
    private List<BestLine> bestLines = new ArrayList<BestLine>();
    @JsonProperty("cantEstimate")
    private Boolean cantEstimate;
    @JsonProperty("carouselMap")
    private String carouselMap;
    @JsonProperty("category")
    private String category;
    @JsonProperty("closed")
    private Boolean closed;
    @JsonProperty("closedTime")
    private Date closedTime;
    @JsonProperty("color")
    private String color;
    @JsonProperty("commentCount")
    private Integer commentCount;
    @JsonProperty("commentsEnabled")
    private Boolean commentsEnabled;
    @JsonProperty("competitive")
    private Double competitive;
    @JsonProperty("countryName")
    private String countryName;
    @JsonProperty("createdAt")
    private Date createdAt;
    @JsonProperty("createdBy")
    private String createdBy;
    @JsonProperty("creationDate")
    private Date creationDate;
    @JsonProperty("cumulativeMarkets")
    private Boolean cumulativeMarkets;
    @JsonProperty("cyom")
    private Boolean cyom;
    @JsonProperty("deploying")
    private Boolean deploying;
    @JsonProperty("deployingTimestamp")
    private Date deployingTimestamp;
    @JsonProperty("description")
    private String description;
    @JsonProperty("disqusThread")
    private String disqusThread;
    @JsonProperty("elapsed")
    private String elapsed;
    @JsonProperty("electionType")
    private String electionType;
    @JsonProperty("enableNegRisk")
    private Boolean enableNegRisk;
    @JsonProperty("enableOrderBook")
    private Boolean enableOrderBook;
    @JsonProperty("endDate")
    private Date endDate;
    @JsonProperty("ended")
    private Boolean ended;
    @JsonProperty("estimateValue")
    private Boolean estimateValue;
    @JsonProperty("estimatedValue")
    private String estimatedValue;
    @JsonProperty("eventCreators")
    private List<EventCreator> eventCreators = new ArrayList<EventCreator>();
    @JsonProperty("eventDate")
    private String eventDate;
    @JsonProperty("eventMetadata")
    private EventMetadata eventMetadata;
    @JsonProperty("eventWeek")
    private Integer eventWeek;
    @JsonProperty("externalPartners")
    private List<EventExternalPartnerMapping> externalPartners = new ArrayList<EventExternalPartnerMapping>();
    @JsonProperty("featured")
    private Boolean featured;
    @JsonProperty("featuredImage")
    private String featuredImage;
    @JsonProperty("featuredImageOptimized")
    private ImageOptimization featuredImageOptimized;
    @JsonProperty("featuredOrder")
    private Integer featuredOrder;
    @JsonProperty("finishedTimestamp")
    private Date finishedTimestamp;
    @JsonProperty("gameId")
    private Integer gameId;
    @JsonProperty("gmpChartMode")
    private String gmpChartMode;
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
    @JsonProperty("isTemplate")
    private Boolean isTemplate;
    @JsonProperty("lastHighlight")
    private String lastHighlight;
    @JsonProperty("lastHighlightAt")
    private Date lastHighlightAt;
    @JsonProperty("lastHighlightType")
    private String lastHighlightType;
    @JsonProperty("liquidity")
    private Double liquidity;
    @JsonProperty("liquidityAmm")
    private Double liquidityAmm;
    @JsonProperty("liquidityClob")
    private Double liquidityClob;
    @JsonProperty("live")
    private Boolean live;
    @JsonProperty("markets")
    private List<Market> markets = new ArrayList<Market>();
    /**
     * Maximum number of markets the event can ever hold: the neg-risk arity packed into the v2 event id at first deployment (atomic neg-risk: equals the member count; incremental neg-risk: reserves slots for later appends). Null for binary events. Immutable once deployed — condition ids derive from it.
     * 
     */
    @JsonProperty("maxMarketCount")
    @JsonPropertyDescription("Maximum number of markets the event can ever hold: the neg-risk arity packed into the v2 event id at first deployment (atomic neg-risk: equals the member count; incremental neg-risk: reserves slots for later appends). Null for binary events. Immutable once deployed \u2014 condition ids derive from it.")
    private Integer maxMarketCount;
    @JsonProperty("negRisk")
    private Boolean negRisk;
    @JsonProperty("negRiskAugmented")
    private Boolean negRiskAugmented;
    @JsonProperty("negRiskFeeBips")
    private Integer negRiskFeeBips;
    @JsonProperty("negRiskMarketID")
    private String negRiskMarketID;
    @JsonProperty("new")
    private Boolean _new;
    @JsonProperty("openInterest")
    private Double openInterest;
    @JsonProperty("parentEventId")
    private Integer parentEventId;
    @JsonProperty("pendingDeployment")
    private Boolean pendingDeployment;
    @JsonProperty("period")
    private String period;
    @JsonProperty("published_at")
    private String publishedAt;
    @JsonProperty("requiresTranslation")
    private Boolean requiresTranslation;
    @JsonProperty("rescheduledFromGameId")
    private Integer rescheduledFromGameId;
    @JsonProperty("resolutionSource")
    private String resolutionSource;
    @JsonProperty("restricted")
    private Boolean restricted;
    @JsonProperty("scheduledDeploymentTimestamp")
    private Date scheduledDeploymentTimestamp;
    @JsonProperty("score")
    private String score;
    @JsonProperty("series")
    private List<Series> series = new ArrayList<Series>();
    @JsonProperty("seriesSlug")
    private String seriesSlug;
    @JsonProperty("showAllOutcomes")
    private Boolean showAllOutcomes;
    @JsonProperty("showMarketImages")
    private Boolean showMarketImages;
    @JsonProperty("slug")
    private String slug;
    @JsonProperty("sortBy")
    private String sortBy;
    @JsonProperty("sport")
    private SportsMetadata sport;
    @JsonProperty("spreadsMainLine")
    private Double spreadsMainLine;
    @JsonProperty("startDate")
    private Date startDate;
    @JsonProperty("startTime")
    private Date startTime;
    @JsonProperty("subEvents")
    private List<String> subEvents = new ArrayList<String>();
    @JsonProperty("subcategory")
    private String subcategory;
    @JsonProperty("subtitle")
    private String subtitle;
    @JsonProperty("tag_labels")
    private List<String> tagLabels = new ArrayList<String>();
    @JsonProperty("tag_slugs")
    private List<String> tagSlugs = new ArrayList<String>();
    @JsonProperty("tags")
    private List<Tag> tags = new ArrayList<Tag>();
    @JsonProperty("teams")
    private List<Team> teams = new ArrayList<Team>();
    @JsonProperty("templateVariables")
    private String templateVariables;
    @JsonProperty("templates")
    private List<Template> templates = new ArrayList<Template>();
    @JsonProperty("ticker")
    private String ticker;
    @JsonProperty("title")
    private String title;
    @JsonProperty("totalsMainLine")
    private Double totalsMainLine;
    @JsonProperty("turnProviderId")
    private String turnProviderId;
    @JsonProperty("tweetCount")
    private Integer tweetCount;
    @JsonProperty("updatedAt")
    private Date updatedAt;
    @JsonProperty("updatedBy")
    private String updatedBy;
    @JsonProperty("usId")
    private String usId;
    /**
     * Protocol version of the event: v1 (legacy) or v2 (all child markets on polymarket-v2 modules). Clients must match exact values and treat unknown values as unsupported.
     * 
     */
    @JsonProperty("version")
    @JsonPropertyDescription("Protocol version of the event: v1 (legacy) or v2 (all child markets on polymarket-v2 modules). Clients must match exact values and treat unknown values as unsupported.")
    private Event.Version version;
    @JsonProperty("volume")
    private Double volume;
    @JsonProperty("volume1mo")
    private Double volume1mo;
    @JsonProperty("volume1wk")
    private Double volume1wk;
    @JsonProperty("volume1yr")
    private Double volume1yr;
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

    public Event with$schema(URI $schema) {
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

    public Event withActive(Boolean active) {
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

    public Event withArchived(Boolean archived) {
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

    public Event withAutomaticallyActive(Boolean automaticallyActive) {
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

    public Event withAutomaticallyResolved(Boolean automaticallyResolved) {
        this.automaticallyResolved = automaticallyResolved;
        return this;
    }

    @JsonProperty("bestLines")
    public List<BestLine> getBestLines() {
        return bestLines;
    }

    @JsonProperty("bestLines")
    public void setBestLines(List<BestLine> bestLines) {
        this.bestLines = bestLines;
    }

    public Event withBestLines(List<BestLine> bestLines) {
        this.bestLines = bestLines;
        return this;
    }

    @JsonProperty("cantEstimate")
    public Boolean getCantEstimate() {
        return cantEstimate;
    }

    @JsonProperty("cantEstimate")
    public void setCantEstimate(Boolean cantEstimate) {
        this.cantEstimate = cantEstimate;
    }

    public Event withCantEstimate(Boolean cantEstimate) {
        this.cantEstimate = cantEstimate;
        return this;
    }

    @JsonProperty("carouselMap")
    public String getCarouselMap() {
        return carouselMap;
    }

    @JsonProperty("carouselMap")
    public void setCarouselMap(String carouselMap) {
        this.carouselMap = carouselMap;
    }

    public Event withCarouselMap(String carouselMap) {
        this.carouselMap = carouselMap;
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

    public Event withCategory(String category) {
        this.category = category;
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

    public Event withClosed(Boolean closed) {
        this.closed = closed;
        return this;
    }

    @JsonProperty("closedTime")
    public Date getClosedTime() {
        return closedTime;
    }

    @JsonProperty("closedTime")
    public void setClosedTime(Date closedTime) {
        this.closedTime = closedTime;
    }

    public Event withClosedTime(Date closedTime) {
        this.closedTime = closedTime;
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

    public Event withColor(String color) {
        this.color = color;
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

    public Event withCommentCount(Integer commentCount) {
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

    public Event withCommentsEnabled(Boolean commentsEnabled) {
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

    public Event withCompetitive(Double competitive) {
        this.competitive = competitive;
        return this;
    }

    @JsonProperty("countryName")
    public String getCountryName() {
        return countryName;
    }

    @JsonProperty("countryName")
    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public Event withCountryName(String countryName) {
        this.countryName = countryName;
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

    public Event withCreatedAt(Date createdAt) {
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

    public Event withCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    @JsonProperty("creationDate")
    public Date getCreationDate() {
        return creationDate;
    }

    @JsonProperty("creationDate")
    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Event withCreationDate(Date creationDate) {
        this.creationDate = creationDate;
        return this;
    }

    @JsonProperty("cumulativeMarkets")
    public Boolean getCumulativeMarkets() {
        return cumulativeMarkets;
    }

    @JsonProperty("cumulativeMarkets")
    public void setCumulativeMarkets(Boolean cumulativeMarkets) {
        this.cumulativeMarkets = cumulativeMarkets;
    }

    public Event withCumulativeMarkets(Boolean cumulativeMarkets) {
        this.cumulativeMarkets = cumulativeMarkets;
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

    public Event withCyom(Boolean cyom) {
        this.cyom = cyom;
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

    public Event withDeploying(Boolean deploying) {
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

    public Event withDeployingTimestamp(Date deployingTimestamp) {
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

    public Event withDescription(String description) {
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

    public Event withDisqusThread(String disqusThread) {
        this.disqusThread = disqusThread;
        return this;
    }

    @JsonProperty("elapsed")
    public String getElapsed() {
        return elapsed;
    }

    @JsonProperty("elapsed")
    public void setElapsed(String elapsed) {
        this.elapsed = elapsed;
    }

    public Event withElapsed(String elapsed) {
        this.elapsed = elapsed;
        return this;
    }

    @JsonProperty("electionType")
    public String getElectionType() {
        return electionType;
    }

    @JsonProperty("electionType")
    public void setElectionType(String electionType) {
        this.electionType = electionType;
    }

    public Event withElectionType(String electionType) {
        this.electionType = electionType;
        return this;
    }

    @JsonProperty("enableNegRisk")
    public Boolean getEnableNegRisk() {
        return enableNegRisk;
    }

    @JsonProperty("enableNegRisk")
    public void setEnableNegRisk(Boolean enableNegRisk) {
        this.enableNegRisk = enableNegRisk;
    }

    public Event withEnableNegRisk(Boolean enableNegRisk) {
        this.enableNegRisk = enableNegRisk;
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

    public Event withEnableOrderBook(Boolean enableOrderBook) {
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

    public Event withEndDate(Date endDate) {
        this.endDate = endDate;
        return this;
    }

    @JsonProperty("ended")
    public Boolean getEnded() {
        return ended;
    }

    @JsonProperty("ended")
    public void setEnded(Boolean ended) {
        this.ended = ended;
    }

    public Event withEnded(Boolean ended) {
        this.ended = ended;
        return this;
    }

    @JsonProperty("estimateValue")
    public Boolean getEstimateValue() {
        return estimateValue;
    }

    @JsonProperty("estimateValue")
    public void setEstimateValue(Boolean estimateValue) {
        this.estimateValue = estimateValue;
    }

    public Event withEstimateValue(Boolean estimateValue) {
        this.estimateValue = estimateValue;
        return this;
    }

    @JsonProperty("estimatedValue")
    public String getEstimatedValue() {
        return estimatedValue;
    }

    @JsonProperty("estimatedValue")
    public void setEstimatedValue(String estimatedValue) {
        this.estimatedValue = estimatedValue;
    }

    public Event withEstimatedValue(String estimatedValue) {
        this.estimatedValue = estimatedValue;
        return this;
    }

    @JsonProperty("eventCreators")
    public List<EventCreator> getEventCreators() {
        return eventCreators;
    }

    @JsonProperty("eventCreators")
    public void setEventCreators(List<EventCreator> eventCreators) {
        this.eventCreators = eventCreators;
    }

    public Event withEventCreators(List<EventCreator> eventCreators) {
        this.eventCreators = eventCreators;
        return this;
    }

    @JsonProperty("eventDate")
    public String getEventDate() {
        return eventDate;
    }

    @JsonProperty("eventDate")
    public void setEventDate(String eventDate) {
        this.eventDate = eventDate;
    }

    public Event withEventDate(String eventDate) {
        this.eventDate = eventDate;
        return this;
    }

    @JsonProperty("eventMetadata")
    public EventMetadata getEventMetadata() {
        return eventMetadata;
    }

    @JsonProperty("eventMetadata")
    public void setEventMetadata(EventMetadata eventMetadata) {
        this.eventMetadata = eventMetadata;
    }

    public Event withEventMetadata(EventMetadata eventMetadata) {
        this.eventMetadata = eventMetadata;
        return this;
    }

    @JsonProperty("eventWeek")
    public Integer getEventWeek() {
        return eventWeek;
    }

    @JsonProperty("eventWeek")
    public void setEventWeek(Integer eventWeek) {
        this.eventWeek = eventWeek;
    }

    public Event withEventWeek(Integer eventWeek) {
        this.eventWeek = eventWeek;
        return this;
    }

    @JsonProperty("externalPartners")
    public List<EventExternalPartnerMapping> getExternalPartners() {
        return externalPartners;
    }

    @JsonProperty("externalPartners")
    public void setExternalPartners(List<EventExternalPartnerMapping> externalPartners) {
        this.externalPartners = externalPartners;
    }

    public Event withExternalPartners(List<EventExternalPartnerMapping> externalPartners) {
        this.externalPartners = externalPartners;
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

    public Event withFeatured(Boolean featured) {
        this.featured = featured;
        return this;
    }

    @JsonProperty("featuredImage")
    public String getFeaturedImage() {
        return featuredImage;
    }

    @JsonProperty("featuredImage")
    public void setFeaturedImage(String featuredImage) {
        this.featuredImage = featuredImage;
    }

    public Event withFeaturedImage(String featuredImage) {
        this.featuredImage = featuredImage;
        return this;
    }

    @JsonProperty("featuredImageOptimized")
    public ImageOptimization getFeaturedImageOptimized() {
        return featuredImageOptimized;
    }

    @JsonProperty("featuredImageOptimized")
    public void setFeaturedImageOptimized(ImageOptimization featuredImageOptimized) {
        this.featuredImageOptimized = featuredImageOptimized;
    }

    public Event withFeaturedImageOptimized(ImageOptimization featuredImageOptimized) {
        this.featuredImageOptimized = featuredImageOptimized;
        return this;
    }

    @JsonProperty("featuredOrder")
    public Integer getFeaturedOrder() {
        return featuredOrder;
    }

    @JsonProperty("featuredOrder")
    public void setFeaturedOrder(Integer featuredOrder) {
        this.featuredOrder = featuredOrder;
    }

    public Event withFeaturedOrder(Integer featuredOrder) {
        this.featuredOrder = featuredOrder;
        return this;
    }

    @JsonProperty("finishedTimestamp")
    public Date getFinishedTimestamp() {
        return finishedTimestamp;
    }

    @JsonProperty("finishedTimestamp")
    public void setFinishedTimestamp(Date finishedTimestamp) {
        this.finishedTimestamp = finishedTimestamp;
    }

    public Event withFinishedTimestamp(Date finishedTimestamp) {
        this.finishedTimestamp = finishedTimestamp;
        return this;
    }

    @JsonProperty("gameId")
    public Integer getGameId() {
        return gameId;
    }

    @JsonProperty("gameId")
    public void setGameId(Integer gameId) {
        this.gameId = gameId;
    }

    public Event withGameId(Integer gameId) {
        this.gameId = gameId;
        return this;
    }

    @JsonProperty("gmpChartMode")
    public String getGmpChartMode() {
        return gmpChartMode;
    }

    @JsonProperty("gmpChartMode")
    public void setGmpChartMode(String gmpChartMode) {
        this.gmpChartMode = gmpChartMode;
    }

    public Event withGmpChartMode(String gmpChartMode) {
        this.gmpChartMode = gmpChartMode;
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

    public Event withIcon(String icon) {
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

    public Event withIconOptimized(ImageOptimization iconOptimized) {
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

    public Event withId(String id) {
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

    public Event withImage(String image) {
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

    public Event withImageOptimized(ImageOptimization imageOptimized) {
        this.imageOptimized = imageOptimized;
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

    public Event withIsTemplate(Boolean isTemplate) {
        this.isTemplate = isTemplate;
        return this;
    }

    @JsonProperty("lastHighlight")
    public String getLastHighlight() {
        return lastHighlight;
    }

    @JsonProperty("lastHighlight")
    public void setLastHighlight(String lastHighlight) {
        this.lastHighlight = lastHighlight;
    }

    public Event withLastHighlight(String lastHighlight) {
        this.lastHighlight = lastHighlight;
        return this;
    }

    @JsonProperty("lastHighlightAt")
    public Date getLastHighlightAt() {
        return lastHighlightAt;
    }

    @JsonProperty("lastHighlightAt")
    public void setLastHighlightAt(Date lastHighlightAt) {
        this.lastHighlightAt = lastHighlightAt;
    }

    public Event withLastHighlightAt(Date lastHighlightAt) {
        this.lastHighlightAt = lastHighlightAt;
        return this;
    }

    @JsonProperty("lastHighlightType")
    public String getLastHighlightType() {
        return lastHighlightType;
    }

    @JsonProperty("lastHighlightType")
    public void setLastHighlightType(String lastHighlightType) {
        this.lastHighlightType = lastHighlightType;
    }

    public Event withLastHighlightType(String lastHighlightType) {
        this.lastHighlightType = lastHighlightType;
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

    public Event withLiquidity(Double liquidity) {
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

    public Event withLiquidityAmm(Double liquidityAmm) {
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

    public Event withLiquidityClob(Double liquidityClob) {
        this.liquidityClob = liquidityClob;
        return this;
    }

    @JsonProperty("live")
    public Boolean getLive() {
        return live;
    }

    @JsonProperty("live")
    public void setLive(Boolean live) {
        this.live = live;
    }

    public Event withLive(Boolean live) {
        this.live = live;
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

    public Event withMarkets(List<Market> markets) {
        this.markets = markets;
        return this;
    }

    /**
     * Maximum number of markets the event can ever hold: the neg-risk arity packed into the v2 event id at first deployment (atomic neg-risk: equals the member count; incremental neg-risk: reserves slots for later appends). Null for binary events. Immutable once deployed — condition ids derive from it.
     * 
     */
    @JsonProperty("maxMarketCount")
    public Integer getMaxMarketCount() {
        return maxMarketCount;
    }

    /**
     * Maximum number of markets the event can ever hold: the neg-risk arity packed into the v2 event id at first deployment (atomic neg-risk: equals the member count; incremental neg-risk: reserves slots for later appends). Null for binary events. Immutable once deployed — condition ids derive from it.
     * 
     */
    @JsonProperty("maxMarketCount")
    public void setMaxMarketCount(Integer maxMarketCount) {
        this.maxMarketCount = maxMarketCount;
    }

    public Event withMaxMarketCount(Integer maxMarketCount) {
        this.maxMarketCount = maxMarketCount;
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

    public Event withNegRisk(Boolean negRisk) {
        this.negRisk = negRisk;
        return this;
    }

    @JsonProperty("negRiskAugmented")
    public Boolean getNegRiskAugmented() {
        return negRiskAugmented;
    }

    @JsonProperty("negRiskAugmented")
    public void setNegRiskAugmented(Boolean negRiskAugmented) {
        this.negRiskAugmented = negRiskAugmented;
    }

    public Event withNegRiskAugmented(Boolean negRiskAugmented) {
        this.negRiskAugmented = negRiskAugmented;
        return this;
    }

    @JsonProperty("negRiskFeeBips")
    public Integer getNegRiskFeeBips() {
        return negRiskFeeBips;
    }

    @JsonProperty("negRiskFeeBips")
    public void setNegRiskFeeBips(Integer negRiskFeeBips) {
        this.negRiskFeeBips = negRiskFeeBips;
    }

    public Event withNegRiskFeeBips(Integer negRiskFeeBips) {
        this.negRiskFeeBips = negRiskFeeBips;
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

    public Event withNegRiskMarketID(String negRiskMarketID) {
        this.negRiskMarketID = negRiskMarketID;
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

    public Event withNew(Boolean _new) {
        this._new = _new;
        return this;
    }

    @JsonProperty("openInterest")
    public Double getOpenInterest() {
        return openInterest;
    }

    @JsonProperty("openInterest")
    public void setOpenInterest(Double openInterest) {
        this.openInterest = openInterest;
    }

    public Event withOpenInterest(Double openInterest) {
        this.openInterest = openInterest;
        return this;
    }

    @JsonProperty("parentEventId")
    public Integer getParentEventId() {
        return parentEventId;
    }

    @JsonProperty("parentEventId")
    public void setParentEventId(Integer parentEventId) {
        this.parentEventId = parentEventId;
    }

    public Event withParentEventId(Integer parentEventId) {
        this.parentEventId = parentEventId;
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

    public Event withPendingDeployment(Boolean pendingDeployment) {
        this.pendingDeployment = pendingDeployment;
        return this;
    }

    @JsonProperty("period")
    public String getPeriod() {
        return period;
    }

    @JsonProperty("period")
    public void setPeriod(String period) {
        this.period = period;
    }

    public Event withPeriod(String period) {
        this.period = period;
        return this;
    }

    @JsonProperty("published_at")
    public String getPublishedAt() {
        return publishedAt;
    }

    @JsonProperty("published_at")
    public void setPublishedAt(String publishedAt) {
        this.publishedAt = publishedAt;
    }

    public Event withPublishedAt(String publishedAt) {
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

    public Event withRequiresTranslation(Boolean requiresTranslation) {
        this.requiresTranslation = requiresTranslation;
        return this;
    }

    @JsonProperty("rescheduledFromGameId")
    public Integer getRescheduledFromGameId() {
        return rescheduledFromGameId;
    }

    @JsonProperty("rescheduledFromGameId")
    public void setRescheduledFromGameId(Integer rescheduledFromGameId) {
        this.rescheduledFromGameId = rescheduledFromGameId;
    }

    public Event withRescheduledFromGameId(Integer rescheduledFromGameId) {
        this.rescheduledFromGameId = rescheduledFromGameId;
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

    public Event withResolutionSource(String resolutionSource) {
        this.resolutionSource = resolutionSource;
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

    public Event withRestricted(Boolean restricted) {
        this.restricted = restricted;
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

    public Event withScheduledDeploymentTimestamp(Date scheduledDeploymentTimestamp) {
        this.scheduledDeploymentTimestamp = scheduledDeploymentTimestamp;
        return this;
    }

    @JsonProperty("score")
    public String getScore() {
        return score;
    }

    @JsonProperty("score")
    public void setScore(String score) {
        this.score = score;
    }

    public Event withScore(String score) {
        this.score = score;
        return this;
    }

    @JsonProperty("series")
    public List<Series> getSeries() {
        return series;
    }

    @JsonProperty("series")
    public void setSeries(List<Series> series) {
        this.series = series;
    }

    public Event withSeries(List<Series> series) {
        this.series = series;
        return this;
    }

    @JsonProperty("seriesSlug")
    public String getSeriesSlug() {
        return seriesSlug;
    }

    @JsonProperty("seriesSlug")
    public void setSeriesSlug(String seriesSlug) {
        this.seriesSlug = seriesSlug;
    }

    public Event withSeriesSlug(String seriesSlug) {
        this.seriesSlug = seriesSlug;
        return this;
    }

    @JsonProperty("showAllOutcomes")
    public Boolean getShowAllOutcomes() {
        return showAllOutcomes;
    }

    @JsonProperty("showAllOutcomes")
    public void setShowAllOutcomes(Boolean showAllOutcomes) {
        this.showAllOutcomes = showAllOutcomes;
    }

    public Event withShowAllOutcomes(Boolean showAllOutcomes) {
        this.showAllOutcomes = showAllOutcomes;
        return this;
    }

    @JsonProperty("showMarketImages")
    public Boolean getShowMarketImages() {
        return showMarketImages;
    }

    @JsonProperty("showMarketImages")
    public void setShowMarketImages(Boolean showMarketImages) {
        this.showMarketImages = showMarketImages;
    }

    public Event withShowMarketImages(Boolean showMarketImages) {
        this.showMarketImages = showMarketImages;
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

    public Event withSlug(String slug) {
        this.slug = slug;
        return this;
    }

    @JsonProperty("sortBy")
    public String getSortBy() {
        return sortBy;
    }

    @JsonProperty("sortBy")
    public void setSortBy(String sortBy) {
        this.sortBy = sortBy;
    }

    public Event withSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }

    @JsonProperty("sport")
    public SportsMetadata getSport() {
        return sport;
    }

    @JsonProperty("sport")
    public void setSport(SportsMetadata sport) {
        this.sport = sport;
    }

    public Event withSport(SportsMetadata sport) {
        this.sport = sport;
        return this;
    }

    @JsonProperty("spreadsMainLine")
    public Double getSpreadsMainLine() {
        return spreadsMainLine;
    }

    @JsonProperty("spreadsMainLine")
    public void setSpreadsMainLine(Double spreadsMainLine) {
        this.spreadsMainLine = spreadsMainLine;
    }

    public Event withSpreadsMainLine(Double spreadsMainLine) {
        this.spreadsMainLine = spreadsMainLine;
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

    public Event withStartDate(Date startDate) {
        this.startDate = startDate;
        return this;
    }

    @JsonProperty("startTime")
    public Date getStartTime() {
        return startTime;
    }

    @JsonProperty("startTime")
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Event withStartTime(Date startTime) {
        this.startTime = startTime;
        return this;
    }

    @JsonProperty("subEvents")
    public List<String> getSubEvents() {
        return subEvents;
    }

    @JsonProperty("subEvents")
    public void setSubEvents(List<String> subEvents) {
        this.subEvents = subEvents;
    }

    public Event withSubEvents(List<String> subEvents) {
        this.subEvents = subEvents;
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

    public Event withSubcategory(String subcategory) {
        this.subcategory = subcategory;
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

    public Event withSubtitle(String subtitle) {
        this.subtitle = subtitle;
        return this;
    }

    @JsonProperty("tag_labels")
    public List<String> getTagLabels() {
        return tagLabels;
    }

    @JsonProperty("tag_labels")
    public void setTagLabels(List<String> tagLabels) {
        this.tagLabels = tagLabels;
    }

    public Event withTagLabels(List<String> tagLabels) {
        this.tagLabels = tagLabels;
        return this;
    }

    @JsonProperty("tag_slugs")
    public List<String> getTagSlugs() {
        return tagSlugs;
    }

    @JsonProperty("tag_slugs")
    public void setTagSlugs(List<String> tagSlugs) {
        this.tagSlugs = tagSlugs;
    }

    public Event withTagSlugs(List<String> tagSlugs) {
        this.tagSlugs = tagSlugs;
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

    public Event withTags(List<Tag> tags) {
        this.tags = tags;
        return this;
    }

    @JsonProperty("teams")
    public List<Team> getTeams() {
        return teams;
    }

    @JsonProperty("teams")
    public void setTeams(List<Team> teams) {
        this.teams = teams;
    }

    public Event withTeams(List<Team> teams) {
        this.teams = teams;
        return this;
    }

    @JsonProperty("templateVariables")
    public String getTemplateVariables() {
        return templateVariables;
    }

    @JsonProperty("templateVariables")
    public void setTemplateVariables(String templateVariables) {
        this.templateVariables = templateVariables;
    }

    public Event withTemplateVariables(String templateVariables) {
        this.templateVariables = templateVariables;
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

    public Event withTemplates(List<Template> templates) {
        this.templates = templates;
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

    public Event withTicker(String ticker) {
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

    public Event withTitle(String title) {
        this.title = title;
        return this;
    }

    @JsonProperty("totalsMainLine")
    public Double getTotalsMainLine() {
        return totalsMainLine;
    }

    @JsonProperty("totalsMainLine")
    public void setTotalsMainLine(Double totalsMainLine) {
        this.totalsMainLine = totalsMainLine;
    }

    public Event withTotalsMainLine(Double totalsMainLine) {
        this.totalsMainLine = totalsMainLine;
        return this;
    }

    @JsonProperty("turnProviderId")
    public String getTurnProviderId() {
        return turnProviderId;
    }

    @JsonProperty("turnProviderId")
    public void setTurnProviderId(String turnProviderId) {
        this.turnProviderId = turnProviderId;
    }

    public Event withTurnProviderId(String turnProviderId) {
        this.turnProviderId = turnProviderId;
        return this;
    }

    @JsonProperty("tweetCount")
    public Integer getTweetCount() {
        return tweetCount;
    }

    @JsonProperty("tweetCount")
    public void setTweetCount(Integer tweetCount) {
        this.tweetCount = tweetCount;
    }

    public Event withTweetCount(Integer tweetCount) {
        this.tweetCount = tweetCount;
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

    public Event withUpdatedAt(Date updatedAt) {
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

    public Event withUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
        return this;
    }

    @JsonProperty("usId")
    public String getUsId() {
        return usId;
    }

    @JsonProperty("usId")
    public void setUsId(String usId) {
        this.usId = usId;
    }

    public Event withUsId(String usId) {
        this.usId = usId;
        return this;
    }

    /**
     * Protocol version of the event: v1 (legacy) or v2 (all child markets on polymarket-v2 modules). Clients must match exact values and treat unknown values as unsupported.
     * 
     */
    @JsonProperty("version")
    public Event.Version getVersion() {
        return version;
    }

    /**
     * Protocol version of the event: v1 (legacy) or v2 (all child markets on polymarket-v2 modules). Clients must match exact values and treat unknown values as unsupported.
     * 
     */
    @JsonProperty("version")
    public void setVersion(Event.Version version) {
        this.version = version;
    }

    public Event withVersion(Event.Version version) {
        this.version = version;
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

    public Event withVolume(Double volume) {
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

    public Event withVolume1mo(Double volume1mo) {
        this.volume1mo = volume1mo;
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

    public Event withVolume1wk(Double volume1wk) {
        this.volume1wk = volume1wk;
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

    public Event withVolume1yr(Double volume1yr) {
        this.volume1yr = volume1yr;
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

    public Event withVolume24hr(Double volume24hr) {
        this.volume24hr = volume24hr;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Event.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("automaticallyActive");
        sb.append('=');
        sb.append(((this.automaticallyActive == null)?"<null>":this.automaticallyActive));
        sb.append(',');
        sb.append("automaticallyResolved");
        sb.append('=');
        sb.append(((this.automaticallyResolved == null)?"<null>":this.automaticallyResolved));
        sb.append(',');
        sb.append("bestLines");
        sb.append('=');
        sb.append(((this.bestLines == null)?"<null>":this.bestLines));
        sb.append(',');
        sb.append("cantEstimate");
        sb.append('=');
        sb.append(((this.cantEstimate == null)?"<null>":this.cantEstimate));
        sb.append(',');
        sb.append("carouselMap");
        sb.append('=');
        sb.append(((this.carouselMap == null)?"<null>":this.carouselMap));
        sb.append(',');
        sb.append("category");
        sb.append('=');
        sb.append(((this.category == null)?"<null>":this.category));
        sb.append(',');
        sb.append("closed");
        sb.append('=');
        sb.append(((this.closed == null)?"<null>":this.closed));
        sb.append(',');
        sb.append("closedTime");
        sb.append('=');
        sb.append(((this.closedTime == null)?"<null>":this.closedTime));
        sb.append(',');
        sb.append("color");
        sb.append('=');
        sb.append(((this.color == null)?"<null>":this.color));
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
        sb.append("countryName");
        sb.append('=');
        sb.append(((this.countryName == null)?"<null>":this.countryName));
        sb.append(',');
        sb.append("createdAt");
        sb.append('=');
        sb.append(((this.createdAt == null)?"<null>":this.createdAt));
        sb.append(',');
        sb.append("createdBy");
        sb.append('=');
        sb.append(((this.createdBy == null)?"<null>":this.createdBy));
        sb.append(',');
        sb.append("creationDate");
        sb.append('=');
        sb.append(((this.creationDate == null)?"<null>":this.creationDate));
        sb.append(',');
        sb.append("cumulativeMarkets");
        sb.append('=');
        sb.append(((this.cumulativeMarkets == null)?"<null>":this.cumulativeMarkets));
        sb.append(',');
        sb.append("cyom");
        sb.append('=');
        sb.append(((this.cyom == null)?"<null>":this.cyom));
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
        sb.append("elapsed");
        sb.append('=');
        sb.append(((this.elapsed == null)?"<null>":this.elapsed));
        sb.append(',');
        sb.append("electionType");
        sb.append('=');
        sb.append(((this.electionType == null)?"<null>":this.electionType));
        sb.append(',');
        sb.append("enableNegRisk");
        sb.append('=');
        sb.append(((this.enableNegRisk == null)?"<null>":this.enableNegRisk));
        sb.append(',');
        sb.append("enableOrderBook");
        sb.append('=');
        sb.append(((this.enableOrderBook == null)?"<null>":this.enableOrderBook));
        sb.append(',');
        sb.append("endDate");
        sb.append('=');
        sb.append(((this.endDate == null)?"<null>":this.endDate));
        sb.append(',');
        sb.append("ended");
        sb.append('=');
        sb.append(((this.ended == null)?"<null>":this.ended));
        sb.append(',');
        sb.append("estimateValue");
        sb.append('=');
        sb.append(((this.estimateValue == null)?"<null>":this.estimateValue));
        sb.append(',');
        sb.append("estimatedValue");
        sb.append('=');
        sb.append(((this.estimatedValue == null)?"<null>":this.estimatedValue));
        sb.append(',');
        sb.append("eventCreators");
        sb.append('=');
        sb.append(((this.eventCreators == null)?"<null>":this.eventCreators));
        sb.append(',');
        sb.append("eventDate");
        sb.append('=');
        sb.append(((this.eventDate == null)?"<null>":this.eventDate));
        sb.append(',');
        sb.append("eventMetadata");
        sb.append('=');
        sb.append(((this.eventMetadata == null)?"<null>":this.eventMetadata));
        sb.append(',');
        sb.append("eventWeek");
        sb.append('=');
        sb.append(((this.eventWeek == null)?"<null>":this.eventWeek));
        sb.append(',');
        sb.append("externalPartners");
        sb.append('=');
        sb.append(((this.externalPartners == null)?"<null>":this.externalPartners));
        sb.append(',');
        sb.append("featured");
        sb.append('=');
        sb.append(((this.featured == null)?"<null>":this.featured));
        sb.append(',');
        sb.append("featuredImage");
        sb.append('=');
        sb.append(((this.featuredImage == null)?"<null>":this.featuredImage));
        sb.append(',');
        sb.append("featuredImageOptimized");
        sb.append('=');
        sb.append(((this.featuredImageOptimized == null)?"<null>":this.featuredImageOptimized));
        sb.append(',');
        sb.append("featuredOrder");
        sb.append('=');
        sb.append(((this.featuredOrder == null)?"<null>":this.featuredOrder));
        sb.append(',');
        sb.append("finishedTimestamp");
        sb.append('=');
        sb.append(((this.finishedTimestamp == null)?"<null>":this.finishedTimestamp));
        sb.append(',');
        sb.append("gameId");
        sb.append('=');
        sb.append(((this.gameId == null)?"<null>":this.gameId));
        sb.append(',');
        sb.append("gmpChartMode");
        sb.append('=');
        sb.append(((this.gmpChartMode == null)?"<null>":this.gmpChartMode));
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
        sb.append("isTemplate");
        sb.append('=');
        sb.append(((this.isTemplate == null)?"<null>":this.isTemplate));
        sb.append(',');
        sb.append("lastHighlight");
        sb.append('=');
        sb.append(((this.lastHighlight == null)?"<null>":this.lastHighlight));
        sb.append(',');
        sb.append("lastHighlightAt");
        sb.append('=');
        sb.append(((this.lastHighlightAt == null)?"<null>":this.lastHighlightAt));
        sb.append(',');
        sb.append("lastHighlightType");
        sb.append('=');
        sb.append(((this.lastHighlightType == null)?"<null>":this.lastHighlightType));
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
        sb.append("live");
        sb.append('=');
        sb.append(((this.live == null)?"<null>":this.live));
        sb.append(',');
        sb.append("markets");
        sb.append('=');
        sb.append(((this.markets == null)?"<null>":this.markets));
        sb.append(',');
        sb.append("maxMarketCount");
        sb.append('=');
        sb.append(((this.maxMarketCount == null)?"<null>":this.maxMarketCount));
        sb.append(',');
        sb.append("negRisk");
        sb.append('=');
        sb.append(((this.negRisk == null)?"<null>":this.negRisk));
        sb.append(',');
        sb.append("negRiskAugmented");
        sb.append('=');
        sb.append(((this.negRiskAugmented == null)?"<null>":this.negRiskAugmented));
        sb.append(',');
        sb.append("negRiskFeeBips");
        sb.append('=');
        sb.append(((this.negRiskFeeBips == null)?"<null>":this.negRiskFeeBips));
        sb.append(',');
        sb.append("negRiskMarketID");
        sb.append('=');
        sb.append(((this.negRiskMarketID == null)?"<null>":this.negRiskMarketID));
        sb.append(',');
        sb.append("_new");
        sb.append('=');
        sb.append(((this._new == null)?"<null>":this._new));
        sb.append(',');
        sb.append("openInterest");
        sb.append('=');
        sb.append(((this.openInterest == null)?"<null>":this.openInterest));
        sb.append(',');
        sb.append("parentEventId");
        sb.append('=');
        sb.append(((this.parentEventId == null)?"<null>":this.parentEventId));
        sb.append(',');
        sb.append("pendingDeployment");
        sb.append('=');
        sb.append(((this.pendingDeployment == null)?"<null>":this.pendingDeployment));
        sb.append(',');
        sb.append("period");
        sb.append('=');
        sb.append(((this.period == null)?"<null>":this.period));
        sb.append(',');
        sb.append("publishedAt");
        sb.append('=');
        sb.append(((this.publishedAt == null)?"<null>":this.publishedAt));
        sb.append(',');
        sb.append("requiresTranslation");
        sb.append('=');
        sb.append(((this.requiresTranslation == null)?"<null>":this.requiresTranslation));
        sb.append(',');
        sb.append("rescheduledFromGameId");
        sb.append('=');
        sb.append(((this.rescheduledFromGameId == null)?"<null>":this.rescheduledFromGameId));
        sb.append(',');
        sb.append("resolutionSource");
        sb.append('=');
        sb.append(((this.resolutionSource == null)?"<null>":this.resolutionSource));
        sb.append(',');
        sb.append("restricted");
        sb.append('=');
        sb.append(((this.restricted == null)?"<null>":this.restricted));
        sb.append(',');
        sb.append("scheduledDeploymentTimestamp");
        sb.append('=');
        sb.append(((this.scheduledDeploymentTimestamp == null)?"<null>":this.scheduledDeploymentTimestamp));
        sb.append(',');
        sb.append("score");
        sb.append('=');
        sb.append(((this.score == null)?"<null>":this.score));
        sb.append(',');
        sb.append("series");
        sb.append('=');
        sb.append(((this.series == null)?"<null>":this.series));
        sb.append(',');
        sb.append("seriesSlug");
        sb.append('=');
        sb.append(((this.seriesSlug == null)?"<null>":this.seriesSlug));
        sb.append(',');
        sb.append("showAllOutcomes");
        sb.append('=');
        sb.append(((this.showAllOutcomes == null)?"<null>":this.showAllOutcomes));
        sb.append(',');
        sb.append("showMarketImages");
        sb.append('=');
        sb.append(((this.showMarketImages == null)?"<null>":this.showMarketImages));
        sb.append(',');
        sb.append("slug");
        sb.append('=');
        sb.append(((this.slug == null)?"<null>":this.slug));
        sb.append(',');
        sb.append("sortBy");
        sb.append('=');
        sb.append(((this.sortBy == null)?"<null>":this.sortBy));
        sb.append(',');
        sb.append("sport");
        sb.append('=');
        sb.append(((this.sport == null)?"<null>":this.sport));
        sb.append(',');
        sb.append("spreadsMainLine");
        sb.append('=');
        sb.append(((this.spreadsMainLine == null)?"<null>":this.spreadsMainLine));
        sb.append(',');
        sb.append("startDate");
        sb.append('=');
        sb.append(((this.startDate == null)?"<null>":this.startDate));
        sb.append(',');
        sb.append("startTime");
        sb.append('=');
        sb.append(((this.startTime == null)?"<null>":this.startTime));
        sb.append(',');
        sb.append("subEvents");
        sb.append('=');
        sb.append(((this.subEvents == null)?"<null>":this.subEvents));
        sb.append(',');
        sb.append("subcategory");
        sb.append('=');
        sb.append(((this.subcategory == null)?"<null>":this.subcategory));
        sb.append(',');
        sb.append("subtitle");
        sb.append('=');
        sb.append(((this.subtitle == null)?"<null>":this.subtitle));
        sb.append(',');
        sb.append("tagLabels");
        sb.append('=');
        sb.append(((this.tagLabels == null)?"<null>":this.tagLabels));
        sb.append(',');
        sb.append("tagSlugs");
        sb.append('=');
        sb.append(((this.tagSlugs == null)?"<null>":this.tagSlugs));
        sb.append(',');
        sb.append("tags");
        sb.append('=');
        sb.append(((this.tags == null)?"<null>":this.tags));
        sb.append(',');
        sb.append("teams");
        sb.append('=');
        sb.append(((this.teams == null)?"<null>":this.teams));
        sb.append(',');
        sb.append("templateVariables");
        sb.append('=');
        sb.append(((this.templateVariables == null)?"<null>":this.templateVariables));
        sb.append(',');
        sb.append("templates");
        sb.append('=');
        sb.append(((this.templates == null)?"<null>":this.templates));
        sb.append(',');
        sb.append("ticker");
        sb.append('=');
        sb.append(((this.ticker == null)?"<null>":this.ticker));
        sb.append(',');
        sb.append("title");
        sb.append('=');
        sb.append(((this.title == null)?"<null>":this.title));
        sb.append(',');
        sb.append("totalsMainLine");
        sb.append('=');
        sb.append(((this.totalsMainLine == null)?"<null>":this.totalsMainLine));
        sb.append(',');
        sb.append("turnProviderId");
        sb.append('=');
        sb.append(((this.turnProviderId == null)?"<null>":this.turnProviderId));
        sb.append(',');
        sb.append("tweetCount");
        sb.append('=');
        sb.append(((this.tweetCount == null)?"<null>":this.tweetCount));
        sb.append(',');
        sb.append("updatedAt");
        sb.append('=');
        sb.append(((this.updatedAt == null)?"<null>":this.updatedAt));
        sb.append(',');
        sb.append("updatedBy");
        sb.append('=');
        sb.append(((this.updatedBy == null)?"<null>":this.updatedBy));
        sb.append(',');
        sb.append("usId");
        sb.append('=');
        sb.append(((this.usId == null)?"<null>":this.usId));
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
        sb.append("volume1wk");
        sb.append('=');
        sb.append(((this.volume1wk == null)?"<null>":this.volume1wk));
        sb.append(',');
        sb.append("volume1yr");
        sb.append('=');
        sb.append(((this.volume1yr == null)?"<null>":this.volume1yr));
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
        result = ((result* 31)+((this.negRiskFeeBips == null)? 0 :this.negRiskFeeBips.hashCode()));
        result = ((result* 31)+((this.lastHighlightAt == null)? 0 :this.lastHighlightAt.hashCode()));
        result = ((result* 31)+((this.endDate == null)? 0 :this.endDate.hashCode()));
        result = ((result* 31)+((this.closedTime == null)? 0 :this.closedTime.hashCode()));
        result = ((result* 31)+((this.featuredOrder == null)? 0 :this.featuredOrder.hashCode()));
        result = ((result* 31)+((this.automaticallyResolved == null)? 0 :this.automaticallyResolved.hashCode()));
        result = ((result* 31)+((this.score == null)? 0 :this.score.hashCode()));
        result = ((result* 31)+((this.tagLabels == null)? 0 :this.tagLabels.hashCode()));
        result = ((result* 31)+((this.maxMarketCount == null)? 0 :this.maxMarketCount.hashCode()));
        result = ((result* 31)+((this.enableOrderBook == null)? 0 :this.enableOrderBook.hashCode()));
        result = ((result* 31)+((this.cantEstimate == null)? 0 :this.cantEstimate.hashCode()));
        result = ((result* 31)+((this.sortBy == null)? 0 :this.sortBy.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.volume1mo == null)? 0 :this.volume1mo.hashCode()));
        result = ((result* 31)+((this.period == null)? 0 :this.period.hashCode()));
        result = ((result* 31)+((this.automaticallyActive == null)? 0 :this.automaticallyActive.hashCode()));
        result = ((result* 31)+((this.requiresTranslation == null)? 0 :this.requiresTranslation.hashCode()));
        result = ((result* 31)+((this.teams == null)? 0 :this.teams.hashCode()));
        result = ((result* 31)+((this.templates == null)? 0 :this.templates.hashCode()));
        result = ((result* 31)+((this.active == null)? 0 :this.active.hashCode()));
        result = ((result* 31)+((this.version == null)? 0 :this.version.hashCode()));
        result = ((result* 31)+((this.commentCount == null)? 0 :this.commentCount.hashCode()));
        result = ((result* 31)+((this.tags == null)? 0 :this.tags.hashCode()));
        result = ((result* 31)+((this.isTemplate == null)? 0 :this.isTemplate.hashCode()));
        result = ((result* 31)+((this.subtitle == null)? 0 :this.subtitle.hashCode()));
        result = ((result* 31)+((this.competitive == null)? 0 :this.competitive.hashCode()));
        result = ((result* 31)+((this.eventCreators == null)? 0 :this.eventCreators.hashCode()));
        result = ((result* 31)+((this.startDate == null)? 0 :this.startDate.hashCode()));
        result = ((result* 31)+((this.carouselMap == null)? 0 :this.carouselMap.hashCode()));
        result = ((result* 31)+((this.seriesSlug == null)? 0 :this.seriesSlug.hashCode()));
        result = ((result* 31)+((this.scheduledDeploymentTimestamp == null)? 0 :this.scheduledDeploymentTimestamp.hashCode()));
        result = ((result* 31)+((this.icon == null)? 0 :this.icon.hashCode()));
        result = ((result* 31)+((this.eventWeek == null)? 0 :this.eventWeek.hashCode()));
        result = ((result* 31)+((this.subEvents == null)? 0 :this.subEvents.hashCode()));
        result = ((result* 31)+((this.volume1wk == null)? 0 :this.volume1wk.hashCode()));
        result = ((result* 31)+((this.archived == null)? 0 :this.archived.hashCode()));
        result = ((result* 31)+((this.rescheduledFromGameId == null)? 0 :this.rescheduledFromGameId.hashCode()));
        result = ((result* 31)+((this.startTime == null)? 0 :this.startTime.hashCode()));
        result = ((result* 31)+((this.parentEventId == null)? 0 :this.parentEventId.hashCode()));
        result = ((result* 31)+((this.negRiskAugmented == null)? 0 :this.negRiskAugmented.hashCode()));
        result = ((result* 31)+((this.cumulativeMarkets == null)? 0 :this.cumulativeMarkets.hashCode()));
        result = ((result* 31)+((this.deployingTimestamp == null)? 0 :this.deployingTimestamp.hashCode()));
        result = ((result* 31)+((this.tagSlugs == null)? 0 :this.tagSlugs.hashCode()));
        result = ((result* 31)+((this.estimateValue == null)? 0 :this.estimateValue.hashCode()));
        result = ((result* 31)+((this.negRisk == null)? 0 :this.negRisk.hashCode()));
        result = ((result* 31)+((this.imageOptimized == null)? 0 :this.imageOptimized.hashCode()));
        result = ((result* 31)+((this.usId == null)? 0 :this.usId.hashCode()));
        result = ((result* 31)+((this.lastHighlightType == null)? 0 :this.lastHighlightType.hashCode()));
        result = ((result* 31)+((this.series == null)? 0 :this.series.hashCode()));
        result = ((result* 31)+((this.deploying == null)? 0 :this.deploying.hashCode()));
        result = ((result* 31)+((this.ended == null)? 0 :this.ended.hashCode()));
        result = ((result* 31)+((this.closed == null)? 0 :this.closed.hashCode()));
        result = ((result* 31)+((this.showMarketImages == null)? 0 :this.showMarketImages.hashCode()));
        result = ((result* 31)+((this.featured == null)? 0 :this.featured.hashCode()));
        result = ((result* 31)+((this.volume24hr == null)? 0 :this.volume24hr.hashCode()));
        result = ((result* 31)+((this.$schema == null)? 0 :this.$schema.hashCode()));
        result = ((result* 31)+((this.turnProviderId == null)? 0 :this.turnProviderId.hashCode()));
        result = ((result* 31)+((this.tweetCount == null)? 0 :this.tweetCount.hashCode()));
        result = ((result* 31)+((this.liquidity == null)? 0 :this.liquidity.hashCode()));
        result = ((result* 31)+((this.eventMetadata == null)? 0 :this.eventMetadata.hashCode()));
        result = ((result* 31)+((this.createdAt == null)? 0 :this.createdAt.hashCode()));
        result = ((result* 31)+((this.volume1yr == null)? 0 :this.volume1yr.hashCode()));
        result = ((result* 31)+((this.totalsMainLine == null)? 0 :this.totalsMainLine.hashCode()));
        result = ((result* 31)+((this.slug == null)? 0 :this.slug.hashCode()));
        result = ((result* 31)+((this.updatedAt == null)? 0 :this.updatedAt.hashCode()));
        result = ((result* 31)+((this.image == null)? 0 :this.image.hashCode()));
        result = ((result* 31)+((this.updatedBy == null)? 0 :this.updatedBy.hashCode()));
        result = ((result* 31)+((this.publishedAt == null)? 0 :this.publishedAt.hashCode()));
        result = ((result* 31)+((this.negRiskMarketID == null)? 0 :this.negRiskMarketID.hashCode()));
        result = ((result* 31)+((this.finishedTimestamp == null)? 0 :this.finishedTimestamp.hashCode()));
        result = ((result* 31)+((this.resolutionSource == null)? 0 :this.resolutionSource.hashCode()));
        result = ((result* 31)+((this.creationDate == null)? 0 :this.creationDate.hashCode()));
        result = ((result* 31)+((this.showAllOutcomes == null)? 0 :this.showAllOutcomes.hashCode()));
        result = ((result* 31)+((this.enableNegRisk == null)? 0 :this.enableNegRisk.hashCode()));
        result = ((result* 31)+((this.templateVariables == null)? 0 :this.templateVariables.hashCode()));
        result = ((result* 31)+((this.volume == null)? 0 :this.volume.hashCode()));
        result = ((result* 31)+((this.markets == null)? 0 :this.markets.hashCode()));
        result = ((result* 31)+((this.bestLines == null)? 0 :this.bestLines.hashCode()));
        result = ((result* 31)+((this.featuredImage == null)? 0 :this.featuredImage.hashCode()));
        result = ((result* 31)+((this.featuredImageOptimized == null)? 0 :this.featuredImageOptimized.hashCode()));
        result = ((result* 31)+((this.countryName == null)? 0 :this.countryName.hashCode()));
        result = ((result* 31)+((this.subcategory == null)? 0 :this.subcategory.hashCode()));
        result = ((result* 31)+((this.spreadsMainLine == null)? 0 :this.spreadsMainLine.hashCode()));
        result = ((result* 31)+((this.eventDate == null)? 0 :this.eventDate.hashCode()));
        result = ((result* 31)+((this.color == null)? 0 :this.color.hashCode()));
        result = ((result* 31)+((this.openInterest == null)? 0 :this.openInterest.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.title == null)? 0 :this.title.hashCode()));
        result = ((result* 31)+((this._new == null)? 0 :this._new.hashCode()));
        result = ((result* 31)+((this.lastHighlight == null)? 0 :this.lastHighlight.hashCode()));
        result = ((result* 31)+((this.elapsed == null)? 0 :this.elapsed.hashCode()));
        result = ((result* 31)+((this.estimatedValue == null)? 0 :this.estimatedValue.hashCode()));
        result = ((result* 31)+((this.iconOptimized == null)? 0 :this.iconOptimized.hashCode()));
        result = ((result* 31)+((this.liquidityClob == null)? 0 :this.liquidityClob.hashCode()));
        result = ((result* 31)+((this.gmpChartMode == null)? 0 :this.gmpChartMode.hashCode()));
        result = ((result* 31)+((this.live == null)? 0 :this.live.hashCode()));
        result = ((result* 31)+((this.gameId == null)? 0 :this.gameId.hashCode()));
        result = ((result* 31)+((this.ticker == null)? 0 :this.ticker.hashCode()));
        result = ((result* 31)+((this.disqusThread == null)? 0 :this.disqusThread.hashCode()));
        result = ((result* 31)+((this.electionType == null)? 0 :this.electionType.hashCode()));
        result = ((result* 31)+((this.liquidityAmm == null)? 0 :this.liquidityAmm.hashCode()));
        result = ((result* 31)+((this.createdBy == null)? 0 :this.createdBy.hashCode()));
        result = ((result* 31)+((this.externalPartners == null)? 0 :this.externalPartners.hashCode()));
        result = ((result* 31)+((this.restricted == null)? 0 :this.restricted.hashCode()));
        result = ((result* 31)+((this.pendingDeployment == null)? 0 :this.pendingDeployment.hashCode()));
        result = ((result* 31)+((this.cyom == null)? 0 :this.cyom.hashCode()));
        result = ((result* 31)+((this.category == null)? 0 :this.category.hashCode()));
        result = ((result* 31)+((this.sport == null)? 0 :this.sport.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Event) == false) {
            return false;
        }
        Event rhs = ((Event) other);
        return ((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((this.commentsEnabled == rhs.commentsEnabled)||((this.commentsEnabled!= null)&&this.commentsEnabled.equals(rhs.commentsEnabled)))&&((this.negRiskFeeBips == rhs.negRiskFeeBips)||((this.negRiskFeeBips!= null)&&this.negRiskFeeBips.equals(rhs.negRiskFeeBips))))&&((this.lastHighlightAt == rhs.lastHighlightAt)||((this.lastHighlightAt!= null)&&this.lastHighlightAt.equals(rhs.lastHighlightAt))))&&((this.endDate == rhs.endDate)||((this.endDate!= null)&&this.endDate.equals(rhs.endDate))))&&((this.closedTime == rhs.closedTime)||((this.closedTime!= null)&&this.closedTime.equals(rhs.closedTime))))&&((this.featuredOrder == rhs.featuredOrder)||((this.featuredOrder!= null)&&this.featuredOrder.equals(rhs.featuredOrder))))&&((this.automaticallyResolved == rhs.automaticallyResolved)||((this.automaticallyResolved!= null)&&this.automaticallyResolved.equals(rhs.automaticallyResolved))))&&((this.score == rhs.score)||((this.score!= null)&&this.score.equals(rhs.score))))&&((this.tagLabels == rhs.tagLabels)||((this.tagLabels!= null)&&this.tagLabels.equals(rhs.tagLabels))))&&((this.maxMarketCount == rhs.maxMarketCount)||((this.maxMarketCount!= null)&&this.maxMarketCount.equals(rhs.maxMarketCount))))&&((this.enableOrderBook == rhs.enableOrderBook)||((this.enableOrderBook!= null)&&this.enableOrderBook.equals(rhs.enableOrderBook))))&&((this.cantEstimate == rhs.cantEstimate)||((this.cantEstimate!= null)&&this.cantEstimate.equals(rhs.cantEstimate))))&&((this.sortBy == rhs.sortBy)||((this.sortBy!= null)&&this.sortBy.equals(rhs.sortBy))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.volume1mo == rhs.volume1mo)||((this.volume1mo!= null)&&this.volume1mo.equals(rhs.volume1mo))))&&((this.period == rhs.period)||((this.period!= null)&&this.period.equals(rhs.period))))&&((this.automaticallyActive == rhs.automaticallyActive)||((this.automaticallyActive!= null)&&this.automaticallyActive.equals(rhs.automaticallyActive))))&&((this.requiresTranslation == rhs.requiresTranslation)||((this.requiresTranslation!= null)&&this.requiresTranslation.equals(rhs.requiresTranslation))))&&((this.teams == rhs.teams)||((this.teams!= null)&&this.teams.equals(rhs.teams))))&&((this.templates == rhs.templates)||((this.templates!= null)&&this.templates.equals(rhs.templates))))&&((this.active == rhs.active)||((this.active!= null)&&this.active.equals(rhs.active))))&&((this.version == rhs.version)||((this.version!= null)&&this.version.equals(rhs.version))))&&((this.commentCount == rhs.commentCount)||((this.commentCount!= null)&&this.commentCount.equals(rhs.commentCount))))&&((this.tags == rhs.tags)||((this.tags!= null)&&this.tags.equals(rhs.tags))))&&((this.isTemplate == rhs.isTemplate)||((this.isTemplate!= null)&&this.isTemplate.equals(rhs.isTemplate))))&&((this.subtitle == rhs.subtitle)||((this.subtitle!= null)&&this.subtitle.equals(rhs.subtitle))))&&((this.competitive == rhs.competitive)||((this.competitive!= null)&&this.competitive.equals(rhs.competitive))))&&((this.eventCreators == rhs.eventCreators)||((this.eventCreators!= null)&&this.eventCreators.equals(rhs.eventCreators))))&&((this.startDate == rhs.startDate)||((this.startDate!= null)&&this.startDate.equals(rhs.startDate))))&&((this.carouselMap == rhs.carouselMap)||((this.carouselMap!= null)&&this.carouselMap.equals(rhs.carouselMap))))&&((this.seriesSlug == rhs.seriesSlug)||((this.seriesSlug!= null)&&this.seriesSlug.equals(rhs.seriesSlug))))&&((this.scheduledDeploymentTimestamp == rhs.scheduledDeploymentTimestamp)||((this.scheduledDeploymentTimestamp!= null)&&this.scheduledDeploymentTimestamp.equals(rhs.scheduledDeploymentTimestamp))))&&((this.icon == rhs.icon)||((this.icon!= null)&&this.icon.equals(rhs.icon))))&&((this.eventWeek == rhs.eventWeek)||((this.eventWeek!= null)&&this.eventWeek.equals(rhs.eventWeek))))&&((this.subEvents == rhs.subEvents)||((this.subEvents!= null)&&this.subEvents.equals(rhs.subEvents))))&&((this.volume1wk == rhs.volume1wk)||((this.volume1wk!= null)&&this.volume1wk.equals(rhs.volume1wk))))&&((this.archived == rhs.archived)||((this.archived!= null)&&this.archived.equals(rhs.archived))))&&((this.rescheduledFromGameId == rhs.rescheduledFromGameId)||((this.rescheduledFromGameId!= null)&&this.rescheduledFromGameId.equals(rhs.rescheduledFromGameId))))&&((this.startTime == rhs.startTime)||((this.startTime!= null)&&this.startTime.equals(rhs.startTime))))&&((this.parentEventId == rhs.parentEventId)||((this.parentEventId!= null)&&this.parentEventId.equals(rhs.parentEventId))))&&((this.negRiskAugmented == rhs.negRiskAugmented)||((this.negRiskAugmented!= null)&&this.negRiskAugmented.equals(rhs.negRiskAugmented))))&&((this.cumulativeMarkets == rhs.cumulativeMarkets)||((this.cumulativeMarkets!= null)&&this.cumulativeMarkets.equals(rhs.cumulativeMarkets))))&&((this.deployingTimestamp == rhs.deployingTimestamp)||((this.deployingTimestamp!= null)&&this.deployingTimestamp.equals(rhs.deployingTimestamp))))&&((this.tagSlugs == rhs.tagSlugs)||((this.tagSlugs!= null)&&this.tagSlugs.equals(rhs.tagSlugs))))&&((this.estimateValue == rhs.estimateValue)||((this.estimateValue!= null)&&this.estimateValue.equals(rhs.estimateValue))))&&((this.negRisk == rhs.negRisk)||((this.negRisk!= null)&&this.negRisk.equals(rhs.negRisk))))&&((this.imageOptimized == rhs.imageOptimized)||((this.imageOptimized!= null)&&this.imageOptimized.equals(rhs.imageOptimized))))&&((this.usId == rhs.usId)||((this.usId!= null)&&this.usId.equals(rhs.usId))))&&((this.lastHighlightType == rhs.lastHighlightType)||((this.lastHighlightType!= null)&&this.lastHighlightType.equals(rhs.lastHighlightType))))&&((this.series == rhs.series)||((this.series!= null)&&this.series.equals(rhs.series))))&&((this.deploying == rhs.deploying)||((this.deploying!= null)&&this.deploying.equals(rhs.deploying))))&&((this.ended == rhs.ended)||((this.ended!= null)&&this.ended.equals(rhs.ended))))&&((this.closed == rhs.closed)||((this.closed!= null)&&this.closed.equals(rhs.closed))))&&((this.showMarketImages == rhs.showMarketImages)||((this.showMarketImages!= null)&&this.showMarketImages.equals(rhs.showMarketImages))))&&((this.featured == rhs.featured)||((this.featured!= null)&&this.featured.equals(rhs.featured))))&&((this.volume24hr == rhs.volume24hr)||((this.volume24hr!= null)&&this.volume24hr.equals(rhs.volume24hr))))&&((this.$schema == rhs.$schema)||((this.$schema!= null)&&this.$schema.equals(rhs.$schema))))&&((this.turnProviderId == rhs.turnProviderId)||((this.turnProviderId!= null)&&this.turnProviderId.equals(rhs.turnProviderId))))&&((this.tweetCount == rhs.tweetCount)||((this.tweetCount!= null)&&this.tweetCount.equals(rhs.tweetCount))))&&((this.liquidity == rhs.liquidity)||((this.liquidity!= null)&&this.liquidity.equals(rhs.liquidity))))&&((this.eventMetadata == rhs.eventMetadata)||((this.eventMetadata!= null)&&this.eventMetadata.equals(rhs.eventMetadata))))&&((this.createdAt == rhs.createdAt)||((this.createdAt!= null)&&this.createdAt.equals(rhs.createdAt))))&&((this.volume1yr == rhs.volume1yr)||((this.volume1yr!= null)&&this.volume1yr.equals(rhs.volume1yr))))&&((this.totalsMainLine == rhs.totalsMainLine)||((this.totalsMainLine!= null)&&this.totalsMainLine.equals(rhs.totalsMainLine))))&&((this.slug == rhs.slug)||((this.slug!= null)&&this.slug.equals(rhs.slug))))&&((this.updatedAt == rhs.updatedAt)||((this.updatedAt!= null)&&this.updatedAt.equals(rhs.updatedAt))))&&((this.image == rhs.image)||((this.image!= null)&&this.image.equals(rhs.image))))&&((this.updatedBy == rhs.updatedBy)||((this.updatedBy!= null)&&this.updatedBy.equals(rhs.updatedBy))))&&((this.publishedAt == rhs.publishedAt)||((this.publishedAt!= null)&&this.publishedAt.equals(rhs.publishedAt))))&&((this.negRiskMarketID == rhs.negRiskMarketID)||((this.negRiskMarketID!= null)&&this.negRiskMarketID.equals(rhs.negRiskMarketID))))&&((this.finishedTimestamp == rhs.finishedTimestamp)||((this.finishedTimestamp!= null)&&this.finishedTimestamp.equals(rhs.finishedTimestamp))))&&((this.resolutionSource == rhs.resolutionSource)||((this.resolutionSource!= null)&&this.resolutionSource.equals(rhs.resolutionSource))))&&((this.creationDate == rhs.creationDate)||((this.creationDate!= null)&&this.creationDate.equals(rhs.creationDate))))&&((this.showAllOutcomes == rhs.showAllOutcomes)||((this.showAllOutcomes!= null)&&this.showAllOutcomes.equals(rhs.showAllOutcomes))))&&((this.enableNegRisk == rhs.enableNegRisk)||((this.enableNegRisk!= null)&&this.enableNegRisk.equals(rhs.enableNegRisk))))&&((this.templateVariables == rhs.templateVariables)||((this.templateVariables!= null)&&this.templateVariables.equals(rhs.templateVariables))))&&((this.volume == rhs.volume)||((this.volume!= null)&&this.volume.equals(rhs.volume))))&&((this.markets == rhs.markets)||((this.markets!= null)&&this.markets.equals(rhs.markets))))&&((this.bestLines == rhs.bestLines)||((this.bestLines!= null)&&this.bestLines.equals(rhs.bestLines))))&&((this.featuredImage == rhs.featuredImage)||((this.featuredImage!= null)&&this.featuredImage.equals(rhs.featuredImage))))&&((this.featuredImageOptimized == rhs.featuredImageOptimized)||((this.featuredImageOptimized!= null)&&this.featuredImageOptimized.equals(rhs.featuredImageOptimized))))&&((this.countryName == rhs.countryName)||((this.countryName!= null)&&this.countryName.equals(rhs.countryName))))&&((this.subcategory == rhs.subcategory)||((this.subcategory!= null)&&this.subcategory.equals(rhs.subcategory))))&&((this.spreadsMainLine == rhs.spreadsMainLine)||((this.spreadsMainLine!= null)&&this.spreadsMainLine.equals(rhs.spreadsMainLine))))&&((this.eventDate == rhs.eventDate)||((this.eventDate!= null)&&this.eventDate.equals(rhs.eventDate))))&&((this.color == rhs.color)||((this.color!= null)&&this.color.equals(rhs.color))))&&((this.openInterest == rhs.openInterest)||((this.openInterest!= null)&&this.openInterest.equals(rhs.openInterest))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))))&&((this._new == rhs._new)||((this._new!= null)&&this._new.equals(rhs._new))))&&((this.lastHighlight == rhs.lastHighlight)||((this.lastHighlight!= null)&&this.lastHighlight.equals(rhs.lastHighlight))))&&((this.elapsed == rhs.elapsed)||((this.elapsed!= null)&&this.elapsed.equals(rhs.elapsed))))&&((this.estimatedValue == rhs.estimatedValue)||((this.estimatedValue!= null)&&this.estimatedValue.equals(rhs.estimatedValue))))&&((this.iconOptimized == rhs.iconOptimized)||((this.iconOptimized!= null)&&this.iconOptimized.equals(rhs.iconOptimized))))&&((this.liquidityClob == rhs.liquidityClob)||((this.liquidityClob!= null)&&this.liquidityClob.equals(rhs.liquidityClob))))&&((this.gmpChartMode == rhs.gmpChartMode)||((this.gmpChartMode!= null)&&this.gmpChartMode.equals(rhs.gmpChartMode))))&&((this.live == rhs.live)||((this.live!= null)&&this.live.equals(rhs.live))))&&((this.gameId == rhs.gameId)||((this.gameId!= null)&&this.gameId.equals(rhs.gameId))))&&((this.ticker == rhs.ticker)||((this.ticker!= null)&&this.ticker.equals(rhs.ticker))))&&((this.disqusThread == rhs.disqusThread)||((this.disqusThread!= null)&&this.disqusThread.equals(rhs.disqusThread))))&&((this.electionType == rhs.electionType)||((this.electionType!= null)&&this.electionType.equals(rhs.electionType))))&&((this.liquidityAmm == rhs.liquidityAmm)||((this.liquidityAmm!= null)&&this.liquidityAmm.equals(rhs.liquidityAmm))))&&((this.createdBy == rhs.createdBy)||((this.createdBy!= null)&&this.createdBy.equals(rhs.createdBy))))&&((this.externalPartners == rhs.externalPartners)||((this.externalPartners!= null)&&this.externalPartners.equals(rhs.externalPartners))))&&((this.restricted == rhs.restricted)||((this.restricted!= null)&&this.restricted.equals(rhs.restricted))))&&((this.pendingDeployment == rhs.pendingDeployment)||((this.pendingDeployment!= null)&&this.pendingDeployment.equals(rhs.pendingDeployment))))&&((this.cyom == rhs.cyom)||((this.cyom!= null)&&this.cyom.equals(rhs.cyom))))&&((this.category == rhs.category)||((this.category!= null)&&this.category.equals(rhs.category))))&&((this.sport == rhs.sport)||((this.sport!= null)&&this.sport.equals(rhs.sport))));
    }


    /**
     * Protocol version of the event: v1 (legacy) or v2 (all child markets on polymarket-v2 modules). Clients must match exact values and treat unknown values as unsupported.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Version {

        V_1("v1"),
        V_2("v2");
        private final String value;
        private final static Map<String, Event.Version> CONSTANTS = new HashMap<String, Event.Version>();

        static {
            for (Event.Version c: values()) {
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
        public static Event.Version fromValue(String value) {
            Event.Version constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
