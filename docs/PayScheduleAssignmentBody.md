

# PayScheduleAssignmentBody


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | The pay schedule assignment type. |  |
|**hourlyPayScheduleUuid** | **String** | Pay schedule for hourly employees. |  [optional] |
|**salariedPayScheduleUuid** | **String** | Pay schedule for salaried employees. |  [optional] |
|**defaultPayScheduleUuid** | **String** | Default pay schedule for employees. |  [optional] |
|**employees** | [**List&lt;PayScheduleAssignmentBodyEmployeesInner&gt;**](PayScheduleAssignmentBodyEmployeesInner.md) | List of employees and their pay schedules. |  [optional] |
|**departments** | [**List&lt;PayScheduleAssignmentBodyDepartmentsInner&gt;**](PayScheduleAssignmentBodyDepartmentsInner.md) | List of departments and their pay schedules. |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| SINGLE | &quot;single&quot; |
| HOURLY_SALARIED | &quot;hourly_salaried&quot; |
| BY_EMPLOYEE | &quot;by_employee&quot; |
| BY_DEPARTMENT | &quot;by_department&quot; |



