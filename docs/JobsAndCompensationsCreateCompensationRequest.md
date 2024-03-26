

# JobsAndCompensationsCreateCompensationRequest



## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**rate** | **String** | The dollar amount paid per payment unit. |  [optional] |
|**paymentUnit** | [**PaymentUnitEnum**](#PaymentUnitEnum) | The unit accompanying the compensation rate. If the employee is an owner, rate should be &#39;Paycheck&#39;. |  |
|**effectiveDate** | **String** | The date when the compensation takes effect. |  [optional] |
|**flsaStatus** | **FlsaStatusType** |  |  |
|**adjustForMinimumWage** | **Boolean** | Determines whether the compensation should be adjusted for minimum wage. Only applies to Nonexempt employees. |  [optional] |
|**minimumWages** | [**List&lt;JobsAndCompensationsCreateCompensationRequestMinimumWagesInner&gt;**](JobsAndCompensationsCreateCompensationRequestMinimumWagesInner.md) |  |  [optional] |



## Enum: PaymentUnitEnum

| Name | Value |
|---- | -----|
| HOUR | &quot;Hour&quot; |
| WEEK | &quot;Week&quot; |
| MONTH | &quot;Month&quot; |
| YEAR | &quot;Year&quot; |
| PAYCHECK | &quot;Paycheck&quot; |



