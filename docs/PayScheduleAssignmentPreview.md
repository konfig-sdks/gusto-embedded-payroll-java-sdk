

# PayScheduleAssignmentPreview

The representation of a pay schedule assignment preview.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | The pay schedule assignment type. |  [optional] [readonly] |
|**employeeChanges** | [**List&lt;PayScheduleAssignmentEmployeeChange&gt;**](PayScheduleAssignmentEmployeeChange.md) | A list of pay schedule changes including pay period and transition pay period. |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| SINGLE | &quot;single&quot; |
| HOURLY_SALARIED | &quot;hourly_salaried&quot; |
| BY_EMPLOYEE | &quot;by_employee&quot; |
| BY_DEPARTMENT | &quot;by_department&quot; |



