

# EmployeePaymentMethodUpdatePaymentMethodRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**version** | **String** | The current version of the object. See the [versioning guide](https://docs.gusto.com/embedded-payroll/docs/versioning#object-layer) for information on how to use this field. |  |
|**type** | [**TypeEnum**](#TypeEnum) | The payment method type. If type is Check, then split_by and splits do not need to be populated. If type is Direct Deposit, split_by and splits are required. |  |
|**splitBy** | [**SplitByEnum**](#SplitByEnum) | Describes how the payment will be split. If split_by is Percentage, then the split amounts must add up to exactly 100. If split_by is Amount, then the last split amount must be nil to capture the remainder. |  [optional] |
|**splits** | [**List&lt;EmployeePaymentMethodUpdatePaymentMethodRequestSplitsInner&gt;**](EmployeePaymentMethodUpdatePaymentMethodRequestSplitsInner.md) |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| DIRECT_DEPOSIT | &quot;Direct Deposit&quot; |
| CHECK | &quot;Check&quot; |



## Enum: SplitByEnum

| Name | Value |
|---- | -----|
| AMOUNT | &quot;Amount&quot; |
| PERCENTAGE | &quot;Percentage&quot; |



