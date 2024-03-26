

# InvoiceDataActiveCompaniesInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**companyUuid** | **String** | unique identifier for the company associated with the invoice data |  [optional] |
|**activeEmployees** | **Integer** | The number of active employees the company was or will be invoiced for that invoice period. Active employees are calculated as the count of onboarded employees hired before the end of the invoice period and not terminated before the start of the invoice period. |  [optional] |
|**activeContractors** | **Integer** | The number of active contractors the company was or will be invoiced for that invoice period. Active contractors are calculated as any contractor with an active contractor payment during the invoice period. |  [optional] |
|**initialInvoicePeriod** | **String** | The first invoice period for the company. This will either be the invoice period of the first invoice-able event (first payroll or contractor payment) or the date they migrated to embedded, whichever is later. |  [optional] |



