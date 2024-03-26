

# EmployeeWorkAddress


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**version** | **String** | The current version of the object. See the [versioning guide](https://docs.gusto.com/embedded-payroll/docs/idempotency) for information on how to use this field. |  [optional] |
|**uuid** | **String** | The unique identifier of this work address. |  [optional] [readonly] |
|**effectiveDate** | **String** | The date the employee began working at this location. |  [optional] |
|**active** | **Boolean** | Signifies if this address is the active work address for the current date |  [optional] [readonly] |
|**locationUuid** | **String** | UUID reference to the company location for this work address. |  [optional] |
|**employeeUuid** | **String** | UUID reference to the employee for this work address. |  [optional] |
|**street1** | **String** |  |  [optional] [readonly] |
|**street2** | **String** |  |  [optional] [readonly] |
|**city** | **String** |  |  [optional] [readonly] |
|**state** | **String** |  |  [optional] [readonly] |
|**zip** | **String** |  |  [optional] [readonly] |
|**country** | **String** |  |  [optional] [readonly] |



