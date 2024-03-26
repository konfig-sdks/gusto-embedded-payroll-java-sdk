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
 * EmployeePaymentMethodUpdatePaymentMethodRequestSplitsInner
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class EmployeePaymentMethodUpdatePaymentMethodRequestSplitsInner {
  public static final String SERIALIZED_NAME_UUID = "uuid";
  @SerializedName(SERIALIZED_NAME_UUID)
  private String uuid;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PRIORITY = "priority";
  @SerializedName(SERIALIZED_NAME_PRIORITY)
  private Integer priority;

  public static final String SERIALIZED_NAME_SPLIT_AMOUNT = "split_amount";
  @SerializedName(SERIALIZED_NAME_SPLIT_AMOUNT)
  private Integer splitAmount;

  public EmployeePaymentMethodUpdatePaymentMethodRequestSplitsInner() {
  }

  public EmployeePaymentMethodUpdatePaymentMethodRequestSplitsInner uuid(String uuid) {
    
    
    
    
    this.uuid = uuid;
    return this;
  }

   /**
   * The bank account ID 
   * @return uuid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The bank account ID ")

  public String getUuid() {
    return uuid;
  }


  public void setUuid(String uuid) {
    
    
    
    this.uuid = uuid;
  }


  public EmployeePaymentMethodUpdatePaymentMethodRequestSplitsInner name(String name) {
    
    
    
    
    this.name = name;
    return this;
  }

   /**
   * The bank account name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The bank account name")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    
    
    
    this.name = name;
  }


  public EmployeePaymentMethodUpdatePaymentMethodRequestSplitsInner priority(Integer priority) {
    
    
    
    
    this.priority = priority;
    return this;
  }

   /**
   * The order of priority for each payment split, with priority 1 being the first bank account paid. Priority must be unique and sequential.
   * @return priority
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The order of priority for each payment split, with priority 1 being the first bank account paid. Priority must be unique and sequential.")

  public Integer getPriority() {
    return priority;
  }


  public void setPriority(Integer priority) {
    
    
    
    this.priority = priority;
  }


  public EmployeePaymentMethodUpdatePaymentMethodRequestSplitsInner splitAmount(Integer splitAmount) {
    
    
    
    
    this.splitAmount = splitAmount;
    return this;
  }

   /**
   * The cents amount allocated for each payment split
   * @return splitAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The cents amount allocated for each payment split")

  public Integer getSplitAmount() {
    return splitAmount;
  }


  public void setSplitAmount(Integer splitAmount) {
    
    
    
    this.splitAmount = splitAmount;
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
   * @return the EmployeePaymentMethodUpdatePaymentMethodRequestSplitsInner instance itself
   */
  public EmployeePaymentMethodUpdatePaymentMethodRequestSplitsInner putAdditionalProperty(String key, Object value) {
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
    EmployeePaymentMethodUpdatePaymentMethodRequestSplitsInner employeePaymentMethodUpdatePaymentMethodRequestSplitsInner = (EmployeePaymentMethodUpdatePaymentMethodRequestSplitsInner) o;
    return Objects.equals(this.uuid, employeePaymentMethodUpdatePaymentMethodRequestSplitsInner.uuid) &&
        Objects.equals(this.name, employeePaymentMethodUpdatePaymentMethodRequestSplitsInner.name) &&
        Objects.equals(this.priority, employeePaymentMethodUpdatePaymentMethodRequestSplitsInner.priority) &&
        Objects.equals(this.splitAmount, employeePaymentMethodUpdatePaymentMethodRequestSplitsInner.splitAmount)&&
        Objects.equals(this.additionalProperties, employeePaymentMethodUpdatePaymentMethodRequestSplitsInner.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(uuid, name, priority, splitAmount, additionalProperties);
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
    sb.append("class EmployeePaymentMethodUpdatePaymentMethodRequestSplitsInner {\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    splitAmount: ").append(toIndentedString(splitAmount)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("priority");
    openapiFields.add("split_amount");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to EmployeePaymentMethodUpdatePaymentMethodRequestSplitsInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!EmployeePaymentMethodUpdatePaymentMethodRequestSplitsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EmployeePaymentMethodUpdatePaymentMethodRequestSplitsInner is not found in the empty JSON string", EmployeePaymentMethodUpdatePaymentMethodRequestSplitsInner.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("uuid") != null && !jsonObj.get("uuid").isJsonNull()) && !jsonObj.get("uuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uuid").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EmployeePaymentMethodUpdatePaymentMethodRequestSplitsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EmployeePaymentMethodUpdatePaymentMethodRequestSplitsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EmployeePaymentMethodUpdatePaymentMethodRequestSplitsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EmployeePaymentMethodUpdatePaymentMethodRequestSplitsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<EmployeePaymentMethodUpdatePaymentMethodRequestSplitsInner>() {
           @Override
           public void write(JsonWriter out, EmployeePaymentMethodUpdatePaymentMethodRequestSplitsInner value) throws IOException {
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
           public EmployeePaymentMethodUpdatePaymentMethodRequestSplitsInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             EmployeePaymentMethodUpdatePaymentMethodRequestSplitsInner instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of EmployeePaymentMethodUpdatePaymentMethodRequestSplitsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EmployeePaymentMethodUpdatePaymentMethodRequestSplitsInner
  * @throws IOException if the JSON string is invalid with respect to EmployeePaymentMethodUpdatePaymentMethodRequestSplitsInner
  */
  public static EmployeePaymentMethodUpdatePaymentMethodRequestSplitsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EmployeePaymentMethodUpdatePaymentMethodRequestSplitsInner.class);
  }

 /**
  * Convert an instance of EmployeePaymentMethodUpdatePaymentMethodRequestSplitsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

