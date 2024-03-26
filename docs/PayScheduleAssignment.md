

# PayScheduleAssignment

The representation of a pay schedule assignment.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | The pay schedule assignment type. |  [optional] [readonly] |
|**hourlyPayScheduleUuid** | **String** | Pay schedule for hourly employees. |  [optional] [readonly] |
|**salariedPayScheduleUuid** | **String** | Pay schedule for salaried employees. |  [optional] [readonly] |
|**defaultPayScheduleUuid** | **String** | Default pay schedule for employees. |  [optional] [readonly] |
|**employees** | [**List&lt;PayScheduleAssignmentEmployee&gt;**](PayScheduleAssignmentEmployee.md) | List of employees and their pay schedules. |  [optional] [readonly] |
|**departments** | [**List&lt;PayScheduleAssignmentDepartment&gt;**](PayScheduleAssignmentDepartment.md) | List of departments and their pay schedules. |  [optional] [readonly] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| SINGLE | &quot;single&quot; |
| HOURLY_SALARIED | &quot;hourly_salaried&quot; |
| BY_EMPLOYEE | &quot;by_employee&quot; |
| BY_DEPARTMENT | &quot;by_department&quot; |



