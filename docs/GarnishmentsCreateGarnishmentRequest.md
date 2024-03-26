

# GarnishmentsCreateGarnishmentRequest



## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | The description of the garnishment. |  |
|**active** | **Boolean** | Whether or not this garnishment is currently active. |  [optional] |
|**amount** | **Float** | The amount of the garnishment. Either a percentage or a fixed dollar amount. Represented as a float, e.g. \&quot;8.00\&quot;. |  |
|**courtOrdered** | **Boolean** | Whether the garnishment is court ordered. |  |
|**times** | **Integer** | The number of times to apply the garnishment. Ignored if recurring is true. |  [optional] |
|**recurring** | **Boolean** | Whether the garnishment should recur indefinitely. |  [optional] |
|**annualMaximum** | **Float** | The maximum deduction per annum. A null value indicates no maximum. Represented as a float, e.g. \&quot;200.00\&quot;. |  [optional] |
|**payPeriodMaximum** | **Float** | The maximum deduction per pay period. A null value indicates no maximum. Represented as a float, e.g. \&quot;16.00\&quot;. |  [optional] |
|**deductAsPercentage** | **Boolean** | Whether the amount should be treated as a percentage to be deducted per pay period. |  [optional] |



