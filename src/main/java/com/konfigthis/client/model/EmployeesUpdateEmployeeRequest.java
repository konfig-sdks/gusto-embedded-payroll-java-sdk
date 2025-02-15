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
 * 
 */
@ApiModel(description = "")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class EmployeesUpdateEmployeeRequest {
  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private String version;

  public static final String SERIALIZED_NAME_FIRST_NAME = "first_name";
  @SerializedName(SERIALIZED_NAME_FIRST_NAME)
  private String firstName;

  public static final String SERIALIZED_NAME_MIDDLE_INITIAL = "middle_initial";
  @SerializedName(SERIALIZED_NAME_MIDDLE_INITIAL)
  private String middleInitial;

  public static final String SERIALIZED_NAME_LAST_NAME = "last_name";
  @SerializedName(SERIALIZED_NAME_LAST_NAME)
  private String lastName;

  public static final String SERIALIZED_NAME_DATE_OF_BIRTH = "date_of_birth";
  @SerializedName(SERIALIZED_NAME_DATE_OF_BIRTH)
  private String dateOfBirth;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_SSN = "ssn";
  @SerializedName(SERIALIZED_NAME_SSN)
  private String ssn;

  public static final String SERIALIZED_NAME_TWO_PERCENT_SHAREHOLDER = "two_percent_shareholder";
  @SerializedName(SERIALIZED_NAME_TWO_PERCENT_SHAREHOLDER)
  private Boolean twoPercentShareholder;

  public EmployeesUpdateEmployeeRequest() {
  }

  public EmployeesUpdateEmployeeRequest version(String version) {
    
    
    
    
    this.version = version;
    return this;
  }

   /**
   * The current version of the object. See the [versioning guide](https://docs.gusto.com/embedded-payroll/docs/versioning#object-layer) for information on how to use this field.
   * @return version
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The current version of the object. See the [versioning guide](https://docs.gusto.com/embedded-payroll/docs/versioning#object-layer) for information on how to use this field.")

  public String getVersion() {
    return version;
  }


  public void setVersion(String version) {
    
    
    
    this.version = version;
  }


  public EmployeesUpdateEmployeeRequest firstName(String firstName) {
    
    
    
    
    this.firstName = firstName;
    return this;
  }

   /**
   * Get firstName
   * @return firstName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getFirstName() {
    return firstName;
  }


  public void setFirstName(String firstName) {
    
    
    
    this.firstName = firstName;
  }


  public EmployeesUpdateEmployeeRequest middleInitial(String middleInitial) {
    
    
    
    
    this.middleInitial = middleInitial;
    return this;
  }

   /**
   * Get middleInitial
   * @return middleInitial
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMiddleInitial() {
    return middleInitial;
  }


  public void setMiddleInitial(String middleInitial) {
    
    
    
    this.middleInitial = middleInitial;
  }


  public EmployeesUpdateEmployeeRequest lastName(String lastName) {
    
    
    
    
    this.lastName = lastName;
    return this;
  }

   /**
   * Get lastName
   * @return lastName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLastName() {
    return lastName;
  }


  public void setLastName(String lastName) {
    
    
    
    this.lastName = lastName;
  }


  public EmployeesUpdateEmployeeRequest dateOfBirth(String dateOfBirth) {
    
    
    
    
    this.dateOfBirth = dateOfBirth;
    return this;
  }

   /**
   * Get dateOfBirth
   * @return dateOfBirth
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDateOfBirth() {
    return dateOfBirth;
  }


  public void setDateOfBirth(String dateOfBirth) {
    
    
    
    this.dateOfBirth = dateOfBirth;
  }


  public EmployeesUpdateEmployeeRequest email(String email) {
    
    
    
    
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    
    
    
    this.email = email;
  }


  public EmployeesUpdateEmployeeRequest ssn(String ssn) {
    
    
    
    
    this.ssn = ssn;
    return this;
  }

   /**
   * Get ssn
   * @return ssn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSsn() {
    return ssn;
  }


  public void setSsn(String ssn) {
    
    
    
    this.ssn = ssn;
  }


  public EmployeesUpdateEmployeeRequest twoPercentShareholder(Boolean twoPercentShareholder) {
    
    
    
    
    this.twoPercentShareholder = twoPercentShareholder;
    return this;
  }

   /**
   * Whether the employee is a two percent shareholder of the company. This field only applies to companies with an S-Corp entity type.
   * @return twoPercentShareholder
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether the employee is a two percent shareholder of the company. This field only applies to companies with an S-Corp entity type.")

  public Boolean getTwoPercentShareholder() {
    return twoPercentShareholder;
  }


  public void setTwoPercentShareholder(Boolean twoPercentShareholder) {
    
    
    
    this.twoPercentShareholder = twoPercentShareholder;
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
   * @return the EmployeesUpdateEmployeeRequest instance itself
   */
  public EmployeesUpdateEmployeeRequest putAdditionalProperty(String key, Object value) {
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
    EmployeesUpdateEmployeeRequest employeesUpdateEmployeeRequest = (EmployeesUpdateEmployeeRequest) o;
    return Objects.equals(this.version, employeesUpdateEmployeeRequest.version) &&
        Objects.equals(this.firstName, employeesUpdateEmployeeRequest.firstName) &&
        Objects.equals(this.middleInitial, employeesUpdateEmployeeRequest.middleInitial) &&
        Objects.equals(this.lastName, employeesUpdateEmployeeRequest.lastName) &&
        Objects.equals(this.dateOfBirth, employeesUpdateEmployeeRequest.dateOfBirth) &&
        Objects.equals(this.email, employeesUpdateEmployeeRequest.email) &&
        Objects.equals(this.ssn, employeesUpdateEmployeeRequest.ssn) &&
        Objects.equals(this.twoPercentShareholder, employeesUpdateEmployeeRequest.twoPercentShareholder)&&
        Objects.equals(this.additionalProperties, employeesUpdateEmployeeRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(version, firstName, middleInitial, lastName, dateOfBirth, email, ssn, twoPercentShareholder, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmployeesUpdateEmployeeRequest {\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    middleInitial: ").append(toIndentedString(middleInitial)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    dateOfBirth: ").append(toIndentedString(dateOfBirth)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    ssn: ").append(toIndentedString(ssn)).append("\n");
    sb.append("    twoPercentShareholder: ").append(toIndentedString(twoPercentShareholder)).append("\n");
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
    openapiFields.add("version");
    openapiFields.add("first_name");
    openapiFields.add("middle_initial");
    openapiFields.add("last_name");
    openapiFields.add("date_of_birth");
    openapiFields.add("email");
    openapiFields.add("ssn");
    openapiFields.add("two_percent_shareholder");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("version");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to EmployeesUpdateEmployeeRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!EmployeesUpdateEmployeeRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EmployeesUpdateEmployeeRequest is not found in the empty JSON string", EmployeesUpdateEmployeeRequest.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : EmployeesUpdateEmployeeRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("version").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `version` to be a primitive type in the JSON string but got `%s`", jsonObj.get("version").toString()));
      }
      if ((jsonObj.get("first_name") != null && !jsonObj.get("first_name").isJsonNull()) && !jsonObj.get("first_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `first_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("first_name").toString()));
      }
      if ((jsonObj.get("middle_initial") != null && !jsonObj.get("middle_initial").isJsonNull()) && !jsonObj.get("middle_initial").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `middle_initial` to be a primitive type in the JSON string but got `%s`", jsonObj.get("middle_initial").toString()));
      }
      if ((jsonObj.get("last_name") != null && !jsonObj.get("last_name").isJsonNull()) && !jsonObj.get("last_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `last_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("last_name").toString()));
      }
      if ((jsonObj.get("date_of_birth") != null && !jsonObj.get("date_of_birth").isJsonNull()) && !jsonObj.get("date_of_birth").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `date_of_birth` to be a primitive type in the JSON string but got `%s`", jsonObj.get("date_of_birth").toString()));
      }
      if ((jsonObj.get("email") != null && !jsonObj.get("email").isJsonNull()) && !jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      if ((jsonObj.get("ssn") != null && !jsonObj.get("ssn").isJsonNull()) && !jsonObj.get("ssn").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ssn` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ssn").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EmployeesUpdateEmployeeRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EmployeesUpdateEmployeeRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EmployeesUpdateEmployeeRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EmployeesUpdateEmployeeRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<EmployeesUpdateEmployeeRequest>() {
           @Override
           public void write(JsonWriter out, EmployeesUpdateEmployeeRequest value) throws IOException {
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
           public EmployeesUpdateEmployeeRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             EmployeesUpdateEmployeeRequest instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of EmployeesUpdateEmployeeRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EmployeesUpdateEmployeeRequest
  * @throws IOException if the JSON string is invalid with respect to EmployeesUpdateEmployeeRequest
  */
  public static EmployeesUpdateEmployeeRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EmployeesUpdateEmployeeRequest.class);
  }

 /**
  * Convert an instance of EmployeesUpdateEmployeeRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

