

# PaySchedule

The representation of a pay schedule.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**uuid** | **String** | The unique identifier of the pay schedule in Gusto. |  [optional] [readonly] |
|**frequency** | [**FrequencyEnum**](#FrequencyEnum) | The frequency that employees on this pay schedule are paid with Gusto. |  [optional] [readonly] |
|**anchorPayDate** | **String** | The first date that employees on this pay schedule are paid with Gusto. |  [optional] [readonly] |
|**anchorEndOfPayPeriod** | **String** | The last date of the first pay period. This can be the same date as the anchor pay date. |  [optional] [readonly] |
|**day1** | **Integer** | An integer between 1 and 31 indicating the first day of the month that employees are paid. This field is only relevant for pay schedules with the “Twice per month” and “Monthly” frequencies. It will be null for pay schedules with other frequencies. |  [optional] [readonly] |
|**day2** | **Integer** | An integer between 1 and 31 indicating the second day of the month that employees are paid. This field is the second pay date for pay schedules with the \&quot;Twice per month\&quot; frequency. For semi-monthly pay schedules, this field should be set to 31. For months shorter than 31 days, we will set the second pay date to the last day of the month. It will be null for pay schedules with other frequencies. |  [optional] [readonly] |
|**name** | **String** | This field will be hourly when the pay schedule is for hourly employees, salaried when the pay schedule is for salaried employees, the department name if pay schedule is by department, and null when the pay schedule is for all employees. |  [optional] [readonly] |
|**customName** | **String** | A custom name for a pay schedule, defaults to the pay frequency description. |  [optional] [readonly] |
|**autoPilot** | **Boolean** | With Autopilot® enabled, payroll will run automatically one day before your payroll deadlines. |  [optional] |
|**active** | **Boolean** | Whether this pay schedule is associated with any employees. A pay schedule is inactive when it&#39;s unassigned. |  [optional] [readonly] |



## Enum: FrequencyEnum

| Name | Value |
|---- | -----|
| EVERY_WEEK | &quot;Every week&quot; |
| EVERY_OTHER_WEEK | &quot;Every other week&quot; |
| TWICE_PER_MONTH | &quot;Twice per month&quot; |
| MONTHLY | &quot;Monthly&quot; |
| QUARTERLY | &quot;Quarterly&quot; |
| ANNUALLY | &quot;Annually&quot; |



