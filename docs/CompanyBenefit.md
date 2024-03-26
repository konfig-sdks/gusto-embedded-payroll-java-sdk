

# CompanyBenefit

The representation of a company benefit.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | The description of the company benefit.For example, a company may offer multiple benefits with an ID of 1 (for Medical Insurance). The description would show something more specific like “Kaiser Permanente” or “Blue Cross/ Blue Shield”. |  [optional] |
|**version** | **String** | The current version of the object. See the [versioning guide](https://docs.gusto.com/embedded-payroll/docs/idempotency) for information on how to use this field. |  [optional] |
|**uuid** | **String** | The UUID of the company benefit. |  [optional] [readonly] |
|**benefitType** | **Double** | The type of the benefit to which the company benefit belongs. |  [optional] [readonly] |
|**active** | **Boolean** | Whether this benefit is active for employee participation. Company benefits may only be deactivated if no employees are actively participating. |  [optional] |
|**deletable** | **Boolean** | Whether this company benefit can be deleted. Deletable will be set to true if the benefit has not been used in payroll, has no employee benefits associated, and the benefit is not owned by Gusto or a Partner |  [optional] |
|**supportsPercentageAmounts** | **Boolean** | Whether employee deductions and company contributions can be set as percentages of payroll for an individual employee. This is determined by the type of benefit and is not configurable by the company. |  [optional] [readonly] |
|**responsibleForEmployerTaxes** | **Boolean** | Whether the employer is subject to pay employer taxes when an employee is on leave. Only applicable to third party sick pay benefits. |  [optional] |
|**responsibleForEmployeeW2** | **Boolean** | Whether the employer is subject to file W-2 forms for an employee on leave. Only applicable to third party sick pay benefits. |  [optional] |



