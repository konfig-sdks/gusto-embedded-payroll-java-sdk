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
 * 
 */
@ApiModel(description = "")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class PayrollsSkipPayrollRequest {
  /**
   * Payroll type
   */
  @JsonAdapter(PayrollTypeEnum.Adapter.class)
 public enum PayrollTypeEnum {
    REGULAR("Regular"),
    
    HIRED_EMPLOYEE("Hired employee"),
    
    DISMISSED_EMPLOYEE("Dismissed employee"),
    
    TRANSITION_FROM_OLD_PAY_SCHEDULE("Transition from old pay schedule");

    private String value;

    PayrollTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PayrollTypeEnum fromValue(String value) {
      for (PayrollTypeEnum b : PayrollTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<PayrollTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PayrollTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PayrollTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return PayrollTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_PAYROLL_TYPE = "payroll_type";
  @SerializedName(SERIALIZED_NAME_PAYROLL_TYPE)
  private PayrollTypeEnum payrollType;

  public static final String SERIALIZED_NAME_START_DATE = "start_date";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private String startDate;

  public static final String SERIALIZED_NAME_END_DATE = "end_date";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  private String endDate;

  public static final String SERIALIZED_NAME_PAY_SCHEDULE_UUID = "pay_schedule_uuid";
  @SerializedName(SERIALIZED_NAME_PAY_SCHEDULE_UUID)
  private String payScheduleUuid;

  public static final String SERIALIZED_NAME_EMPLOYEE_UUIDS = "employee_uuids";
  @SerializedName(SERIALIZED_NAME_EMPLOYEE_UUIDS)
  private List<String> employeeUuids = null;

  public PayrollsSkipPayrollRequest() {
  }

  public PayrollsSkipPayrollRequest payrollType(PayrollTypeEnum payrollType) {
    
    
    
    
    this.payrollType = payrollType;
    return this;
  }

   /**
   * Payroll type
   * @return payrollType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Payroll type")

  public PayrollTypeEnum getPayrollType() {
    return payrollType;
  }


  public void setPayrollType(PayrollTypeEnum payrollType) {
    
    
    
    this.payrollType = payrollType;
  }


  public PayrollsSkipPayrollRequest startDate(String startDate) {
    
    
    
    
    this.startDate = startDate;
    return this;
  }

   /**
   * Pay period start date
   * @return startDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Pay period start date")

  public String getStartDate() {
    return startDate;
  }


  public void setStartDate(String startDate) {
    
    
    
    this.startDate = startDate;
  }


  public PayrollsSkipPayrollRequest endDate(String endDate) {
    
    
    
    
    this.endDate = endDate;
    return this;
  }

   /**
   * Pay period end date
   * @return endDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Pay period end date")

  public String getEndDate() {
    return endDate;
  }


  public void setEndDate(String endDate) {
    
    
    
    this.endDate = endDate;
  }


  public PayrollsSkipPayrollRequest payScheduleUuid(String payScheduleUuid) {
    
    
    
    
    this.payScheduleUuid = payScheduleUuid;
    return this;
  }

   /**
   * The UUID of the pay schedule
   * @return payScheduleUuid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The UUID of the pay schedule")

  public String getPayScheduleUuid() {
    return payScheduleUuid;
  }


  public void setPayScheduleUuid(String payScheduleUuid) {
    
    
    
    this.payScheduleUuid = payScheduleUuid;
  }


  public PayrollsSkipPayrollRequest employeeUuids(List<String> employeeUuids) {
    
    
    
    
    this.employeeUuids = employeeUuids;
    return this;
  }

  public PayrollsSkipPayrollRequest addEmployeeUuidsItem(String employeeUuidsItem) {
    if (this.employeeUuids == null) {
      this.employeeUuids = new ArrayList<>();
    }
    this.employeeUuids.add(employeeUuidsItem);
    return this;
  }

   /**
   * An array of employees. This field is only applicable to new hire payroll and termination payroll
   * @return employeeUuids
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An array of employees. This field is only applicable to new hire payroll and termination payroll")

  public List<String> getEmployeeUuids() {
    return employeeUuids;
  }


  public void setEmployeeUuids(List<String> employeeUuids) {
    
    
    
    this.employeeUuids = employeeUuids;
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
   * @return the PayrollsSkipPayrollRequest instance itself
   */
  public PayrollsSkipPayrollRequest putAdditionalProperty(String key, Object value) {
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
    PayrollsSkipPayrollRequest payrollsSkipPayrollRequest = (PayrollsSkipPayrollRequest) o;
    return Objects.equals(this.payrollType, payrollsSkipPayrollRequest.payrollType) &&
        Objects.equals(this.startDate, payrollsSkipPayrollRequest.startDate) &&
        Objects.equals(this.endDate, payrollsSkipPayrollRequest.endDate) &&
        Objects.equals(this.payScheduleUuid, payrollsSkipPayrollRequest.payScheduleUuid) &&
        Objects.equals(this.employeeUuids, payrollsSkipPayrollRequest.employeeUuids)&&
        Objects.equals(this.additionalProperties, payrollsSkipPayrollRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(payrollType, startDate, endDate, payScheduleUuid, employeeUuids, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayrollsSkipPayrollRequest {\n");
    sb.append("    payrollType: ").append(toIndentedString(payrollType)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    payScheduleUuid: ").append(toIndentedString(payScheduleUuid)).append("\n");
    sb.append("    employeeUuids: ").append(toIndentedString(employeeUuids)).append("\n");
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
    openapiFields.add("payroll_type");
    openapiFields.add("start_date");
    openapiFields.add("end_date");
    openapiFields.add("pay_schedule_uuid");
    openapiFields.add("employee_uuids");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("payroll_type");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PayrollsSkipPayrollRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PayrollsSkipPayrollRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PayrollsSkipPayrollRequest is not found in the empty JSON string", PayrollsSkipPayrollRequest.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : PayrollsSkipPayrollRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("payroll_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payroll_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payroll_type").toString()));
      }
      if ((jsonObj.get("start_date") != null && !jsonObj.get("start_date").isJsonNull()) && !jsonObj.get("start_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `start_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("start_date").toString()));
      }
      if ((jsonObj.get("end_date") != null && !jsonObj.get("end_date").isJsonNull()) && !jsonObj.get("end_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `end_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("end_date").toString()));
      }
      if ((jsonObj.get("pay_schedule_uuid") != null && !jsonObj.get("pay_schedule_uuid").isJsonNull()) && !jsonObj.get("pay_schedule_uuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pay_schedule_uuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pay_schedule_uuid").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("employee_uuids") != null && !jsonObj.get("employee_uuids").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `employee_uuids` to be an array in the JSON string but got `%s`", jsonObj.get("employee_uuids").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PayrollsSkipPayrollRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PayrollsSkipPayrollRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PayrollsSkipPayrollRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PayrollsSkipPayrollRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<PayrollsSkipPayrollRequest>() {
           @Override
           public void write(JsonWriter out, PayrollsSkipPayrollRequest value) throws IOException {
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
           public PayrollsSkipPayrollRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             PayrollsSkipPayrollRequest instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of PayrollsSkipPayrollRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PayrollsSkipPayrollRequest
  * @throws IOException if the JSON string is invalid with respect to PayrollsSkipPayrollRequest
  */
  public static PayrollsSkipPayrollRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PayrollsSkipPayrollRequest.class);
  }

 /**
  * Convert an instance of PayrollsSkipPayrollRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

