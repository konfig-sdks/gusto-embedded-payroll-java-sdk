

# ContractorPaymentReceipt


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**contractorPaymentUuid** | **String** | A unique identifier of the contractor payment receipt. |  [optional] |
|**companyUuid** | **String** | A unique identifier of the company making the contractor payment. |  [optional] |
|**nameOfSender** | **String** | The name of the company making the contractor payment. |  [optional] |
|**nameOfRecipient** | **String** | The individual or company name of the contractor receiving payment. |  [optional] |
|**debitDate** | **LocalDate** | The debit date for the contractor payment. |  [optional] |
|**license** | **String** | Always the fixed string \&quot;ZenPayroll, Inc., dba Gusto is a licensed money transmitter. For more about Gusto’s licenses and your state-specific rights to request information, submit complaints, dispute errors, or cancel transactions, visit our license page.\&quot; |  [optional] |
|**licenseUri** | **String** | URL for the license information for the licensed payroll processor. Always the fixed string \&quot;https://gusto.com/about/licenses\&quot; |  [optional] |
|**rightToRefund** | **String** | URL for information related to right to refund. Always the fixed string \&quot;https://gusto.com/about/licenses\&quot; |  [optional] |
|**liabilityOfLicensee** | **String** | URL for information related to right to liability of licensee. Always the fixed string \&quot;https://gusto.com/about/licenses\&quot; |  [optional] |
|**totals** | [**ContractorPaymentReceiptTotals**](ContractorPaymentReceiptTotals.md) |  |  [optional] |
|**contractorPayments** | [**List&lt;ContractorPaymentReceiptContractorPaymentsInner&gt;**](ContractorPaymentReceiptContractorPaymentsInner.md) | An array of contractor payments for this contractor payment. |  [optional] |
|**licensee** | [**ContractorPaymentReceiptLicensee**](ContractorPaymentReceiptLicensee.md) |  |  [optional] |



