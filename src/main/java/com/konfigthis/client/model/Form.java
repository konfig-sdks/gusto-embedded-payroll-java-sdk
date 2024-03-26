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
import org.openapitools.jackson.nullable.JsonNullable;

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
 * Form
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class Form {
  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_UUID = "uuid";
  @SerializedName(SERIALIZED_NAME_UUID)
  private String uuid;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DRAFT = "draft";
  @SerializedName(SERIALIZED_NAME_DRAFT)
  private Boolean draft;

  public static final String SERIALIZED_NAME_YEAR = "year";
  @SerializedName(SERIALIZED_NAME_YEAR)
  private Integer year;

  public static final String SERIALIZED_NAME_QUARTER = "quarter";
  @SerializedName(SERIALIZED_NAME_QUARTER)
  private Integer quarter;

  public static final String SERIALIZED_NAME_REQUIRES_SIGNING = "requires_signing";
  @SerializedName(SERIALIZED_NAME_REQUIRES_SIGNING)
  private Boolean requiresSigning;

  public Form() {
  }

  
  public Form(
     String title, 
     String description, 
     String uuid, 
     String name, 
     Boolean draft, 
     Integer year, 
     Integer quarter, 
     Boolean requiresSigning
  ) {
    this();
    this.title = title;
    this.description = description;
    this.uuid = uuid;
    this.name = name;
    this.draft = draft;
    this.year = year;
    this.quarter = quarter;
    this.requiresSigning = requiresSigning;
  }

   /**
   * The title of the form
   * @return title
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Direct Deposit Authorization", value = "The title of the form")

  public String getTitle() {
    return title;
  }




   /**
   * The description of the form
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "We need you to sign paperwork to authorize us to debit and credit your bank account and file and pay your taxes.", value = "The description of the form")

  public String getDescription() {
    return description;
  }




   /**
   * The UUID of the form
   * @return uuid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "48cdd5ec-a4dd-4840-a424-ad79f38d8408", value = "The UUID of the form")

  public String getUuid() {
    return uuid;
  }




   /**
   * The type identifier of the form
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "company_direct_deposit", value = "The type identifier of the form")

  public String getName() {
    return name;
  }




   /**
   * If the form is in a draft state. E.g. End of year tax forms may be provided in a draft state prior to being finalized.
   * @return draft
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If the form is in a draft state. E.g. End of year tax forms may be provided in a draft state prior to being finalized.")

  public Boolean getDraft() {
    return draft;
  }




   /**
   * The year of this form. For some forms, e.g. tax forms, this is the year which the form represents. A W2 for January - December 2022 would be delivered in January 2023 and have a year value of 2022. This value is nullable and will not be present on all forms.
   * @return year
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The year of this form. For some forms, e.g. tax forms, this is the year which the form represents. A W2 for January - December 2022 would be delivered in January 2023 and have a year value of 2022. This value is nullable and will not be present on all forms.")

  public Integer getYear() {
    return year;
  }




   /**
   * The quarter of this form. For some forms, e.g. tax forms, this is the calendar quarter which this form represents. An Employer&#39;s Quarterly Federal Tax Return (Form 941) for April, May, June 2022 would have a quarter value of 2 (and a year value of 2022). This value is nullable and will not be present on all forms.
   * @return quarter
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The quarter of this form. For some forms, e.g. tax forms, this is the calendar quarter which this form represents. An Employer's Quarterly Federal Tax Return (Form 941) for April, May, June 2022 would have a quarter value of 2 (and a year value of 2022). This value is nullable and will not be present on all forms.")

  public Integer getQuarter() {
    return quarter;
  }




   /**
   * A boolean flag that indicates whether the form needs signing or not. Note that this value will change after the form is signed.
   * @return requiresSigning
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "A boolean flag that indicates whether the form needs signing or not. Note that this value will change after the form is signed.")

  public Boolean getRequiresSigning() {
    return requiresSigning;
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
   * @return the Form instance itself
   */
  public Form putAdditionalProperty(String key, Object value) {
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
    Form form = (Form) o;
    return Objects.equals(this.title, form.title) &&
        Objects.equals(this.description, form.description) &&
        Objects.equals(this.uuid, form.uuid) &&
        Objects.equals(this.name, form.name) &&
        Objects.equals(this.draft, form.draft) &&
        Objects.equals(this.year, form.year) &&
        Objects.equals(this.quarter, form.quarter) &&
        Objects.equals(this.requiresSigning, form.requiresSigning)&&
        Objects.equals(this.additionalProperties, form.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, description, uuid, name, draft, year, quarter, requiresSigning, additionalProperties);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Form {\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    draft: ").append(toIndentedString(draft)).append("\n");
    sb.append("    year: ").append(toIndentedString(year)).append("\n");
    sb.append("    quarter: ").append(toIndentedString(quarter)).append("\n");
    sb.append("    requiresSigning: ").append(toIndentedString(requiresSigning)).append("\n");
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
    openapiFields.add("description");
    openapiFields.add("uuid");
    openapiFields.add("name");
    openapiFields.add("draft");
    openapiFields.add("year");
    openapiFields.add("quarter");
    openapiFields.add("requires_signing");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Form
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Form.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Form is not found in the empty JSON string", Form.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("title") != null && !jsonObj.get("title").isJsonNull()) && !jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("uuid") != null && !jsonObj.get("uuid").isJsonNull()) && !jsonObj.get("uuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uuid").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Form.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Form' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Form> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Form.class));

       return (TypeAdapter<T>) new TypeAdapter<Form>() {
           @Override
           public void write(JsonWriter out, Form value) throws IOException {
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
           public Form read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             Form instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of Form given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Form
  * @throws IOException if the JSON string is invalid with respect to Form
  */
  public static Form fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Form.class);
  }

 /**
  * Convert an instance of Form to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

