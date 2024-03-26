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
 * An array of earnings for the employee. Depends on your company selections, earnings includes wages, hours, bonuses, tips, commission and more.
 */
@ApiModel(description = "An array of earnings for the employee. Depends on your company selections, earnings includes wages, hours, bonuses, tips, commission and more.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class ExternalPayrollsUpdatePayrollItemsRequestExternalPayrollItemsInnerEarningsInner {
  public static final String SERIALIZED_NAME_HOURS = "hours";
  @SerializedName(SERIALIZED_NAME_HOURS)
  private String hours;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private String amount;

  public static final String SERIALIZED_NAME_EARNING_ID = "earning_id";
  @SerializedName(SERIALIZED_NAME_EARNING_ID)
  private Integer earningId;

  /**
   * The earning type for the compensation.
   */
  @JsonAdapter(EarningTypeEnum.Adapter.class)
 public enum EarningTypeEnum {
    COMPANYPAYTYPE("CompanyPayType"),
    
    COMPANYEARNINGTYPE("CompanyEarningType");

    private String value;

    EarningTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static EarningTypeEnum fromValue(String value) {
      for (EarningTypeEnum b : EarningTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<EarningTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final EarningTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public EarningTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return EarningTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_EARNING_TYPE = "earning_type";
  @SerializedName(SERIALIZED_NAME_EARNING_TYPE)
  private EarningTypeEnum earningType;

  public ExternalPayrollsUpdatePayrollItemsRequestExternalPayrollItemsInnerEarningsInner() {
  }

  public ExternalPayrollsUpdatePayrollItemsRequestExternalPayrollItemsInnerEarningsInner hours(String hours) {
    
    
    
    
    this.hours = hours;
    return this;
  }

   /**
   * The hour of the compensation for the pay period.
   * @return hours
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The hour of the compensation for the pay period.")

  public String getHours() {
    return hours;
  }


  public void setHours(String hours) {
    
    
    
    this.hours = hours;
  }


  public ExternalPayrollsUpdatePayrollItemsRequestExternalPayrollItemsInnerEarningsInner amount(String amount) {
    
    
    
    
    this.amount = amount;
    return this;
  }

   /**
   * The amount of the earning.
   * @return amount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The amount of the earning.")

  public String getAmount() {
    return amount;
  }


  public void setAmount(String amount) {
    
    
    
    this.amount = amount;
  }


  public ExternalPayrollsUpdatePayrollItemsRequestExternalPayrollItemsInnerEarningsInner earningId(Integer earningId) {
    
    
    
    
    this.earningId = earningId;
    return this;
  }

   /**
   * The ID of the earning.
   * @return earningId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the earning.")

  public Integer getEarningId() {
    return earningId;
  }


  public void setEarningId(Integer earningId) {
    
    
    
    this.earningId = earningId;
  }


  public ExternalPayrollsUpdatePayrollItemsRequestExternalPayrollItemsInnerEarningsInner earningType(EarningTypeEnum earningType) {
    
    
    
    
    this.earningType = earningType;
    return this;
  }

   /**
   * The earning type for the compensation.
   * @return earningType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The earning type for the compensation.")

  public EarningTypeEnum getEarningType() {
    return earningType;
  }


  public void setEarningType(EarningTypeEnum earningType) {
    
    
    
    this.earningType = earningType;
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
   * @return the ExternalPayrollsUpdatePayrollItemsRequestExternalPayrollItemsInnerEarningsInner instance itself
   */
  public ExternalPayrollsUpdatePayrollItemsRequestExternalPayrollItemsInnerEarningsInner putAdditionalProperty(String key, Object value) {
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
    ExternalPayrollsUpdatePayrollItemsRequestExternalPayrollItemsInnerEarningsInner externalPayrollsUpdatePayrollItemsRequestExternalPayrollItemsInnerEarningsInner = (ExternalPayrollsUpdatePayrollItemsRequestExternalPayrollItemsInnerEarningsInner) o;
    return Objects.equals(this.hours, externalPayrollsUpdatePayrollItemsRequestExternalPayrollItemsInnerEarningsInner.hours) &&
        Objects.equals(this.amount, externalPayrollsUpdatePayrollItemsRequestExternalPayrollItemsInnerEarningsInner.amount) &&
        Objects.equals(this.earningId, externalPayrollsUpdatePayrollItemsRequestExternalPayrollItemsInnerEarningsInner.earningId) &&
        Objects.equals(this.earningType, externalPayrollsUpdatePayrollItemsRequestExternalPayrollItemsInnerEarningsInner.earningType)&&
        Objects.equals(this.additionalProperties, externalPayrollsUpdatePayrollItemsRequestExternalPayrollItemsInnerEarningsInner.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hours, amount, earningId, earningType, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExternalPayrollsUpdatePayrollItemsRequestExternalPayrollItemsInnerEarningsInner {\n");
    sb.append("    hours: ").append(toIndentedString(hours)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    earningId: ").append(toIndentedString(earningId)).append("\n");
    sb.append("    earningType: ").append(toIndentedString(earningType)).append("\n");
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
    openapiFields.add("hours");
    openapiFields.add("amount");
    openapiFields.add("earning_id");
    openapiFields.add("earning_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ExternalPayrollsUpdatePayrollItemsRequestExternalPayrollItemsInnerEarningsInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ExternalPayrollsUpdatePayrollItemsRequestExternalPayrollItemsInnerEarningsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ExternalPayrollsUpdatePayrollItemsRequestExternalPayrollItemsInnerEarningsInner is not found in the empty JSON string", ExternalPayrollsUpdatePayrollItemsRequestExternalPayrollItemsInnerEarningsInner.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("hours") != null && !jsonObj.get("hours").isJsonNull()) && !jsonObj.get("hours").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `hours` to be a primitive type in the JSON string but got `%s`", jsonObj.get("hours").toString()));
      }
      if ((jsonObj.get("amount") != null && !jsonObj.get("amount").isJsonNull()) && !jsonObj.get("amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("amount").toString()));
      }
      if ((jsonObj.get("earning_type") != null && !jsonObj.get("earning_type").isJsonNull()) && !jsonObj.get("earning_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `earning_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("earning_type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ExternalPayrollsUpdatePayrollItemsRequestExternalPayrollItemsInnerEarningsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ExternalPayrollsUpdatePayrollItemsRequestExternalPayrollItemsInnerEarningsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ExternalPayrollsUpdatePayrollItemsRequestExternalPayrollItemsInnerEarningsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ExternalPayrollsUpdatePayrollItemsRequestExternalPayrollItemsInnerEarningsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ExternalPayrollsUpdatePayrollItemsRequestExternalPayrollItemsInnerEarningsInner>() {
           @Override
           public void write(JsonWriter out, ExternalPayrollsUpdatePayrollItemsRequestExternalPayrollItemsInnerEarningsInner value) throws IOException {
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
           public ExternalPayrollsUpdatePayrollItemsRequestExternalPayrollItemsInnerEarningsInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ExternalPayrollsUpdatePayrollItemsRequestExternalPayrollItemsInnerEarningsInner instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ExternalPayrollsUpdatePayrollItemsRequestExternalPayrollItemsInnerEarningsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ExternalPayrollsUpdatePayrollItemsRequestExternalPayrollItemsInnerEarningsInner
  * @throws IOException if the JSON string is invalid with respect to ExternalPayrollsUpdatePayrollItemsRequestExternalPayrollItemsInnerEarningsInner
  */
  public static ExternalPayrollsUpdatePayrollItemsRequestExternalPayrollItemsInnerEarningsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ExternalPayrollsUpdatePayrollItemsRequestExternalPayrollItemsInnerEarningsInner.class);
  }

 /**
  * Convert an instance of ExternalPayrollsUpdatePayrollItemsRequestExternalPayrollItemsInnerEarningsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

