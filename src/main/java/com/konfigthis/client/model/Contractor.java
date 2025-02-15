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
import com.konfigthis.client.model.ContractorAddress;
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
 * The representation of a contractor (individual or business) in Gusto.
 */
@ApiModel(description = "The representation of a contractor (individual or business) in Gusto.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class Contractor {
  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private String version;

  public static final String SERIALIZED_NAME_UUID = "uuid";
  @SerializedName(SERIALIZED_NAME_UUID)
  private String uuid;

  public static final String SERIALIZED_NAME_COMPANY_UUID = "company_uuid";
  @SerializedName(SERIALIZED_NAME_COMPANY_UUID)
  private String companyUuid;

  /**
   * The contractor&#39;s wage type, either \&quot;Fixed\&quot; or \&quot;Hourly\&quot;.
   */
  @JsonAdapter(WageTypeEnum.Adapter.class)
 public enum WageTypeEnum {
    FIXED("Fixed"),
    
    HOURLY("Hourly");

    private String value;

    WageTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static WageTypeEnum fromValue(String value) {
      for (WageTypeEnum b : WageTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<WageTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final WageTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public WageTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return WageTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_WAGE_TYPE = "wage_type";
  @SerializedName(SERIALIZED_NAME_WAGE_TYPE)
  private WageTypeEnum wageType;

  public static final String SERIALIZED_NAME_IS_ACTIVE = "is_active";
  @SerializedName(SERIALIZED_NAME_IS_ACTIVE)
  private Boolean isActive = true;

  /**
   * The contractor&#39;s type, either \&quot;Individual\&quot; or \&quot;Business\&quot;. 
   */
  @JsonAdapter(TypeEnum.Adapter.class)
 public enum TypeEnum {
    INDIVIDUAL("Individual"),
    
    BUSINESS("Business");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type;

  public static final String SERIALIZED_NAME_FIRST_NAME = "first_name";
  @SerializedName(SERIALIZED_NAME_FIRST_NAME)
  private String firstName;

  public static final String SERIALIZED_NAME_LAST_NAME = "last_name";
  @SerializedName(SERIALIZED_NAME_LAST_NAME)
  private String lastName;

  public static final String SERIALIZED_NAME_MIDDLE_INITIAL = "middle_initial";
  @SerializedName(SERIALIZED_NAME_MIDDLE_INITIAL)
  private String middleInitial;

  public static final String SERIALIZED_NAME_BUSINESS_NAME = "business_name";
  @SerializedName(SERIALIZED_NAME_BUSINESS_NAME)
  private String businessName;

  public static final String SERIALIZED_NAME_EIN = "ein";
  @SerializedName(SERIALIZED_NAME_EIN)
  private String ein;

  public static final String SERIALIZED_NAME_HAS_EIN = "has_ein";
  @SerializedName(SERIALIZED_NAME_HAS_EIN)
  private Boolean hasEin;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_START_DATE = "start_date";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private String startDate;

  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private ContractorAddress address;

  public static final String SERIALIZED_NAME_HOURLY_RATE = "hourly_rate";
  @SerializedName(SERIALIZED_NAME_HOURLY_RATE)
  private String hourlyRate;

  public static final String SERIALIZED_NAME_FILE_NEW_HIRE_REPORT = "file_new_hire_report";
  @SerializedName(SERIALIZED_NAME_FILE_NEW_HIRE_REPORT)
  private Boolean fileNewHireReport = false;

  public static final String SERIALIZED_NAME_WORK_STATE = "work_state";
  @SerializedName(SERIALIZED_NAME_WORK_STATE)
  private String workState;

  public static final String SERIALIZED_NAME_ONBOARDED = "onboarded";
  @SerializedName(SERIALIZED_NAME_ONBOARDED)
  private Boolean onboarded;

  /**
   * One of the \&quot;onboarding_status\&quot; enum values.
   */
  @JsonAdapter(OnboardingStatusEnum.Adapter.class)
 public enum OnboardingStatusEnum {
    ONBOARDING_COMPLETED("onboarding_completed"),
    
    ADMIN_ONBOARDING_REVIEW("admin_onboarding_review"),
    
    ADMIN_ONBOARDING_INCOMPLETE("admin_onboarding_incomplete");

    private String value;

    OnboardingStatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static OnboardingStatusEnum fromValue(String value) {
      for (OnboardingStatusEnum b : OnboardingStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<OnboardingStatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final OnboardingStatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public OnboardingStatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return OnboardingStatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_ONBOARDING_STATUS = "onboarding_status";
  @SerializedName(SERIALIZED_NAME_ONBOARDING_STATUS)
  private OnboardingStatusEnum onboardingStatus;

  public Contractor() {
  }

  
  public Contractor(
     String uuid, 
     String companyUuid, 
     Boolean isActive, 
     String startDate
  ) {
    this();
    this.uuid = uuid;
    this.companyUuid = companyUuid;
    this.isActive = isActive;
    this.startDate = startDate;
  }

  public Contractor version(String version) {
    
    
    
    
    this.version = version;
    return this;
  }

   /**
   * The current version of the object. See the [versioning guide](https://docs.gusto.com/embedded-payroll/docs/idempotency) for information on how to use this field.
   * @return version
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The current version of the object. See the [versioning guide](https://docs.gusto.com/embedded-payroll/docs/idempotency) for information on how to use this field.")

  public String getVersion() {
    return version;
  }


  public void setVersion(String version) {
    
    
    
    this.version = version;
  }


   /**
   * The UUID of the contractor in Gusto.
   * @return uuid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The UUID of the contractor in Gusto.")

  public String getUuid() {
    return uuid;
  }




   /**
   * The UUID of the company the contractor is employed by.
   * @return companyUuid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The UUID of the company the contractor is employed by.")

  public String getCompanyUuid() {
    return companyUuid;
  }




  public Contractor wageType(WageTypeEnum wageType) {
    
    
    
    
    this.wageType = wageType;
    return this;
  }

   /**
   * The contractor&#39;s wage type, either \&quot;Fixed\&quot; or \&quot;Hourly\&quot;.
   * @return wageType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The contractor's wage type, either \"Fixed\" or \"Hourly\".")

  public WageTypeEnum getWageType() {
    return wageType;
  }


  public void setWageType(WageTypeEnum wageType) {
    
    
    
    this.wageType = wageType;
  }


   /**
   * The status of the contractor with the company.
   * @return isActive
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "The status of the contractor with the company.")

  public Boolean getIsActive() {
    return isActive;
  }




  public Contractor type(TypeEnum type) {
    
    
    
    
    this.type = type;
    return this;
  }

   /**
   * The contractor&#39;s type, either \&quot;Individual\&quot; or \&quot;Business\&quot;. 
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The contractor's type, either \"Individual\" or \"Business\". ")

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    
    
    
    this.type = type;
  }


  public Contractor firstName(String firstName) {
    
    
    
    
    this.firstName = firstName;
    return this;
  }

   /**
   * The contractor’s first name. This attribute is required for “Individual” contractors and will be ignored for “Business” contractors.
   * @return firstName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The contractor’s first name. This attribute is required for “Individual” contractors and will be ignored for “Business” contractors.")

  public String getFirstName() {
    return firstName;
  }


  public void setFirstName(String firstName) {
    
    
    
    this.firstName = firstName;
  }


  public Contractor lastName(String lastName) {
    
    
    
    
    this.lastName = lastName;
    return this;
  }

   /**
   * The contractor’s last name. This attribute is required for “Individual” contractors and will be ignored for “Business” contractors.
   * @return lastName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The contractor’s last name. This attribute is required for “Individual” contractors and will be ignored for “Business” contractors.")

  public String getLastName() {
    return lastName;
  }


  public void setLastName(String lastName) {
    
    
    
    this.lastName = lastName;
  }


  public Contractor middleInitial(String middleInitial) {
    
    
    
    
    this.middleInitial = middleInitial;
    return this;
  }

   /**
   * The contractor’s middle initial. This attribute is optional for “Individual” contractors and will be ignored for “Business” contractors.
   * @return middleInitial
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The contractor’s middle initial. This attribute is optional for “Individual” contractors and will be ignored for “Business” contractors.")

  public String getMiddleInitial() {
    return middleInitial;
  }


  public void setMiddleInitial(String middleInitial) {
    
    
    
    this.middleInitial = middleInitial;
  }


  public Contractor businessName(String businessName) {
    
    
    
    
    this.businessName = businessName;
    return this;
  }

   /**
   * The name of the contractor business. This attribute is required for “Business” contractors and will be ignored for “Individual” contractors.
   * @return businessName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the contractor business. This attribute is required for “Business” contractors and will be ignored for “Individual” contractors.")

  public String getBusinessName() {
    return businessName;
  }


  public void setBusinessName(String businessName) {
    
    
    
    this.businessName = businessName;
  }


  public Contractor ein(String ein) {
    
    
    
    
    this.ein = ein;
    return this;
  }

   /**
   * The Federal Employer Identification Number of the contractor business. This attribute is optional for “Business” contractors and will be ignored for “Individual” contractors.
   * @return ein
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The Federal Employer Identification Number of the contractor business. This attribute is optional for “Business” contractors and will be ignored for “Individual” contractors.")

  public String getEin() {
    return ein;
  }


  public void setEin(String ein) {
    
    
    
    this.ein = ein;
  }


  public Contractor hasEin(Boolean hasEin) {
    
    
    
    
    this.hasEin = hasEin;
    return this;
  }

   /**
   * Whether company&#39;s Employer Identification Number (EIN) is present
   * @return hasEin
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether company's Employer Identification Number (EIN) is present")

  public Boolean getHasEin() {
    return hasEin;
  }


  public void setHasEin(Boolean hasEin) {
    
    
    
    this.hasEin = hasEin;
  }


  public Contractor email(String email) {
    
    
    
    
    this.email = email;
    return this;
  }

   /**
   * The contractor’s email address. This attribute is optional for “Individual” contractors and will be ignored for “Business” contractors. 
   * @return email
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The contractor’s email address. This attribute is optional for “Individual” contractors and will be ignored for “Business” contractors. ")

  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    
    
    
    this.email = email;
  }


   /**
   * The contractor&#39;s start date.
   * @return startDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The contractor's start date.")

  public String getStartDate() {
    return startDate;
  }




  public Contractor address(ContractorAddress address) {
    
    
    
    
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ContractorAddress getAddress() {
    return address;
  }


  public void setAddress(ContractorAddress address) {
    
    
    
    this.address = address;
  }


  public Contractor hourlyRate(String hourlyRate) {
    
    
    
    
    this.hourlyRate = hourlyRate;
    return this;
  }

   /**
   * The contractor’s hourly rate. This attribute is required if the wage_type is “Hourly”.
   * @return hourlyRate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "50.0", value = "The contractor’s hourly rate. This attribute is required if the wage_type is “Hourly”.")

  public String getHourlyRate() {
    return hourlyRate;
  }


  public void setHourlyRate(String hourlyRate) {
    
    
    
    this.hourlyRate = hourlyRate;
  }


  public Contractor fileNewHireReport(Boolean fileNewHireReport) {
    
    
    
    
    this.fileNewHireReport = fileNewHireReport;
    return this;
  }

   /**
   * The boolean flag indicating whether Gusto will file a new hire report for the contractor
   * @return fileNewHireReport
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "The boolean flag indicating whether Gusto will file a new hire report for the contractor")

  public Boolean getFileNewHireReport() {
    return fileNewHireReport;
  }


  public void setFileNewHireReport(Boolean fileNewHireReport) {
    
    
    
    this.fileNewHireReport = fileNewHireReport;
  }


  public Contractor workState(String workState) {
    
    
    
    
    this.workState = workState;
    return this;
  }

   /**
   * State where the contractor will be conducting the majority of their work for the company. This value is used when generating the new hire report.
   * @return workState
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "State where the contractor will be conducting the majority of their work for the company. This value is used when generating the new hire report.")

  public String getWorkState() {
    return workState;
  }


  public void setWorkState(String workState) {
    
    
    
    this.workState = workState;
  }


  public Contractor onboarded(Boolean onboarded) {
    
    
    
    
    this.onboarded = onboarded;
    return this;
  }

   /**
   * The updated onboarding status for the contractor
   * @return onboarded
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The updated onboarding status for the contractor")

  public Boolean getOnboarded() {
    return onboarded;
  }


  public void setOnboarded(Boolean onboarded) {
    
    
    
    this.onboarded = onboarded;
  }


  public Contractor onboardingStatus(OnboardingStatusEnum onboardingStatus) {
    
    
    
    
    this.onboardingStatus = onboardingStatus;
    return this;
  }

   /**
   * One of the \&quot;onboarding_status\&quot; enum values.
   * @return onboardingStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "One of the \"onboarding_status\" enum values.")

  public OnboardingStatusEnum getOnboardingStatus() {
    return onboardingStatus;
  }


  public void setOnboardingStatus(OnboardingStatusEnum onboardingStatus) {
    
    
    
    this.onboardingStatus = onboardingStatus;
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
   * @return the Contractor instance itself
   */
  public Contractor putAdditionalProperty(String key, Object value) {
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
    Contractor contractor = (Contractor) o;
    return Objects.equals(this.version, contractor.version) &&
        Objects.equals(this.uuid, contractor.uuid) &&
        Objects.equals(this.companyUuid, contractor.companyUuid) &&
        Objects.equals(this.wageType, contractor.wageType) &&
        Objects.equals(this.isActive, contractor.isActive) &&
        Objects.equals(this.type, contractor.type) &&
        Objects.equals(this.firstName, contractor.firstName) &&
        Objects.equals(this.lastName, contractor.lastName) &&
        Objects.equals(this.middleInitial, contractor.middleInitial) &&
        Objects.equals(this.businessName, contractor.businessName) &&
        Objects.equals(this.ein, contractor.ein) &&
        Objects.equals(this.hasEin, contractor.hasEin) &&
        Objects.equals(this.email, contractor.email) &&
        Objects.equals(this.startDate, contractor.startDate) &&
        Objects.equals(this.address, contractor.address) &&
        Objects.equals(this.hourlyRate, contractor.hourlyRate) &&
        Objects.equals(this.fileNewHireReport, contractor.fileNewHireReport) &&
        Objects.equals(this.workState, contractor.workState) &&
        Objects.equals(this.onboarded, contractor.onboarded) &&
        Objects.equals(this.onboardingStatus, contractor.onboardingStatus)&&
        Objects.equals(this.additionalProperties, contractor.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(version, uuid, companyUuid, wageType, isActive, type, firstName, lastName, middleInitial, businessName, ein, hasEin, email, startDate, address, hourlyRate, fileNewHireReport, workState, onboarded, onboardingStatus, additionalProperties);
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
    sb.append("class Contractor {\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    companyUuid: ").append(toIndentedString(companyUuid)).append("\n");
    sb.append("    wageType: ").append(toIndentedString(wageType)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    middleInitial: ").append(toIndentedString(middleInitial)).append("\n");
    sb.append("    businessName: ").append(toIndentedString(businessName)).append("\n");
    sb.append("    ein: ").append(toIndentedString(ein)).append("\n");
    sb.append("    hasEin: ").append(toIndentedString(hasEin)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    hourlyRate: ").append(toIndentedString(hourlyRate)).append("\n");
    sb.append("    fileNewHireReport: ").append(toIndentedString(fileNewHireReport)).append("\n");
    sb.append("    workState: ").append(toIndentedString(workState)).append("\n");
    sb.append("    onboarded: ").append(toIndentedString(onboarded)).append("\n");
    sb.append("    onboardingStatus: ").append(toIndentedString(onboardingStatus)).append("\n");
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
    openapiFields.add("company_uuid");
    openapiFields.add("wage_type");
    openapiFields.add("is_active");
    openapiFields.add("type");
    openapiFields.add("first_name");
    openapiFields.add("last_name");
    openapiFields.add("middle_initial");
    openapiFields.add("business_name");
    openapiFields.add("ein");
    openapiFields.add("has_ein");
    openapiFields.add("email");
    openapiFields.add("start_date");
    openapiFields.add("address");
    openapiFields.add("hourly_rate");
    openapiFields.add("file_new_hire_report");
    openapiFields.add("work_state");
    openapiFields.add("onboarded");
    openapiFields.add("onboarding_status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Contractor
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Contractor.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Contractor is not found in the empty JSON string", Contractor.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("version") != null && !jsonObj.get("version").isJsonNull()) && !jsonObj.get("version").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `version` to be a primitive type in the JSON string but got `%s`", jsonObj.get("version").toString()));
      }
      if ((jsonObj.get("uuid") != null && !jsonObj.get("uuid").isJsonNull()) && !jsonObj.get("uuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uuid").toString()));
      }
      if ((jsonObj.get("company_uuid") != null && !jsonObj.get("company_uuid").isJsonNull()) && !jsonObj.get("company_uuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `company_uuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("company_uuid").toString()));
      }
      if ((jsonObj.get("wage_type") != null && !jsonObj.get("wage_type").isJsonNull()) && !jsonObj.get("wage_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `wage_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("wage_type").toString()));
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if (!jsonObj.get("first_name").isJsonNull() && (jsonObj.get("first_name") != null && !jsonObj.get("first_name").isJsonNull()) && !jsonObj.get("first_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `first_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("first_name").toString()));
      }
      if (!jsonObj.get("last_name").isJsonNull() && (jsonObj.get("last_name") != null && !jsonObj.get("last_name").isJsonNull()) && !jsonObj.get("last_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `last_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("last_name").toString()));
      }
      if (!jsonObj.get("middle_initial").isJsonNull() && (jsonObj.get("middle_initial") != null && !jsonObj.get("middle_initial").isJsonNull()) && !jsonObj.get("middle_initial").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `middle_initial` to be a primitive type in the JSON string but got `%s`", jsonObj.get("middle_initial").toString()));
      }
      if (!jsonObj.get("business_name").isJsonNull() && (jsonObj.get("business_name") != null && !jsonObj.get("business_name").isJsonNull()) && !jsonObj.get("business_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `business_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("business_name").toString()));
      }
      if (!jsonObj.get("ein").isJsonNull() && (jsonObj.get("ein") != null && !jsonObj.get("ein").isJsonNull()) && !jsonObj.get("ein").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ein` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ein").toString()));
      }
      if (!jsonObj.get("email").isJsonNull() && (jsonObj.get("email") != null && !jsonObj.get("email").isJsonNull()) && !jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      if ((jsonObj.get("start_date") != null && !jsonObj.get("start_date").isJsonNull()) && !jsonObj.get("start_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `start_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("start_date").toString()));
      }
      // validate the optional field `address`
      if (jsonObj.get("address") != null && !jsonObj.get("address").isJsonNull()) {
        ContractorAddress.validateJsonObject(jsonObj.getAsJsonObject("address"));
      }
      if ((jsonObj.get("hourly_rate") != null && !jsonObj.get("hourly_rate").isJsonNull()) && !jsonObj.get("hourly_rate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `hourly_rate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("hourly_rate").toString()));
      }
      if (!jsonObj.get("work_state").isJsonNull() && (jsonObj.get("work_state") != null && !jsonObj.get("work_state").isJsonNull()) && !jsonObj.get("work_state").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `work_state` to be a primitive type in the JSON string but got `%s`", jsonObj.get("work_state").toString()));
      }
      if ((jsonObj.get("onboarding_status") != null && !jsonObj.get("onboarding_status").isJsonNull()) && !jsonObj.get("onboarding_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `onboarding_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("onboarding_status").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Contractor.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Contractor' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Contractor> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Contractor.class));

       return (TypeAdapter<T>) new TypeAdapter<Contractor>() {
           @Override
           public void write(JsonWriter out, Contractor value) throws IOException {
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
           public Contractor read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             Contractor instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of Contractor given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Contractor
  * @throws IOException if the JSON string is invalid with respect to Contractor
  */
  public static Contractor fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Contractor.class);
  }

 /**
  * Convert an instance of Contractor to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

