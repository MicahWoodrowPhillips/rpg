
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
    "name",
    "portrait",
    "sheet_template_id",
    "game_id",
    "private",
    "created_at",
    "updated_at",
    "deleted_at",
    "downloaded_at",
    "sheetdata_revision_id",
    "sheet_data"
})
public class PathfinderCharacterFromMythWeavers {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("portrait")
    private String portrait;
    @JsonProperty("sheet_template_id")
    private Integer sheetTemplateId;
    @JsonProperty("game_id")
    private Integer gameId;
    @JsonProperty("private")
    private Integer _private;
    @JsonProperty("created_at")
    private String createdAt;
    @JsonProperty("updated_at")
    private String updatedAt;
    @JsonProperty("deleted_at")
    private Object deletedAt;
    @JsonProperty("downloaded_at")
    private String downloadedAt;
    @JsonProperty("sheetdata_revision_id")
    private String sheetdataRevisionId;
    @JsonProperty("sheet_data")
    private SheetData sheetData;
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

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("portrait")
    public String getPortrait() {
        return portrait;
    }

    @JsonProperty("portrait")
    public void setPortrait(String portrait) {
        this.portrait = portrait;
    }

    @JsonProperty("sheet_template_id")
    public Integer getSheetTemplateId() {
        return sheetTemplateId;
    }

    @JsonProperty("sheet_template_id")
    public void setSheetTemplateId(Integer sheetTemplateId) {
        this.sheetTemplateId = sheetTemplateId;
    }

    @JsonProperty("game_id")
    public Integer getGameId() {
        return gameId;
    }

    @JsonProperty("game_id")
    public void setGameId(Integer gameId) {
        this.gameId = gameId;
    }

    @JsonProperty("private")
    public Integer getPrivate() {
        return _private;
    }

    @JsonProperty("private")
    public void setPrivate(Integer _private) {
        this._private = _private;
    }

    @JsonProperty("created_at")
    public String getCreatedAt() {
        return createdAt;
    }

    @JsonProperty("created_at")
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    @JsonProperty("updated_at")
    public String getUpdatedAt() {
        return updatedAt;
    }

    @JsonProperty("updated_at")
    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    @JsonProperty("deleted_at")
    public Object getDeletedAt() {
        return deletedAt;
    }

    @JsonProperty("deleted_at")
    public void setDeletedAt(Object deletedAt) {
        this.deletedAt = deletedAt;
    }

    @JsonProperty("downloaded_at")
    public String getDownloadedAt() {
        return downloadedAt;
    }

    @JsonProperty("downloaded_at")
    public void setDownloadedAt(String downloadedAt) {
        this.downloadedAt = downloadedAt;
    }

    @JsonProperty("sheetdata_revision_id")
    public String getSheetdataRevisionId() {
        return sheetdataRevisionId;
    }

    @JsonProperty("sheetdata_revision_id")
    public void setSheetdataRevisionId(String sheetdataRevisionId) {
        this.sheetdataRevisionId = sheetdataRevisionId;
    }

    @JsonProperty("sheet_data")
    public SheetData getSheetData() {
        return sheetData;
    }

    @JsonProperty("sheet_data")
    public void setSheetData(SheetData sheetData) {
        this.sheetData = sheetData;
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
