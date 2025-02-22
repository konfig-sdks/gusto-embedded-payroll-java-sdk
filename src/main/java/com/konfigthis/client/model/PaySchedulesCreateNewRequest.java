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
 * 
 */
@ApiModel(description = "")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class PaySchedulesCreateNewRequest {
  /**
   * The frequency that employees on this pay schedule are paid with Gusto.
   */
  @JsonAdapter(FrequencyEnum.Adapter.class)
 public enum FrequencyEnum {
    EVERY_WEEK("Every week"),
    
    EVERY_OTHER_WEEK("Every other week"),
    
    TWICE_PER_MONTH("Twice per month"),
    
    MONTHLY("Monthly");

    private String value;

    FrequencyEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static FrequencyEnum fromValue(String value) {
      for (FrequencyEnum b : FrequencyEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<FrequencyEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final FrequencyEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public FrequencyEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return FrequencyEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_FREQUENCY = "frequency";
  @SerializedName(SERIALIZED_NAME_FREQUENCY)
  private FrequencyEnum frequency;

  public static final String SERIALIZED_NAME_ANCHOR_PAY_DATE = "anchor_pay_date";
  @SerializedName(SERIALIZED_NAME_ANCHOR_PAY_DATE)
  private String anchorPayDate;

  public static final String SERIALIZED_NAME_ANCHOR_END_OF_PAY_PERIOD = "anchor_end_of_pay_period";
  @SerializedName(SERIALIZED_NAME_ANCHOR_END_OF_PAY_PERIOD)
  private String anchorEndOfPayPeriod;

  public static final String SERIALIZED_NAME_DAY1 = "day_1";
  @SerializedName(SERIALIZED_NAME_DAY1)
  private Integer day1;

  public static final String SERIALIZED_NAME_DAY2 = "day_2";
  @SerializedName(SERIALIZED_NAME_DAY2)
  private Integer day2;

  public static final String SERIALIZED_NAME_CUSTOM_NAME = "custom_name";
  @SerializedName(SERIALIZED_NAME_CUSTOM_NAME)
  private String customName;

  public PaySchedulesCreateNewRequest() {
  }

  public PaySchedulesCreateNewRequest frequency(FrequencyEnum frequency) {
    
    
    
    
    this.frequency = frequency;
    return this;
  }

   /**
   * The frequency that employees on this pay schedule are paid with Gusto.
   * @return frequency
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The frequency that employees on this pay schedule are paid with Gusto.")

  public FrequencyEnum getFrequency() {
    return frequency;
  }


  public void setFrequency(FrequencyEnum frequency) {
    
    
    
    this.frequency = frequency;
  }


  public PaySchedulesCreateNewRequest anchorPayDate(String anchorPayDate) {
    
    
    
    
    this.anchorPayDate = anchorPayDate;
    return this;
  }

   /**
   * The first date that employees on this pay schedule are paid with Gusto.
   * @return anchorPayDate
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "2020-05-15", required = true, value = "The first date that employees on this pay schedule are paid with Gusto.")

  public String getAnchorPayDate() {
    return anchorPayDate;
  }


  public void setAnchorPayDate(String anchorPayDate) {
    
    
    
    this.anchorPayDate = anchorPayDate;
  }


  public PaySchedulesCreateNewRequest anchorEndOfPayPeriod(String anchorEndOfPayPeriod) {
    
    
    
    
    this.anchorEndOfPayPeriod = anchorEndOfPayPeriod;
    return this;
  }

   /**
   * The last date of the first pay period. This can be the same date as the anchor pay date.
   * @return anchorEndOfPayPeriod
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "2020-05-08", required = true, value = "The last date of the first pay period. This can be the same date as the anchor pay date.")

  public String getAnchorEndOfPayPeriod() {
    return anchorEndOfPayPeriod;
  }


  public void setAnchorEndOfPayPeriod(String anchorEndOfPayPeriod) {
    
    
    
    this.anchorEndOfPayPeriod = anchorEndOfPayPeriod;
  }


  public PaySchedulesCreateNewRequest day1(Integer day1) {
    
    
    
    
    this.day1 = day1;
    return this;
  }

   /**
   * An integer between 1 and 31 indicating the first day of the month that employees are paid. This field is only relevant for pay schedules with the “Twice per month” and “Monthly” frequencies. It will be null for pay schedules with other frequencies.
   * @return day1
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An integer between 1 and 31 indicating the first day of the month that employees are paid. This field is only relevant for pay schedules with the “Twice per month” and “Monthly” frequencies. It will be null for pay schedules with other frequencies.")

  public Integer getDay1() {
    return day1;
  }


  public void setDay1(Integer day1) {
    
    
    
    this.day1 = day1;
  }


  public PaySchedulesCreateNewRequest day2(Integer day2) {
    
    
    
    
    this.day2 = day2;
    return this;
  }

   /**
   * An integer between 1 and 31 indicating the second day of the month that employees are paid. This field is the second pay date for pay schedules with the \&quot;Twice per month\&quot; frequency. For semi-monthly pay schedules, set this field to 31. For months shorter than 31 days, we will set the second pay date to the last day of the month. It will be null for pay schedules with other frequencies.
   * @return day2
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An integer between 1 and 31 indicating the second day of the month that employees are paid. This field is the second pay date for pay schedules with the \"Twice per month\" frequency. For semi-monthly pay schedules, set this field to 31. For months shorter than 31 days, we will set the second pay date to the last day of the month. It will be null for pay schedules with other frequencies.")

  public Integer getDay2() {
    return day2;
  }


  public void setDay2(Integer day2) {
    
    
    
    this.day2 = day2;
  }


  public PaySchedulesCreateNewRequest customName(String customName) {
    
    
    
    
    this.customName = customName;
    return this;
  }

   /**
   * A custom pay schedule name, defaults to the pay frequency description.
   * @return customName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A custom pay schedule name, defaults to the pay frequency description.")

  public String getCustomName() {
    return customName;
  }


  public void setCustomName(String customName) {
    
    
    
    this.customName = customName;
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
   * @return the PaySchedulesCreateNewRequest instance itself
   */
  public PaySchedulesCreateNewRequest putAdditionalProperty(String key, Object value) {
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
    PaySchedulesCreateNewRequest paySchedulesCreateNewRequest = (PaySchedulesCreateNewRequest) o;
    return Objects.equals(this.frequency, paySchedulesCreateNewRequest.frequency) &&
        Objects.equals(this.anchorPayDate, paySchedulesCreateNewRequest.anchorPayDate) &&
        Objects.equals(this.anchorEndOfPayPeriod, paySchedulesCreateNewRequest.anchorEndOfPayPeriod) &&
        Objects.equals(this.day1, paySchedulesCreateNewRequest.day1) &&
        Objects.equals(this.day2, paySchedulesCreateNewRequest.day2) &&
        Objects.equals(this.customName, paySchedulesCreateNewRequest.customName)&&
        Objects.equals(this.additionalProperties, paySchedulesCreateNewRequest.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(frequency, anchorPayDate, anchorEndOfPayPeriod, day1, day2, customName, additionalProperties);
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
    sb.append("class PaySchedulesCreateNewRequest {\n");
    sb.append("    frequency: ").append(toIndentedString(frequency)).append("\n");
    sb.append("    anchorPayDate: ").append(toIndentedString(anchorPayDate)).append("\n");
    sb.append("    anchorEndOfPayPeriod: ").append(toIndentedString(anchorEndOfPayPeriod)).append("\n");
    sb.append("    day1: ").append(toIndentedString(day1)).append("\n");
    sb.append("    day2: ").append(toIndentedString(day2)).append("\n");
    sb.append("    customName: ").append(toIndentedString(customName)).append("\n");
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
    openapiFields.add("frequency");
    openapiFields.add("anchor_pay_date");
    openapiFields.add("anchor_end_of_pay_period");
    openapiFields.add("day_1");
    openapiFields.add("day_2");
    openapiFields.add("custom_name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("frequency");
    openapiRequiredFields.add("anchor_pay_date");
    openapiRequiredFields.add("anchor_end_of_pay_period");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PaySchedulesCreateNewRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PaySchedulesCreateNewRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PaySchedulesCreateNewRequest is not found in the empty JSON string", PaySchedulesCreateNewRequest.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : PaySchedulesCreateNewRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("frequency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `frequency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("frequency").toString()));
      }
      if (!jsonObj.get("anchor_pay_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `anchor_pay_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("anchor_pay_date").toString()));
      }
      if (!jsonObj.get("anchor_end_of_pay_period").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `anchor_end_of_pay_period` to be a primitive type in the JSON string but got `%s`", jsonObj.get("anchor_end_of_pay_period").toString()));
      }
      if ((jsonObj.get("custom_name") != null && !jsonObj.get("custom_name").isJsonNull()) && !jsonObj.get("custom_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `custom_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("custom_name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PaySchedulesCreateNewRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PaySchedulesCreateNewRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PaySchedulesCreateNewRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PaySchedulesCreateNewRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<PaySchedulesCreateNewRequest>() {
           @Override
           public void write(JsonWriter out, PaySchedulesCreateNewRequest value) throws IOException {
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
           public PaySchedulesCreateNewRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             PaySchedulesCreateNewRequest instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of PaySchedulesCreateNewRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PaySchedulesCreateNewRequest
  * @throws IOException if the JSON string is invalid with respect to PaySchedulesCreateNewRequest
  */
  public static PaySchedulesCreateNewRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PaySchedulesCreateNewRequest.class);
  }

 /**
  * Convert an instance of PaySchedulesCreateNewRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

