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
 * ExternalPayrollApplicableTaxesInner
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class ExternalPayrollApplicableTaxesInner {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_EMPLOYER_TAX = "employer_tax";
  @SerializedName(SERIALIZED_NAME_EMPLOYER_TAX)
  private Boolean employerTax;

  public static final String SERIALIZED_NAME_RESIDENT_TAX = "resident_tax";
  @SerializedName(SERIALIZED_NAME_RESIDENT_TAX)
  private Boolean residentTax;

  public ExternalPayrollApplicableTaxesInner() {
  }

  public ExternalPayrollApplicableTaxesInner id(Integer id) {
    
    
    
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    
    
    
    this.id = id;
  }


  public ExternalPayrollApplicableTaxesInner name(String name) {
    
    
    
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    
    
    
    this.name = name;
  }


  public ExternalPayrollApplicableTaxesInner employerTax(Boolean employerTax) {
    
    
    
    
    this.employerTax = employerTax;
    return this;
  }

   /**
   * Some taxes may have an amount withheld from the employee and an amount withheld from the employer, e.g. Social Security. A &#x60;true&#x60; value indicates this is the employer&#39;s amount.
   * @return employerTax
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Some taxes may have an amount withheld from the employee and an amount withheld from the employer, e.g. Social Security. A `true` value indicates this is the employer's amount.")

  public Boolean getEmployerTax() {
    return employerTax;
  }


  public void setEmployerTax(Boolean employerTax) {
    
    
    
    this.employerTax = employerTax;
  }


  public ExternalPayrollApplicableTaxesInner residentTax(Boolean residentTax) {
    
    
    
    
    this.residentTax = residentTax;
    return this;
  }

   /**
   * Some taxes may have different rates or reporting requirements depending on if the employee is a resident or non-resident of the tax jurisdiction.
   * @return residentTax
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Some taxes may have different rates or reporting requirements depending on if the employee is a resident or non-resident of the tax jurisdiction.")

  public Boolean getResidentTax() {
    return residentTax;
  }


  public void setResidentTax(Boolean residentTax) {
    
    
    
    this.residentTax = residentTax;
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
   * @return the ExternalPayrollApplicableTaxesInner instance itself
   */
  public ExternalPayrollApplicableTaxesInner putAdditionalProperty(String key, Object value) {
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
    ExternalPayrollApplicableTaxesInner externalPayrollApplicableTaxesInner = (ExternalPayrollApplicableTaxesInner) o;
    return Objects.equals(this.id, externalPayrollApplicableTaxesInner.id) &&
        Objects.equals(this.name, externalPayrollApplicableTaxesInner.name) &&
        Objects.equals(this.employerTax, externalPayrollApplicableTaxesInner.employerTax) &&
        Objects.equals(this.residentTax, externalPayrollApplicableTaxesInner.residentTax)&&
        Objects.equals(this.additionalProperties, externalPayrollApplicableTaxesInner.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, employerTax, residentTax, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExternalPayrollApplicableTaxesInner {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    employerTax: ").append(toIndentedString(employerTax)).append("\n");
    sb.append("    residentTax: ").append(toIndentedString(residentTax)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("name");
    openapiFields.add("employer_tax");
    openapiFields.add("resident_tax");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ExternalPayrollApplicableTaxesInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ExternalPayrollApplicableTaxesInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ExternalPayrollApplicableTaxesInner is not found in the empty JSON string", ExternalPayrollApplicableTaxesInner.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ExternalPayrollApplicableTaxesInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ExternalPayrollApplicableTaxesInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ExternalPayrollApplicableTaxesInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ExternalPayrollApplicableTaxesInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ExternalPayrollApplicableTaxesInner>() {
           @Override
           public void write(JsonWriter out, ExternalPayrollApplicableTaxesInner value) throws IOException {
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
           public ExternalPayrollApplicableTaxesInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ExternalPayrollApplicableTaxesInner instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ExternalPayrollApplicableTaxesInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ExternalPayrollApplicableTaxesInner
  * @throws IOException if the JSON string is invalid with respect to ExternalPayrollApplicableTaxesInner
  */
  public static ExternalPayrollApplicableTaxesInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ExternalPayrollApplicableTaxesInner.class);
  }

 /**
  * Convert an instance of ExternalPayrollApplicableTaxesInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

