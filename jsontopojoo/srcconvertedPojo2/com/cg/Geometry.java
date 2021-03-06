
package com.cg;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type",
    "coordinates",
    "geometries"
})
public class Geometry {

    @JsonProperty("type")
    private String type;
    @JsonProperty("coordinates")
    private List<List<List<List<Double>>>> coordinates = new ArrayList<List<List<List<Double>>>>();
    @JsonProperty("geometries")
    private List<Geometry_> geometries = new ArrayList<Geometry_>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    public Geometry withType(String type) {
        this.type = type;
        return this;
    }

    @JsonProperty("coordinates")
    public List<List<List<List<Double>>>> getCoordinates() {
        return coordinates;
    }

    @JsonProperty("coordinates")
    public void setCoordinates(List<List<List<List<Double>>>> coordinates) {
        this.coordinates = coordinates;
    }

    public Geometry withCoordinates(List<List<List<List<Double>>>> coordinates) {
        this.coordinates = coordinates;
        return this;
    }

    @JsonProperty("geometries")
    public List<Geometry_> getGeometries() {
        return geometries;
    }

    @JsonProperty("geometries")
    public void setGeometries(List<Geometry_> geometries) {
        this.geometries = geometries;
    }

    public Geometry withGeometries(List<Geometry_> geometries) {
        this.geometries = geometries;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public Geometry withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(type).append(coordinates).append(geometries).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Geometry) == false) {
            return false;
        }
        Geometry rhs = ((Geometry) other);
        return new EqualsBuilder().append(type, rhs.type).append(coordinates, rhs.coordinates).append(geometries, rhs.geometries).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
