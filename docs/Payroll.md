

# Payroll



## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**payrollDeadline** | **OffsetDateTime** | A timestamp that is the deadline for the payroll to be run in order for employees to be paid on time. |  [optional] [readonly] |
|**checkDate** | **String** | The date on which employees will be paid for the payroll. |  [optional] [readonly] |
|**processed** | **Boolean** | Whether or not the payroll has been successfully processed. Note that processed payrolls cannot be updated. Additionally, a payroll is not guaranteed to be processed just because the payroll deadline has passed. Late payrolls are not uncommon. Conversely, users may choose to run payroll before the payroll deadline. |  [optional] [readonly] |
|**processedDate** | **String** | The date at which the payroll was processed. Null if the payroll isn&#39;t processed yet. |  [optional] [readonly] |
|**calculatedAt** | **String** | A timestamp of the last valid payroll calculation. Null is there isn&#39;t a valid calculation. |  [optional] [readonly] |
|**payrollUuid** | **String** | The UUID of the payroll. |  [optional] [readonly] |
|**companyUuid** | **String** | The UUID of the company for the payroll. |  [optional] [readonly] |
|**offCycle** | **Boolean** | Indicates whether the payroll is an off-cycle payroll |  [optional] [readonly] |
|**offCycleReason** | **OffCycleReasonType** |  |  [optional] |
|**external** | **Boolean** | Indicates whether the payroll is an external payroll |  [optional] [readonly] |
|**finalTerminationPayroll** | **Boolean** | Indicates whether the payroll is the final payroll for a terminated employee. Only included for off-cycle payrolls. |  [optional] [readonly] |
|**withholdingPayPeriod** | **PayrollWithholdingPayPeriodType** |  |  [optional] |
|**skipRegularDeductions** | **Boolean** | Block regular deductions and contributions for this payroll.  Only included for off-cycle payrolls. |  [optional] [readonly] |
|**fixedWithholdingRate** | **Boolean** | Enable taxes to be withheld at the IRS&#39;s required rate of 22% for federal income taxes. State income taxes will be taxed at the state&#39;s supplemental tax rate. Otherwise, we&#39;ll sum the entirety of the employee&#39;s wages and withhold taxes on the entire amount at the rate for regular wages. Only included for off-cycle payrolls. |  [optional] [readonly] |
|**payPeriod** | [**PayrollPayPeriodType**](PayrollPayPeriodType.md) |  |  [optional] |
|**payrollStatusMeta** | [**PayrollPayrollStatusMetaType**](PayrollPayrollStatusMetaType.md) |  |  [optional] |
|**totals** | [**PayrollTotalsType**](PayrollTotalsType.md) |  |  [optional] |
|**employeeCompensations** | [**List&lt;PayrollEmployeeCompensationsTypeInner&gt;**](PayrollEmployeeCompensationsTypeInner.md) |  |  [optional] |
|**companyTaxes** | [**List&lt;PayrollCompanyTaxesTypeInner&gt;**](PayrollCompanyTaxesTypeInner.md) | An array of taxes applicable to this payroll in addition to taxes included in &#x60;employee_compensations&#x60;. Only included for processed or calculated payrolls when &#x60;taxes&#x60; is present in the &#x60;include&#x60; parameter. |  [optional] |
|**paymentSpeedChanged** | [**PayrollPaymentSpeedChangedType**](PayrollPaymentSpeedChangedType.md) |  |  [optional] |
|**createdAt** | **OffsetDateTime** | Datetime for when the resource was created. |  [optional] [readonly] |



