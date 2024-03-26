

# Termination

The representation of a termination in Gusto.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**version** | **String** | The current version of the object. See the [versioning guide](https://docs.gusto.com/embedded-payroll/docs/idempotency) for information on how to use this field. |  [optional] |
|**uuid** | **String** | The UUID of the termination object. |  [optional] [readonly] |
|**employeeUuid** | **Integer** | The UUID of the employee to which this termination is attached. |  [optional] [readonly] |
|**active** | **Boolean** | Whether the employee&#39;s termination has gone into effect. |  [optional] [readonly] |
|**cancelable** | **Boolean** | Whether the employee&#39;s termination is cancelable. Cancelable is true if &#x60;run_termination_payroll&#x60; is false and &#x60;effective_date&#x60; is in the future. |  [optional] [readonly] |
|**effectiveDate** | **String** | The employee&#39;s last day of work. |  [optional] |
|**runTerminationPayroll** | **Boolean** | If true, the employee should receive their final wages via an off-cycle payroll. If false, they should receive their final wages on their current pay schedule. |  [optional] |



