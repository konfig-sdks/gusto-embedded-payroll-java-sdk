

# PayrollsSkipPayrollRequest



## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**payrollType** | [**PayrollTypeEnum**](#PayrollTypeEnum) | Payroll type |  |
|**startDate** | **String** | Pay period start date |  [optional] |
|**endDate** | **String** | Pay period end date |  [optional] |
|**payScheduleUuid** | **String** | The UUID of the pay schedule |  [optional] |
|**employeeUuids** | **List&lt;String&gt;** | An array of employees. This field is only applicable to new hire payroll and termination payroll |  [optional] |



## Enum: PayrollTypeEnum

| Name | Value |
|---- | -----|
| REGULAR | &quot;Regular&quot; |
| HIRED_EMPLOYEE | &quot;Hired employee&quot; |
| DISMISSED_EMPLOYEE | &quot;Dismissed employee&quot; |
| TRANSITION_FROM_OLD_PAY_SCHEDULE | &quot;Transition from old pay schedule&quot; |



