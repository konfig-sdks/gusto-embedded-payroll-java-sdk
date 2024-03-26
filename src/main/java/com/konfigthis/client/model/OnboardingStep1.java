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
 * OnboardingStep1
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class OnboardingStep1 {
  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_REQUIRED = "required";
  @SerializedName(SERIALIZED_NAME_REQUIRED)
  private Boolean required;

  public static final String SERIALIZED_NAME_COMPLETED = "completed";
  @SerializedName(SERIALIZED_NAME_COMPLETED)
  private Boolean completed;

  public static final String SERIALIZED_NAME_SKIPPABLE = "skippable";
  @SerializedName(SERIALIZED_NAME_SKIPPABLE)
  private Boolean skippable;

  public static final String SERIALIZED_NAME_REQUIREMENTS = "requirements";
  @SerializedName(SERIALIZED_NAME_REQUIREMENTS)
  private List<String> requirements = null;

  public OnboardingStep1() {
  }

  public OnboardingStep1 title(String title) {
    
    
    
    
    this.title = title;
    return this;
  }

   /**
   * The display name of the onboarding step
   * @return title
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The display name of the onboarding step")

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    
    
    
    this.title = title;
  }


  public OnboardingStep1 id(String id) {
    
    
    
    
    this.id = id;
    return this;
  }

   /**
   * The string identifier for each onboarding step
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The string identifier for each onboarding step")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    
    
    
    this.id = id;
  }


  public OnboardingStep1 required(Boolean required) {
    
    
    
    
    this.required = required;
    return this;
  }

   /**
   * The boolean flag indicating whether the step is required or optional
   * @return required
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The boolean flag indicating whether the step is required or optional")

  public Boolean getRequired() {
    return required;
  }


  public void setRequired(Boolean required) {
    
    
    
    this.required = required;
  }


  public OnboardingStep1 completed(Boolean completed) {
    
    
    
    
    this.completed = completed;
    return this;
  }

   /**
   * The boolean flag indicating whether the step is completed or not.
   * @return completed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The boolean flag indicating whether the step is completed or not.")

  public Boolean getCompleted() {
    return completed;
  }


  public void setCompleted(Boolean completed) {
    
    
    
    this.completed = completed;
  }


  public OnboardingStep1 skippable(Boolean skippable) {
    
    
    
    
    this.skippable = skippable;
    return this;
  }

   /**
   * The boolean flag indicating whether the step can be skipped or not.
   * @return skippable
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The boolean flag indicating whether the step can be skipped or not.")

  public Boolean getSkippable() {
    return skippable;
  }


  public void setSkippable(Boolean skippable) {
    
    
    
    this.skippable = skippable;
  }


  public OnboardingStep1 requirements(List<String> requirements) {
    
    
    
    
    this.requirements = requirements;
    return this;
  }

  public OnboardingStep1 addRequirementsItem(String requirementsItem) {
    if (this.requirements == null) {
      this.requirements = new ArrayList<>();
    }
    this.requirements.add(requirementsItem);
    return this;
  }

   /**
   * A list of onboarding step that are required to be completed in order to proceed with the current onboarding step.
   * @return requirements
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of onboarding step that are required to be completed in order to proceed with the current onboarding step.")

  public List<String> getRequirements() {
    return requirements;
  }


  public void setRequirements(List<String> requirements) {
    
    
    
    this.requirements = requirements;
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
   * @return the OnboardingStep1 instance itself
   */
  public OnboardingStep1 putAdditionalProperty(String key, Object value) {
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
    OnboardingStep1 onboardingStep1 = (OnboardingStep1) o;
    return Objects.equals(this.title, onboardingStep1.title) &&
        Objects.equals(this.id, onboardingStep1.id) &&
        Objects.equals(this.required, onboardingStep1.required) &&
        Objects.equals(this.completed, onboardingStep1.completed) &&
        Objects.equals(this.skippable, onboardingStep1.skippable) &&
        Objects.equals(this.requirements, onboardingStep1.requirements)&&
        Objects.equals(this.additionalProperties, onboardingStep1.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, id, required, completed, skippable, requirements, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OnboardingStep1 {\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    required: ").append(toIndentedString(required)).append("\n");
    sb.append("    completed: ").append(toIndentedString(completed)).append("\n");
    sb.append("    skippable: ").append(toIndentedString(skippable)).append("\n");
    sb.append("    requirements: ").append(toIndentedString(requirements)).append("\n");
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
    openapiFields.add("title");
    openapiFields.add("id");
    openapiFields.add("required");
    openapiFields.add("completed");
    openapiFields.add("skippable");
    openapiFields.add("requirements");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to OnboardingStep1
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!OnboardingStep1.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OnboardingStep1 is not found in the empty JSON string", OnboardingStep1.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("title") != null && !jsonObj.get("title").isJsonNull()) && !jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("requirements") != null && !jsonObj.get("requirements").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `requirements` to be an array in the JSON string but got `%s`", jsonObj.get("requirements").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OnboardingStep1.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OnboardingStep1' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OnboardingStep1> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OnboardingStep1.class));

       return (TypeAdapter<T>) new TypeAdapter<OnboardingStep1>() {
           @Override
           public void write(JsonWriter out, OnboardingStep1 value) throws IOException {
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
           public OnboardingStep1 read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             OnboardingStep1 instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of OnboardingStep1 given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OnboardingStep1
  * @throws IOException if the JSON string is invalid with respect to OnboardingStep1
  */
  public static OnboardingStep1 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OnboardingStep1.class);
  }

 /**
  * Convert an instance of OnboardingStep1 to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

