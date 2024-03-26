

# EmployeeAddress


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**version** | **String** | The current version of the object. See the [versioning guide](https://docs.gusto.com/embedded-payroll/docs/idempotency) for information on how to use this field. |  [optional] |
|**street1** | **String** |  |  [optional] |
|**street2** | **String** |  |  [optional] |
|**city** | **String** |  |  [optional] |
|**state** | **String** |  |  [optional] |
|**zip** | **String** |  |  [optional] |
|**country** | **String** |  |  [optional] |
|**active** | **Boolean** | The status of the location. Inactive locations have been deleted, but may still have historical data associated with them. |  [optional] [readonly] |
|**uuid** | **String** | The UUID of the employee address |  [optional] |
|**employeeUuid** | **String** | The UUID of the employee |  [optional] |
|**effectiveDate** | **LocalDate** | The date the employee started living at the address. |  [optional] |
|**courtesyWithholding** | **Boolean** | Determines if home taxes should be withheld and paid for employee. |  [optional] |



