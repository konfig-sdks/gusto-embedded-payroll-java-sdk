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
import com.konfigthis.client.model.FlsaStatusType;
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
 * The representation of compensation in Gusto.
 */
@ApiModel(description = "The representation of compensation in Gusto.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class Compensation {
  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private String version;

  public static final String SERIALIZED_NAME_UUID = "uuid";
  @SerializedName(SERIALIZED_NAME_UUID)
  private String uuid;

  public static final String SERIALIZED_NAME_JOB_UUID = "job_uuid";
  @SerializedName(SERIALIZED_NAME_JOB_UUID)
  private String jobUuid;

  public static final String SERIALIZED_NAME_RATE = "rate";
  @SerializedName(SERIALIZED_NAME_RATE)
  private String rate;

  /**
   * The unit accompanying the compensation rate. If the employee is an owner, rate should be &#39;Paycheck&#39;.
   */
  @JsonAdapter(PaymentUnitEnum.Adapter.class)
 public enum PaymentUnitEnum {
    HOUR("Hour"),
    
    WEEK("Week"),
    
    MONTH("Month"),
    
    YEAR("Year"),
    
    PAYCHECK("Paycheck");

    private String value;

    PaymentUnitEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PaymentUnitEnum fromValue(String value) {
      for (PaymentUnitEnum b : PaymentUnitEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<PaymentUnitEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PaymentUnitEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PaymentUnitEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return PaymentUnitEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_PAYMENT_UNIT = "payment_unit";
  @SerializedName(SERIALIZED_NAME_PAYMENT_UNIT)
  private PaymentUnitEnum paymentUnit;

  public static final String SERIALIZED_NAME_FLSA_STATUS = "flsa_status";
  @SerializedName(SERIALIZED_NAME_FLSA_STATUS)
  private FlsaStatusType flsaStatus;

  public static final String SERIALIZED_NAME_EFFECTIVE_DATE = "effective_date";
  @SerializedName(SERIALIZED_NAME_EFFECTIVE_DATE)
  private String effectiveDate;

  public static final String SERIALIZED_NAME_ADJUST_FOR_MINIMUM_WAGE = "adjust_for_minimum_wage";
  @SerializedName(SERIALIZED_NAME_ADJUST_FOR_MINIMUM_WAGE)
  private Boolean adjustForMinimumWage;

  public Compensation() {
  }

  
  public Compensation(
     String uuid, 
     String jobUuid, 
     Boolean adjustForMinimumWage
  ) {
    this();
    this.uuid = uuid;
    this.jobUuid = jobUuid;
    this.adjustForMinimumWage = adjustForMinimumWage;
  }

  public Compensation version(String version) {
    
    
    
    
    this.version = version;
    return this;
  }

   /**
   * The current version of the object. See the [versioning guide](https://docs.gusto.com/embedded-payroll/docs/idempotency) for information on how to use this field.
   * @return version
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "98jr3289h3298hr9329gf9egskt3kagri32qqgiqe3872", value = "The current version of the object. See the [versioning guide](https://docs.gusto.com/embedded-payroll/docs/idempotency) for information on how to use this field.")

  public String getVersion() {
    return version;
  }


  public void setVersion(String version) {
    
    
    
    this.version = version;
  }


   /**
   * The UUID of the compensation in Gusto.
   * @return uuid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "910b675b-af99-404e-b8d8-562a72b76b44", value = "The UUID of the compensation in Gusto.")

  public String getUuid() {
    return uuid;
  }




   /**
   * The UUID of the job to which the compensation belongs.
   * @return jobUuid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "fe9d72aa-11aa-4f6c-ba3b-4de14598cff6", value = "The UUID of the job to which the compensation belongs.")

  public String getJobUuid() {
    return jobUuid;
  }




  public Compensation rate(String rate) {
    
    
    
    
    this.rate = rate;
    return this;
  }

   /**
   * The dollar amount paid per payment unit.
   * @return rate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "70.00", value = "The dollar amount paid per payment unit.")

  public String getRate() {
    return rate;
  }


  public void setRate(String rate) {
    
    
    
    this.rate = rate;
  }


  public Compensation paymentUnit(PaymentUnitEnum paymentUnit) {
    
    
    
    
    this.paymentUnit = paymentUnit;
    return this;
  }

   /**
   * The unit accompanying the compensation rate. If the employee is an owner, rate should be &#39;Paycheck&#39;.
   * @return paymentUnit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "HOUR", value = "The unit accompanying the compensation rate. If the employee is an owner, rate should be 'Paycheck'.")

  public PaymentUnitEnum getPaymentUnit() {
    return paymentUnit;
  }


  public void setPaymentUnit(PaymentUnitEnum paymentUnit) {
    
    
    
    this.paymentUnit = paymentUnit;
  }


  public Compensation flsaStatus(FlsaStatusType flsaStatus) {
    
    
    
    
    this.flsaStatus = flsaStatus;
    return this;
  }

   /**
   * Get flsaStatus
   * @return flsaStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public FlsaStatusType getFlsaStatus() {
    return flsaStatus;
  }


  public void setFlsaStatus(FlsaStatusType flsaStatus) {
    
    
    
    this.flsaStatus = flsaStatus;
  }


  public Compensation effectiveDate(String effectiveDate) {
    
    
    
    
    this.effectiveDate = effectiveDate;
    return this;
  }

   /**
   * The effective date for this compensation. For the first compensation, this defaults to the job&#39;s hire date.
   * @return effectiveDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020-12-11", value = "The effective date for this compensation. For the first compensation, this defaults to the job's hire date.")

  public String getEffectiveDate() {
    return effectiveDate;
  }


  public void setEffectiveDate(String effectiveDate) {
    
    
    
    this.effectiveDate = effectiveDate;
  }


   /**
   * Indicates if the compensation could be adjusted to minimum wage during payroll calculation.
   * @return adjustForMinimumWage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "Indicates if the compensation could be adjusted to minimum wage during payroll calculation.")

  public Boolean getAdjustForMinimumWage() {
    return adjustForMinimumWage;
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
   * @return the Compensation instance itself
   */
  public Compensation putAdditionalProperty(String key, Object value) {
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
    Compensation compensation = (Compensation) o;
    return Objects.equals(this.version, compensation.version) &&
        Objects.equals(this.uuid, compensation.uuid) &&
        Objects.equals(this.jobUuid, compensation.jobUuid) &&
        Objects.equals(this.rate, compensation.rate) &&
        Objects.equals(this.paymentUnit, compensation.paymentUnit) &&
        Objects.equals(this.flsaStatus, compensation.flsaStatus) &&
        Objects.equals(this.effectiveDate, compensation.effectiveDate) &&
        Objects.equals(this.adjustForMinimumWage, compensation.adjustForMinimumWage)&&
        Objects.equals(this.additionalProperties, compensation.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(version, uuid, jobUuid, rate, paymentUnit, flsaStatus, effectiveDate, adjustForMinimumWage, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Compensation {\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    jobUuid: ").append(toIndentedString(jobUuid)).append("\n");
    sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
    sb.append("    paymentUnit: ").append(toIndentedString(paymentUnit)).append("\n");
    sb.append("    flsaStatus: ").append(toIndentedString(flsaStatus)).append("\n");
    sb.append("    effectiveDate: ").append(toIndentedString(effectiveDate)).append("\n");
    sb.append("    adjustForMinimumWage: ").append(toIndentedString(adjustForMinimumWage)).append("\n");
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
    openapiFields.add("uuid");
    openapiFields.add("job_uuid");
    openapiFields.add("rate");
    openapiFields.add("payment_unit");
    openapiFields.add("flsa_status");
    openapiFields.add("effective_date");
    openapiFields.add("adjust_for_minimum_wage");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Compensation
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Compensation.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Compensation is not found in the empty JSON string", Compensation.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("version") != null && !jsonObj.get("version").isJsonNull()) && !jsonObj.get("version").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `version` to be a primitive type in the JSON string but got `%s`", jsonObj.get("version").toString()));
      }
      if ((jsonObj.get("uuid") != null && !jsonObj.get("uuid").isJsonNull()) && !jsonObj.get("uuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uuid").toString()));
      }
      if ((jsonObj.get("job_uuid") != null && !jsonObj.get("job_uuid").isJsonNull()) && !jsonObj.get("job_uuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `job_uuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("job_uuid").toString()));
      }
      if ((jsonObj.get("rate") != null && !jsonObj.get("rate").isJsonNull()) && !jsonObj.get("rate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `rate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("rate").toString()));
      }
      if ((jsonObj.get("payment_unit") != null && !jsonObj.get("payment_unit").isJsonNull()) && !jsonObj.get("payment_unit").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payment_unit` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payment_unit").toString()));
      }
      if ((jsonObj.get("effective_date") != null && !jsonObj.get("effective_date").isJsonNull()) && !jsonObj.get("effective_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `effective_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("effective_date").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Compensation.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Compensation' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Compensation> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Compensation.class));

       return (TypeAdapter<T>) new TypeAdapter<Compensation>() {
           @Override
           public void write(JsonWriter out, Compensation value) throws IOException {
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
           public Compensation read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             Compensation instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of Compensation given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Compensation
  * @throws IOException if the JSON string is invalid with respect to Compensation
  */
  public static Compensation fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Compensation.class);
  }

 /**
  * Convert an instance of Compensation to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

