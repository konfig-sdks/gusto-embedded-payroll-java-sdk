

# ExternalPayroll

The representation of an external payroll.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**uuid** | **String** | The UUID of the external payroll. |  [optional] [readonly] |
|**companyUuid** | **String** | The UUID of the company. |  [optional] [readonly] |
|**checkDate** | **String** | External payroll&#39;s check date. |  [optional] [readonly] |
|**paymentPeriodStartDate** | **String** | External payroll&#39;s pay period start date. |  [optional] [readonly] |
|**paymentPeriodEndDate** | **String** | External payroll&#39;s pay period end date. |  [optional] [readonly] |
|**status** | [**StatusEnum**](#StatusEnum) | The status of the external payroll. The status will be &#x60;unprocessed&#x60; when the external payroll is created and transition to &#x60;processed&#x60; once tax liabilities are entered and finalized.  Once in the &#x60;processed&#x60; status all actions that can edit an external payroll will be disabled. |  [optional] [readonly] |
|**externalPayrollItems** | [**List&lt;ExternalPayrollExternalPayrollItemsInner&gt;**](ExternalPayrollExternalPayrollItemsInner.md) | External payroll items for employees |  [optional] [readonly] |
|**applicableEarnings** | [**List&lt;ExternalPayrollApplicableEarningsInner&gt;**](ExternalPayrollApplicableEarningsInner.md) | Applicable earnings based on company provisioning. |  [optional] [readonly] |
|**applicableBenefits** | [**List&lt;ExternalPayrollApplicableBenefitsInner&gt;**](ExternalPayrollApplicableBenefitsInner.md) | Applicable benefits based on company provisioning. |  [optional] [readonly] |
|**applicableTaxes** | [**List&lt;ExternalPayrollApplicableTaxesInner&gt;**](ExternalPayrollApplicableTaxesInner.md) | Applicable taxes based on company provisioning. |  [optional] [readonly] |
|**metadata** | [**ExternalPayrollMetadata**](ExternalPayrollMetadata.md) |  |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| UNPROCESSED | &quot;unprocessed&quot; |
| PROCESSED | &quot;processed&quot; |



