

# ContractorPayment

The representation of a single contractor payment.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**uuid** | **String** | The unique identifier of the contractor payment in Gusto. |  [optional] [readonly] |
|**contractorUuid** | **String** | The UUID of the contractor. |  [optional] [readonly] |
|**bonus** | **String** | The bonus amount in the payment. |  [optional] [readonly] |
|**date** | **String** | The payment date. |  [optional] [readonly] |
|**hours** | **String** | The number of hours worked for the payment. |  [optional] [readonly] |
|**paymentMethod** | [**PaymentMethodEnum**](#PaymentMethodEnum) | The payment method. |  [optional] [readonly] |
|**reimbursement** | **String** | The reimbursement amount in the payment. |  [optional] [readonly] |
|**status** | [**StatusEnum**](#StatusEnum) | Contractor payment status |  [optional] |
|**hourlyRate** | **String** | The rate per hour worked for the payment. |  [optional] [readonly] |
|**mayCancel** | **Boolean** | Determine if the contractor payment can be cancelled. |  [optional] [readonly] |
|**wage** | **String** | The fixed wage of the payment, regardless of hours worked. |  [optional] [readonly] |
|**wageType** | [**WageTypeEnum**](#WageTypeEnum) | The wage type for the payment. |  [optional] [readonly] |
|**wageTotal** | **String** | (hours * hourly_rate) + wage + bonus |  [optional] [readonly] |



## Enum: PaymentMethodEnum

| Name | Value |
|---- | -----|
| DIRECT_DEPOSIT | &quot;Direct Deposit&quot; |
| CHECK | &quot;Check&quot; |
| HISTORICAL_PAYMENT | &quot;Historical Payment&quot; |
| CORRECTION_PAYMENT | &quot;Correction Payment&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| FUNDED | &quot;Funded&quot; |
| UNFUNDED | &quot;Unfunded&quot; |



## Enum: WageTypeEnum

| Name | Value |
|---- | -----|
| HOURLY | &quot;Hourly&quot; |
| FIXED | &quot;Fixed&quot; |



