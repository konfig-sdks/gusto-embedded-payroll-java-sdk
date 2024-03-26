

# PaymentMethodBankAccount

Representation of a bank account item

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**uuid** | **String** | The bank account ID |  [optional] |
|**name** | **String** | The bank account name |  [optional] |
|**hiddenAccountNumber** | **String** | Masked bank account number |  [optional] |
|**priority** | **Integer** | The order of priority for each payment split, with priority 1 being the first bank account paid. Priority must be unique and sequential. |  [optional] |
|**splitAmount** | **Integer** | The cents amount allocated for each payment split |  [optional] |



