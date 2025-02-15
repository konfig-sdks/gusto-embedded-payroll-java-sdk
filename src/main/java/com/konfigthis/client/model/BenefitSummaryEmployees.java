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
import com.konfigthis.client.model.BenefitSummaryEmployeesPayrollBenefits;
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
public class BenefitSummaryEmployees {
  public static final String SERIALIZED_NAME_UUID = "uuid";
  @SerializedName(SERIALIZED_NAME_UUID)
  private String uuid;

  public static final String SERIALIZED_NAME_COMPANY_BENEFIT_DEDUCTION = "company_benefit_deduction";
  @SerializedName(SERIALIZED_NAME_COMPANY_BENEFIT_DEDUCTION)
  private String companyBenefitDeduction;

  public static final String SERIALIZED_NAME_COMPANY_BENEFIT_CONTRIBUTION = "company_benefit_contribution";
  @SerializedName(SERIALIZED_NAME_COMPANY_BENEFIT_CONTRIBUTION)
  private String companyBenefitContribution;

  public static final String SERIALIZED_NAME_BENEFIT_DEDUCTION = "benefit_deduction";
  @SerializedName(SERIALIZED_NAME_BENEFIT_DEDUCTION)
  private String benefitDeduction;

  public static final String SERIALIZED_NAME_BENEFIT_CONTRIBUTION = "benefit_contribution";
  @SerializedName(SERIALIZED_NAME_BENEFIT_CONTRIBUTION)
  private String benefitContribution;

  public static final String SERIALIZED_NAME_GROSS_PAY = "gross_pay";
  @SerializedName(SERIALIZED_NAME_GROSS_PAY)
  private String grossPay;

  public static final String SERIALIZED_NAME_PAYROLL_BENEFITS = "payroll_benefits";
  @SerializedName(SERIALIZED_NAME_PAYROLL_BENEFITS)
  private BenefitSummaryEmployeesPayrollBenefits payrollBenefits;

  public BenefitSummaryEmployees() {
  }

  public BenefitSummaryEmployees uuid(String uuid) {
    
    
    
    
    this.uuid = uuid;
    return this;
  }

   /**
   * The UUID of the employee
   * @return uuid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The UUID of the employee")

  public String getUuid() {
    return uuid;
  }


  public void setUuid(String uuid) {
    
    
    
    this.uuid = uuid;
  }


  public BenefitSummaryEmployees companyBenefitDeduction(String companyBenefitDeduction) {
    
    
    
    
    this.companyBenefitDeduction = companyBenefitDeduction;
    return this;
  }

   /**
   * The aggregate of employee deduction for all employees given the period of time and benefit type.
   * @return companyBenefitDeduction
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The aggregate of employee deduction for all employees given the period of time and benefit type.")

  public String getCompanyBenefitDeduction() {
    return companyBenefitDeduction;
  }


  public void setCompanyBenefitDeduction(String companyBenefitDeduction) {
    
    
    
    this.companyBenefitDeduction = companyBenefitDeduction;
  }


  public BenefitSummaryEmployees companyBenefitContribution(String companyBenefitContribution) {
    
    
    
    
    this.companyBenefitContribution = companyBenefitContribution;
    return this;
  }

   /**
   * The aggregate of company contribution for all employees given the period of time and benefit type.
   * @return companyBenefitContribution
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The aggregate of company contribution for all employees given the period of time and benefit type.")

  public String getCompanyBenefitContribution() {
    return companyBenefitContribution;
  }


  public void setCompanyBenefitContribution(String companyBenefitContribution) {
    
    
    
    this.companyBenefitContribution = companyBenefitContribution;
  }


  public BenefitSummaryEmployees benefitDeduction(String benefitDeduction) {
    
    
    
    
    this.benefitDeduction = benefitDeduction;
    return this;
  }

   /**
   * Sum of employee benefit deduction given the period of time for this specific employee.
   * @return benefitDeduction
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Sum of employee benefit deduction given the period of time for this specific employee.")

  public String getBenefitDeduction() {
    return benefitDeduction;
  }


  public void setBenefitDeduction(String benefitDeduction) {
    
    
    
    this.benefitDeduction = benefitDeduction;
  }


  public BenefitSummaryEmployees benefitContribution(String benefitContribution) {
    
    
    
    
    this.benefitContribution = benefitContribution;
    return this;
  }

   /**
   * Sum of company contribution given the period of time for this specific employee.
   * @return benefitContribution
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Sum of company contribution given the period of time for this specific employee.")

  public String getBenefitContribution() {
    return benefitContribution;
  }


  public void setBenefitContribution(String benefitContribution) {
    
    
    
    this.benefitContribution = benefitContribution;
  }


  public BenefitSummaryEmployees grossPay(String grossPay) {
    
    
    
    
    this.grossPay = grossPay;
    return this;
  }

   /**
   * Gross pay of this pay check.
   * @return grossPay
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Gross pay of this pay check.")

  public String getGrossPay() {
    return grossPay;
  }


  public void setGrossPay(String grossPay) {
    
    
    
    this.grossPay = grossPay;
  }


  public BenefitSummaryEmployees payrollBenefits(BenefitSummaryEmployeesPayrollBenefits payrollBenefits) {
    
    
    
    
    this.payrollBenefits = payrollBenefits;
    return this;
  }

   /**
   * Get payrollBenefits
   * @return payrollBenefits
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BenefitSummaryEmployeesPayrollBenefits getPayrollBenefits() {
    return payrollBenefits;
  }


  public void setPayrollBenefits(BenefitSummaryEmployeesPayrollBenefits payrollBenefits) {
    
    
    
    this.payrollBenefits = payrollBenefits;
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
   * @return the BenefitSummaryEmployees instance itself
   */
  public BenefitSummaryEmployees putAdditionalProperty(String key, Object value) {
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
    BenefitSummaryEmployees benefitSummaryEmployees = (BenefitSummaryEmployees) o;
    return Objects.equals(this.uuid, benefitSummaryEmployees.uuid) &&
        Objects.equals(this.companyBenefitDeduction, benefitSummaryEmployees.companyBenefitDeduction) &&
        Objects.equals(this.companyBenefitContribution, benefitSummaryEmployees.companyBenefitContribution) &&
        Objects.equals(this.benefitDeduction, benefitSummaryEmployees.benefitDeduction) &&
        Objects.equals(this.benefitContribution, benefitSummaryEmployees.benefitContribution) &&
        Objects.equals(this.grossPay, benefitSummaryEmployees.grossPay) &&
        Objects.equals(this.payrollBenefits, benefitSummaryEmployees.payrollBenefits)&&
        Objects.equals(this.additionalProperties, benefitSummaryEmployees.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uuid, companyBenefitDeduction, companyBenefitContribution, benefitDeduction, benefitContribution, grossPay, payrollBenefits, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BenefitSummaryEmployees {\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    companyBenefitDeduction: ").append(toIndentedString(companyBenefitDeduction)).append("\n");
    sb.append("    companyBenefitContribution: ").append(toIndentedString(companyBenefitContribution)).append("\n");
    sb.append("    benefitDeduction: ").append(toIndentedString(benefitDeduction)).append("\n");
    sb.append("    benefitContribution: ").append(toIndentedString(benefitContribution)).append("\n");
    sb.append("    grossPay: ").append(toIndentedString(grossPay)).append("\n");
    sb.append("    payrollBenefits: ").append(toIndentedString(payrollBenefits)).append("\n");
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
    openapiFields.add("company_benefit_deduction");
    openapiFields.add("company_benefit_contribution");
    openapiFields.add("benefit_deduction");
    openapiFields.add("benefit_contribution");
    openapiFields.add("gross_pay");
    openapiFields.add("payroll_benefits");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to BenefitSummaryEmployees
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!BenefitSummaryEmployees.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in BenefitSummaryEmployees is not found in the empty JSON string", BenefitSummaryEmployees.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("uuid") != null && !jsonObj.get("uuid").isJsonNull()) && !jsonObj.get("uuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uuid").toString()));
      }
      if ((jsonObj.get("company_benefit_deduction") != null && !jsonObj.get("company_benefit_deduction").isJsonNull()) && !jsonObj.get("company_benefit_deduction").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `company_benefit_deduction` to be a primitive type in the JSON string but got `%s`", jsonObj.get("company_benefit_deduction").toString()));
      }
      if ((jsonObj.get("company_benefit_contribution") != null && !jsonObj.get("company_benefit_contribution").isJsonNull()) && !jsonObj.get("company_benefit_contribution").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `company_benefit_contribution` to be a primitive type in the JSON string but got `%s`", jsonObj.get("company_benefit_contribution").toString()));
      }
      if ((jsonObj.get("benefit_deduction") != null && !jsonObj.get("benefit_deduction").isJsonNull()) && !jsonObj.get("benefit_deduction").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `benefit_deduction` to be a primitive type in the JSON string but got `%s`", jsonObj.get("benefit_deduction").toString()));
      }
      if ((jsonObj.get("benefit_contribution") != null && !jsonObj.get("benefit_contribution").isJsonNull()) && !jsonObj.get("benefit_contribution").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `benefit_contribution` to be a primitive type in the JSON string but got `%s`", jsonObj.get("benefit_contribution").toString()));
      }
      if ((jsonObj.get("gross_pay") != null && !jsonObj.get("gross_pay").isJsonNull()) && !jsonObj.get("gross_pay").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gross_pay` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gross_pay").toString()));
      }
      // validate the optional field `payroll_benefits`
      if (jsonObj.get("payroll_benefits") != null && !jsonObj.get("payroll_benefits").isJsonNull()) {
        BenefitSummaryEmployeesPayrollBenefits.validateJsonObject(jsonObj.getAsJsonObject("payroll_benefits"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BenefitSummaryEmployees.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BenefitSummaryEmployees' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BenefitSummaryEmployees> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BenefitSummaryEmployees.class));

       return (TypeAdapter<T>) new TypeAdapter<BenefitSummaryEmployees>() {
           @Override
           public void write(JsonWriter out, BenefitSummaryEmployees value) throws IOException {
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
           public BenefitSummaryEmployees read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             BenefitSummaryEmployees instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of BenefitSummaryEmployees given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BenefitSummaryEmployees
  * @throws IOException if the JSON string is invalid with respect to BenefitSummaryEmployees
  */
  public static BenefitSummaryEmployees fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BenefitSummaryEmployees.class);
  }

 /**
  * Convert an instance of BenefitSummaryEmployees to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

