

# PayrollEmployeeCompensationsTypeInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**version** | **String** | The current version of this employee compensation. This field is only available for prepared payrolls. See the [versioning guide](https://docs.gusto.com/embedded-payroll/docs/idempotency) for information on how to use this field. |  [optional] |
|**employeeUuid** | **String** | The UUID of the employee. |  [optional] [readonly] |
|**excluded** | **Boolean** | This employee will be excluded from payroll calculation and will not be paid for the payroll. Cancelling a payroll would reset all employees&#39; excluded back to false. |  [optional] [readonly] |
|**grossPay** | **String** | The employee&#39;s gross pay, equal to regular wages + cash tips + payroll tips + any other additional earnings, excluding imputed income. This value is only available for processed payrolls. |  [optional] [readonly] |
|**netPay** | **String** | The employee&#39;s net pay, equal to gross_pay - employee taxes - employee deductions or garnishments - cash tips. This value is only available for processed payrolls. |  [optional] [readonly] |
|**checkAmount** | **String** | The employee&#39;s check amount, equal to net_pay + reimbursements. This value is only available for processed payrolls. |  [optional] [readonly] |
|**paymentMethod** | [**PaymentMethodEnum**](#PaymentMethodEnum) | The employee&#39;s compensation payment method. |  [optional] |
|**memo** | **String** | Custom text that will be printed as a personal note to the employee on a paystub. |  [optional] [readonly] |
|**fixedCompensations** | [**List&lt;PayrollEmployeeCompensationsTypeInnerFixedCompensationsInner&gt;**](PayrollEmployeeCompensationsTypeInnerFixedCompensationsInner.md) | An array of fixed compensations for the employee. Fixed compensations include tips, bonuses, and one time reimbursements. If this payroll has been processed, only fixed compensations with a value greater than 0.00 are returned. For an unprocessed payroll, all active fixed compensations are returned. |  [optional] |
|**hourlyCompensations** | [**List&lt;PayrollEmployeeCompensationsTypeInnerHourlyCompensationsInner&gt;**](PayrollEmployeeCompensationsTypeInnerHourlyCompensationsInner.md) | An array of hourly compensations for the employee. Hourly compensations include regular, overtime, and double overtime hours. If this payroll has been processed, only hourly compensations with a value greater than 0.00 are returned. For an unprocessed payroll, all active hourly compensations are returned. |  [optional] |
|**paidTimeOff** | [**List&lt;PayrollEmployeeCompensationsTypeInnerPaidTimeOffInner&gt;**](PayrollEmployeeCompensationsTypeInnerPaidTimeOffInner.md) | An array of all paid time off the employee is eligible for this pay period. |  [optional] |
|**benefits** | [**List&lt;PayrollEmployeeCompensationsTypeInnerBenefitsInner&gt;**](PayrollEmployeeCompensationsTypeInnerBenefitsInner.md) | An array of employee benefits for the pay period. Benefits are only included for processed payroll when the include parameter is present. |  [optional] [readonly] |
|**deductions** | [**List&lt;PayrollEmployeeCompensationsTypeInnerDeductionsInner&gt;**](PayrollEmployeeCompensationsTypeInnerDeductionsInner.md) | An array of employee deductions for the pay period. Deductions are only included for processed payroll when the include parameter is present. |  [optional] [readonly] |
|**taxes** | [**List&lt;PayrollEmployeeCompensationsTypeInnerTaxesInner&gt;**](PayrollEmployeeCompensationsTypeInnerTaxesInner.md) | An array of employer and employee taxes for the pay period. Only included for processed or calculated payrolls when &#x60;taxes&#x60; is present in the &#x60;include&#x60; parameter. |  [optional] [readonly] |



## Enum: PaymentMethodEnum

| Name | Value |
|---- | -----|
| CHECK | &quot;Check&quot; |
| DIRECT_DEPOSIT | &quot;Direct Deposit&quot; |



