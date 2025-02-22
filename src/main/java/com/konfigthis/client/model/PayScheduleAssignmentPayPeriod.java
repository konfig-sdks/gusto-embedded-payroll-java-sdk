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
 * Pay schedule assignment first pay period information.
 */
@ApiModel(description = "Pay schedule assignment first pay period information.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class PayScheduleAssignmentPayPeriod {
  public static final String SERIALIZED_NAME_PAY_SCHEDULE_UUID = "pay_schedule_uuid";
  @SerializedName(SERIALIZED_NAME_PAY_SCHEDULE_UUID)
  private String payScheduleUuid;

  public static final String SERIALIZED_NAME_START_DATE = "start_date";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private String startDate;

  public static final String SERIALIZED_NAME_END_DATE = "end_date";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  private String endDate;

  public static final String SERIALIZED_NAME_CHECK_DATE = "check_date";
  @SerializedName(SERIALIZED_NAME_CHECK_DATE)
  private String checkDate;

  public PayScheduleAssignmentPayPeriod() {
  }

  public PayScheduleAssignmentPayPeriod payScheduleUuid(String payScheduleUuid) {
    
    
    
    
    this.payScheduleUuid = payScheduleUuid;
    return this;
  }

   /**
   * The pay schedule UUID.
   * @return payScheduleUuid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "3f029a58-155d-4c30-8361-cc266b2c1f11", value = "The pay schedule UUID.")

  public String getPayScheduleUuid() {
    return payScheduleUuid;
  }


  public void setPayScheduleUuid(String payScheduleUuid) {
    
    
    
    this.payScheduleUuid = payScheduleUuid;
  }


  public PayScheduleAssignmentPayPeriod startDate(String startDate) {
    
    
    
    
    this.startDate = startDate;
    return this;
  }

   /**
   * Pay period start date.
   * @return startDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2023-07-01", value = "Pay period start date.")

  public String getStartDate() {
    return startDate;
  }


  public void setStartDate(String startDate) {
    
    
    
    this.startDate = startDate;
  }


  public PayScheduleAssignmentPayPeriod endDate(String endDate) {
    
    
    
    
    this.endDate = endDate;
    return this;
  }

   /**
   * Pay period end date.
   * @return endDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2023-08-01", value = "Pay period end date.")

  public String getEndDate() {
    return endDate;
  }


  public void setEndDate(String endDate) {
    
    
    
    this.endDate = endDate;
  }


  public PayScheduleAssignmentPayPeriod checkDate(String checkDate) {
    
    
    
    
    this.checkDate = checkDate;
    return this;
  }

   /**
   * Pay period check date.
   * @return checkDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2023-08-02", value = "Pay period check date.")

  public String getCheckDate() {
    return checkDate;
  }


  public void setCheckDate(String checkDate) {
    
    
    
    this.checkDate = checkDate;
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
   * @return the PayScheduleAssignmentPayPeriod instance itself
   */
  public PayScheduleAssignmentPayPeriod putAdditionalProperty(String key, Object value) {
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
    PayScheduleAssignmentPayPeriod payScheduleAssignmentPayPeriod = (PayScheduleAssignmentPayPeriod) o;
    return Objects.equals(this.payScheduleUuid, payScheduleAssignmentPayPeriod.payScheduleUuid) &&
        Objects.equals(this.startDate, payScheduleAssignmentPayPeriod.startDate) &&
        Objects.equals(this.endDate, payScheduleAssignmentPayPeriod.endDate) &&
        Objects.equals(this.checkDate, payScheduleAssignmentPayPeriod.checkDate)&&
        Objects.equals(this.additionalProperties, payScheduleAssignmentPayPeriod.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(payScheduleUuid, startDate, endDate, checkDate, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayScheduleAssignmentPayPeriod {\n");
    sb.append("    payScheduleUuid: ").append(toIndentedString(payScheduleUuid)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    checkDate: ").append(toIndentedString(checkDate)).append("\n");
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
    openapiFields.add("pay_schedule_uuid");
    openapiFields.add("start_date");
    openapiFields.add("end_date");
    openapiFields.add("check_date");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PayScheduleAssignmentPayPeriod
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PayScheduleAssignmentPayPeriod.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PayScheduleAssignmentPayPeriod is not found in the empty JSON string", PayScheduleAssignmentPayPeriod.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("pay_schedule_uuid") != null && !jsonObj.get("pay_schedule_uuid").isJsonNull()) && !jsonObj.get("pay_schedule_uuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pay_schedule_uuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pay_schedule_uuid").toString()));
      }
      if ((jsonObj.get("start_date") != null && !jsonObj.get("start_date").isJsonNull()) && !jsonObj.get("start_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `start_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("start_date").toString()));
      }
      if ((jsonObj.get("end_date") != null && !jsonObj.get("end_date").isJsonNull()) && !jsonObj.get("end_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `end_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("end_date").toString()));
      }
      if ((jsonObj.get("check_date") != null && !jsonObj.get("check_date").isJsonNull()) && !jsonObj.get("check_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `check_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("check_date").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PayScheduleAssignmentPayPeriod.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PayScheduleAssignmentPayPeriod' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PayScheduleAssignmentPayPeriod> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PayScheduleAssignmentPayPeriod.class));

       return (TypeAdapter<T>) new TypeAdapter<PayScheduleAssignmentPayPeriod>() {
           @Override
           public void write(JsonWriter out, PayScheduleAssignmentPayPeriod value) throws IOException {
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
           public PayScheduleAssignmentPayPeriod read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             PayScheduleAssignmentPayPeriod instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of PayScheduleAssignmentPayPeriod given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PayScheduleAssignmentPayPeriod
  * @throws IOException if the JSON string is invalid with respect to PayScheduleAssignmentPayPeriod
  */
  public static PayScheduleAssignmentPayPeriod fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PayScheduleAssignmentPayPeriod.class);
  }

 /**
  * Convert an instance of PayScheduleAssignmentPayPeriod to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

