

# FederalTaxDetails


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**version** | **String** | The current version of the object. See the [versioning guide](https://docs.gusto.com/embedded-payroll/docs/idempotency) for information on how to use this field. |  [optional] |
|**taxPayerType** | **String** | What type of tax entity the company is. One of: - C-Corporation - S-Corporation - Sole proprietor - LLC - LLP - Limited partnership - Co-ownership - Association - Trusteeship - General partnership - Joint venture - Non-Profit |  [optional] |
|**taxableAsScorp** | **Boolean** | Whether the company is taxed as an S-Corporation. Tax payer types that may be taxed as an S-Corporation include: - S-Corporation - C-Corporation - LLC |  [optional] |
|**filingForm** | **String** | The form used by the company for federal tax filing. One of: - 941 (Quarterly federal tax return form) - 944 (Annual federal tax return form) |  [optional] |
|**hasEin** | **Boolean** | Whether company&#39;s Employer Identification Number (EIN) is present |  [optional] |
|**einVerified** | **Boolean** | Whether the EIN was able to be verified as a valid EIN with the IRS.  |  [optional] |
|**legalName** | **String** | The legal name of the company |  [optional] |



