

# FederalTaxDetailsUpdateAttributesRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**version** | **String** | The current version of the object. See the [versioning guide](https://docs.gusto.com/embedded-payroll/docs/versioning#object-layer) for information on how to use this field. |  |
|**legalName** | **String** | The legal name of the company |  [optional] |
|**ein** | **String** | The EIN of of the company |  [optional] |
|**taxPayerType** | [**TaxPayerTypeEnum**](#TaxPayerTypeEnum) | What type of tax entity the company is |  [optional] |
|**filingForm** | **String** | The form used by the company for federal tax filing. One of: - 941 (Quarterly federal tax return) - 944 (Annual federal tax return) |  [optional] |
|**taxableAsScorp** | **Boolean** | Whether this company should be taxed as an S-Corporation |  [optional] |



## Enum: TaxPayerTypeEnum

| Name | Value |
|---- | -----|
| C_CORPORATION | &quot;C-Corporation&quot; |
| S_CORPORATION | &quot;S-Corporation&quot; |
| SOLE_PROPRIETOR | &quot;Sole proprietor&quot; |
| LLC | &quot;LLC&quot; |
| LLP | &quot;LLP&quot; |
| LIMITED_PARTNERSHIP | &quot;Limited partnership&quot; |
| CO_OWNERSHIP | &quot;Co-ownership&quot; |
| ASSOCIATION | &quot;Association&quot; |
| TRUSTEESHIP | &quot;Trusteeship&quot; |
| GENERAL_PARTNERSHIP | &quot;General partnership&quot; |
| JOINT_VENTURE | &quot;Joint venture&quot; |
| NON_PROFIT | &quot;Non-Profit&quot; |



