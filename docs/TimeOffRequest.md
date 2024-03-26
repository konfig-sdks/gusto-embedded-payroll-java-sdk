

# TimeOffRequest

The representation of a time off request. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** | The ID of the time off request. |  [optional] [readonly] |
|**status** | [**StatusEnum**](#StatusEnum) | The status of the time off request. |  [optional] [readonly] |
|**employeeNote** | **String** | A note about the time off request, from the employee to the employer. |  [optional] [readonly] |
|**employerNote** | **String** | A note about the time off request, from the employer to the employee. |  [optional] [readonly] |
|**requestType** | [**RequestTypeEnum**](#RequestTypeEnum) | The type of time off request. |  [optional] [readonly] |
|**days** | **Object** | An object that represents the days in the time off request. The keys of the object are the dates, formatted as a YYYY-MM-DD string. The values of the object are the number of hours requested off for each day, formatted as a string representation of a numeric decimal to the thousands place. |  [optional] [readonly] |
|**employee** | [**TimeOffRequestEmployee**](TimeOffRequestEmployee.md) |  |  [optional] |
|**initiator** | [**TimeOffRequestInitiator**](TimeOffRequestInitiator.md) |  |  [optional] |
|**approver** | [**TimeOffRequestApprover**](TimeOffRequestApprover.md) |  |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| PENDING | &quot;pending&quot; |
| APPROVED | &quot;approved&quot; |
| DENIED | &quot;denied&quot; |



## Enum: RequestTypeEnum

| Name | Value |
|---- | -----|
| VACATION | &quot;vacation&quot; |
| SICK | &quot;sick&quot; |



