
package five.min.markets.poly.model;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "field",
    "id",
    "imageOptimizedComplete",
    "imageOptimizedLastUpdated",
    "imageSizeKbOptimized",
    "imageSizeKbSource",
    "imageUrlOptimized",
    "imageUrlSource",
    "relID",
    "relname"
})
@Generated("jsonschema2pojo")
public class ImageOptimization {

    @JsonProperty("field")
    private String field;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("id")
    private String id;
    @JsonProperty("imageOptimizedComplete")
    private Boolean imageOptimizedComplete;
    @JsonProperty("imageOptimizedLastUpdated")
    private String imageOptimizedLastUpdated;
    @JsonProperty("imageSizeKbOptimized")
    private Double imageSizeKbOptimized;
    @JsonProperty("imageSizeKbSource")
    private Double imageSizeKbSource;
    @JsonProperty("imageUrlOptimized")
    private String imageUrlOptimized;
    @JsonProperty("imageUrlSource")
    private String imageUrlSource;
    @JsonProperty("relID")
    private Integer relID;
    @JsonProperty("relname")
    private String relname;

    @JsonProperty("field")
    public String getField() {
        return field;
    }

    @JsonProperty("field")
    public void setField(String field) {
        this.field = field;
    }

    public ImageOptimization withField(String field) {
        this.field = field;
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

    public ImageOptimization withId(String id) {
        this.id = id;
        return this;
    }

    @JsonProperty("imageOptimizedComplete")
    public Boolean getImageOptimizedComplete() {
        return imageOptimizedComplete;
    }

    @JsonProperty("imageOptimizedComplete")
    public void setImageOptimizedComplete(Boolean imageOptimizedComplete) {
        this.imageOptimizedComplete = imageOptimizedComplete;
    }

    public ImageOptimization withImageOptimizedComplete(Boolean imageOptimizedComplete) {
        this.imageOptimizedComplete = imageOptimizedComplete;
        return this;
    }

    @JsonProperty("imageOptimizedLastUpdated")
    public String getImageOptimizedLastUpdated() {
        return imageOptimizedLastUpdated;
    }

    @JsonProperty("imageOptimizedLastUpdated")
    public void setImageOptimizedLastUpdated(String imageOptimizedLastUpdated) {
        this.imageOptimizedLastUpdated = imageOptimizedLastUpdated;
    }

    public ImageOptimization withImageOptimizedLastUpdated(String imageOptimizedLastUpdated) {
        this.imageOptimizedLastUpdated = imageOptimizedLastUpdated;
        return this;
    }

    @JsonProperty("imageSizeKbOptimized")
    public Double getImageSizeKbOptimized() {
        return imageSizeKbOptimized;
    }

    @JsonProperty("imageSizeKbOptimized")
    public void setImageSizeKbOptimized(Double imageSizeKbOptimized) {
        this.imageSizeKbOptimized = imageSizeKbOptimized;
    }

    public ImageOptimization withImageSizeKbOptimized(Double imageSizeKbOptimized) {
        this.imageSizeKbOptimized = imageSizeKbOptimized;
        return this;
    }

    @JsonProperty("imageSizeKbSource")
    public Double getImageSizeKbSource() {
        return imageSizeKbSource;
    }

    @JsonProperty("imageSizeKbSource")
    public void setImageSizeKbSource(Double imageSizeKbSource) {
        this.imageSizeKbSource = imageSizeKbSource;
    }

    public ImageOptimization withImageSizeKbSource(Double imageSizeKbSource) {
        this.imageSizeKbSource = imageSizeKbSource;
        return this;
    }

    @JsonProperty("imageUrlOptimized")
    public String getImageUrlOptimized() {
        return imageUrlOptimized;
    }

    @JsonProperty("imageUrlOptimized")
    public void setImageUrlOptimized(String imageUrlOptimized) {
        this.imageUrlOptimized = imageUrlOptimized;
    }

    public ImageOptimization withImageUrlOptimized(String imageUrlOptimized) {
        this.imageUrlOptimized = imageUrlOptimized;
        return this;
    }

    @JsonProperty("imageUrlSource")
    public String getImageUrlSource() {
        return imageUrlSource;
    }

    @JsonProperty("imageUrlSource")
    public void setImageUrlSource(String imageUrlSource) {
        this.imageUrlSource = imageUrlSource;
    }

    public ImageOptimization withImageUrlSource(String imageUrlSource) {
        this.imageUrlSource = imageUrlSource;
        return this;
    }

    @JsonProperty("relID")
    public Integer getRelID() {
        return relID;
    }

    @JsonProperty("relID")
    public void setRelID(Integer relID) {
        this.relID = relID;
    }

    public ImageOptimization withRelID(Integer relID) {
        this.relID = relID;
        return this;
    }

    @JsonProperty("relname")
    public String getRelname() {
        return relname;
    }

    @JsonProperty("relname")
    public void setRelname(String relname) {
        this.relname = relname;
    }

    public ImageOptimization withRelname(String relname) {
        this.relname = relname;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ImageOptimization.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("field");
        sb.append('=');
        sb.append(((this.field == null)?"<null>":this.field));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("imageOptimizedComplete");
        sb.append('=');
        sb.append(((this.imageOptimizedComplete == null)?"<null>":this.imageOptimizedComplete));
        sb.append(',');
        sb.append("imageOptimizedLastUpdated");
        sb.append('=');
        sb.append(((this.imageOptimizedLastUpdated == null)?"<null>":this.imageOptimizedLastUpdated));
        sb.append(',');
        sb.append("imageSizeKbOptimized");
        sb.append('=');
        sb.append(((this.imageSizeKbOptimized == null)?"<null>":this.imageSizeKbOptimized));
        sb.append(',');
        sb.append("imageSizeKbSource");
        sb.append('=');
        sb.append(((this.imageSizeKbSource == null)?"<null>":this.imageSizeKbSource));
        sb.append(',');
        sb.append("imageUrlOptimized");
        sb.append('=');
        sb.append(((this.imageUrlOptimized == null)?"<null>":this.imageUrlOptimized));
        sb.append(',');
        sb.append("imageUrlSource");
        sb.append('=');
        sb.append(((this.imageUrlSource == null)?"<null>":this.imageUrlSource));
        sb.append(',');
        sb.append("relID");
        sb.append('=');
        sb.append(((this.relID == null)?"<null>":this.relID));
        sb.append(',');
        sb.append("relname");
        sb.append('=');
        sb.append(((this.relname == null)?"<null>":this.relname));
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
        result = ((result* 31)+((this.imageSizeKbSource == null)? 0 :this.imageSizeKbSource.hashCode()));
        result = ((result* 31)+((this.relID == null)? 0 :this.relID.hashCode()));
        result = ((result* 31)+((this.relname == null)? 0 :this.relname.hashCode()));
        result = ((result* 31)+((this.field == null)? 0 :this.field.hashCode()));
        result = ((result* 31)+((this.imageOptimizedComplete == null)? 0 :this.imageOptimizedComplete.hashCode()));
        result = ((result* 31)+((this.imageOptimizedLastUpdated == null)? 0 :this.imageOptimizedLastUpdated.hashCode()));
        result = ((result* 31)+((this.imageUrlOptimized == null)? 0 :this.imageUrlOptimized.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.imageUrlSource == null)? 0 :this.imageUrlSource.hashCode()));
        result = ((result* 31)+((this.imageSizeKbOptimized == null)? 0 :this.imageSizeKbOptimized.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ImageOptimization) == false) {
            return false;
        }
        ImageOptimization rhs = ((ImageOptimization) other);
        return (((((((((((this.imageSizeKbSource == rhs.imageSizeKbSource)||((this.imageSizeKbSource!= null)&&this.imageSizeKbSource.equals(rhs.imageSizeKbSource)))&&((this.relID == rhs.relID)||((this.relID!= null)&&this.relID.equals(rhs.relID))))&&((this.relname == rhs.relname)||((this.relname!= null)&&this.relname.equals(rhs.relname))))&&((this.field == rhs.field)||((this.field!= null)&&this.field.equals(rhs.field))))&&((this.imageOptimizedComplete == rhs.imageOptimizedComplete)||((this.imageOptimizedComplete!= null)&&this.imageOptimizedComplete.equals(rhs.imageOptimizedComplete))))&&((this.imageOptimizedLastUpdated == rhs.imageOptimizedLastUpdated)||((this.imageOptimizedLastUpdated!= null)&&this.imageOptimizedLastUpdated.equals(rhs.imageOptimizedLastUpdated))))&&((this.imageUrlOptimized == rhs.imageUrlOptimized)||((this.imageUrlOptimized!= null)&&this.imageUrlOptimized.equals(rhs.imageUrlOptimized))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.imageUrlSource == rhs.imageUrlSource)||((this.imageUrlSource!= null)&&this.imageUrlSource.equals(rhs.imageUrlSource))))&&((this.imageSizeKbOptimized == rhs.imageSizeKbOptimized)||((this.imageSizeKbOptimized!= null)&&this.imageSizeKbOptimized.equals(rhs.imageSizeKbOptimized))));
    }

}
