

# ExternalPayrollBasic

The representation of an external payroll with minimal information.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**uuid** | **String** | The UUID of the external payroll. |  [optional] [readonly] |
|**companyUuid** | **String** | The UUID of the company. |  [optional] [readonly] |
|**checkDate** | **String** | External payroll&#39;s check date. |  [optional] [readonly] |
|**paymentPeriodStartDate** | **String** | External payroll&#39;s pay period start date. |  [optional] [readonly] |
|**paymentPeriodEndDate** | **String** | External payroll&#39;s pay period end date. |  [optional] [readonly] |
|**status** | [**StatusEnum**](#StatusEnum) | The status of the external payroll. The status will be &#x60;unprocessed&#x60; when the external payroll is created and transition to &#x60;processed&#x60; once tax liabilities are entered and finalized.  Once in the &#x60;processed&#x60; status all actions that can edit an external payroll will be disabled. |  [optional] [readonly] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| UNPROCESSED | &quot;unprocessed&quot; |
| PROCESSED | &quot;processed&quot; |



