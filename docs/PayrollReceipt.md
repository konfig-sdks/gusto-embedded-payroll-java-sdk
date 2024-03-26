

# PayrollReceipt


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**payrollUuid** | **String** | A unique identifier of the payroll receipt. |  [optional] |
|**companyUuid** | **String** | A unique identifier of the company for the payroll. |  [optional] |
|**nameOfSender** | **String** | The name of the company by whom the payroll was paid |  [optional] |
|**nameOfRecipient** | **String** | Always the fixed string \&quot;Payroll Recipients\&quot; |  [optional] |
|**recipientNotice** | **String** | Always the fixed string \&quot;Payroll recipients include the employees listed below plus the tax agencies for the taxes listed below.\&quot; |  [optional] |
|**debitDate** | **String** | The debit or funding date for the payroll |  [optional] |
|**license** | **String** | Always the fixed string \&quot;ZenPayroll, Inc., dba Gusto is a licensed money transmitter. For more about Gusto’s licenses and your state-specific rights to request information, submit complaints, dispute errors, or cancel transactions, visit our license page.\&quot; |  [optional] |
|**licenseUri** | **String** | URL for the license information for the licensed payroll processor. Always the fixed string \&quot;https://gusto.com/about/licenses\&quot; |  [optional] |
|**rightToRefund** | **String** |  |  [optional] |
|**liabilityOfLicensee** | **String** |  |  [optional] |
|**totals** | [**PayrollReceiptTotals**](PayrollReceiptTotals.md) |  |  [optional] |
|**taxes** | [**List&lt;PayrollReceiptTaxesInner&gt;**](PayrollReceiptTaxesInner.md) | An array of totaled employer and employee taxes for the pay period. |  [optional] |
|**employeeCompensations** | [**List&lt;PayrollReceiptEmployeeCompensationsInner&gt;**](PayrollReceiptEmployeeCompensationsInner.md) | An array of employee compensations and withholdings for this payroll |  [optional] |
|**licensee** | [**PayrollReceiptLicensee**](PayrollReceiptLicensee.md) |  |  [optional] |



