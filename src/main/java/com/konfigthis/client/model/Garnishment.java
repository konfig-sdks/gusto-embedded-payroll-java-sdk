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
 * Garnishments, or employee deductions, are fixed amounts or percentages deducted from an employee’s pay. They can be deducted a specific number of times or on a recurring basis. Garnishments can also have maximum deductions on a yearly or per-pay-period bases. Common uses for garnishments are court-ordered payments for child support or back taxes. Some companies provide loans to their employees that are repaid via garnishments.
 */
@ApiModel(description = "Garnishments, or employee deductions, are fixed amounts or percentages deducted from an employee’s pay. They can be deducted a specific number of times or on a recurring basis. Garnishments can also have maximum deductions on a yearly or per-pay-period bases. Common uses for garnishments are court-ordered payments for child support or back taxes. Some companies provide loans to their employees that are repaid via garnishments.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class Garnishment {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private String version;

  public static final String SERIALIZED_NAME_UUID = "uuid";
  @SerializedName(SERIALIZED_NAME_UUID)
  private String uuid;

  public static final String SERIALIZED_NAME_EMPLOYEE_UUID = "employee_uuid";
  @SerializedName(SERIALIZED_NAME_EMPLOYEE_UUID)
  private Integer employeeUuid;

  public static final String SERIALIZED_NAME_ACTIVE = "active";
  @SerializedName(SERIALIZED_NAME_ACTIVE)
  private Boolean active = true;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private Float amount;

  public static final String SERIALIZED_NAME_COURT_ORDERED = "court_ordered";
  @SerializedName(SERIALIZED_NAME_COURT_ORDERED)
  private Boolean courtOrdered;

  public static final String SERIALIZED_NAME_TIMES = "times";
  @SerializedName(SERIALIZED_NAME_TIMES)
  private Integer times;

  public static final String SERIALIZED_NAME_RECURRING = "recurring";
  @SerializedName(SERIALIZED_NAME_RECURRING)
  private Boolean recurring = false;

  public static final String SERIALIZED_NAME_ANNUAL_MAXIMUM = "annual_maximum";
  @SerializedName(SERIALIZED_NAME_ANNUAL_MAXIMUM)
  private Float annualMaximum;

  public static final String SERIALIZED_NAME_PAY_PERIOD_MAXIMUM = "pay_period_maximum";
  @SerializedName(SERIALIZED_NAME_PAY_PERIOD_MAXIMUM)
  private Float payPeriodMaximum;

  public static final String SERIALIZED_NAME_DEDUCT_AS_PERCENTAGE = "deduct_as_percentage";
  @SerializedName(SERIALIZED_NAME_DEDUCT_AS_PERCENTAGE)
  private Boolean deductAsPercentage = false;

  public Garnishment() {
  }

  
  public Garnishment(
     String uuid, 
     Integer employeeUuid
  ) {
    this();
    this.uuid = uuid;
    this.employeeUuid = employeeUuid;
  }

  public Garnishment description(String description) {
    
    
    
    
    this.description = description;
    return this;
  }

   /**
   * The description of the garnishment.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Company loan to employee", value = "The description of the garnishment.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    
    
    
    this.description = description;
  }


  public Garnishment version(String version) {
    
    
    
    
    this.version = version;
    return this;
  }

   /**
   * The current version of the object. See the [versioning guide](https://docs.gusto.com/embedded-payroll/docs/idempotency) for information on how to use this field.
   * @return version
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "52b7c567242cb7452e89ba2bc02cb476", value = "The current version of the object. See the [versioning guide](https://docs.gusto.com/embedded-payroll/docs/idempotency) for information on how to use this field.")

  public String getVersion() {
    return version;
  }


  public void setVersion(String version) {
    
    
    
    this.version = version;
  }


   /**
   * The UUID of the garnishment in Gusto.
   * @return uuid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "4c7841a2-1363-497e-bc0f-664703c7484f", value = "The UUID of the garnishment in Gusto.")

  public String getUuid() {
    return uuid;
  }




   /**
   * The UUID of the employee to which this garnishment belongs.
   * @return employeeUuid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The UUID of the employee to which this garnishment belongs.")

  public Integer getEmployeeUuid() {
    return employeeUuid;
  }




  public Garnishment active(Boolean active) {
    
    
    
    
    this.active = active;
    return this;
  }

   /**
   * Whether or not this garnishment is currently active.
   * @return active
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Whether or not this garnishment is currently active.")

  public Boolean getActive() {
    return active;
  }


  public void setActive(Boolean active) {
    
    
    
    this.active = active;
  }


  public Garnishment amount(Float amount) {
    
    
    
    
    this.amount = amount;
    return this;
  }

   /**
   * The amount of the garnishment. Either a percentage or a fixed dollar amount. Represented as a float, e.g. \&quot;8.00\&quot;.
   * @return amount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "8.00", value = "The amount of the garnishment. Either a percentage or a fixed dollar amount. Represented as a float, e.g. \"8.00\".")

  public Float getAmount() {
    return amount;
  }


  public void setAmount(Float amount) {
    
    
    
    this.amount = amount;
  }


  public Garnishment courtOrdered(Boolean courtOrdered) {
    
    
    
    
    this.courtOrdered = courtOrdered;
    return this;
  }

   /**
   * Whether the garnishment is court ordered.
   * @return courtOrdered
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "Whether the garnishment is court ordered.")

  public Boolean getCourtOrdered() {
    return courtOrdered;
  }


  public void setCourtOrdered(Boolean courtOrdered) {
    
    
    
    this.courtOrdered = courtOrdered;
  }


  public Garnishment times(Integer times) {
    
    
    
    
    this.times = times;
    return this;
  }

   /**
   * The number of times to apply the garnishment. Ignored if recurring is true.
   * @return times
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of times to apply the garnishment. Ignored if recurring is true.")

  public Integer getTimes() {
    return times;
  }


  public void setTimes(Integer times) {
    
    
    
    this.times = times;
  }


  public Garnishment recurring(Boolean recurring) {
    
    
    
    
    this.recurring = recurring;
    return this;
  }

   /**
   * Whether the garnishment should recur indefinitely.
   * @return recurring
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "Whether the garnishment should recur indefinitely.")

  public Boolean getRecurring() {
    return recurring;
  }


  public void setRecurring(Boolean recurring) {
    
    
    
    this.recurring = recurring;
  }


  public Garnishment annualMaximum(Float annualMaximum) {
    
    
    
    
    this.annualMaximum = annualMaximum;
    return this;
  }

   /**
   * The maximum deduction per annum. A null value indicates no maximum. Represented as a float, e.g. \&quot;200.00\&quot;.
   * @return annualMaximum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The maximum deduction per annum. A null value indicates no maximum. Represented as a float, e.g. \"200.00\".")

  public Float getAnnualMaximum() {
    return annualMaximum;
  }


  public void setAnnualMaximum(Float annualMaximum) {
    
    
    
    this.annualMaximum = annualMaximum;
  }


  public Garnishment payPeriodMaximum(Float payPeriodMaximum) {
    
    
    
    
    this.payPeriodMaximum = payPeriodMaximum;
    return this;
  }

   /**
   * The maximum deduction per pay period. A null value indicates no maximum. Represented as a float, e.g. \&quot;16.00\&quot;.
   * @return payPeriodMaximum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The maximum deduction per pay period. A null value indicates no maximum. Represented as a float, e.g. \"16.00\".")

  public Float getPayPeriodMaximum() {
    return payPeriodMaximum;
  }


  public void setPayPeriodMaximum(Float payPeriodMaximum) {
    
    
    
    this.payPeriodMaximum = payPeriodMaximum;
  }


  public Garnishment deductAsPercentage(Boolean deductAsPercentage) {
    
    
    
    
    this.deductAsPercentage = deductAsPercentage;
    return this;
  }

   /**
   * Whether the amount should be treated as a percentage to be deducted per pay period.
   * @return deductAsPercentage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "Whether the amount should be treated as a percentage to be deducted per pay period.")

  public Boolean getDeductAsPercentage() {
    return deductAsPercentage;
  }


  public void setDeductAsPercentage(Boolean deductAsPercentage) {
    
    
    
    this.deductAsPercentage = deductAsPercentage;
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
   * @return the Garnishment instance itself
   */
  public Garnishment putAdditionalProperty(String key, Object value) {
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
    Garnishment garnishment = (Garnishment) o;
    return Objects.equals(this.description, garnishment.description) &&
        Objects.equals(this.version, garnishment.version) &&
        Objects.equals(this.uuid, garnishment.uuid) &&
        Objects.equals(this.employeeUuid, garnishment.employeeUuid) &&
        Objects.equals(this.active, garnishment.active) &&
        Objects.equals(this.amount, garnishment.amount) &&
        Objects.equals(this.courtOrdered, garnishment.courtOrdered) &&
        Objects.equals(this.times, garnishment.times) &&
        Objects.equals(this.recurring, garnishment.recurring) &&
        Objects.equals(this.annualMaximum, garnishment.annualMaximum) &&
        Objects.equals(this.payPeriodMaximum, garnishment.payPeriodMaximum) &&
        Objects.equals(this.deductAsPercentage, garnishment.deductAsPercentage)&&
        Objects.equals(this.additionalProperties, garnishment.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, version, uuid, employeeUuid, active, amount, courtOrdered, times, recurring, annualMaximum, payPeriodMaximum, deductAsPercentage, additionalProperties);
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
    sb.append("class Garnishment {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    employeeUuid: ").append(toIndentedString(employeeUuid)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    courtOrdered: ").append(toIndentedString(courtOrdered)).append("\n");
    sb.append("    times: ").append(toIndentedString(times)).append("\n");
    sb.append("    recurring: ").append(toIndentedString(recurring)).append("\n");
    sb.append("    annualMaximum: ").append(toIndentedString(annualMaximum)).append("\n");
    sb.append("    payPeriodMaximum: ").append(toIndentedString(payPeriodMaximum)).append("\n");
    sb.append("    deductAsPercentage: ").append(toIndentedString(deductAsPercentage)).append("\n");
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
    openapiFields.add("description");
    openapiFields.add("version");
    openapiFields.add("uuid");
    openapiFields.add("employee_uuid");
    openapiFields.add("active");
    openapiFields.add("amount");
    openapiFields.add("court_ordered");
    openapiFields.add("times");
    openapiFields.add("recurring");
    openapiFields.add("annual_maximum");
    openapiFields.add("pay_period_maximum");
    openapiFields.add("deduct_as_percentage");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Garnishment
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Garnishment.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Garnishment is not found in the empty JSON string", Garnishment.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("version") != null && !jsonObj.get("version").isJsonNull()) && !jsonObj.get("version").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `version` to be a primitive type in the JSON string but got `%s`", jsonObj.get("version").toString()));
      }
      if ((jsonObj.get("uuid") != null && !jsonObj.get("uuid").isJsonNull()) && !jsonObj.get("uuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uuid").toString()));
      }
      if ((jsonObj.get("amount") != null && !jsonObj.get("amount").isJsonNull()) && !jsonObj.get("amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("amount").toString()));
      }
      if (!jsonObj.get("annual_maximum").isJsonNull() && (jsonObj.get("annual_maximum") != null && !jsonObj.get("annual_maximum").isJsonNull()) && !jsonObj.get("annual_maximum").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `annual_maximum` to be a primitive type in the JSON string but got `%s`", jsonObj.get("annual_maximum").toString()));
      }
      if (!jsonObj.get("pay_period_maximum").isJsonNull() && (jsonObj.get("pay_period_maximum") != null && !jsonObj.get("pay_period_maximum").isJsonNull()) && !jsonObj.get("pay_period_maximum").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pay_period_maximum` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pay_period_maximum").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Garnishment.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Garnishment' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Garnishment> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Garnishment.class));

       return (TypeAdapter<T>) new TypeAdapter<Garnishment>() {
           @Override
           public void write(JsonWriter out, Garnishment value) throws IOException {
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
           public Garnishment read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             Garnishment instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of Garnishment given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Garnishment
  * @throws IOException if the JSON string is invalid with respect to Garnishment
  */
  public static Garnishment fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Garnishment.class);
  }

 /**
  * Convert an instance of Garnishment to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

