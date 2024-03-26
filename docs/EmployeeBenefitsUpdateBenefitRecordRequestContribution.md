

# EmployeeBenefitsUpdateBenefitRecordRequestContribution

An object representing the type and value of the company contribution.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | The company contribution scheme.  &#x60;amount&#x60;: The company contributes a fixed amount per payroll. If elective is true, the contribution is matching, dollar-for-dollar.  &#x60;percentage&#x60;: The company contributes a percentage of the payroll amount per payroll period. If elective is true, the contribution is matching, dollar-for-dollar.  &#x60;tiered&#x60;: The size of the company contribution corresponds to the size of the employee deduction relative to a tiered matching scheme. |  [optional] |
|**value** | **Object** |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| AMOUNT | &quot;amount&quot; |
| PERCENTAGE | &quot;percentage&quot; |
| TIERED | &quot;tiered&quot; |



