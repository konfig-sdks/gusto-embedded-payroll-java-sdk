

# PayrollPayrollStatusMetaType

Information about the payroll's status and expected dates

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**cancellable** | **Boolean** | true if the payroll may be cancelled |  [optional] [readonly] |
|**expectedCheckDate** | **String** | The date an employee will be paid if the payroll is submitted now |  [optional] [readonly] |
|**initialCheckDate** | **String** | The normal check date for the associated pay period |  [optional] [readonly] |
|**expectedDebitTime** | **String** | The time the employer&#39;s account will be debited if the payroll is submitted now |  [optional] [readonly] |
|**payrollLate** | **Boolean** | expected_check_date &gt; initial_check_date |  [optional] [readonly] |
|**initialDebitCutoffTime** | **String** | Payroll must be submitted at or before this time to avoid late payroll |  [optional] [readonly] |



