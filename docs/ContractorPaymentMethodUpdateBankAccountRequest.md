

# ContractorPaymentMethodUpdateBankAccountRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**version** | **String** | The current version of the object. See the [versioning guide](https://docs.gusto.com/embedded-payroll/docs/idempotency) for information on how to use this field. |  |
|**type** | [**TypeEnum**](#TypeEnum) | The payment method type. If type is Direct Deposit, the contractor is required to have a bank account. see [Bank account endpoint](./post-v1-contractors-contractor_uuid-bank_accounts) |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| DIRECT_DEPOSIT | &quot;Direct Deposit&quot; |
| CHECK | &quot;Check&quot; |



