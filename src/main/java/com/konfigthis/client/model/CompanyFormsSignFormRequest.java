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
public class CompanyFormsSignFormRequest {
  public static final String SERIALIZED_NAME_SIGNATURE_TEXT = "signature_text";
  @SerializedName(SERIALIZED_NAME_SIGNATURE_TEXT)
  private String signatureText;

  public static final String SERIALIZED_NAME_AGREE = "agree";
  @SerializedName(SERIALIZED_NAME_AGREE)
  private Boolean agree;

  public static final String SERIALIZED_NAME_SIGNED_BY_IP_ADDRESS = "signed_by_ip_address";
  @SerializedName(SERIALIZED_NAME_SIGNED_BY_IP_ADDRESS)
  private String signedByIpAddress;

  public CompanyFormsSignFormRequest() {
  }

  public CompanyFormsSignFormRequest signatureText(String signatureText) {
    
    
    
    
    this.signatureText = signatureText;
    return this;
  }

   /**
   * The signature
   * @return signatureText
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The signature")

  public String getSignatureText() {
    return signatureText;
  }


  public void setSignatureText(String signatureText) {
    
    
    
    this.signatureText = signatureText;
  }


  public CompanyFormsSignFormRequest agree(Boolean agree) {
    
    
    
    
    this.agree = agree;
    return this;
  }

   /**
   * whether you agree to sign electronically
   * @return agree
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "whether you agree to sign electronically")

  public Boolean getAgree() {
    return agree;
  }


  public void setAgree(Boolean agree) {
    
    
    
    this.agree = agree;
  }


  public CompanyFormsSignFormRequest signedByIpAddress(String signedByIpAddress) {
    
    
    
    
    this.signedByIpAddress = signedByIpAddress;
    return this;
  }

   /**
   * The IP address of the signatory who signed the form.
   * @return signedByIpAddress
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The IP address of the signatory who signed the form.")

  public String getSignedByIpAddress() {
    return signedByIpAddress;
  }


  public void setSignedByIpAddress(String signedByIpAddress) {
    
    
    
    this.signedByIpAddress = signedByIpAddress;
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
   * @return the CompanyFormsSignFormRequest instance itself
   */
  public CompanyFormsSignFormRequest putAdditionalProperty(String key, Object value) {
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
    CompanyFormsSignFormRequest companyFormsSignFormRequest = (CompanyFormsSignFormRequest) o;
    return Objects.equals(this.signatureText, companyFormsSignFormRequest.signatureText) &&
        Objects.equals(this.agree, companyFormsSignFormRequest.agree) &&
        Objects.equals(this.signedByIpAddress, companyFormsSignFormRequest.signedByIpAddress)&&
        Objects.equals(this.additionalProperties, companyFormsSignFormRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(signatureText, agree, signedByIpAddress, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompanyFormsSignFormRequest {\n");
    sb.append("    signatureText: ").append(toIndentedString(signatureText)).append("\n");
    sb.append("    agree: ").append(toIndentedString(agree)).append("\n");
    sb.append("    signedByIpAddress: ").append(toIndentedString(signedByIpAddress)).append("\n");
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
    openapiFields.add("signature_text");
    openapiFields.add("agree");
    openapiFields.add("signed_by_ip_address");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("signature_text");
    openapiRequiredFields.add("agree");
    openapiRequiredFields.add("signed_by_ip_address");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CompanyFormsSignFormRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CompanyFormsSignFormRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CompanyFormsSignFormRequest is not found in the empty JSON string", CompanyFormsSignFormRequest.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CompanyFormsSignFormRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("signature_text").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `signature_text` to be a primitive type in the JSON string but got `%s`", jsonObj.get("signature_text").toString()));
      }
      if (!jsonObj.get("signed_by_ip_address").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `signed_by_ip_address` to be a primitive type in the JSON string but got `%s`", jsonObj.get("signed_by_ip_address").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CompanyFormsSignFormRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CompanyFormsSignFormRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CompanyFormsSignFormRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CompanyFormsSignFormRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CompanyFormsSignFormRequest>() {
           @Override
           public void write(JsonWriter out, CompanyFormsSignFormRequest value) throws IOException {
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
           public CompanyFormsSignFormRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             CompanyFormsSignFormRequest instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of CompanyFormsSignFormRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CompanyFormsSignFormRequest
  * @throws IOException if the JSON string is invalid with respect to CompanyFormsSignFormRequest
  */
  public static CompanyFormsSignFormRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CompanyFormsSignFormRequest.class);
  }

 /**
  * Convert an instance of CompanyFormsSignFormRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

