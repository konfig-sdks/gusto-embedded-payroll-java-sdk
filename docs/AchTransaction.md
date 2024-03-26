

# AchTransaction

Representation of an ACH transaction

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | The description of the ACH transaction. Can be used to identify the ACH transaction on the recipient&#39;s bank statement. |  [optional] |
|**uuid** | **String** | Unique identifier of an ACH transaction |  [optional] |
|**companyUuid** | **String** | Unique identifier of the company to which the ACH transaction belongs |  [optional] |
|**paymentEventType** | [**PaymentEventTypeEnum**](#PaymentEventTypeEnum) | The type of payment event associated with the ACH transaction |  [optional] |
|**paymentEventUuid** | **String** | Unique identifier for the payment event associated with the ACH transaction |  [optional] |
|**recipientType** | [**RecipientTypeEnum**](#RecipientTypeEnum) | The type of recipient associated with the ACH transaction |  [optional] |
|**recipientUuid** | **String** | Unique identifier for the recipient associated with the ACH transaction |  [optional] |
|**errorCode** | **String** | The error code associated with the ACH transaction, if any. If there is no error on the ACH transaction, this field will be nil. See [this article](https://engineering.gusto.com/how-ach-works-a-developer-perspective-part-2/) for a complete list of ACH return codes. |  [optional] |
|**transactionType** | **String** | The type of transaction associated with the ACH transaction |  [optional] |
|**paymentStatus** | [**PaymentStatusEnum**](#PaymentStatusEnum) | The status of the ACH transaction |  [optional] |
|**paymentDirection** | [**PaymentDirectionEnum**](#PaymentDirectionEnum) | The direction of the payment |  [optional] |
|**paymentEventCheckDate** | **String** | The date of the payment event check associated with the ACH transaction |  [optional] |
|**paymentDate** | **String** | The date of the payment associated with the ACH transaction |  [optional] |
|**amount** | **String** | The amount of money moved by the ACH transaction. This amount is always non-negative. |  [optional] |



## Enum: PaymentEventTypeEnum

| Name | Value |
|---- | -----|
| PAYROLL | &quot;Payroll&quot; |
| CONTRACTORPAYMENT | &quot;ContractorPayment&quot; |



## Enum: RecipientTypeEnum

| Name | Value |
|---- | -----|
| EMPLOYEE | &quot;Employee&quot; |
| CONTRACTOR | &quot;Contractor&quot; |



## Enum: PaymentStatusEnum

| Name | Value |
|---- | -----|
| UNSUBMITTED | &quot;unsubmitted&quot; |
| SUBMITTED | &quot;submitted&quot; |
| SUCCESSFUL | &quot;successful&quot; |
| FAILED | &quot;failed&quot; |



## Enum: PaymentDirectionEnum

| Name | Value |
|---- | -----|
| CREDIT | &quot;credit&quot; |
| DEBIT | &quot;debit&quot; |



