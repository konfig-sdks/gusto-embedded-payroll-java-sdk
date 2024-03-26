

# PayrollsUpdatePayrollByIdRequestEmployeeCompensationsInner



## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**version** | **String** | The current version of this employee compensation from the prepared payroll. See the [versioning guide](https://docs.gusto.com/embedded-payroll/docs/idempotency) for information on how to use this field. |  [optional] |
|**employeeUuid** | **String** | The UUID of the employee. |  [optional] |
|**excluded** | **Boolean** | This employee will be excluded from payroll calculation and will not be paid for the payroll. |  [optional] |
|**paymentMethod** | [**PaymentMethodEnum**](#PaymentMethodEnum) | The employee&#39;s compensation payment method. Invalid values will be ignored. |  [optional] |
|**memo** | **String** | Custom text that will be printed as a personal note to the employee on a paystub. |  [optional] |
|**fixedCompensations** | [**List&lt;PayrollsUpdatePayrollByIdRequestEmployeeCompensationsInnerFixedCompensationsInner&gt;**](PayrollsUpdatePayrollByIdRequestEmployeeCompensationsInnerFixedCompensationsInner.md) |  |  [optional] |
|**hourlyCompensations** | [**List&lt;PayrollsUpdatePayrollByIdRequestEmployeeCompensationsInnerHourlyCompensationsInner&gt;**](PayrollsUpdatePayrollByIdRequestEmployeeCompensationsInnerHourlyCompensationsInner.md) |  |  [optional] |
|**paidTimeOff** | [**List&lt;PayrollsUpdatePayrollByIdRequestEmployeeCompensationsInnerPaidTimeOffInner&gt;**](PayrollsUpdatePayrollByIdRequestEmployeeCompensationsInnerPaidTimeOffInner.md) | An array of all paid time off the employee is eligible for this pay period. Each paid time off object can be the name or the specific policy_uuid. |  [optional] |



## Enum: PaymentMethodEnum

| Name | Value |
|---- | -----|
| DIRECT_DEPOSIT | &quot;Direct Deposit&quot; |
| CHECK | &quot;Check&quot; |



