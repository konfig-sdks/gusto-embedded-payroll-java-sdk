

# NotificationResourcesInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**entityType** | **String** | The type of entity being described, could be “Contractor”, “Employee”, “BankAccount”, “Payroll”, “ContractorPayment”, “RecoveryCase”, or “Signatory” |  |
|**entityUuid** | **String** | Unique identifier of the entity |  |
|**referenceType** | **String** | Optional. The type of a resource that is related to the one described by entity_type and entity_uuid. For instance, if the entity_type is “BankAccount”, the reference_type could be the “Employee” or “Contractor” to whom the bank account belongs. |  [optional] |
|**referenceUuid** | **String** | Optional. Unique identifier of the reference. |  [optional] |



