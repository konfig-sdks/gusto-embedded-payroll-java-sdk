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
import com.konfigthis.client.model.IntrospectionGetCurrentAccessTokenInfoResponseResource;
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
public class IntrospectionGetCurrentAccessTokenInfoResponse {
  public static final String SERIALIZED_NAME_SCOPE = "scope";
  @SerializedName(SERIALIZED_NAME_SCOPE)
  private String scope;

  public static final String SERIALIZED_NAME_RESOURCE = "resource";
  @SerializedName(SERIALIZED_NAME_RESOURCE)
  private IntrospectionGetCurrentAccessTokenInfoResponseResource resource;

  public IntrospectionGetCurrentAccessTokenInfoResponse() {
  }

  public IntrospectionGetCurrentAccessTokenInfoResponse scope(String scope) {
    
    
    
    
    this.scope = scope;
    return this;
  }

   /**
   * Space delimited string of accessible scopes.
   * @return scope
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Space delimited string of accessible scopes.")

  public String getScope() {
    return scope;
  }


  public void setScope(String scope) {
    
    
    
    this.scope = scope;
  }


  public IntrospectionGetCurrentAccessTokenInfoResponse resource(IntrospectionGetCurrentAccessTokenInfoResponseResource resource) {
    
    
    
    
    this.resource = resource;
    return this;
  }

   /**
   * Get resource
   * @return resource
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public IntrospectionGetCurrentAccessTokenInfoResponseResource getResource() {
    return resource;
  }


  public void setResource(IntrospectionGetCurrentAccessTokenInfoResponseResource resource) {
    
    
    
    this.resource = resource;
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
   * @return the IntrospectionGetCurrentAccessTokenInfoResponse instance itself
   */
  public IntrospectionGetCurrentAccessTokenInfoResponse putAdditionalProperty(String key, Object value) {
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
    IntrospectionGetCurrentAccessTokenInfoResponse introspectionGetCurrentAccessTokenInfoResponse = (IntrospectionGetCurrentAccessTokenInfoResponse) o;
    return Objects.equals(this.scope, introspectionGetCurrentAccessTokenInfoResponse.scope) &&
        Objects.equals(this.resource, introspectionGetCurrentAccessTokenInfoResponse.resource)&&
        Objects.equals(this.additionalProperties, introspectionGetCurrentAccessTokenInfoResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scope, resource, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IntrospectionGetCurrentAccessTokenInfoResponse {\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    resource: ").append(toIndentedString(resource)).append("\n");
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
    openapiFields.add("scope");
    openapiFields.add("resource");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to IntrospectionGetCurrentAccessTokenInfoResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!IntrospectionGetCurrentAccessTokenInfoResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in IntrospectionGetCurrentAccessTokenInfoResponse is not found in the empty JSON string", IntrospectionGetCurrentAccessTokenInfoResponse.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("scope") != null && !jsonObj.get("scope").isJsonNull()) && !jsonObj.get("scope").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `scope` to be a primitive type in the JSON string but got `%s`", jsonObj.get("scope").toString()));
      }
      // validate the optional field `resource`
      if (jsonObj.get("resource") != null && !jsonObj.get("resource").isJsonNull()) {
        IntrospectionGetCurrentAccessTokenInfoResponseResource.validateJsonObject(jsonObj.getAsJsonObject("resource"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!IntrospectionGetCurrentAccessTokenInfoResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'IntrospectionGetCurrentAccessTokenInfoResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<IntrospectionGetCurrentAccessTokenInfoResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(IntrospectionGetCurrentAccessTokenInfoResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<IntrospectionGetCurrentAccessTokenInfoResponse>() {
           @Override
           public void write(JsonWriter out, IntrospectionGetCurrentAccessTokenInfoResponse value) throws IOException {
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
           public IntrospectionGetCurrentAccessTokenInfoResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             IntrospectionGetCurrentAccessTokenInfoResponse instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of IntrospectionGetCurrentAccessTokenInfoResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of IntrospectionGetCurrentAccessTokenInfoResponse
  * @throws IOException if the JSON string is invalid with respect to IntrospectionGetCurrentAccessTokenInfoResponse
  */
  public static IntrospectionGetCurrentAccessTokenInfoResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, IntrospectionGetCurrentAccessTokenInfoResponse.class);
  }

 /**
  * Convert an instance of IntrospectionGetCurrentAccessTokenInfoResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

