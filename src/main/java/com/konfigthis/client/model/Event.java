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
 * Representation of an Event
 */
@ApiModel(description = "Representation of an Event")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class Event {
  public static final String SERIALIZED_NAME_UUID = "uuid";
  @SerializedName(SERIALIZED_NAME_UUID)
  private String uuid;

  public static final String SERIALIZED_NAME_EVENT_TYPE = "event_type";
  @SerializedName(SERIALIZED_NAME_EVENT_TYPE)
  private String eventType;

  /**
   * Name of the parent resource of the described entity.
   */
  @JsonAdapter(ResourceTypeEnum.Adapter.class)
 public enum ResourceTypeEnum {
    COMPANY("Company");

    private String value;

    ResourceTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ResourceTypeEnum fromValue(String value) {
      for (ResourceTypeEnum b : ResourceTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ResourceTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ResourceTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ResourceTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ResourceTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_RESOURCE_TYPE = "resource_type";
  @SerializedName(SERIALIZED_NAME_RESOURCE_TYPE)
  private ResourceTypeEnum resourceType;

  public static final String SERIALIZED_NAME_RESOURCE_UUID = "resource_uuid";
  @SerializedName(SERIALIZED_NAME_RESOURCE_UUID)
  private String resourceUuid;

  public static final String SERIALIZED_NAME_ENTITY_TYPE = "entity_type";
  @SerializedName(SERIALIZED_NAME_ENTITY_TYPE)
  private String entityType;

  public static final String SERIALIZED_NAME_ENTITY_UUID = "entity_uuid";
  @SerializedName(SERIALIZED_NAME_ENTITY_UUID)
  private String entityUuid;

  public static final String SERIALIZED_NAME_TIMESTAMP = "timestamp";
  @SerializedName(SERIALIZED_NAME_TIMESTAMP)
  private Integer timestamp;

  public Event() {
  }

  public Event uuid(String uuid) {
    
    
    
    
    this.uuid = uuid;
    return this;
  }

   /**
   * Unique identifier for the event.
   * @return uuid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "f7397a24-57ad-4fae-b011-d258e8232900", value = "Unique identifier for the event.")

  public String getUuid() {
    return uuid;
  }


  public void setUuid(String uuid) {
    
    
    
    this.uuid = uuid;
  }


  public Event eventType(String eventType) {
    
    
    
    
    this.eventType = eventType;
    return this;
  }

   /**
   * Description of the event (e.g., payroll.submitted, or company.form.signed).
   * @return eventType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "employee.bank_account.created", value = "Description of the event (e.g., payroll.submitted, or company.form.signed).")

  public String getEventType() {
    return eventType;
  }


  public void setEventType(String eventType) {
    
    
    
    this.eventType = eventType;
  }


  public Event resourceType(ResourceTypeEnum resourceType) {
    
    
    
    
    this.resourceType = resourceType;
    return this;
  }

   /**
   * Name of the parent resource of the described entity.
   * @return resourceType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "COMPANY", value = "Name of the parent resource of the described entity.")

  public ResourceTypeEnum getResourceType() {
    return resourceType;
  }


  public void setResourceType(ResourceTypeEnum resourceType) {
    
    
    
    this.resourceType = resourceType;
  }


  public Event resourceUuid(String resourceUuid) {
    
    
    
    
    this.resourceUuid = resourceUuid;
    return this;
  }

   /**
   * Unique identifier for the parent resource.
   * @return resourceUuid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "92a20431-9489-4bde-ad27-6feb20b969d5", value = "Unique identifier for the parent resource.")

  public String getResourceUuid() {
    return resourceUuid;
  }


  public void setResourceUuid(String resourceUuid) {
    
    
    
    this.resourceUuid = resourceUuid;
  }


  public Event entityType(String entityType) {
    
    
    
    
    this.entityType = entityType;
    return this;
  }

   /**
   * Name of the entity that the event corresponds to.
   * @return entityType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "BankAccount", value = "Name of the entity that the event corresponds to.")

  public String getEntityType() {
    return entityType;
  }


  public void setEntityType(String entityType) {
    
    
    
    this.entityType = entityType;
  }


  public Event entityUuid(String entityUuid) {
    
    
    
    
    this.entityUuid = entityUuid;
    return this;
  }

   /**
   * Unique identifier for the entity.
   * @return entityUuid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "92a20431-9489-4bde-ad27-6feb20b969d5", value = "Unique identifier for the entity.")

  public String getEntityUuid() {
    return entityUuid;
  }


  public void setEntityUuid(String entityUuid) {
    
    
    
    this.entityUuid = entityUuid;
  }


  public Event timestamp(Integer timestamp) {
    
    
    
    
    this.timestamp = timestamp;
    return this;
  }

   /**
   * Time at which this event was created. Measured in seconds since the Unix epoch.
   * @return timestamp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1686784995", value = "Time at which this event was created. Measured in seconds since the Unix epoch.")

  public Integer getTimestamp() {
    return timestamp;
  }


  public void setTimestamp(Integer timestamp) {
    
    
    
    this.timestamp = timestamp;
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
   * @return the Event instance itself
   */
  public Event putAdditionalProperty(String key, Object value) {
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
    Event event = (Event) o;
    return Objects.equals(this.uuid, event.uuid) &&
        Objects.equals(this.eventType, event.eventType) &&
        Objects.equals(this.resourceType, event.resourceType) &&
        Objects.equals(this.resourceUuid, event.resourceUuid) &&
        Objects.equals(this.entityType, event.entityType) &&
        Objects.equals(this.entityUuid, event.entityUuid) &&
        Objects.equals(this.timestamp, event.timestamp)&&
        Objects.equals(this.additionalProperties, event.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uuid, eventType, resourceType, resourceUuid, entityType, entityUuid, timestamp, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Event {\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
    sb.append("    resourceUuid: ").append(toIndentedString(resourceUuid)).append("\n");
    sb.append("    entityType: ").append(toIndentedString(entityType)).append("\n");
    sb.append("    entityUuid: ").append(toIndentedString(entityUuid)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
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
    openapiFields.add("event_type");
    openapiFields.add("resource_type");
    openapiFields.add("resource_uuid");
    openapiFields.add("entity_type");
    openapiFields.add("entity_uuid");
    openapiFields.add("timestamp");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Event
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Event.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Event is not found in the empty JSON string", Event.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("uuid") != null && !jsonObj.get("uuid").isJsonNull()) && !jsonObj.get("uuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uuid").toString()));
      }
      if ((jsonObj.get("event_type") != null && !jsonObj.get("event_type").isJsonNull()) && !jsonObj.get("event_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `event_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("event_type").toString()));
      }
      if ((jsonObj.get("resource_type") != null && !jsonObj.get("resource_type").isJsonNull()) && !jsonObj.get("resource_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `resource_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("resource_type").toString()));
      }
      if ((jsonObj.get("resource_uuid") != null && !jsonObj.get("resource_uuid").isJsonNull()) && !jsonObj.get("resource_uuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `resource_uuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("resource_uuid").toString()));
      }
      if ((jsonObj.get("entity_type") != null && !jsonObj.get("entity_type").isJsonNull()) && !jsonObj.get("entity_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `entity_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("entity_type").toString()));
      }
      if ((jsonObj.get("entity_uuid") != null && !jsonObj.get("entity_uuid").isJsonNull()) && !jsonObj.get("entity_uuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `entity_uuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("entity_uuid").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Event.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Event' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Event> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Event.class));

       return (TypeAdapter<T>) new TypeAdapter<Event>() {
           @Override
           public void write(JsonWriter out, Event value) throws IOException {
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
           public Event read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             Event instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of Event given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Event
  * @throws IOException if the JSON string is invalid with respect to Event
  */
  public static Event fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Event.class);
  }

 /**
  * Convert an instance of Event to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

