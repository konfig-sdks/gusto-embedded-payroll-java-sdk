

# ContractorBankAccount


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**uuid** | **String** | UUID of the bank account |  [optional] |
|**contractorUuid** | **String** | UUID of the employee |  [optional] |
|**accountType** | [**AccountTypeEnum**](#AccountTypeEnum) | Bank account type |  [optional] |
|**name** | **String** | Name for the bank account |  [optional] |
|**routingNumber** | **String** | The bank account&#39;s routing number |  [optional] |
|**hiddenAccountNumber** | **String** | Masked bank account number |  [optional] |



## Enum: AccountTypeEnum

| Name | Value |
|---- | -----|
| CHECKING | &quot;Checking&quot; |
| SAVINGS | &quot;Savings&quot; |



