

# TimeOffActivity

Representation of a Time Off Activity

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**policyUuid** | **String** | unique identifier of a time off policy |  [optional] |
|**timeOffType** | [**TimeOffTypeEnum**](#TimeOffTypeEnum) | Type of the time off activity |  [optional] |
|**policyName** | **String** | The name of the time off policy for this activity |  [optional] |
|**eventType** | **String** | The type of the time off event/activity |  [optional] |
|**eventDescription** | **String** | A description for the time off event/activity |  [optional] |
|**effectiveTime** | **String** | The datetime of the time off activity |  [optional] |
|**balance** | **Float** | The time off balance at the time of the activity |  [optional] |
|**balanceChange** | **Float** | The amount the time off balance changed as a result of the activity |  [optional] |



## Enum: TimeOffTypeEnum

| Name | Value |
|---- | -----|
| VACATION | &quot;vacation&quot; |
| SICK | &quot;sick&quot; |



