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
 * Representation of a recovery case
 */
@ApiModel(description = "Representation of a recovery case")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class RecoveryCase {
  public static final String SERIALIZED_NAME_UUID = "uuid";
  @SerializedName(SERIALIZED_NAME_UUID)
  private String uuid;

  public static final String SERIALIZED_NAME_COMPANY_UUID = "company_uuid";
  @SerializedName(SERIALIZED_NAME_COMPANY_UUID)
  private String companyUuid;

  /**
   * Status of the recovery case
   */
  @JsonAdapter(StatusEnum.Adapter.class)
 public enum StatusEnum {
    OPEN("open"),
    
    REDEBIT_INITIATED("redebit_initiated"),
    
    RECOVERED("recovered"),
    
    LOST("lost");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private StatusEnum status;

  public static final String SERIALIZED_NAME_LATEST_ERROR_CODE = "latest_error_code";
  @SerializedName(SERIALIZED_NAME_LATEST_ERROR_CODE)
  private String latestErrorCode;

  public static final String SERIALIZED_NAME_ORIGINAL_DEBIT_DATE = "original_debit_date";
  @SerializedName(SERIALIZED_NAME_ORIGINAL_DEBIT_DATE)
  private String originalDebitDate;

  public static final String SERIALIZED_NAME_CHECK_DATE = "check_date";
  @SerializedName(SERIALIZED_NAME_CHECK_DATE)
  private String checkDate;

  public static final String SERIALIZED_NAME_PAYROLL_UUID = "payroll_uuid";
  @SerializedName(SERIALIZED_NAME_PAYROLL_UUID)
  private String payrollUuid;

  public static final String SERIALIZED_NAME_CONTRACTOR_PAYMENT_UUIDS = "contractor_payment_uuids";
  @SerializedName(SERIALIZED_NAME_CONTRACTOR_PAYMENT_UUIDS)
  private List<String> contractorPaymentUuids = null;

  public static final String SERIALIZED_NAME_AMOUNT_OUTSTANDING = "amount_outstanding";
  @SerializedName(SERIALIZED_NAME_AMOUNT_OUTSTANDING)
  private String amountOutstanding;

  public static final String SERIALIZED_NAME_EVENT_TOTAL_AMOUNT = "event_total_amount";
  @SerializedName(SERIALIZED_NAME_EVENT_TOTAL_AMOUNT)
  private String eventTotalAmount;

  public RecoveryCase() {
  }

  public RecoveryCase uuid(String uuid) {
    
    
    
    
    this.uuid = uuid;
    return this;
  }

   /**
   * Unique identifier of an recovery case
   * @return uuid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "e83d273e-4ae9-4b61-9c71-4030c2f73093", value = "Unique identifier of an recovery case")

  public String getUuid() {
    return uuid;
  }


  public void setUuid(String uuid) {
    
    
    
    this.uuid = uuid;
  }


  public RecoveryCase companyUuid(String companyUuid) {
    
    
    
    
    this.companyUuid = companyUuid;
    return this;
  }

   /**
   * Unique identifier of the company to which the recovery case belongs
   * @return companyUuid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "c5e3e3e9-732f-4762-849e-20b5cec9036f", value = "Unique identifier of the company to which the recovery case belongs")

  public String getCompanyUuid() {
    return companyUuid;
  }


  public void setCompanyUuid(String companyUuid) {
    
    
    
    this.companyUuid = companyUuid;
  }


  public RecoveryCase status(StatusEnum status) {
    
    
    
    
    this.status = status;
    return this;
  }

   /**
   * Status of the recovery case
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "OPEN", value = "Status of the recovery case")

  public StatusEnum getStatus() {
    return status;
  }


  public void setStatus(StatusEnum status) {
    
    
    
    this.status = status;
  }


  public RecoveryCase latestErrorCode(String latestErrorCode) {
    
    
    
    
    this.latestErrorCode = latestErrorCode;
    return this;
  }

   /**
   * The latest bank error code for the recovery case. See [this article](https://engineering.gusto.com/how-ach-works-a-developer-perspective-part-2/) for a complete list of ACH return codes.
   * @return latestErrorCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "R01", value = "The latest bank error code for the recovery case. See [this article](https://engineering.gusto.com/how-ach-works-a-developer-perspective-part-2/) for a complete list of ACH return codes.")

  public String getLatestErrorCode() {
    return latestErrorCode;
  }


  public void setLatestErrorCode(String latestErrorCode) {
    
    
    
    this.latestErrorCode = latestErrorCode;
  }


  public RecoveryCase originalDebitDate(String originalDebitDate) {
    
    
    
    
    this.originalDebitDate = originalDebitDate;
    return this;
  }

   /**
   * Date when funds were originally debited from the company&#39;s bank account
   * @return originalDebitDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2023-10-11", value = "Date when funds were originally debited from the company's bank account")

  public String getOriginalDebitDate() {
    return originalDebitDate;
  }


  public void setOriginalDebitDate(String originalDebitDate) {
    
    
    
    this.originalDebitDate = originalDebitDate;
  }


  public RecoveryCase checkDate(String checkDate) {
    
    
    
    
    this.checkDate = checkDate;
    return this;
  }

   /**
   * Check date for the associated payroll or contractor payments
   * @return checkDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2023-10-13", value = "Check date for the associated payroll or contractor payments")

  public String getCheckDate() {
    return checkDate;
  }


  public void setCheckDate(String checkDate) {
    
    
    
    this.checkDate = checkDate;
  }


  public RecoveryCase payrollUuid(String payrollUuid) {
    
    
    
    
    this.payrollUuid = payrollUuid;
    return this;
  }

   /**
   * The uuid of the associated payroll for which the recovery case was created. If the recovery case was created for a contractor payment, this field will be null.
   * @return payrollUuid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "210f2034-fb4a-4059-b109-6c3b5efe499d", value = "The uuid of the associated payroll for which the recovery case was created. If the recovery case was created for a contractor payment, this field will be null.")

  public String getPayrollUuid() {
    return payrollUuid;
  }


  public void setPayrollUuid(String payrollUuid) {
    
    
    
    this.payrollUuid = payrollUuid;
  }


  public RecoveryCase contractorPaymentUuids(List<String> contractorPaymentUuids) {
    
    
    
    
    this.contractorPaymentUuids = contractorPaymentUuids;
    return this;
  }

  public RecoveryCase addContractorPaymentUuidsItem(String contractorPaymentUuidsItem) {
    if (this.contractorPaymentUuids == null) {
      this.contractorPaymentUuids = new ArrayList<>();
    }
    this.contractorPaymentUuids.add(contractorPaymentUuidsItem);
    return this;
  }

   /**
   * The uuids of the associated contractor payments for which the recovery case was created. If the recovery case was created for a payroll, this field will be null.
   * @return contractorPaymentUuids
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The uuids of the associated contractor payments for which the recovery case was created. If the recovery case was created for a payroll, this field will be null.")

  public List<String> getContractorPaymentUuids() {
    return contractorPaymentUuids;
  }


  public void setContractorPaymentUuids(List<String> contractorPaymentUuids) {
    
    
    
    this.contractorPaymentUuids = contractorPaymentUuids;
  }


  public RecoveryCase amountOutstanding(String amountOutstanding) {
    
    
    
    
    this.amountOutstanding = amountOutstanding;
    return this;
  }

   /**
   * Amount outstanding for the recovery case
   * @return amountOutstanding
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10499.43", value = "Amount outstanding for the recovery case")

  public String getAmountOutstanding() {
    return amountOutstanding;
  }


  public void setAmountOutstanding(String amountOutstanding) {
    
    
    
    this.amountOutstanding = amountOutstanding;
  }


  public RecoveryCase eventTotalAmount(String eventTotalAmount) {
    
    
    
    
    this.eventTotalAmount = eventTotalAmount;
    return this;
  }

   /**
   * Total amount to be debited from the payroll or contractor payments
   * @return eventTotalAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "5912.07", value = "Total amount to be debited from the payroll or contractor payments")

  public String getEventTotalAmount() {
    return eventTotalAmount;
  }


  public void setEventTotalAmount(String eventTotalAmount) {
    
    
    
    this.eventTotalAmount = eventTotalAmount;
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
   * @return the RecoveryCase instance itself
   */
  public RecoveryCase putAdditionalProperty(String key, Object value) {
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
    RecoveryCase recoveryCase = (RecoveryCase) o;
    return Objects.equals(this.uuid, recoveryCase.uuid) &&
        Objects.equals(this.companyUuid, recoveryCase.companyUuid) &&
        Objects.equals(this.status, recoveryCase.status) &&
        Objects.equals(this.latestErrorCode, recoveryCase.latestErrorCode) &&
        Objects.equals(this.originalDebitDate, recoveryCase.originalDebitDate) &&
        Objects.equals(this.checkDate, recoveryCase.checkDate) &&
        Objects.equals(this.payrollUuid, recoveryCase.payrollUuid) &&
        Objects.equals(this.contractorPaymentUuids, recoveryCase.contractorPaymentUuids) &&
        Objects.equals(this.amountOutstanding, recoveryCase.amountOutstanding) &&
        Objects.equals(this.eventTotalAmount, recoveryCase.eventTotalAmount)&&
        Objects.equals(this.additionalProperties, recoveryCase.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uuid, companyUuid, status, latestErrorCode, originalDebitDate, checkDate, payrollUuid, contractorPaymentUuids, amountOutstanding, eventTotalAmount, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecoveryCase {\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    companyUuid: ").append(toIndentedString(companyUuid)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    latestErrorCode: ").append(toIndentedString(latestErrorCode)).append("\n");
    sb.append("    originalDebitDate: ").append(toIndentedString(originalDebitDate)).append("\n");
    sb.append("    checkDate: ").append(toIndentedString(checkDate)).append("\n");
    sb.append("    payrollUuid: ").append(toIndentedString(payrollUuid)).append("\n");
    sb.append("    contractorPaymentUuids: ").append(toIndentedString(contractorPaymentUuids)).append("\n");
    sb.append("    amountOutstanding: ").append(toIndentedString(amountOutstanding)).append("\n");
    sb.append("    eventTotalAmount: ").append(toIndentedString(eventTotalAmount)).append("\n");
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
    openapiFields.add("uuid");
    openapiFields.add("company_uuid");
    openapiFields.add("status");
    openapiFields.add("latest_error_code");
    openapiFields.add("original_debit_date");
    openapiFields.add("check_date");
    openapiFields.add("payroll_uuid");
    openapiFields.add("contractor_payment_uuids");
    openapiFields.add("amount_outstanding");
    openapiFields.add("event_total_amount");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to RecoveryCase
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!RecoveryCase.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RecoveryCase is not found in the empty JSON string", RecoveryCase.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("uuid") != null && !jsonObj.get("uuid").isJsonNull()) && !jsonObj.get("uuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uuid").toString()));
      }
      if ((jsonObj.get("company_uuid") != null && !jsonObj.get("company_uuid").isJsonNull()) && !jsonObj.get("company_uuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `company_uuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("company_uuid").toString()));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if ((jsonObj.get("latest_error_code") != null && !jsonObj.get("latest_error_code").isJsonNull()) && !jsonObj.get("latest_error_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `latest_error_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("latest_error_code").toString()));
      }
      if ((jsonObj.get("original_debit_date") != null && !jsonObj.get("original_debit_date").isJsonNull()) && !jsonObj.get("original_debit_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `original_debit_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("original_debit_date").toString()));
      }
      if ((jsonObj.get("check_date") != null && !jsonObj.get("check_date").isJsonNull()) && !jsonObj.get("check_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `check_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("check_date").toString()));
      }
      if ((jsonObj.get("payroll_uuid") != null && !jsonObj.get("payroll_uuid").isJsonNull()) && !jsonObj.get("payroll_uuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payroll_uuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payroll_uuid").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("contractor_payment_uuids") != null && !jsonObj.get("contractor_payment_uuids").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `contractor_payment_uuids` to be an array in the JSON string but got `%s`", jsonObj.get("contractor_payment_uuids").toString()));
      }
      if ((jsonObj.get("amount_outstanding") != null && !jsonObj.get("amount_outstanding").isJsonNull()) && !jsonObj.get("amount_outstanding").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `amount_outstanding` to be a primitive type in the JSON string but got `%s`", jsonObj.get("amount_outstanding").toString()));
      }
      if ((jsonObj.get("event_total_amount") != null && !jsonObj.get("event_total_amount").isJsonNull()) && !jsonObj.get("event_total_amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `event_total_amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("event_total_amount").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RecoveryCase.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RecoveryCase' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RecoveryCase> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RecoveryCase.class));

       return (TypeAdapter<T>) new TypeAdapter<RecoveryCase>() {
           @Override
           public void write(JsonWriter out, RecoveryCase value) throws IOException {
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
           public RecoveryCase read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             RecoveryCase instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of RecoveryCase given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RecoveryCase
  * @throws IOException if the JSON string is invalid with respect to RecoveryCase
  */
  public static RecoveryCase fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RecoveryCase.class);
  }

 /**
  * Convert an instance of RecoveryCase to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

