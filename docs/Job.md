

# Job

The representation of a job in Gusto.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**title** | **String** | The title for the job. |  [optional] |
|**version** | **String** | The current version of the object. See the [versioning guide](https://docs.gusto.com/embedded-payroll/docs/idempotency) for information on how to use this field. |  [optional] |
|**uuid** | **String** | The UUID of the job. |  [optional] [readonly] |
|**employeeUuid** | **String** | The UUID of the employee to which the job belongs. |  [optional] [readonly] |
|**hireDate** | **String** | The date when the employee was hired or rehired for the job. |  [optional] |
|**primary** | **Boolean** | Whether this is the employee&#39;s primary job. The value will be set to true unless an existing job exists for the employee. |  [optional] [readonly] |
|**rate** | **String** | The current compensation rate of the job. |  [optional] [readonly] |
|**paymentUnit** | **String** | The payment unit of the current compensation for the job. |  [optional] [readonly] |
|**currentCompensationUuid** | **String** | The UUID of the current compensation of the job. |  [optional] [readonly] |
|**twoPercentShareholder** | **Boolean** | Whether the employee owns at least 2% of the company. |  [optional] |
|**stateWcCovered** | **Boolean** | Whether this job is eligible for workers&#39; compensation coverage in the state of Washington (WA). |  [optional] |
|**stateWcClassCode** | **String** | The risk class code for workers&#39; compensation in Washington state. Please visit [Washington state&#39;s Risk Class page](https://www.lni.wa.gov/insurance/rates-risk-classes/risk-classes-for-workers-compensation/risk-class-lookup#/) to learn more. |  [optional] |
|**compensations** | [**List&lt;Compensation&gt;**](Compensation.md) |  |  [optional] [readonly] |



