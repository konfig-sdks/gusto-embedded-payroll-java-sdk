

# Compensation

The representation of compensation in Gusto.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**version** | **String** | The current version of the object. See the [versioning guide](https://docs.gusto.com/embedded-payroll/docs/idempotency) for information on how to use this field. |  [optional] |
|**uuid** | **String** | The UUID of the compensation in Gusto. |  [optional] [readonly] |
|**jobUuid** | **String** | The UUID of the job to which the compensation belongs. |  [optional] [readonly] |
|**rate** | **String** | The dollar amount paid per payment unit. |  [optional] |
|**paymentUnit** | [**PaymentUnitEnum**](#PaymentUnitEnum) | The unit accompanying the compensation rate. If the employee is an owner, rate should be &#39;Paycheck&#39;. |  [optional] |
|**flsaStatus** | **FlsaStatusType** |  |  [optional] |
|**effectiveDate** | **String** | The effective date for this compensation. For the first compensation, this defaults to the job&#39;s hire date. |  [optional] |
|**adjustForMinimumWage** | **Boolean** | Indicates if the compensation could be adjusted to minimum wage during payroll calculation. |  [optional] [readonly] |



## Enum: PaymentUnitEnum

| Name | Value |
|---- | -----|
| HOUR | &quot;Hour&quot; |
| WEEK | &quot;Week&quot; |
| MONTH | &quot;Month&quot; |
| YEAR | &quot;Year&quot; |
| PAYCHECK | &quot;Paycheck&quot; |



