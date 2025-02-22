/*
 * Gusto API
 * Welcome to Gusto's Embedded Payroll API documentation!
 *
 * The version of the OpenAPI document: 2024-03-01
 * Contact: developer@gusto.com
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.konfigthis.client.model.TaxRequirementSet;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.konfigthis.client.JSON;

/**
 * 
 */
@ApiModel(description = "")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class TaxRequirementsState {
  public static final String SERIALIZED_NAME_COMPANY_UUID = "company_uuid";
  @SerializedName(SERIALIZED_NAME_COMPANY_UUID)
  private String companyUuid;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private String state;

  public static final String SERIALIZED_NAME_REQUIREMENT_SETS = "requirement_sets";
  @SerializedName(SERIALIZED_NAME_REQUIREMENT_SETS)
  private List<TaxRequirementSet> requirementSets = null;

  public TaxRequirementsState() {
  }

  public TaxRequirementsState companyUuid(String companyUuid) {
    
    
    
    
    this.companyUuid = companyUuid;
    return this;
  }

   /**
   * Get companyUuid
   * @return companyUuid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "6c14eac3-0da2-474d-bda1-786b3602d381", value = "")

  public String getCompanyUuid() {
    return companyUuid;
  }


  public void setCompanyUuid(String companyUuid) {
    
    
    
    this.companyUuid = companyUuid;
  }


  public TaxRequirementsState state(String state) {
    
    
    
    
    this.state = state;
    return this;
  }

   /**
   * One of the two-letter state abbreviations for the fifty United States and the District of Columbia (DC)
   * @return state
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "GA", value = "One of the two-letter state abbreviations for the fifty United States and the District of Columbia (DC)")

  public String getState() {
    return state;
  }


  public void setState(String state) {
    
    
    
    this.state = state;
  }


  public TaxRequirementsState requirementSets(List<TaxRequirementSet> requirementSets) {
    
    
    
    
    this.requirementSets = requirementSets;
    return this;
  }

  public TaxRequirementsState addRequirementSetsItem(TaxRequirementSet requirementSetsItem) {
    if (this.requirementSets == null) {
      this.requirementSets = new ArrayList<>();
    }
    this.requirementSets.add(requirementSetsItem);
    return this;
  }

   /**
   * Get requirementSets
   * @return requirementSets
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<TaxRequirementSet> getRequirementSets() {
    return requirementSets;
  }


  public void setRequirementSets(List<TaxRequirementSet> requirementSets) {
    
    
    
    this.requirementSets = requirementSets;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the TaxRequirementsState instance itself
   */
  public TaxRequirementsState putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaxRequirementsState taxRequirementsState = (TaxRequirementsState) o;
    return Objects.equals(this.companyUuid, taxRequirementsState.companyUuid) &&
        Objects.equals(this.state, taxRequirementsState.state) &&
        Objects.equals(this.requirementSets, taxRequirementsState.requirementSets)&&
        Objects.equals(this.additionalProperties, taxRequirementsState.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(companyUuid, state, requirementSets, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaxRequirementsState {\n");
    sb.append("    companyUuid: ").append(toIndentedString(companyUuid)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    requirementSets: ").append(toIndentedString(requirementSets)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("company_uuid");
    openapiFields.add("state");
    openapiFields.add("requirement_sets");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TaxRequirementsState
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!TaxRequirementsState.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TaxRequirementsState is not found in the empty JSON string", TaxRequirementsState.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("company_uuid") != null && !jsonObj.get("company_uuid").isJsonNull()) && !jsonObj.get("company_uuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `company_uuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("company_uuid").toString()));
      }
      if ((jsonObj.get("state") != null && !jsonObj.get("state").isJsonNull()) && !jsonObj.get("state").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `state` to be a primitive type in the JSON string but got `%s`", jsonObj.get("state").toString()));
      }
      if (jsonObj.get("requirement_sets") != null && !jsonObj.get("requirement_sets").isJsonNull()) {
        JsonArray jsonArrayrequirementSets = jsonObj.getAsJsonArray("requirement_sets");
        if (jsonArrayrequirementSets != null) {
          // ensure the json data is an array
          if (!jsonObj.get("requirement_sets").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `requirement_sets` to be an array in the JSON string but got `%s`", jsonObj.get("requirement_sets").toString()));
          }

          // validate the optional field `requirement_sets` (array)
          for (int i = 0; i < jsonArrayrequirementSets.size(); i++) {
            TaxRequirementSet.validateJsonObject(jsonArrayrequirementSets.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TaxRequirementsState.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TaxRequirementsState' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TaxRequirementsState> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TaxRequirementsState.class));

       return (TypeAdapter<T>) new TypeAdapter<TaxRequirementsState>() {
           @Override
           public void write(JsonWriter out, TaxRequirementsState value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additonal properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public TaxRequirementsState read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             TaxRequirementsState instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TaxRequirementsState given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TaxRequirementsState
  * @throws IOException if the JSON string is invalid with respect to TaxRequirementsState
  */
  public static TaxRequirementsState fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TaxRequirementsState.class);
  }

 /**
  * Convert an instance of TaxRequirementsState to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

