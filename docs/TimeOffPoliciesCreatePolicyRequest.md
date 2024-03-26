

# TimeOffPoliciesCreatePolicyRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | Name of the time off policy |  |
|**policyType** | **String** | Type of the time off policy. Currently only \&quot;vacation\&quot; and \&quot;sick\&quot; are supported |  |
|**accrualMethod** | [**AccrualMethodEnum**](#AccrualMethodEnum) | Accrual method of the time off policy |  |
|**accrualRate** | **Float** | The rate at which the time off hours will accrue for an employee on the policy. Represented as a float, e.g. \&quot;40.0\&quot;. |  [optional] |
|**accrualRateUnit** | **Float** | The number of hours an employee has to work or be paid for to accrue the number of hours set in the accrual rate. Only used for hourly policies (per_hour_paid, per_hour_paid_no_overtime, per_hour_work, per_hour_worked_no_overtime). Represented as a float, e.g. \&quot;40.0\&quot;. |  [optional] |
|**paidOutOnTermination** | **Boolean** | Boolean representing if an employees accrued time off hours will be paid out on termination |  [optional] |
|**accrualWaitingPeriodDays** | **Integer** | Number of days before an employee on the policy will begin accruing time off hours |  [optional] |
|**carryoverLimitHours** | **Float** | The max number of hours and employee can carryover from one year to the next |  [optional] |
|**maxAccrualHoursPerYear** | **Float** | The max number of hours and employee can accrue in a year |  [optional] |
|**maxHours** | **Float** | The max number of hours an employee can accrue |  [optional] |



## Enum: AccrualMethodEnum

| Name | Value |
|---- | -----|
| UNLIMITED | &quot;unlimited&quot; |
| PER_PAY_PERIOD | &quot;per_pay_period&quot; |
| PER_CALENDAR_YEAR | &quot;per_calendar_year&quot; |
| PER_ANNIVERSARY_YEAR | &quot;per_anniversary_year&quot; |
| PER_HOUR_WORKED | &quot;per_hour_worked&quot; |
| PER_HOUR_WORKED_NO_OVERTIME | &quot;per_hour_worked_no_overtime&quot; |
| PER_HOUR_PAID | &quot;per_hour_paid&quot; |
| PER_HOUR_PAID_NO_OVERTIME | &quot;per_hour_paid_no_overtime&quot; |



