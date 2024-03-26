

# ContractorPaymentsCreatePaymentRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**contractorUuid** | **String** | The contractor receiving the payment |  |
|**date** | **LocalDate** | The contractor receiving the payment |  |
|**paymentMethod** | [**PaymentMethodEnum**](#PaymentMethodEnum) |  |  [optional] |
|**wage** | **Double** | If the contractor is on a fixed wage, this is the fixed wage payment for the contractor, regardless of hours worked |  [optional] |
|**hours** | **Double** | If the contractor is on an hourly wage, this is the number of hours that the contractor worked for the payment |  [optional] |
|**bonus** | **Double** | If the contractor is on an hourly wage, this is the bonus the contractor earned |  [optional] |
|**reimbursement** | **Double** | Reimbursed wages for the contractor |  [optional] |



## Enum: PaymentMethodEnum

| Name | Value |
|---- | -----|
| DIRECT_DEPOSIT | &quot;Direct Deposit&quot; |
| CHECK | &quot;Check&quot; |
| HISTORICAL_PAYMENT | &quot;Historical Payment&quot; |



