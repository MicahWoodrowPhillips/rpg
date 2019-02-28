
package com.lrg.d20.character.web.pf;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "sheet_id",
    "jsondata"
})
public class SheetData {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("sheet_id")
    private Integer sheetId;
    @JsonProperty("jsondata")
    private Jsondata jsondata;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("sheet_id")
    public Integer getSheetId() {
        return sheetId;
    }

    @JsonProperty("sheet_id")
    public void setSheetId(Integer sheetId) {
        this.sheetId = sheetId;
    }

    @JsonProperty("jsondata")
    public Jsondata getJsondata() {
        return jsondata;
    }

    @JsonProperty("jsondata")
    public void setJsondata(Jsondata jsondata) {
        this.jsondata = jsondata;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
