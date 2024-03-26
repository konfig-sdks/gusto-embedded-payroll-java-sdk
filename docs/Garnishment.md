

# Garnishment

Garnishments, or employee deductions, are fixed amounts or percentages deducted from an employee’s pay. They can be deducted a specific number of times or on a recurring basis. Garnishments can also have maximum deductions on a yearly or per-pay-period bases. Common uses for garnishments are court-ordered payments for child support or back taxes. Some companies provide loans to their employees that are repaid via garnishments.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | The description of the garnishment. |  [optional] |
|**version** | **String** | The current version of the object. See the [versioning guide](https://docs.gusto.com/embedded-payroll/docs/idempotency) for information on how to use this field. |  [optional] |
|**uuid** | **String** | The UUID of the garnishment in Gusto. |  [optional] [readonly] |
|**employeeUuid** | **Integer** | The UUID of the employee to which this garnishment belongs. |  [optional] [readonly] |
|**active** | **Boolean** | Whether or not this garnishment is currently active. |  [optional] |
|**amount** | **Float** | The amount of the garnishment. Either a percentage or a fixed dollar amount. Represented as a float, e.g. \&quot;8.00\&quot;. |  [optional] |
|**courtOrdered** | **Boolean** | Whether the garnishment is court ordered. |  [optional] |
|**times** | **Integer** | The number of times to apply the garnishment. Ignored if recurring is true. |  [optional] |
|**recurring** | **Boolean** | Whether the garnishment should recur indefinitely. |  [optional] |
|**annualMaximum** | **Float** | The maximum deduction per annum. A null value indicates no maximum. Represented as a float, e.g. \&quot;200.00\&quot;. |  [optional] |
|**payPeriodMaximum** | **Float** | The maximum deduction per pay period. A null value indicates no maximum. Represented as a float, e.g. \&quot;16.00\&quot;. |  [optional] |
|**deductAsPercentage** | **Boolean** | Whether the amount should be treated as a percentage to be deducted per pay period. |  [optional] |



