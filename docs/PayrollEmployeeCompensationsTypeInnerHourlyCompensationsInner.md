

# PayrollEmployeeCompensationsTypeInnerHourlyCompensationsInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | The name of the compensation. This also serves as the unique, immutable identifier for this compensation. |  [optional] |
|**hours** | **String** | The number of hours to be compensated for this pay period. |  [optional] |
|**amount** | **String** | The amount of the compensation. This field is only available after the payroll is calculated and cannot be used for updating hourly compensations. |  [optional] |
|**jobUuid** | **String** | The UUID of the job for the compensation. |  [optional] [readonly] |
|**compensationMultiplier** | **Double** | The amount multiplied by the base rate to calculate total compensation per hour worked. |  [optional] [readonly] |



