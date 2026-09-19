
package five.min.markets.poly.model;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "line",
    "lineType"
})
@Generated("jsonschema2pojo")
public class BestLine {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("id")
    private String id;
    @JsonProperty("line")
    private Double line;
    @JsonProperty("lineType")
    private String lineType;

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

    public BestLine withId(String id) {
        this.id = id;
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

    public BestLine withLine(Double line) {
        this.line = line;
        return this;
    }

    @JsonProperty("lineType")
    public String getLineType() {
        return lineType;
    }

    @JsonProperty("lineType")
    public void setLineType(String lineType) {
        this.lineType = lineType;
    }

    public BestLine withLineType(String lineType) {
        this.lineType = lineType;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(BestLine.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("line");
        sb.append('=');
        sb.append(((this.line == null)?"<null>":this.line));
        sb.append(',');
        sb.append("lineType");
        sb.append('=');
        sb.append(((this.lineType == null)?"<null>":this.lineType));
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
        result = ((result* 31)+((this.line == null)? 0 :this.line.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.lineType == null)? 0 :this.lineType.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof BestLine) == false) {
            return false;
        }
        BestLine rhs = ((BestLine) other);
        return ((((this.line == rhs.line)||((this.line!= null)&&this.line.equals(rhs.line)))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.lineType == rhs.lineType)||((this.lineType!= null)&&this.lineType.equals(rhs.lineType))));
    }

}
