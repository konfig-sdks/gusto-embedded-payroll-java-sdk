

# CompanyBankAccount

The company bank account

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**uuid** | **String** | UUID of the bank account |  [optional] |
|**companyUuid** | **String** | UUID of the company |  [optional] |
|**accountType** | [**AccountTypeEnum**](#AccountTypeEnum) | Bank account type |  [optional] |
|**routingNumber** | **String** | The bank account&#39;s routing number |  [optional] |
|**hiddenAccountNumber** | **String** | Masked bank account number |  [optional] |
|**verificationStatus** | [**VerificationStatusEnum**](#VerificationStatusEnum) | The verification status of the bank account.  &#39;awaiting_deposits&#39; means the bank account is just created and money is being transferred. &#39;ready_for_verification&#39; means the micro-deposits are completed and the verification process can begin by using the verify endpoint. &#39;verified&#39; means the bank account is verified. |  [optional] |
|**verificationType** | [**VerificationTypeEnum**](#VerificationTypeEnum) | The verification type of the bank account.  &#39;bank_deposits&#39; means the bank account is connected by entering routing and accounting numbers and verifying through micro-deposits. &#39;plaid&#39; means the bank account is connected through Plaid. |  [optional] |
|**plaidStatus** | [**PlaidStatusEnum**](#PlaidStatusEnum) | The Plaid connection status of the bank account. Only applies when verification type is Plaid. |  [optional] |
|**lastCachedBalance** | **String** | The last fetch balance for the bank account. Please be aware that this amount does not reflect the most up-to-date balance and only applies when the verification type is Plaid. |  [optional] |
|**balanceFetchedDate** | **String** | The balance fetch date associated with the last_cached_balance. Only applies when verification type is Plaid. |  [optional] |
|**name** | **String** | Name of bank account |  [optional] |



## Enum: AccountTypeEnum

| Name | Value |
|---- | -----|
| CHECKING | &quot;Checking&quot; |
| SAVINGS | &quot;Savings&quot; |



## Enum: VerificationStatusEnum

| Name | Value |
|---- | -----|
| AWAITING_DEPOSITS | &quot;awaiting_deposits&quot; |
| READY_FOR_VERIFICATION | &quot;ready_for_verification&quot; |
| VERIFIED | &quot;verified&quot; |



## Enum: VerificationTypeEnum

| Name | Value |
|---- | -----|
| BANK_DEPOSITS | &quot;bank_deposits&quot; |
| PLAID | &quot;plaid&quot; |
| PLAID_EXTERNAL | &quot;plaid_external&quot; |



## Enum: PlaidStatusEnum

| Name | Value |
|---- | -----|
| CONNECTED | &quot;connected&quot; |
| DISCONNECTED | &quot;disconnected&quot; |



