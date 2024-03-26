

# ExternalPayrollsUpdatePayrollItemsRequestExternalPayrollItemsInner

Submit wages, benefits, taxes for each employee

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**employeeUuid** | **String** | The UUID of the employee. |  [optional] |
|**earnings** | [**List&lt;ExternalPayrollsUpdatePayrollItemsRequestExternalPayrollItemsInnerEarningsInner&gt;**](ExternalPayrollsUpdatePayrollItemsRequestExternalPayrollItemsInnerEarningsInner.md) |  |  [optional] |
|**benefits** | [**List&lt;ExternalPayrollsUpdatePayrollItemsRequestExternalPayrollItemsInnerBenefitsInner&gt;**](ExternalPayrollsUpdatePayrollItemsRequestExternalPayrollItemsInnerBenefitsInner.md) |  |  [optional] |
|**taxes** | [**List&lt;ExternalPayrollsUpdatePayrollItemsRequestExternalPayrollItemsInnerTaxesInner&gt;**](ExternalPayrollsUpdatePayrollItemsRequestExternalPayrollItemsInnerTaxesInner.md) | An array of taxes for the employee. Depends on your company selections, taxes include federal income tax, social security, medicare, and more. |  [optional] |



