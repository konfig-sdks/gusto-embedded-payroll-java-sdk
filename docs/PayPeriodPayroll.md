

# PayPeriodPayroll

Information about the payroll for the pay period.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**payrollUuid** | **String** | The UUID of the payroll for this pay period. |  [optional] [readonly] |
|**checkDate** | **String** | The date on which employees will be paid for the payroll if the payroll is submitted on time. |  [optional] [readonly] |
|**processed** | **Boolean** | Whether or not the payroll has been successfully processed. Note that processed payrolls cannot be updated. Additionally, a payroll is not guaranteed to be processed just because the payroll deadline has passed. Late payrolls are not uncommon. Conversely, users may choose to run payroll before the payroll deadline. |  [optional] [readonly] |
|**payrollDeadline** | **OffsetDateTime** | The date by which payroll should be run for employees to be paid on time. Payroll data, such as time and attendance data, should be submitted on or before this date. |  [optional] [readonly] |
|**payrollType** | [**PayrollTypeEnum**](#PayrollTypeEnum) | Whether it is regular pay period or transition pay period. |  [optional] [readonly] |



## Enum: PayrollTypeEnum

| Name | Value |
|---- | -----|
| REGULAR | &quot;regular&quot; |
| TRANSITION | &quot;transition&quot; |



