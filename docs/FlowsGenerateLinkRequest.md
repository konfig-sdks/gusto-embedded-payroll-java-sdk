

# FlowsGenerateLinkRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**flowType** | **String** | flow type |  |
|**entityUuid** | **String** | UUID of the target entity applicable to the flow. This field is optional for company flows, please refer to the flow_types table above for more details. |  [optional] |
|**entityType** | [**EntityTypeEnum**](#EntityTypeEnum) | the type of target entity applicable to the flow. This field is optional for company flows, please refer to the flow_types table above for more details. |  [optional] |



## Enum: EntityTypeEnum

| Name | Value |
|---- | -----|
| COMPANY | &quot;Company&quot; |
| EMPLOYEE | &quot;Employee&quot; |



