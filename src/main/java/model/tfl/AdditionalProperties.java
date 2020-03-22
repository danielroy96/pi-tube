package model.tfl;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AdditionalProperties {

    private String category;

    private String key;

    private String sourceSystemKey;

    private String value;

    private String modified;

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getSourceSystemKey() {
        return sourceSystemKey;
    }

    public void setSourceSystemKey(String sourceSystemKey) {
        this.sourceSystemKey = sourceSystemKey;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getModified() {
        return modified;
    }

    public void setModified(String modified) {
        this.modified = modified;
    }
}
