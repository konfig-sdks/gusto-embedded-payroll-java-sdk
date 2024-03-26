

# PaySchedulesCreateNewRequest



## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**frequency** | [**FrequencyEnum**](#FrequencyEnum) | The frequency that employees on this pay schedule are paid with Gusto. |  |
|**anchorPayDate** | **String** | The first date that employees on this pay schedule are paid with Gusto. |  |
|**anchorEndOfPayPeriod** | **String** | The last date of the first pay period. This can be the same date as the anchor pay date. |  |
|**day1** | **Integer** | An integer between 1 and 31 indicating the first day of the month that employees are paid. This field is only relevant for pay schedules with the “Twice per month” and “Monthly” frequencies. It will be null for pay schedules with other frequencies. |  [optional] |
|**day2** | **Integer** | An integer between 1 and 31 indicating the second day of the month that employees are paid. This field is the second pay date for pay schedules with the \&quot;Twice per month\&quot; frequency. For semi-monthly pay schedules, set this field to 31. For months shorter than 31 days, we will set the second pay date to the last day of the month. It will be null for pay schedules with other frequencies. |  [optional] |
|**customName** | **String** | A custom pay schedule name, defaults to the pay frequency description. |  [optional] |



## Enum: FrequencyEnum

| Name | Value |
|---- | -----|
| EVERY_WEEK | &quot;Every week&quot; |
| EVERY_OTHER_WEEK | &quot;Every other week&quot; |
| TWICE_PER_MONTH | &quot;Twice per month&quot; |
| MONTHLY | &quot;Monthly&quot; |



