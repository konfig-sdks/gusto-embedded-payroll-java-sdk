

# RecoveryCase

Representation of a recovery case

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**uuid** | **String** | Unique identifier of an recovery case |  [optional] |
|**companyUuid** | **String** | Unique identifier of the company to which the recovery case belongs |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | Status of the recovery case |  [optional] |
|**latestErrorCode** | **String** | The latest bank error code for the recovery case. See [this article](https://engineering.gusto.com/how-ach-works-a-developer-perspective-part-2/) for a complete list of ACH return codes. |  [optional] |
|**originalDebitDate** | **String** | Date when funds were originally debited from the company&#39;s bank account |  [optional] |
|**checkDate** | **String** | Check date for the associated payroll or contractor payments |  [optional] |
|**payrollUuid** | **String** | The uuid of the associated payroll for which the recovery case was created. If the recovery case was created for a contractor payment, this field will be null. |  [optional] |
|**contractorPaymentUuids** | **List&lt;String&gt;** | The uuids of the associated contractor payments for which the recovery case was created. If the recovery case was created for a payroll, this field will be null. |  [optional] |
|**amountOutstanding** | **String** | Amount outstanding for the recovery case |  [optional] |
|**eventTotalAmount** | **String** | Total amount to be debited from the payroll or contractor payments |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| OPEN | &quot;open&quot; |
| REDEBIT_INITIATED | &quot;redebit_initiated&quot; |
| RECOVERED | &quot;recovered&quot; |
| LOST | &quot;lost&quot; |



