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
import com.konfigthis.client.model.PaySchedulesPreviewPayScheduleDatesResponsePayPeriodsInner;
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
 * Pay schedule preview
 */
@ApiModel(description = "Pay schedule preview")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class PaySchedulesPreviewPayScheduleDatesResponse {
  public static final String SERIALIZED_NAME_PAY_PERIODS = "pay_periods";
  @SerializedName(SERIALIZED_NAME_PAY_PERIODS)
  private List<PaySchedulesPreviewPayScheduleDatesResponsePayPeriodsInner> payPeriods = null;

  public static final String SERIALIZED_NAME_HOLIDAYS = "holidays";
  @SerializedName(SERIALIZED_NAME_HOLIDAYS)
  private List<String> holidays = null;

  public PaySchedulesPreviewPayScheduleDatesResponse() {
  }

  public PaySchedulesPreviewPayScheduleDatesResponse payPeriods(List<PaySchedulesPreviewPayScheduleDatesResponsePayPeriodsInner> payPeriods) {
    
    
    
    
    this.payPeriods = payPeriods;
    return this;
  }

  public PaySchedulesPreviewPayScheduleDatesResponse addPayPeriodsItem(PaySchedulesPreviewPayScheduleDatesResponsePayPeriodsInner payPeriodsItem) {
    if (this.payPeriods == null) {
      this.payPeriods = new ArrayList<>();
    }
    this.payPeriods.add(payPeriodsItem);
    return this;
  }

   /**
   * A list of pay periods for the previewed pay schedule
   * @return payPeriods
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of pay periods for the previewed pay schedule")

  public List<PaySchedulesPreviewPayScheduleDatesResponsePayPeriodsInner> getPayPeriods() {
    return payPeriods;
  }


  public void setPayPeriods(List<PaySchedulesPreviewPayScheduleDatesResponsePayPeriodsInner> payPeriods) {
    
    
    
    this.payPeriods = payPeriods;
  }


  public PaySchedulesPreviewPayScheduleDatesResponse holidays(List<String> holidays) {
    
    
    
    
    this.holidays = holidays;
    return this;
  }

  public PaySchedulesPreviewPayScheduleDatesResponse addHolidaysItem(String holidaysItem) {
    if (this.holidays == null) {
      this.holidays = new ArrayList<>();
    }
    this.holidays.add(holidaysItem);
    return this;
  }

   /**
   * A list of dates for bank closures
   * @return holidays
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of dates for bank closures")

  public List<String> getHolidays() {
    return holidays;
  }


  public void setHolidays(List<String> holidays) {
    
    
    
    this.holidays = holidays;
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
   * @return the PaySchedulesPreviewPayScheduleDatesResponse instance itself
   */
  public PaySchedulesPreviewPayScheduleDatesResponse putAdditionalProperty(String key, Object value) {
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
    PaySchedulesPreviewPayScheduleDatesResponse paySchedulesPreviewPayScheduleDatesResponse = (PaySchedulesPreviewPayScheduleDatesResponse) o;
    return Objects.equals(this.payPeriods, paySchedulesPreviewPayScheduleDatesResponse.payPeriods) &&
        Objects.equals(this.holidays, paySchedulesPreviewPayScheduleDatesResponse.holidays)&&
        Objects.equals(this.additionalProperties, paySchedulesPreviewPayScheduleDatesResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(payPeriods, holidays, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaySchedulesPreviewPayScheduleDatesResponse {\n");
    sb.append("    payPeriods: ").append(toIndentedString(payPeriods)).append("\n");
    sb.append("    holidays: ").append(toIndentedString(holidays)).append("\n");
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
    openapiFields.add("pay_periods");
    openapiFields.add("holidays");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PaySchedulesPreviewPayScheduleDatesResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PaySchedulesPreviewPayScheduleDatesResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PaySchedulesPreviewPayScheduleDatesResponse is not found in the empty JSON string", PaySchedulesPreviewPayScheduleDatesResponse.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("pay_periods") != null && !jsonObj.get("pay_periods").isJsonNull()) {
        JsonArray jsonArraypayPeriods = jsonObj.getAsJsonArray("pay_periods");
        if (jsonArraypayPeriods != null) {
          // ensure the json data is an array
          if (!jsonObj.get("pay_periods").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `pay_periods` to be an array in the JSON string but got `%s`", jsonObj.get("pay_periods").toString()));
          }

          // validate the optional field `pay_periods` (array)
          for (int i = 0; i < jsonArraypayPeriods.size(); i++) {
            PaySchedulesPreviewPayScheduleDatesResponsePayPeriodsInner.validateJsonObject(jsonArraypayPeriods.get(i).getAsJsonObject());
          };
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("holidays") != null && !jsonObj.get("holidays").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `holidays` to be an array in the JSON string but got `%s`", jsonObj.get("holidays").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PaySchedulesPreviewPayScheduleDatesResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PaySchedulesPreviewPayScheduleDatesResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PaySchedulesPreviewPayScheduleDatesResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PaySchedulesPreviewPayScheduleDatesResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<PaySchedulesPreviewPayScheduleDatesResponse>() {
           @Override
           public void write(JsonWriter out, PaySchedulesPreviewPayScheduleDatesResponse value) throws IOException {
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
           public PaySchedulesPreviewPayScheduleDatesResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             PaySchedulesPreviewPayScheduleDatesResponse instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of PaySchedulesPreviewPayScheduleDatesResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PaySchedulesPreviewPayScheduleDatesResponse
  * @throws IOException if the JSON string is invalid with respect to PaySchedulesPreviewPayScheduleDatesResponse
  */
  public static PaySchedulesPreviewPayScheduleDatesResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PaySchedulesPreviewPayScheduleDatesResponse.class);
  }

 /**
  * Convert an instance of PaySchedulesPreviewPayScheduleDatesResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

