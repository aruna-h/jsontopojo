
package com.cg;

import java.util.HashMap;
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
    "foo",
    "bar",
    "baz"
})
public class Properties {

    @JsonProperty("foo")
    private Foo foo;
    @JsonProperty("bar")
    private Bar bar;
    @JsonProperty("baz")
    private Baz baz;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("foo")
    public Foo getFoo() {
        return foo;
    }

    @JsonProperty("foo")
    public void setFoo(Foo foo) {
        this.foo = foo;
    }

    public Properties withFoo(Foo foo) {
        this.foo = foo;
        return this;
    }

    @JsonProperty("bar")
    public Bar getBar() {
        return bar;
    }

    @JsonProperty("bar")
    public void setBar(Bar bar) {
        this.bar = bar;
    }

    public Properties withBar(Bar bar) {
        this.bar = bar;
        return this;
    }

    @JsonProperty("baz")
    public Baz getBaz() {
        return baz;
    }

    @JsonProperty("baz")
    public void setBaz(Baz baz) {
        this.baz = baz;
    }

    public Properties withBaz(Baz baz) {
        this.baz = baz;
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

    public Properties withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(foo).append(bar).append(baz).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Properties) == false) {
            return false;
        }
        Properties rhs = ((Properties) other);
        return new EqualsBuilder().append(foo, rhs.foo).append(bar, rhs.bar).append(baz, rhs.baz).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
