

# TimeOffPolicy

Representation of a Time Off Policy

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**version** | **String** | The current version of the object. See the [versioning guide](https://docs.gusto.com/embedded-payroll/docs/versioning#object-layer) for information on how to use this field. |  [optional] |
|**uuid** | **String** | Unique identifier of a time off policy |  |
|**companyUuid** | **String** | Unique identifier for the company owning the time off policy |  |
|**name** | **String** | Name of the time off policy |  |
|**policyType** | [**PolicyTypeEnum**](#PolicyTypeEnum) | Type of the time off policy |  |
|**accrualMethod** | **String** | Policy time off accrual method |  |
|**accrualRate** | **Float** | The rate at which the time off hours will accrue for an employee on the policy. Represented as a float, e.g. \&quot;40.0\&quot;. |  [optional] |
|**accrualRateUnit** | **Float** | The number of hours an employee has to work or be paid for to accrue the number of hours set in the accrual rate. Only used for hourly policies (per_hour_paid, per_hour_paid_no_overtime, per_hour_work, per_hour_worked_no_overtime). Represented as a float, e.g. \&quot;40.0\&quot;. |  [optional] |
|**paidOutOnTermination** | **Boolean** | Boolean representing if an employees accrued time off hours will be paid out on termination |  [optional] |
|**accrualWaitingPeriodDays** | **Integer** | Number of days before an employee on the policy will begin accruing time off hours |  [optional] |
|**carryoverLimitHours** | **Float** | The max number of hours and employee can carryover from one year to the next |  [optional] |
|**maxAccrualHoursPerYear** | **Float** | The max number of hours and employee can accrue in a year |  [optional] |
|**maxHours** | **Float** | The max number of hours an employee can accrue |  [optional] |
|**complete** | **Boolean** | boolean representing if a policy has completed configuration |  [optional] |
|**isActive** | **Boolean** | boolean representing if a policy is active or not |  |
|**employees** | [**List&lt;TimeOffPolicyEmployeesInner&gt;**](TimeOffPolicyEmployeesInner.md) | List of employee UUIDs under a time off policy |  |



## Enum: PolicyTypeEnum

| Name | Value |
|---- | -----|
| VACATION | &quot;vacation&quot; |
| SICK | &quot;sick&quot; |



