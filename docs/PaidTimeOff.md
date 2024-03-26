

# PaidTimeOff

The representation of paid time off in Gusto.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | [**NameEnum**](#NameEnum) | The name of the paid time off type. |  [optional] [readonly] |
|**policyName** | **String** | The name of the time off policy. |  [optional] [readonly] |
|**policyUuid** | **String** | The UUID of the time off policy. |  [optional] [readonly] |
|**accrualUnit** | **String** | The unit the PTO type is accrued in. |  [optional] [readonly] |
|**accrualRate** | **String** | The number of accrual units accrued per accrual period. |  [optional] [readonly] |
|**accrualMethod** | **String** | The accrual method of the time off policy |  [optional] [readonly] |
|**accrualPeriod** | **String** | The frequency at which the PTO type is accrued. |  [optional] [readonly] |
|**accrualBalance** | **String** | The number of accrual units accrued. |  [optional] [readonly] |
|**maximumAccrualBalance** | **String** | The maximum number of accrual units allowed. A null value signifies no maximum. |  [optional] [readonly] |
|**paidAtTermination** | **Boolean** | Whether the accrual balance is paid to the employee upon termination. |  [optional] [readonly] |



## Enum: NameEnum

| Name | Value |
|---- | -----|
| VACATION_HOURS | &quot;Vacation Hours&quot; |
| SICK_HOURS | &quot;Sick Hours&quot; |
| HOLIDAY_HOURS | &quot;Holiday Hours&quot; |



