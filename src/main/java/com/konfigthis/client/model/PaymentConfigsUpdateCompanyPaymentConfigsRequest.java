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
public class PaymentConfigsUpdateCompanyPaymentConfigsRequest {
  public static final String SERIALIZED_NAME_FAST_PAYMENT_LIMIT = "fast_payment_limit";
  @SerializedName(SERIALIZED_NAME_FAST_PAYMENT_LIMIT)
  private String fastPaymentLimit;

  /**
   * Gusto Embedded supports three payment speeds (1-day, 2-day, and 4-day). For next-day payments, funds are deposited in your team&#39;s bank account by the end of the next business day. Most people will see the funds arrive the next afternoon, but payments may arrive as late as the end of the business day.
   */
  @JsonAdapter(PaymentSpeedEnum.Adapter.class)
 public enum PaymentSpeedEnum {
    _1_DAY("1-day"),
    
    _2_DAY("2-day"),
    
    _4_DAY("4-day");

    private String value;

    PaymentSpeedEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PaymentSpeedEnum fromValue(String value) {
      for (PaymentSpeedEnum b : PaymentSpeedEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<PaymentSpeedEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PaymentSpeedEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PaymentSpeedEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return PaymentSpeedEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_PAYMENT_SPEED = "payment_speed";
  @SerializedName(SERIALIZED_NAME_PAYMENT_SPEED)
  private PaymentSpeedEnum paymentSpeed;

  public PaymentConfigsUpdateCompanyPaymentConfigsRequest() {
  }

  public PaymentConfigsUpdateCompanyPaymentConfigsRequest fastPaymentLimit(String fastPaymentLimit) {
    
    
    
    
    this.fastPaymentLimit = fastPaymentLimit;
    return this;
  }

   /**
   * Fast payment limit. This limit is an aggregate of all fast payrolls amount.
   * @return fastPaymentLimit
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Fast payment limit. This limit is an aggregate of all fast payrolls amount.")

  public String getFastPaymentLimit() {
    return fastPaymentLimit;
  }


  public void setFastPaymentLimit(String fastPaymentLimit) {
    
    
    
    this.fastPaymentLimit = fastPaymentLimit;
  }


  public PaymentConfigsUpdateCompanyPaymentConfigsRequest paymentSpeed(PaymentSpeedEnum paymentSpeed) {
    
    
    
    
    this.paymentSpeed = paymentSpeed;
    return this;
  }

   /**
   * Gusto Embedded supports three payment speeds (1-day, 2-day, and 4-day). For next-day payments, funds are deposited in your team&#39;s bank account by the end of the next business day. Most people will see the funds arrive the next afternoon, but payments may arrive as late as the end of the business day.
   * @return paymentSpeed
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Gusto Embedded supports three payment speeds (1-day, 2-day, and 4-day). For next-day payments, funds are deposited in your team's bank account by the end of the next business day. Most people will see the funds arrive the next afternoon, but payments may arrive as late as the end of the business day.")

  public PaymentSpeedEnum getPaymentSpeed() {
    return paymentSpeed;
  }


  public void setPaymentSpeed(PaymentSpeedEnum paymentSpeed) {
    
    
    
    this.paymentSpeed = paymentSpeed;
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
   * @return the PaymentConfigsUpdateCompanyPaymentConfigsRequest instance itself
   */
  public PaymentConfigsUpdateCompanyPaymentConfigsRequest putAdditionalProperty(String key, Object value) {
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
    PaymentConfigsUpdateCompanyPaymentConfigsRequest paymentConfigsUpdateCompanyPaymentConfigsRequest = (PaymentConfigsUpdateCompanyPaymentConfigsRequest) o;
    return Objects.equals(this.fastPaymentLimit, paymentConfigsUpdateCompanyPaymentConfigsRequest.fastPaymentLimit) &&
        Objects.equals(this.paymentSpeed, paymentConfigsUpdateCompanyPaymentConfigsRequest.paymentSpeed)&&
        Objects.equals(this.additionalProperties, paymentConfigsUpdateCompanyPaymentConfigsRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fastPaymentLimit, paymentSpeed, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentConfigsUpdateCompanyPaymentConfigsRequest {\n");
    sb.append("    fastPaymentLimit: ").append(toIndentedString(fastPaymentLimit)).append("\n");
    sb.append("    paymentSpeed: ").append(toIndentedString(paymentSpeed)).append("\n");
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
    openapiFields.add("fast_payment_limit");
    openapiFields.add("payment_speed");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("fast_payment_limit");
    openapiRequiredFields.add("payment_speed");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PaymentConfigsUpdateCompanyPaymentConfigsRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PaymentConfigsUpdateCompanyPaymentConfigsRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PaymentConfigsUpdateCompanyPaymentConfigsRequest is not found in the empty JSON string", PaymentConfigsUpdateCompanyPaymentConfigsRequest.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : PaymentConfigsUpdateCompanyPaymentConfigsRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("fast_payment_limit").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fast_payment_limit` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fast_payment_limit").toString()));
      }
      if (!jsonObj.get("payment_speed").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payment_speed` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payment_speed").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PaymentConfigsUpdateCompanyPaymentConfigsRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PaymentConfigsUpdateCompanyPaymentConfigsRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PaymentConfigsUpdateCompanyPaymentConfigsRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PaymentConfigsUpdateCompanyPaymentConfigsRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<PaymentConfigsUpdateCompanyPaymentConfigsRequest>() {
           @Override
           public void write(JsonWriter out, PaymentConfigsUpdateCompanyPaymentConfigsRequest value) throws IOException {
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
           public PaymentConfigsUpdateCompanyPaymentConfigsRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             PaymentConfigsUpdateCompanyPaymentConfigsRequest instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of PaymentConfigsUpdateCompanyPaymentConfigsRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PaymentConfigsUpdateCompanyPaymentConfigsRequest
  * @throws IOException if the JSON string is invalid with respect to PaymentConfigsUpdateCompanyPaymentConfigsRequest
  */
  public static PaymentConfigsUpdateCompanyPaymentConfigsRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PaymentConfigsUpdateCompanyPaymentConfigsRequest.class);
  }

 /**
  * Convert an instance of PaymentConfigsUpdateCompanyPaymentConfigsRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

