

# PayrollsUpdatePayrollByIdRequestEmployeeCompensationsInnerPaidTimeOffInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | The name of the PTO. This also serves as the unique, immutable identifier for the PTO. Must pass in name or policy_uuid but not both. |  [optional] |
|**hours** | **String** | The hours of this PTO taken during the pay period. |  [optional] |
|**policyUuid** | **String** | The uuid of the PTO policy. Must pass in name or policy_uuid but not both. |  [optional] |
|**finalPayoutUnusedHoursInput** | **String** | The outstanding hours paid upon termination. This field is only applicable for termination payrolls. |  [optional] |



