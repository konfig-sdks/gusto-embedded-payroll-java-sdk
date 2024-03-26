

# Event

Representation of an Event

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**uuid** | **String** | Unique identifier for the event. |  [optional] |
|**eventType** | **String** | Description of the event (e.g., payroll.submitted, or company.form.signed). |  [optional] |
|**resourceType** | [**ResourceTypeEnum**](#ResourceTypeEnum) | Name of the parent resource of the described entity. |  [optional] |
|**resourceUuid** | **String** | Unique identifier for the parent resource. |  [optional] |
|**entityType** | **String** | Name of the entity that the event corresponds to. |  [optional] |
|**entityUuid** | **String** | Unique identifier for the entity. |  [optional] |
|**timestamp** | **Integer** | Time at which this event was created. Measured in seconds since the Unix epoch. |  [optional] |



## Enum: ResourceTypeEnum

| Name | Value |
|---- | -----|
| COMPANY | &quot;Company&quot; |



