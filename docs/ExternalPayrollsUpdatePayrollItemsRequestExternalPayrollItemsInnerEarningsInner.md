

# ExternalPayrollsUpdatePayrollItemsRequestExternalPayrollItemsInnerEarningsInner

An array of earnings for the employee. Depends on your company selections, earnings includes wages, hours, bonuses, tips, commission and more.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**hours** | **String** | The hour of the compensation for the pay period. |  [optional] |
|**amount** | **String** | The amount of the earning. |  [optional] |
|**earningId** | **Integer** | The ID of the earning. |  [optional] |
|**earningType** | [**EarningTypeEnum**](#EarningTypeEnum) | The earning type for the compensation. |  [optional] |



## Enum: EarningTypeEnum

| Name | Value |
|---- | -----|
| COMPANYPAYTYPE | &quot;CompanyPayType&quot; |
| COMPANYEARNINGTYPE | &quot;CompanyEarningType&quot; |



